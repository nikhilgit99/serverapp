package com.campusconnect.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="EVENT")
public class EventBean {

    @Id
    @Basic
    @Column(name="EVENT_ID" , unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eventId;

    @Basic
    @Column(name = "EVENT_NAME" , unique = true)
    private String eventName;

}
