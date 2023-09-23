package com.example.week.implement;

import com.example.week.models.Account;
import com.example.week.models.AccountStatus;
import com.example.week.models.Role;
import com.example.week.repository.AccountRepository;
import com.example.week.service.AccountService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;
public class AccountImplement implements AccountService {
    @Inject
    private AccountRepository repository;

    public AccountImplement() {
        this.repository = new AccountRepository();
    }

    @Override
    public List<Account> getAll() {
        return repository.getAll();
    }

    @Override
    public Account findById(String id) {
        return repository.find(id);
    }

    @Override
    public boolean create(Account a) {
        return repository.createAccount(a);
    }

    @Override
    public boolean update(Account a) {
        return repository.updateAccount(a);
    }

    @Override
    public void delete(String userName) {
        Account a = repository.find(userName);
        a.setStatus(AccountStatus.DELETED);
    }

    @Override
    public List<Account> dAccByRole() {

        return repository.findAcByRole();
    }

    @Override
    public Role findRole(String username) {
        return repository.findRole(username);
    }
}
