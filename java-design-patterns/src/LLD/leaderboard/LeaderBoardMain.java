package LLD.leaderboard;

import LLD.leaderboard.services.LeaderBoardServiceImpl;

public class LeaderBoardMain {

    public static void main(String[] args) {
        LeaderBoardServiceImpl leaderBoardService = new LeaderBoardServiceImpl();
        leaderBoardService.addScore("1",73);
        leaderBoardService.addScore("2",56);
        leaderBoardService.addScore("3",39);
        leaderBoardService.addScore("4",51);
        leaderBoardService.addScore("5",4);
        System.out.println(leaderBoardService.topK(1));
        System.out.println(leaderBoardService.reset("1"));
        System.out.println(leaderBoardService.reset("2"));
        leaderBoardService.addScore("2",51);
        System.out.println(leaderBoardService.getLeaderBoardDetails());
        System.out.println(leaderBoardService.topK(1));
    }
}
