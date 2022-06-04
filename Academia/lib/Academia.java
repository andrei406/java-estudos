package lib;

public class Academia {
 public String cliente;
 public int frequencia;
 private float mensalidade;
 private int idade;
 private boolean ativo;
 private boolean debito;
 
 public Academia(String c, int f, float m, int i, boolean a, boolean d){
   this.cliente = c;
   this.frequencia = f;
   this.mensalidade = m;
   this.idade = i;
   this.debito = d;
   this.ativo = a;
 }
 public void setCliente(String c){
   this.cliente = c;
 }
 public String getCliente(){
   return this.cliente;
 }
 public void setFrequencia( int f){
   this.frequencia = f;
 }
 public int getFrequencia(){
   return this.frequencia;
 }
 public void setMensalidade(float m){
   this.mensalidade = m;
 }
 public float getMensalidade(){
   return this.mensalidade;
 }
 public void setIdade(int i){
   this.idade = i;
 }
 public int getIdade(){
   return this.idade;
 }
 public void setAtivo(boolean a){
   this.ativo = a; 
 }
 public boolean getAtivo(){
   return this.ativo;
 }
 public void setDebito(boolean d){
   this.debito = d;
 }
 public boolean getDebito(){
   return this.debito;
 }
 
  public void status(){
   System.out.println();
   System.out.println("Cliente: " + getCliente());
   if (ativo){
    System.out.println();
    System.out.print("a frequência de dias é de " + getFrequencia());
     System.out.println(" dias");
     System.out.println("a mensalidade é de R$" + getMensalidade());
    }
    System.out.println();
   if (debito){
   
    System.out.println("O cliente está com débito");
    } else if (ativo == false ) {
       System.out.println("Cliente inativo");
    }
   }
   
 public void pagarMensalidade(){
  System.out.println();
  if (debito && ativo){
   System.out.println("Mensalidade paga!");
   setDebito(false);
  } else if (getAtivo() == false){ 
   System.out.println("Cliente inativo");
  } else if (getDebito() == false){
    System.out.println("Cliente não tem débito");
  }
 }
     
 public void cancelarCliente(){
   setAtivo(false);
     }

 }
