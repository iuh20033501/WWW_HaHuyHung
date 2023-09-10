package com.example.week.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
    @Id
    private Long role_id;
    private String role_name;
    private String description;
    private String status;

    public Role() {
    }

    public Role(Long role_id, String role_name, String description, String status) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.description = description;
        this.status = status;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
