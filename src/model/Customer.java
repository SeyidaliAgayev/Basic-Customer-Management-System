package model;

public class Customer {
    private int id;
    private String name;
    private int age;
    private int salary;


    public Customer() {

    }

    public Customer(int id, String Name, int Age, int Salary) {
        this.id = id;
        this.name = Name;
        this.age = Age;
        this.salary =Salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getInfo() {
        return "----------------\n" +
                id + ". Customer\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Salary: " + salary;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
