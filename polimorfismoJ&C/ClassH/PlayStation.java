/*
* @Autor: Darwin Neira Carrasco
* @Email: dneirac@unsa.edu.pe
* @Descripcion:
*/

public class PlayStation extends Console{

  public PlayStation (double price, String game){
    super(price, "Sony", game);
  }

  public void Configurate(){
    System.out.println("Configurating PlayStation");
  }

}

