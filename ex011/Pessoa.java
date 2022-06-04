package ex011;
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String n, String s, int i){
        nome = n;
        sexo = s;
        idade = i;
    }

    public void fazerAniv() {
        setIdade(getIdade() + 1);
        
    }

    private void setIdade(int i) {
        idade = i;
    }

    private int getIdade() {
        return idade;
    }
    public void setNome(String n) {
        nome = n;
    }
    public String getNome(){
        return nome;
    }
    public void setSexo(String s) {
        sexo = s;
    }
    public String getSexo(){
        return sexo;
    }
}
