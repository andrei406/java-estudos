package Exercices;

class Pen {
  public String model;
  public String color;
  private float tip;
  private int change;
  private boolean closed;
  
  public void status(){
    System.out.println(" The pen is " + color);

  }
  
  public void write() {
    if (closed == true){
      System.out.println("Error: Pen is closed");
    } else {
      System.out.println("I'm write");
    }
  }
  private void draw() {
    if (closed == true){
      System.out.println("The pen is closed");
    } else {
      System.out.println("I'm drawing");
    }
  }

   
  }
