package HCLAssignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Team{
  private int teamId;
  private String teamName;

  public Team(int teamId,String teamName){
    this.teamId = teamId;
    this.teamName = teamName;
  }

  public int getTeamId(){
    return teamId;
  }

  public String getTeamName(){
    return teamName;
  }
}
class Player{
  private int playerId;
  private String playerName;
  private Team team;

  public Player(int playerId,String playerName,Team team){
    this.playerId = playerId;
    this.playerName = playerName;
    this.team = team;
  }

  public int getPlayerId(){
    return playerId;
  }

  public String getPlayerName(){
    return playerName;
  }

  public Team getTeam(){
    return team;
  }

  public String toString(){
    return "["+playerId+", "+playerName+", "+team+"]";
  }
}
public class TeamPlayer{
  public static void main(String[] args) {

    Team t1 = new Team(10,"Team A");
    Team t2 = new Team(20,"Team B");
    List<Player> list = new ArrayList<>();

    list.add(new Player(1,"player 1",t1));
    list.add(new Player(2,"player 2",t2));
    list.add(new Player(3,"player 3",t2));

    // System.out.println(list);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the team Id: ");
    int teamId = sc.nextInt();

    findingPlayersBasedOnTeamId(list,teamId);

    System.out.println("Enter the Player Id: ");
    int playerId = sc.nextInt();
    
    findPlayerDetailsById(list,playerId);

    sc.close();
  }

  private static void findingPlayersBasedOnTeamId(List<Player> list,int teamId) {
    int count=1;
    System.out.println("Team "+teamId+" details:");
    for(Player p:list){
      if(p.getTeam().getTeamId()==teamId){
        System.out.println("-----Player"+count+" Details----");
        System.out.println("Player Id: "+p.getPlayerId());
        System.out.println("Player Name: "+p.getPlayerName());
        System.out.println("Team Id: "+p.getTeam().getTeamId());
        System.out.println("Team Name: "+p.getTeam().getTeamName());
        count++;
      }
    }
  }

  private static void findPlayerDetailsById(List<Player> list, int playerId) {
    for(Player p:list){
      if(p.getPlayerId() == playerId){
        System.out.println("-----Player Details----");
        System.out.println("Player Id: "+p.getPlayerId());
        System.out.println("Player Name: "+p.getPlayerName());
        System.out.println("Team Id: "+p.getTeam().getTeamId());
        System.out.println("Team Name: "+p.getTeam().getTeamName());
      }
    }
  }
}

