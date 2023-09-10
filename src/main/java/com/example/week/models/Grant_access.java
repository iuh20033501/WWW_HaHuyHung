package com.example.week.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Grant_access {
    @Id
    @ManyToOne
    private Account account;
    @Id
    @ManyToOne
    private Role role;
    private String note;
    private String is_grant;

    public Grant_access(Account account, Role role, String note, String is_grant) {
        this.account = account;
        this.role = role;
        this.note = note;
        this.is_grant = is_grant;
    }

    public Grant_access() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getIs_grant() {
        return is_grant;
    }

    public void setIs_grant(String is_grant) {
        this.is_grant = is_grant;
    }
}
