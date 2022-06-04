package ex011;

public class Bolsista extends Aluno{
    private int bolsa;

    public Bolsista(String n, String s, int i, int m, String c, int b) {
        super(n, s, i, m, c);
        //TODO Auto-generated constructor stub
        bolsa = b;
    }

    public void setBolsa(int b) {
        bolsa = b;
    }

    public int getBolsa() {
        return bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Bolsa renovada!");
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Bolsista tem facilidade para pagar mensalidade!");
    }
}
