/*
* @Autor: Darwin Neira Carrasco
* @Email: dneirac@unsa.edu.pe
* @Descripcion:
*/

public class Console {
  private double price;
  private String companyName;
  private String gameFamous;


  public Console(double price, String company, String game){
    this.price = price;
    this.companyName = company;
    this.gameFamous = game;
  }

  public void startGame(){
    System.out.println("Console start");
  }

  public void LoadGame(String game){
    System.out.println("Loading "+ game +"...");
  }
  public void Configurate(){
    System.out.println("Configurating Console");
  }

  public void DownloadGame(){
    System.out.println("Downloading from ConsoleStore");
  }

  public double getPrice(){
    return price;
  }

  public String getCompany(){
    return companyName;
  }

  public String getGameFamous(){
    return gameFamous;
  }

}

