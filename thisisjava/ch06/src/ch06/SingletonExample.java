package ch06;

public class SingletonExample {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();

        if (obj1 == obj2) {
            System.out.println("같다");
            System.out.println(obj1);
            System.out.println(obj2);
        } else {
            System.out.println("다르다");
        }
    }
}
