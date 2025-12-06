package LLD.leaderboard.services;

import LLD.leaderboard.dto.Player;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public interface LeaderBoardService {

    void addScore(String playerId, int score);

    Optional<Integer> topK(int k);

    Optional<AtomicInteger> reset(String playerId);
}
