package org.devjangir.creational.Builder;

public class Student {
    int age;
    String name;
    int grade;

    private Student(StudentBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.grade = builder.grade;
    }

    public static class StudentBuilder {
        int age;
        String name;
        int grade;

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setGrade(int grade) {
            this.grade = grade;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public static void main(String[] args) {
        Student student = new Student.StudentBuilder()
                .setAge(10)
                .setName("John")
                .setGrade(5)
                .build();
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.grade);
    }
}
