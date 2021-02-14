package com.examplegroup7.BloodManagementSystem.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="currentpassword")
@EntityListeners(AuditingEntityListener.class)

public class CurrentPassword{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long Id;
    private String cpassword;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
}