package lib;
import lib.Gafanhoto;
import lib.Video;;
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.totAssistido.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setVisualizacoes(this.filme.getVisualisacoes() + 1);

    }
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int a){
        this.filme.setAvaliacao(a);
    }
    public void avaliar(float a){
        int tot = 0;
        if (a <=20){
            tot = 3;
        } else if (tot <= 50){
            tot = 5;
        } else if (tot <=90){
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
}
