package com.example.Security.auth;

import com.example.Security.security.ApplicationUserRole;
import com.google.common.collect.Lists;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("quotesV1")
public class ApplicationUserDaoService implements ApplicationUserDao {

    private final PasswordEncoder passwordEncoder;

    public ApplicationUserDaoService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return getApplicationUsers()
                .stream()
                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers() {
        List<ApplicationUser> applicationUsers = Lists.newArrayList(
            new ApplicationUser(
                    ApplicationUserRole.USER.getGrantedAuthorities(),
                    "user",
                    passwordEncoder.encode("user1"),
                    true,
                    true,
                    true,
                    true
            ),
            new ApplicationUser(
                ApplicationUserRole.ADMIN.getGrantedAuthorities(),
                "admin",
                passwordEncoder.encode("admin1"),
                true,
                true,
                true,
                true
            )
        );
        return applicationUsers;
    }
}
