package com.spring_boot.schulbesuch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchulbesuchRepository extends JpaRepository<Schulbesuch, Long> {


}
