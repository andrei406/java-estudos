package lib;

public class testAcademia {
 public static void main (String [] args){
  Academia c1 = new Academia("Maromba", 7, 33.99f, 37, true, true);
  c1.status();
  c1.pagarMensalidade();
  c1.status();
  } 
 }