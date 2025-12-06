package LLD.leaderboard.dto.builder;

import LLD.leaderboard.dto.Player;

import java.util.Objects;

public class PlayerBuilder {
    
    public String playerId;
    public Integer score;

    public PlayerBuilder setPlayerId(String playerId) {
        this.playerId = playerId;
        return this;
    }

    public PlayerBuilder setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Player build() {
        return new Player(this);
    }
}
