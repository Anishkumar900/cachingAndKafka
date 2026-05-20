package com.notifaction.notification_service.repository;

import com.notifaction.notification_service.Entity.Notifaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotifactionRepository extends JpaRepository<Notifaction,String> {

}
