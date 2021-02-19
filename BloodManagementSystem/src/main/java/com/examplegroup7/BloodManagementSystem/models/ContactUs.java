package com.examplegroup7.BloodManagementSystem.models;

import com.examplegroup7.BloodManagementSystem.utils.StringSequenceIdentifier;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name ="contactus")
@EntityListeners(AuditingEntityListener.class)

public class ContactUs {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_us_seq")
    @GenericGenerator(
            name = "contact_us_seq",
            strategy = "com.examplegroup7.BloodManagementSystem.utils.StringSequenceIdentifier",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringSequenceIdentifier.INCREMENT_PARAM, value = "1"),
                    @org.hibernate.annotations.Parameter(name = StringSequenceIdentifier.VALUE_PREFIX_PARAMETER, value = "C"),
                    @org.hibernate.annotations.Parameter(name = StringSequenceIdentifier.NUMBER_FORMAT_PARAMETER, value = "%02d") })

    private String Id;

    private String userId;
    private String subject;
    private String messageBody;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
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
