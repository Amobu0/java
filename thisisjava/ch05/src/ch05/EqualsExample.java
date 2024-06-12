package ch05;

public class EqualsExample {
    public static void main(String[] args) {
        //job1과 job2는 같은 번지를 가진다.
        String job1 = "개발자";
        String job2 = "개발자";

        //name1과 name2는 다른 번지를 가진다.
        String name1 = new String("Amobu0");
        String name2 = new String("Amobu0");

        boolean a = job1.equals(job2); //true
        boolean b = name1.equals(name2); //true

        boolean c = job1 == job2;
        boolean d = name1 == name2;
        System.out.println("a = " + a); //true
        System.out.println("b = " + b); //true
        System.out.println();
        System.out.println("c = " + c); //true
        System.out.println("d = " + d); //false


    }
}
