package aula07;

public class Figth {
    public String name, naciolity, category;
    private int age, losts, hinders, victorys;
    private float height,mass;

    public Figth(String n, String nn, int a, float h, float m, String c, int v, int l, int hh){
        this.name = n;
        this.naciolity = nn;
        this.age = a;
        this.height = h;
        this.mass = m;
        this.category = c;
        this.victorys = v;
        this.losts = l;
        this.hinders = hh;

    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void setNacionality(String n){
        this.naciolity = n;
    }
    public String getNaciolity(){
        return this.naciolity;
    }
    public void setAge(int a){
        this.age = a;
    }
    public float getAge(){
        return this.age;
    }
    public void setMass(float m){
        this.mass = m; 
    }
    public float getMass() {
        return this.mass;
    }

    public void setHeight( float h){
        this.height = h;
    }
    public float getHeight() {
        return this.height;
    }

    public void setCategory(String c){
        this.category = c;
    }
    public String getCategory(){
        return this.category;
    }
    public void setVictorys(int v){
        this.victorys = v;
    }
    public int getVictorys() {
        return this.victorys;
    }
    public void setLosts(int l){
        this.losts = l;
    }
    public int getLosts() {
        return this.losts;
    }
    public void setHinders(int h){
        this.hinders = h;
    }
    public int getHinders() {
        return this.hinders;
    }
    public void present(){
        System.out.println();
        System.out.print("Fighter: " + getName());
        System.out.println(" from " + getNaciolity());
        System.out.print("Age: " + getAge());
        System.out.print(" old | height: " + getHeight());
        System.out.print(" m|");
        System.out.println(" mass: " + getMass());
        System.out.print("Kg | Category: " + getCategory());
        System.out.println(" | Victorys: " + getVictorys());
        System.out.println();
    }
    public void winFight(){
        System.out.println("New victory to: " + getName());
        this.victorys += 1;
    }
    public void lostFigth() {
        System.out.println(getName() + "'s lose");
        this.losts += 1;
    }
    public void hinderFight(){
        System.out.println(getName() + " hinder");
        this.hinders += 1;
    }
}

