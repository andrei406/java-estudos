package lib;

import java.util.Random;


public class Lutar {
  private Lutador desafiado, desafiante;
  private int round;
  private boolean aprovada;
  
  public void marcarLuta(Lutador l1, Lutador l2){
   if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
   this.aprovada = true;
   desafiado = l2;
   desafiante = l1;
  } else {
    aprovada = false;
    desafiante = null;
    desafiado = null;
  }
 }
 public void lutar(){
  if (aprovada) {
   System.out.println("##### DESAFIANTE #####");
   desafiante.apresentar();
   System.out.println("##### DESFIADO #####");
   desafiado.apresentar();
     
 } else {
  System.out.println();
  System.out.println("A luta não poderá ocorrer");
    }
 Random aleatorio = new Random();
 int vencedor = aleatorio.nextInt(3);
 switch (vencedor) {
  case 0:
   System.out.println("Ouve empate");
   desafiante.empatarLuta();
   desafiado.empatarLuta();
   break;
  case 1:
   System.out.println("O desafiado venceu");
   desafiado.ganharLuta();
   desafiante.perderLuta();
   break;
  case 2:
   System.out.println("O desafiante ganhou a luta");
   desafiante.ganharLuta();
   desafiado.perderLuta();
   break;
  }
 }
}