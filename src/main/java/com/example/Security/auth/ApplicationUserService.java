package com.example.Security.auth;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserService implements UserDetailsService {

    private final ApplicationUserDao applicationUserDao;

    public ApplicationUserService(@Qualifier("quotesV1") ApplicationUserDao applicationUserDao) {
        this.applicationUserDao = applicationUserDao;
    }

    @Override
    public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
        return applicationUserDao.selectApplicationUserByUsername(user)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("Username %s not found", user)));
    }
}
