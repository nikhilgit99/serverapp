
package com.campusconnect.repository;

import com.campusconnect.entity.SessionBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by NIKHI on 15-09-2018.
 */

@Repository
public interface SessionRepository extends CrudRepository<SessionBean, Long> {
}