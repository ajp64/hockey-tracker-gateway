package com.HockeyTrackerGateway.controllers;

import com.HockeyTrackerGateway.model.Player;
import com.HockeyTrackerGateway.proxy.PlayerProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.server.model.PlayerListResponse;
import java.util.UUID;

@RestController
public class PlayerController {

  private final PlayerProxy playerProxy;

  public PlayerController(PlayerProxy playerProxy) {
    this.playerProxy = playerProxy;
  }
  @PostMapping("/players")
  public Player createPlayer(
      @RequestBody Player payment
      ) {
    String requestId = UUID.randomUUID().toString();
    return playerProxy.createPlayer(requestId, payment);
  }

  @GetMapping("/players")
  public PlayerListResponse listPlayers(
  ) {
    return playerProxy.listPlayers();
  }
}
