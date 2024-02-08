package com.dataTransferOperation.repository;

import com.dataTransferOperation.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
