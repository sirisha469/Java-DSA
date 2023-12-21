package HCLAssignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Player{
  private int playerId;
  private String playerName;
  private int teamId;
  private String teamName;

  public Player(int playerId,String playerName,int teamId,String teamName){
    this.playerId = playerId;
    this.playerName = playerName;
    this.teamId = teamId; 
    this.teamName = teamName;
  }

  public int getPlayerId(){
    return playerId;
  }

  public String getPlayerName(){
    return playerName;
  }

  public int getTeamId(){
    return teamId;
  }

  public String getTeamName(){
    return teamName;
  }

  public String toString(){
    return "["+playerId+", "+playerName+", "+teamId+", "+teamName+"]";
  }
}
public class TeamPlayer{
  public static void main(String[] args) {
    List<Player> list = new ArrayList<>();

    list.add(new Player(1,"player 1",10,"Team A"));
    list.add(new Player(2,"player 2",20,"Team B"));
    list.add(new Player(3,"player 3",20,"Team B"));

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
    for(Player p:list){
      if(p.getTeamId()==teamId){
        System.out.println("-----Player"+count+" Details----");
        System.out.println("Player Id: "+p.getPlayerId());
        System.out.println("Player Name: "+p.getPlayerName());
        System.out.println("Team Id: "+p.getTeamId());
        System.out.println("Team Name: "+p.getTeamName());
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
        System.out.println("Team Id: "+p.getTeamId());
        System.out.println("Team Name: "+p.getTeamName());
      }
    }
  }
}

