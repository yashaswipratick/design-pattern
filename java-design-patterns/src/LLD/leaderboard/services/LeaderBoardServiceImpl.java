package LLD.leaderboard.services;

import LLD.leaderboard.dto.Player;
import LLD.leaderboard.dto.builder.PlayerBuilder;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LeaderBoardServiceImpl implements LeaderBoardService{

    TreeMap<Player, AtomicInteger> leaderBoardDetails;

    public LeaderBoardServiceImpl() {
        this.leaderBoardDetails = new TreeMap<>((o1, o2) -> Double.compare(o2.getScore(), o1.getScore()));
    }

    public TreeMap<Player, AtomicInteger> getLeaderBoardDetails() {
        return leaderBoardDetails;
    }

    @Override
    public void addScore(String playerId, int score) {
        if (playerId == null && score <= 0) {
            return;
        }

        Player player = new PlayerBuilder().setPlayerId(playerId).setScore(0).build();
        if (leaderBoardDetails.containsKey(player)) {

            synchronized (player) {
                AtomicInteger s = leaderBoardDetails.get(player);
                int andAdd = s.getAndAdd(score);
                player.setScore(andAdd);
                leaderBoardDetails.put(player, new AtomicInteger(andAdd));
            }
        } else {
            leaderBoardDetails.put(new PlayerBuilder()
                    .setPlayerId(playerId)
                    .setScore(score)
                    .build(), new AtomicInteger(score));
        }
    }

    @Override
    public Optional<Integer> topK(int k) {
        // top - 3
        // 1 - 100
        //2 - 100
        //3 - 100
        //4 - 100
        //5 - 90
        return Optional.of(leaderBoardDetails.values()
                .stream()
                        .mapToInt(AtomicInteger::get)
                .limit(k).sum());
    }

    @Override
    public Optional<AtomicInteger> reset(String playerId) {
        //It is guaranteed that the player was added to the leaderboard before calling this function - mentioned in requirement

        Player player = null;
        for (Map.Entry<Player, AtomicInteger> entry : leaderBoardDetails.entrySet()) {
            if (entry.getKey().getPlayerId().equalsIgnoreCase(playerId)) {
                player = entry.getKey();
                break;
            }
        }
        AtomicInteger remove = leaderBoardDetails.remove(player);
        return Optional.of(remove);
    }
}
