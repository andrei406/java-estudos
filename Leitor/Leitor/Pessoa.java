package Leitor;

public class Pessoa {
  private int idade;
  private String sexo;
  private String nome;
  
  public Pessoa(int i, String s, String n){
    idade = i;
    sexo = s;
    nome = n;
  }
  //special methods

  public void setIdade(int i){
    idade = i;
  }
  public int getIdade(){
    return idade;
  }
  public void setSexo(String s){
    sexo = s;
  }
  public String getSexo(){
    return sexo;
  }
  public void setNome(String n){
    nome = n;
  }
  public String getNome(){
    return nome;
  }
  
  public void fazerAniv(){
    idade += 1;
  }
  public void detalhes(){
    System.out.println("a idade é " + this.idade);
  }
}
