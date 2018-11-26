
package com.campusconnect.entity;

import javax.persistence.*;


/**
 * Created by NIKHI on 15-09-2018.
 */

@Entity
@Table(name = "ROOM")
public class RoomBean {

    @Id
    @Basic
    @Column(name="ROOM_ID" , unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roomId;
}

