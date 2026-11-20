public class LigaDeKrowkower {
   private int numPlayers;
   private int fixturesWeekly;
   private double teamValue;
   private String teamMotto;
   private boolean isWomansTeam;
   private int gamesWon;
   private int gamesLost;
   private int gamesTied;
   
   public LigaDeKrowkower() {
      numPlayers = 31;
      fixturesWeekly = 1;
      teamValue = 7,654,321,012.34;
      teamMotto = "¡Anotemos!, pero no solo en el fútbol";
      isWomansTeam = false;
      gamesWon = 10;
      gamesLost = 2;
      gamesTied = 2;
      
      }
   public LigaDeKrowkower(int numPlayers, int fixturesWeekly, double teamValue, String teamMotto, boolean isWomansTeam, int gamesWon, int gamesLost, gamesTied) {
      this.numPlayers = numPlayers;
      this.fixturesWeekly = fixturesWeekly;
      this.teamValue = teamValue;
      this.teamMotto = teamMotto;
      this.isWomansTeam = isWomansTeam;
      this.gamesWon = gamesWon;
      this.gamesLost = gamesLost;
      this.gamesTied = gamesTied;
      }
   
      
   
      
   
   
   
}