package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of payers you want to add");
        int noOfPlayers=s.nextInt();
      //  Player[] playerList=new Player[noOfPlayers];
        ArrayList<Player> playerList=new ArrayList<>();
        for (int i = 0; i < noOfPlayers; i++) {
            Player p=new Player();
            System.out.println("Enter the player id");
            p.setPlayerId(s.nextInt());
            s.nextLine();
            System.out.println("Enter the player name");
            p.setPlayerName(s.nextLine());
            System.out.println("Enter the player team name");
            p.setTeamName(s.nextLine());
            System.out.println("Enter the player total runs");
            p.setTotalRuns(s.nextInt());
            playerList.add(p);
        }


        Icc icc=new Icc();
        icc.getAllPlayerInfo(playerList);
//        icc.getPlayerInfo(p);

    }
}
