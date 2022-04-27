package sss;
public class Person {
    private String name;
    private int age;
    private String adreess;
  
    public Person() {}
    public Person(String name, int age, String adreess) {
        this.name = name;
        this.age = age;
        this.adreess = adreess;
    }
    public void hienThiThongTin() {
        System.out.println("\nTen: " + name);
        System.out.println("\nTuoi: " + age);
        System.out.println("\nDia chi: " + adreess);
    }
    public void display() {
    }
  }