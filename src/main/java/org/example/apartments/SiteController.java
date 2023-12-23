package org.example.apartments;

import org.example.apartments.models.Bill;
import org.example.apartments.models.SecurityUser;
import org.example.apartments.models.User;
import org.example.apartments.repos.BillRepository;
import org.example.apartments.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
public class SiteController {
    @GetMapping("/")
    public String index(@AuthenticationPrincipal SecurityUser secUser, Model model) {
        boolean is_logged = secUser != null;
        model.addAttribute("is_logged", is_logged);
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BillRepository billRepository;
    @GetMapping("/lk")
    public String lk(@AuthenticationPrincipal SecurityUser secUser, Model model) {
        User user = userRepository.findById(secUser.getUser().getPersonalAccount()).orElseThrow();
        model.addAttribute("user", user);

        return "user_page";
    }

    @GetMapping("/pay/{bill_id}")
    public RedirectView pay(@PathVariable Long bill_id, Model model){
        Bill bill = billRepository.findById(bill_id).orElseThrow();
        bill.setPaid(true);
        billRepository.save(bill);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/lk");
        return redirectView;
    }
}