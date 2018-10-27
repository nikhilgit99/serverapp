
package com.campusconnect.repository;

import com.campusconnect.entity.TimeTableBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by NIKHI on 15-09-2018.
 */

@Repository
public interface TimeTableRepository extends CrudRepository<TimeTableBean, Long> {
}

