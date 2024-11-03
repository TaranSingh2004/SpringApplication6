package in.sp.beans;

public class Student {
    private int rollNo;
    private String name;
    private Address address;

    public Student(int rollNo, String name, Address address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println("rollno:" + rollNo);
        System.out.println("name:" + name);
        System.out.println("address:" + address);

    }
}
