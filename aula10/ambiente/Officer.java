package ambiente;

public class Officer extends Person{
    private boolean working;
    private  String sector;

    public Officer(String n, String g, int o, boolean w, String s) {
        super(n, g, o);
        working = w;
        sector = s;
        //TODO Auto-generated constructor stub
    }
    



    public void setWorking(boolean w) {
        working = w;
    }
    public String getWorking() {
        if (working){
            return "yes";
        }
        else{
            return "not";
        }
    }
    public void setSector(String s){
        sector = s;
    }
    public String getSector() {
        return sector;
    }
    public void changeWork(String nW){
        setSector(nW);
    }
    @Override
    public String info(){
        return "\nname: " + getName() + "\n gender: " + getGender() + "\n old: " + getOld() + "\nsector:" + getSector() + "\nworking: " + getWorking() +"\n";

    }
}