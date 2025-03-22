package com.HockeyTrackerGateway.proxy;

import com.HockeyTrackerGateway.model.Player;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.rest.server.model.PlayerListResponse;

@FeignClient(name = "players", url = "${name.service.url}")
public interface PlayerProxy {

  @PostMapping("/players")
  Player createPlayer(
      @RequestHeader String requestId,
      @RequestBody Player player);

  @GetMapping("/players")
  PlayerListResponse listPlayers();

}