/*
* @Autor: Darwin Neira Carrasco
* @Email: dneirac@unsa.edu.pe
* @Descripcion:
*/

public class Main {
  public static void main(String [] args){
    Console ps = new PlayStation(23.5,"GOW");
    ps.Configurate();
    Console s = new Switch(23.5,"Mario");
    s.Configurate();
    Console c = new Console(23.5,"NewConsole","Game");
    c.Configurate();
  }
}

