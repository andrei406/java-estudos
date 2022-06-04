package lib;

public class Mammal extends Animal {
  public String hairColor;
  
  @Override
  public String walk(){
    return "Walking"; 
  }
  @Override
  public String sound(){
    return "normal sound";
  }
  @Override 
  public String eat(){
    return "carnivorous or herbivorus";
  }
  
}
