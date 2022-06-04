package ambiente;

public class Person{
    //p P
    private String name;
    private int old;
    private String gender;

    public Person(String n, String g, int o){
        name = n;
        old = o;
        gender = g;
        
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setOld(int o){
        old = o;
    }
    public int getOld(){
        return old;
    }
    public void setGender(String g){
        gender = g;
    }
    public String getGender(){
        return gender;
    }
    public void doBrithday(){
        setOld(getOld() + 1);
    }
    public String info(){
        return "\nname: " + getName() + "\n gender: " + getGender() + "\n old: " + getOld() + "\n";
    }
}
