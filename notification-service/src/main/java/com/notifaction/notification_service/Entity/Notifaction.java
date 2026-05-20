package com.notifaction.notification_service.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Notifaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private  String notifactionId;
    private String emailId;
    private LocalDate date;

}
