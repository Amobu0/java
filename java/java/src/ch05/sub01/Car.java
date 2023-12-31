package ch05.sub01;

public class Car {
    private static Car instance = new Car();
    public static Car getInstance() {
        return instance;
    }
    private Car() {}
    // 속성(필드)
    String name;
    String color;
    int speed;
    
    // 기능(메서드)
    public void speedUp(int speed) {
        this.speed += speed;
    }
    
    public void speedDown(int speed) {
        this.speed -= speed;
    }
    
    public void show() {
        System.out.println("차량명 : " + this.name);
        System.out.println("차량색 : " + this.color);
        System.out.println("현재속도 : " + this.speed);
    }
}
