package com.examplegroup7.BloodManagementSystem.repositories;

import com.examplegroup7.BloodManagementSystem.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
