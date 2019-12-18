package com.example.userandpaymentinfo.repository;

import com.example.userandpaymentinfo.model.PodaciORacunu;
import com.example.userandpaymentinfo.model.Urednik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodaciORacunuRepository extends JpaRepository<PodaciORacunu, Long> {

    PodaciORacunu findOneById(Long id);
}
