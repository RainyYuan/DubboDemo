package com.alibaba.sjmodel;

//构造器
public class StudentBuilder {
    // 需要构建的对象
    private Student student = new Student();
    public StudentBuilder id(int id) {
        student.setId(id);
        return this;
    }
    public StudentBuilder name(String name) {
        student.setName(name);
        return this;
    }

    // 构建对象
    public Student build() {
        return student;
    }



    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        // 决定如何创建一个Student
        Student student = builder.name("zhangsan").id(111).build();
        System.out.println(student);
    }
}
