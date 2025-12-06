package LLD.leaderboard.dto;

import LLD.leaderboard.dto.builder.PlayerBuilder;

import java.util.Objects;

public class Player {

    private String playerId;
    private Integer score;


    public Player(PlayerBuilder playerBuilder) {
        this.playerId = playerBuilder.playerId;
        this.score = playerBuilder.score;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId='" + playerId + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(getPlayerId(), player.getPlayerId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPlayerId());
    }
}
