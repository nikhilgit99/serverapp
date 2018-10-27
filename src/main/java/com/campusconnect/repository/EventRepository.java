package com.campusconnect.repository;

import com.campusconnect.entity.EventBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventRepository extends CrudRepository<EventBean, Long> {
}
