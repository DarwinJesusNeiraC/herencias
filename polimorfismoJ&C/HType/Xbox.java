/*
* @Autor: Darwin Neira Carrasco
* @Email: dneirac@unsa.edu.pe
* @Descripcion:
*/

public class Xbox implements Product {

  private double price;
  private String company;
  private int popularity;

  public Xbox(){
    this.price = 20.45;
    this.company = "Xbox";
    this.popularity = 50;
  }

  public double priceIGV(){
    return this.price * IGV;
  }

  public void company(){
    System.out.println("Name company: " + this.company);
  }

  public int popularityPercentage(){
    return this.popularity;
  }

}
