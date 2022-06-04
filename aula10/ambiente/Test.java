package ambiente; 
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Victor", "Masculino", 22);
        Student p2 = new Student("Beto", "Male", 18, "College", "1st semester");
        Officer p3 = new Officer("Wesley", "Male", 23, true, "writer");
        Teacher p4 = new Teacher("Will", "Male", 44, 1500, "math");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(p3.info());
        System.out.println(p4.info());
    }
}
