package org.example.apartments.service;

import org.example.apartments.models.SecurityUser;
import org.example.apartments.repos.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JpaUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    public JpaUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository
                .findById(Long.parseLong(username))
                .map(SecurityUser::new)
                .orElseThrow(() -> new UsernameNotFoundException("not found: " + username));
    }
}
