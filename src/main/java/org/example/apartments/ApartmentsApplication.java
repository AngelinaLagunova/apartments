package org.example.apartments;

import org.example.apartments.models.Apartment;
import org.example.apartments.models.Bill;
import org.example.apartments.models.User;
import org.example.apartments.repos.ApartmentRepository;
import org.example.apartments.repos.BillRepository;
import org.example.apartments.repos.UserRepository;
import org.example.apartments.repos.UtilityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.Date;

@SpringBootApplication

public class
ApartmentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApartmentsApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(
            PasswordEncoder encoder,
            ApartmentRepository apartmentRepository,
            UserRepository userRepository,
            BillRepository billRepository,
            UtilityRepository utilityRepository
    ){
        return args -> {
//            Apartment apartment = new Apartment(
//                2,
//                20.5F
//            );
//            apartmentRepository.save(apartment);
//            User user = new User(
//                    111111L,
//                    "Лагунова Ангелина Максимовна",
//                    encoder.encode("22222"),
//                    "+79143379293",
//                    apartment
//            );
//            userRepository.save(user);
//            User user = userRepository.findById(111111L).orElseThrow();
//            Bill bill1 = new Bill(
//                    123F,
//                    new Date(2023-1900, 11, 5),
//                    user,
//                    utilityRepository.findById(22).orElseThrow()
//            );
//            Bill bill2 = new Bill(
//                    222F,
//                    new Date(2023-1900, 11, 5),
//                    user,
//                    utilityRepository.findById(11).orElseThrow()
//            );
//            billRepository.save(bill1);
//            billRepository.save(bill2);
        };
    }
}
