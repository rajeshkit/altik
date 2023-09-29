package ex;
import java.util.ArrayList;
import java.util.List;

public class Icc {
    public void getPlayerInfo(Player player){
        System.out.println(player.getPlayerId());
        System.out.println(player.getPlayerName());
        System.out.println(player.getTeamName());
        System.out.println(player.getTotalRuns());
    }
    public void getAllPlayerInfo(List<Player> players){
        for (Player player : players) {
            System.out.println(player.getPlayerId());
            System.out.println(player.getPlayerName());
            System.out.println(player.getTeamName());
            System.out.println(player.getTotalRuns());
            System.out.println("**********************");
        }

    }
}
