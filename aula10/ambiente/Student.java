package ambiente;

public class Student extends Person {
    private String grade;
    private String curse;

    public Student(String n, String g, int o, String gr, String c) {
        super(n, g, o);
        //TODO Auto-generated constructor stub
        grade = gr;
        curse = c;

    }
    //p P
   
    public void setGrade(String g){
        grade = g;
    }
    public String getGrade(){
        return grade;
    }
    public void setCurse(String c) {
        curse = c;
    }
    public String getCurse() {
        return curse;
    }
    public void cancelGrade(){
        setGrade(null);
    }
    @Override
    public String info(){
        return "\nname: " + getName() + "\n gender: " + getGender() + "\n old: " + getOld() + "\ngrade: " + getGrade() + "\ncurse: " + getCurse() + "\n";
    }
}
