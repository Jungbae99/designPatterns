package com.me.designPatterns._02_structural_patterns._06_adapter._01_before;

import com.me.designPatterns._02_structural_patterns._06_adapter._01_before.security.UserDetails;
import com.me.designPatterns._02_structural_patterns._06_adapter._01_before.security.UserDetailsService;

public class AccountService implements UserDetailsService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }
}
