package aula04;
public class Bank {

    public int number;
    public String type;
    private String user;
    private float cash;
    private boolean status;

    public Bank(int n, String t, String u, float c, boolean s){
        setNumber(n);
        setType(t);
        setUser(u);
        setCash(c);
        setStatus(s);
        System.out.println("Account's " + getUser());
        System.out.println();
    }
    public void setUser(String u){
        this.user = u;
    }
    public String getUser(){
        return this.user;
    }
    public void setType(String t){
        this.type = t;
    }
    public String getType(){
        return this.type;
    }
    public void setCash(float c){
        this.cash = c;
    }
    public float getCash(){
        return this.cash;
    }
    public void setNumber(int n){
        this.number = n;
    }
    public int getNumber(){
        return this.number;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void info (){
        if (getStatus()){
            System.out.println("Cash: " + getCash());
            System.out.println("Type: " + getType());
            System.out.println("User: " + getUser());
            System.out.println("Number: " + getNumber());
        }else{
            System.out.println("Sorry, but this account is closed");
        }
    }
    public void closeAcc(){
        if (getCash() > 0){
            System.out.println("The account cannot be closed. Have cash");
        } else if (getCash() < 0) {
            System.out.println("You have credit");
        }
         else{
            System.out.println("The account was closed");
            setStatus(false);
        }
    }
    public void openAcc(String t) {
        this.setType(t);
        if (t== "AN"){
            this.setCash(50);
            setStatus(true);
        } else if ( t == "AC") {
            this.setCash(150);
            setStatus(true);
        } else{
            System.out.println("Sorry, but the account type have a eror ");
        }
    }
    public void addCash(float c){
        if (getStatus()) {
            this.cash += c;
            System.out.println("Now your cash is: " + getCash());
        } else {
            System.out.println("Sorry, but your status are bad :(");
        }
    }
    public void exitCash(float c){
        if (getStatus()){
            this.cash -= c;
            System.out.println("To buy of " + c);
        } else{
            System.out.println("Sorry, but your status are bad :(");
        }

    }
    public void payMonh(){
        if (getStatus()){
            float v = 0;
            if (getType() == "AN"){
                v = 12;
                this.cash -= v;
                System.out.println("You account are bought");
            } else if ( getType() == "AC"){
                v = 20;
                System.out.println("You account are boutht");
                this.cash -= v;
            } else{
                System.out.println("Sorry, but have a erro! Your Status");
            }
        }
    }
}
