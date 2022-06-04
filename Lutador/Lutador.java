package lib;

public class Lutador {
 private String nome, nacionalidade, categoria;
 private int idade, derrota, empate, vitoria;
 private float altura, peso;
 
 public Lutador(String n, String nn, int i, int d, int e, int v, float a, float p) {
  setNome(n);
  setPeso(p);
  setIdade(i);
  setNacionalidade(nn);
  setDerrota(d);
  setVitoria(v);
  setAltura(a);
  setEmpate(e);
  // this.nome= n;
  // this.nacionalidade =nn;
 //  this.idade = i;
 //  this.derrota = d;
//   this.empate = e;
//   this.vitoria = v;
 //  this.peso = p;
 //  this.altura = a;
 
 }
 
 public void setNome(String n){
   this.nome = n;
 }
 public String getNome(){
   return this.nome;
 }
 public void setPeso(float p){
   this.peso = p;
 }
 public float getPeso(){
   return this.peso;
 }
 
public void setIdade(int i){
  this.idade = i;
}
public int getIdade(){
  return this.idade;
}

public void setAltura(float a){
  this.altura = a;
}
public float getAltura(){
  return this.altura;
}

public void setNacionalidade(String n){
  this.nacionalidade = n;
}
public String getNacionalidade(){
  return this.nacionalidade;
}

public void setCategoria(){
  if (getPeso() < 52.2){
    System.out.println("Peso inválido para qualquer categoria");
  } 
  else if (getPeso() <= 70.3){
    this.categoria = "leve";
  }
  else if (getPeso() <= 83.9){
    this.categoria= "médio";
  }
  else if (getPeso() <= 120.2){
    this.categoria = "pesado";
  }
  else{
    System.out.println("Peso inválido à qualquer categoria");
  }
}
public String getCategoria(){
  return this.categoria;
}

public void setDerrota(int d){
  this.derrota = d;
}
public int getDerrota(){
  return this.derrota;
}

public void setVitoria(int v){
  this.vitoria = v;
}
public int getVitoria(){
  return this.vitoria;
}

public void setEmpate(int e){
  this.empate = e;
}
public int getEmpate(){
  return this.empate;
}

public void apresentar(){
  System.out.println();
  System.out.println("Lutador no ring: " + getNome());
  System.out.print("com idade de " + getIdade());
  System.out.println(" anos ");
  System.out.println(getVitoria() + " vitórias");
  System.out.println(getEmpate() + " empates");
  System.out.print("e apenas " + getDerrota());
  System.out.println(" derrotas");
}
public void status(){
  System.out.println("O pais é " + getNacionalidade());
  System.out.println("a categoria é " + getCategoria());
 
}
public void ganharLuta(){
  setVitoria(getVitoria() + 1);
}
public void empatarLuta(){
  setEmpate(getEmpate() + 1);
}
public void perderLuta(){
  setDerrota(getDerrota() + 1);
}
}
