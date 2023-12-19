package HCLAssignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Team{
  private int teamId;
  private String teamName;
  private List<Player> players;

  public Team(int teamId,String teamName){
    this.teamId = teamId;
    this.teamName = teamName;
    this.players = new ArrayList<>();
  }

  public void setTeamId(int teamId){
    this.teamId = teamId;
  }

  public int getTeamId(){
    return teamId;
  }

  public void setTeamName(String teamName){
    this.teamName = teamName;
  }

  public String getTeamName(){
    return teamName;
  }

  public void setPlayers(List<Player> players){
    this.players = players;
  }

  public List<Player> getPlayers(){
    return players;
  }

  public void addPlayer(Player player){
    players.add(player);
  }

  public String toString(){
    return teamId+" "+teamName;
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

  public void setPlayerId(int playerId){
    this.playerId = playerId;
  }

  public int getPlayerId(){
    return playerId;
  }

  public void setPlayerName(String playerName){
    this.playerName = playerName;
  }

  public String getPlayerName(){
    return playerName;
  }

  public void setTeam(Team team){
    this.team = team;
  }

  public Team getTeam(){
    return team;
  }

  public String toString(){
    return playerId+" "+playerName+" "+team.getTeamName();
  }
}

public class TeamPlayer {
  public static void main(String[] args) {
    Team t1 = new Team(1,"Team A");
    Team t2 = new Team(2,"Team B");

    Player p1 = new Player(1, "player1", t1);
    Player p2 = new Player(2, "player2", t1);
    Player p3 = new Player(3, "player3", t2);

    t1.addPlayer(p1);
    t1.addPlayer(p2);
    t2.addPlayer(p3);

    System.out.println(t1.getPlayers());

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter team ID: ");
    int teamId = sc.nextInt();

    displayPlayersOfTeam(teamId);

  }

  public static void displayPlayersOfTeam(int teamId){
    Team team = findTeamById(teamId);
    System.out.println(team);
    System.out.println(team.getPlayers());
    if(team!=null){
      for(Player p:team.getPlayers()){
        System.out.println(p.getPlayerId());
      }
    }
    // else{
    //   System.out.println("Team not found");
    // }
    
  }

  public static Team findTeamById(int teamId){
    List<Team> teams = Arrays.asList(new Team(1, "Team A"), new Team(2, "Team B"));

    for (Team team : teams) {
      if (team.getTeamId() == teamId) {
        return team;
      }
    }
    return null;
  }
}
