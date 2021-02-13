package com.examplegroup7.BloodManagementSystem.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name ="contactus")
@EntityListeners(AuditingEntityListener.class)

public class ContactUs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String userId;
    private String subject;
    private String messageBody;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
