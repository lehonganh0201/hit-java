package com;

public abstract class Person implements Displayable{
    protected int id=n;
    protected String name;

    private static int n=1;

    public Person(String name) {
        this.name = name;
        n++;
    }

    public Person() {
        n++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        Person.n = n;
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
