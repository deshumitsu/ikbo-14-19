package ru.mirea;

public class Practic1_Dog {
    public static class Dog
    {
        private String name;
        private int age;
        Dog(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public void ToString()
        {
            System.out.println(name);
            System.out.println(age);
        }


    }
    public static void main(String[] args)
    {
        Dog dg;
        dg = new Dog("Zyablik", 3);
        dg.ToString();
    }
}