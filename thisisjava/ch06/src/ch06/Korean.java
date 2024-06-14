package ch06;

public class Korean {
    //인스턴스 final 필드 선언
    final String nation = "대한민국";
    final String gender;

    //인스턴스 필드 선언
    String name;

    //생성자 선언
    public Korean(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }
}
