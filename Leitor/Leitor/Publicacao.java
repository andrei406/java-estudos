package Leitor;

public interface Publicacao {
  public void abrir();
  public void fechar();
  public void folhear(int p);
  public void avancPag();
  public void voltPag();
  public String detalhes();
}
