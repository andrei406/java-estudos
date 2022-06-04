//package Leitor;


import Leitor.*;


public class main {

  public static void main(String[] args) {
    Pessoa p1 = new Pessoa(18, "feminino", "Vanessa");
    Pessoa p2 = new Pessoa(28, "masculio", "Marcelo");

    Livro l1 = new Livro("Lie", "Rico" , 101, p1);
    System.out.println(l1.detalhes());
  }

}
