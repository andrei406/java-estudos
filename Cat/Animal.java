package lib;

public abstract class Animal {
  private int old;
  private int lips;
  private float mass;
  
  public void setOld(int o){
    old = o;
  }
  public int getOld(){
    return old;
  }
  public void setLips(int l){
    lips = l;
  }
  public int getLips(){
    return lips;
  }
  public void setMass(float m){
    mass = m;
  }
  public float getMass(){
    return mass;
  }
  public String walk(){
    return null;
  }
  public String eat(){
    return null;
  }
  public String sound(){
    return null;
  }
  
}
