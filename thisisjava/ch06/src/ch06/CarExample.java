package ch06;

public class CarExample {
    public static void main(String[] args) {

        //Car 객체 생성
        Car car = new Car("현대자동차", "그렌져", "검정");

        //Car 객체의 필드값 읽기
        System.out.println("company : " + car.company);
        System.out.println("model : " + car.model);
        System.out.println("color : " + car.color);
    }
}
