package lib;

public class Dog extends Woof {
  
  public String react(int o, float h){
    if(o < 5){
      if (h < 10){
        return "shake";
      } else{
        return "bark";
        }
    } else {
      if (h < 10){
        return "bark";
      } else {
        return null;
        }
      }
    }
  public String react(String p){
    if ((p == "eat") || ( p == "hi")){
      return "shake";
    } else{
      return null;
    }
  } 
  public String react (int h, int m){
    if(h < 12 ){
      return "shake";
    }
    else if(h >= 18){
      return null;
    } else{
      return "shake and bark";
    }
  }
  public String react(boolean d){
    if (d){
      return "shake";
    } else{
      return "bark and growl";
    }
  }
}
