package sss.nv;

import sss.Employee;

public class parttime extends Employee {
    public double salary;
    public double rate;
    public parttime() {}


    public parttime(String name, int age, String address, double salary, double rate) {
      this.salary = salary;
      this.rate = rate;
  }
}