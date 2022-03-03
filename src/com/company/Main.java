package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Almaz", 20));
        arrayList.add(new Student("Nurgazy", 19));
        arrayList.add(new Student("Ulan", -26));
        arrayList.add(new Student("Muhammad", 25));
        arrayList.add(new Student(null, 22));


        for (Student a : arrayList) {
            System.out.println(a);

            try {

                if (a.getAge() < 0) {

                    throw new MyException(a.getName() + " жашы терс болбоо керек");

                }

            } catch (MyException w) {
                System.err.println(w.getMessage());
            }
            try {
                if (a.getName() == null) {
                    throw new MyException(a.getName() + " аты бош болбоо керек");
                }
            } catch (MyException q) {
                System.err.println(q.getMessage());
            }
        }
    }
}