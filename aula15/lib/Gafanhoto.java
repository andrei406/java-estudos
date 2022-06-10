package lib;

public class Gafanhoto extends Pessoa {
    String login;
    float totAssistido;
    

    public Gafanhoto(String nome, int idade, String sexo, String login, float totAssistido) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = totAssistido;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public float getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(float totAssistido) {
        this.totAssistido = totAssistido;
    }
    public String info() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nTotal assistido: " + getTotAssistido() + "\n Nivel de experiência: " + getExperiencia() ;
    }
}
