package com.salahbkd.advanced.generics.sample;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
    public static void main(String[] args) {
        // generics collection Demo
        /*GenericCollection<Student> students = new GenericCollection<>();
        students.add(new Student("student1"));
        students.add(new Student("student2"));
        System.out.println(students.get(1)); // type casting is not required

        // generics methods demo
        String[] names = {"name1", "name2", "name3"};
        Integer[] ints = {10, 20, 30};
        // print() works with any reference type array
        GenericMethods.print(names);
        GenericMethods.print(ints);
*/
        var studentsList = new GenericCollection<Student>();
        studentsList.add(new Student("student1"));
        studentsList.add(new Student("student2"));

        var teachersList = new GenericCollection<Teacher>();
        teachersList.add(new Teacher("teacher1"));
        teachersList.add(new Teacher("teacher2"));
        // printCollection() works with any GenericCollection of Person sub-types
        GenericMethods.printCollection(studentsList);
        GenericMethods.printCollection(teachersList);

        var genericCollection = new GenericCollection<Object>();
        // printCollection() also works with any GenericCollection of an instance of Object
        // or its sub-types.
        GenericMethods.addToCollection(genericCollection, new Student("student3"));
        GenericMethods.addToCollection(genericCollection, new Teacher("teacher3"));

    }
}
