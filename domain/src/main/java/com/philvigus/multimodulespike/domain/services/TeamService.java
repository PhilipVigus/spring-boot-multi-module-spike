package com.philvigus.multimodulespike.domain.services;

import com.philvigus.multimodulespike.domain.models.Team;

import java.util.List;

public interface TeamService {
  List<Team> findAll();

  Team save(Team object);
}
