package ex011;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    public Aluno(String n, String s, int i, int m, String c) {
        super(n, s, i);
        //TODO Auto-generated constructor stub
        matricula = m;
        curso = c;
    }
   

    public void setMatricula(int m) {
        matricula = m;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setCurso(String c) {
        curso = c;
    }
    public String getCurso(){
        return curso;
    }
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga!");
    }
}
