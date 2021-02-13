package com.examplegroup7.BloodManagementSystem.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "donors")
@EntityListeners(AuditingEntityListener.class)

public class FindDonors {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)

    private Long Id;
    private String state;
    private String district;
    private String bloodGroup;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
