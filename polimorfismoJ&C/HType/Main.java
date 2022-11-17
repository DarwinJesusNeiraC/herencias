/*
* @Autor: Darwin Neira Carrasco
* @Email: dneirac@unsa.edu.pe
* @Descripcion:
*/

public class Main {
  public static void main(String [] args){
    PlayStation ps = new PlayStation();
    Xbox xb = new Xbox();

    System.out.println("PlayStation price: " + ps.priceIGV());
    ps.company();
    System.out.println("PlayStation populary: " + ps.popularityPercentage());


    System.out.println("Xbox price: " + xb.priceIGV());
    xb.company();
    System.out.println("Xbox populary: " + xb.popularityPercentage());
  }

}

