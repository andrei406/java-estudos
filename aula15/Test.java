//package lib;
import lib.*;
public class Test {
    public static void main(String[] args) {
        Video v1 = new Video("Seja um apoiador");
        Video v2 = new Video("SQL introdução");
        v1.play();
        v1.like();
        Gafanhoto p1 = new Gafanhoto("Andrei", 17, "masculino", "@andrei", 17.0f);
        System.out.println(p1.info());  
        System.out.println(v1.status());
        Visualizacao vv = new Visualizacao(p1, v1);
        System.out.println(vv.toString());
        Visualizacao vv2 = new Visualizacao(p1, v2);
    }
    
}
