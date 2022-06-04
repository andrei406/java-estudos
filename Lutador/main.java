package lib;

import lib.Lutador;
import lib.Lutar;


public class main {

  public static void main(String[] args) {
   
    Lutador l1 = new Lutador("Rodrigo", "Brasil", 27, 2, 0, 3, 1.77f, 81.2f );
    l1.apresentar();
    l1.status();
    Lutador l2 = new Lutador("Marcos","Argentina",45,5, 20, 35, 1.98f, 83.0f);
    l2.apresentar();
    l1.status();
    
  Lutar f01 = new Lutar();
  f01.marcarLuta(l1,l2);
  f01.lutar();
  }

}
