public class LigaDeKrokower {

private int NumTeams = 20;
private double LeagueValue = 8.53;

private String teamName;
private int numPlayers;
private int fixturesWeekly;
private double teamValue;
private String teamMotto;
private int gamesWon;
private int gamesLost;
private int gamesTied;
boolean isWomansTeam;


   public LigaDeKrokower() {
     String teamName = "FemboyFC";
     int numPlayers = 31;
     int fixturesWeekly = 1;
     double teamValue = 4.32;
     String teamMotto = "Anotemos, pero no solo en futbol";
     boolean isWomansTeam = false;
     int gamesWon = 10;
     int gamesLost = 2;
     int gamesTied = 2;
      }
     
      public LigaDeKrokower(String teamName, int numPlayers, int fixturesWeekly, double teamValue, String teamMotto, boolean isWomansTeam, int gamesWon, int gamesLost, int gamesTied) {
      this.teamName = teamName;
      this.numPlayers = numPlayers;
      this.fixturesWeekly = fixturesWeekly;
      this.teamValue = teamValue;
      this.teamMotto = teamMotto;
      this.isWomansTeam = isWomansTeam;
      this.gamesWon = gamesWon;
      }
     
      //A team in Liga de Krokower wins a match
      public void win(){
      gamesWon++;
      }
     
      //A team in Liga de Krokower loses a match
      public void loss(){
      gamesLost++;
      }
     
      //A team in Liga de Krokower draws a match
      public void draw(){
      gamesTied++;
      }
     
      //A team in Liga de Krokower purchases a player
      public void transferIn(){
      numPlayers++;
      }
     
      //A team in Liga de Krokower sells a player
      public void transferOut(){
      numPlayers--;
      }
     
      //A team in Liga de Krokower gets prize money for finishing high in the league standings
      public double prizeMoney(int prize){
      teamValue = (teamValue + prize);
      return teamValue;
      }
     
      //A team in Liga de Krokower changes their motto
      public void mottoChange(String newMotto){
      teamMotto = newMotto;
      }
      public static void main(String[] args) {
      }
     
 
}