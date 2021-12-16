package com.example.myfirstapp_01;

// builder 패턴
public class Student {

    private String name;
    private int grade;

    private Student() {}

    // 내부 정적 클래스 생성
    public static class MyBuilder {
        private String name;
        private int grade;

        // 자기자신을 리턴하는 메소드
        public MyBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public MyBuilder setGrade(int grade) {
            this.grade = grade;
            return this;
        }

        //
        public Student build() {
            Student student = new Student();
            student.name = name;
            student.grade = grade;
            return student;
        }
    }
    public static void main(String[] args) {
        Student st = new MyBuilder().setName("홍길동").setGrade(3).build();
        
    }

}
