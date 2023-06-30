package test;

import java.util.Comparator;

public class Footballer {
    int age;
    String name;
    String club;

    Footballer(int age, String name, String club) {
        this.age = age;
        this.name = name;
        this.club = club;
    }

    @Override
    public String toString() {
        return "age=" + age + ", name='" + name + '\'' + ", club='" + club;
    }
}
