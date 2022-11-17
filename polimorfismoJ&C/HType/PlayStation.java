/*
* @Autor: Darwin Neira Carrasco
* @Email: dneirac@unsa.edu.pe
* @Descripcion:
*/

public class PlayStation implements Product {

  private double price;
  private String company;
  private int popularity;

  public PlayStation(){
    this.price = 18.95;
    this.company = "PlayStation";
    this.popularity = 80;

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

