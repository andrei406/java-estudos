package Leitor;

import Leitor.Pessoa;


public class Livro implements Publicacao {
  private String titulo;
  private String autor;
  private int atuPag;
  private int totPaginas;
  private boolean aberto;
  private Pessoa leitor;
  
  public Livro(String t, String a, int tot, Pessoa l){
    titulo = t;
    autor = a;
    atuPag = 0;
    totPaginas = tot;
    aberto = false;
    leitor = l;
  }
  
  public void setTitulo(String t){
    titulo = t; 
  }
  public String getTitulo(){
    return titulo;
  }
  public void setAutor(String a){
    autor = a;
  }
  public String getAutor(){
    return autor;
  }
  public void setatuPag(int p){
    atuPag = p;
  }
  public int getatuPag(){
    return atuPag;
  }
  public void setTotPaginas(int tP){
    totPaginas = tP;
  }
  public int getTotPaginas(){
    return totPaginas;
  }
  public void setAberto(boolean aB){
    aberto = aB;
  }
  public boolean getAberto(){
    return aberto;
  }
  public void setPessoa(Pessoa p){
    leitor = p;
  }
  public Pessoa getPessoa(){
    return leitor;
  }
  
  @Override
  public String detalhes(){
    return "autor: " + autor + "\ntítulo: " + titulo + "\ntotal de páginas: " + totPaginas + "\naberto: " + aberto + "\nleitor: " + leitor.getNome();
  }
  @Override
  public void abrir(){
    aberto = true;
  }
  @Override
  public void fechar(){
    aberto = false;
  }
  @Override
  public void avancPag(){
    atuPag ++;
  }
  @Override
  public void voltPag(){
    atuPag --;
  }
  @Override
  public void folhear(int p){
    atuPag = p;
  }
}

