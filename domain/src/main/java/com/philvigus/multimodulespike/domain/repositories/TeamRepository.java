package com.philvigus.multimodulespike.domain.repositories;

import com.philvigus.multimodulespike.domain.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
