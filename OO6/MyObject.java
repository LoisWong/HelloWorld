package OO6;

class Object {
    int value;
    Object(int val) {this.value = val;}
    int getValue() {return this.value;}
    void setValue(int val) {this.value = val;}
    String getName() {return "Object";}
}

public class MyObject extends Object {
    String getName() {return "MyObject";}
    MyObject(int a) {super(a);}
    public static void main(String[] args) {
        System.out.println("comparisons: " + (new MyObject(100).getValue() < new MyObject(200).getValue()) + ",  " +  (new MyObject(100).getValue() <= new MyObject(200).getValue()) + ",  " +  (new MyObject(100).getValue() > new MyObject(200).getValue()) + ",  " + (new MyObject(100).getValue() >= new MyObject(200).getValue()) + ",  "+  (new MyObject(100).getValue() == new MyObject(200).getValue()));
        return;
    }
}

