package Empolyee_317;

/*
   어서와 java는 처음이지! page 317
   - 직원과 매니저 클래스 작성(상속 접근 제어)
*/

public class Manager extends Employee{
  private int bonus;  // private 멤버

  public Manager(String name, String address, int salary, int rrn, int bonus) {
    super(name, address, salary, rrn); // Employee한테 상속 받아온 생성자를 호출
    this.bonus = bonus;
  }

  void test() {
    System.out.println("name=" + name);
    System.out.println("address=" + address);
    System.out.println("salary=" + salary);
  }
}
