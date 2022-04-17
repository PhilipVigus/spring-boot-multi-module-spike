package com.philvigus.multimodulespike.domain.services;

import com.philvigus.multimodulespike.domain.models.Team;
import com.philvigus.multimodulespike.domain.repositories.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
  private final TeamRepository teamRepository;

  public TeamServiceImpl(TeamRepository teamRepository) {
    this.teamRepository = teamRepository;
  }

  @Override
  public List<Team> findAll() {
    return teamRepository.findAll();
  }

  @Override
  public Team save(Team object) {
    return teamRepository.save(object);
  }
}
