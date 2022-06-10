package lib;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int visualisacoes;
    private int curtidas;
    private boolean reproduzindo;

    

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.visualisacoes = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    public void setTitulo(String t){
        titulo = t;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setAvaliacao (int a){
        int nova;
        nova = ((int) ((this.avaliacao + a))/this.visualisacoes);
        this.avaliacao = nova;
    }
    public int getAvaliacao() {
        return avaliacao;
    }

    public void setVisualizacoes(int v){
        visualisacoes = v;
    }
    public int getVisualisacoes() {
        return visualisacoes;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    public boolean getReproduzindo(){
        return reproduzindo;
    }
    
    @Override
    public void play(){
        reproduzindo = true;
    };
    @Override
    public void pause(){
        reproduzindo = false;
    };
    @Override
    public void like(){
        curtidas++;

    };
    public String status(){
        return "Visualizações: " + getVisualisacoes() + "\nLikes: " + getCurtidas() + "\nAvaliação: " + getAvaliacao();
    }
}
