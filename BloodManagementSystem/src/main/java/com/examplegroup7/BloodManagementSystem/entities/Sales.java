package com.examplegroup7.BloodManagementSystem.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table( name = "sales" )
@EntityListeners(AuditingEntityListener.class)

public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sales_id;

    @Column(name ="seller_id")
    private String sellerId;
    @Column(name ="buyer_id")
    private String buyerId;
    private String component;
    @Column(name="blood_group")
    private String bloodGroup;
    private Double units;
    private Double price;
    @Column(name ="date_of_transaction")
    private LocalDate date;

    public Long getSales_id() {
        return sales_id;
    }

    public void setSales_id(Long sales_id) {
        this.sales_id = sales_id;
    }

    public String getSeller_id() {
        return sellerId;
    }

    public void setSeller_id(String seller_id) {
        this.sellerId = seller_id;
    }

    public String getBuyer() {
        return buyerId;
    }

    public void setBuyer(String buyer) {
        this.buyerId = buyer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getBlood_group() {
        return bloodGroup;
    }

    public void setBlood_group(String blood_group) {
        this.bloodGroup = bloodGroup;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double units) {
        this.units = units;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "sales_id=" + sales_id +
                ", sellerId='" + sellerId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", component='" + component + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", units=" + units +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
