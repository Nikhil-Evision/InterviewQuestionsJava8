package com.evision.transactionhandling.repository;

import com.evision.transactionhandling.model.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {

}
