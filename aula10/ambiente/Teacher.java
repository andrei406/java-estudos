package ambiente;

public class Teacher extends Person{
    private float salary;
    private String materia;
    public Teacher(String n, String g, int o, float s, String m) {
        super(n, g, o);
        //TODO Auto-generated constructor stub
        salary = s;
        materia = m;
    }
    

    public void setSalary(float c) {
        salary = c;
    }
    public float getSalary(){
        return salary;
    }
    public void setMateria(String a){
        materia = a;
    }
    public String getMateria(){
        return materia;
    }
    public void moreSalary(float M){
        setSalary(getSalary() + M);
    }
    @Override
    public String info(){
        return "\nname: " + getName() + "\n gender: " + getGender() + "\n old: " + getOld() + "\nsalary: " + getSalary() + "\nmateria: " + getMateria() + "\n";
    }
}
