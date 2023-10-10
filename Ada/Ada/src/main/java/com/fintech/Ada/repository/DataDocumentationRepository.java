package com.fintech.Ada.repository;

import com.fintech.Ada.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataDocumentationRepository extends JpaRepository<Event,Long> {

}
