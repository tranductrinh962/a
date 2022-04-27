package sss;
public class Student extends Person {
  private double math, physics, average;
  public Student() {}
  public Student(int id, String name, int age, double math, double physics, double chemistry) {
      this.math = math;
      this.physics = physics;
      average = (math + physics) / 2;
  }
  public double getAverage() {
      return average;
  }
  public double getMath() {
      return math;
  }
  public void display() {
      super.display();
      System.out.println("\tDiem toan: " + math);
      System.out.println("\tDiem vat ly: " + physics);
      System.out.println("\tDiem trung binh: " + average);
  }  
}

