package aula02;
public class Pen {
    public String model;
    public String color;
    public float tip;
    public int change;
    public boolean closed;

    public void status (){
        System.out.println("One pen" + this.color);
        System.out.println("Model:" + this.model);
        System.out.println("Are it capped?" + this.closed);
        System.out.println("Change:" + this.change);
    }
    public void draw(){
        if (this.closed == true) {
            System.out.println("Error: cannot draw, the pen is closed");
        }
        else {
            System.out.println("It was drawing");
        }
        
    }
    public void close(){
        this.closed = true;
    }
    public void open (){
        this.closed = false;
    }
    
}  
