package com.examplegroup7.BloodManagementSystem.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

import java.sql.Timestamp;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table( name="notification")
@EntityListeners(AuditingEntityListener.class)
public class Notification {

    @Id
    @SequenceGenerator(
            name = "id_sequence",
            sequenceName = "id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "id_sequence"
    )
    private Integer id;

    @Column(name="status", columnDefinition = "default false")
    private Boolean status;
    private Timestamp timedate;
    private String title;

    @Column(name="user_id")
    private String userId;

    public Notification(Timestamp timedate, String title, String userId) {
        this.timedate = timedate;
        this.title = title;
        this.userId = userId;
    }

    public Notification(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Timestamp getTimedate() {
        return timedate;
    }

    public void setTimedate(Timestamp timedate) {
        this.timedate = timedate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", status=" + status +
                ", timedate='" + timedate + '\'' +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                '}';
    }
}
