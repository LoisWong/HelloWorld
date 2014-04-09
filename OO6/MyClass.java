package OO6;

public class MyClass{
	public int data; // mydata     
    MyClass(int n) {
          this.data = n;
    }     
    int getData() {        
        return this.data;
    }     
    int addValue(int n) {
        this.data += n;
        return this.data;
    }
    int subValue(int n) {
        this.data -= n;
        return this.data;
    }
    public static void main(String[] args) {
        MyClass myclass = new MyClass(2998);
        System.out.println(myclass.getData());
        myclass.data = 489;
        System.out.println(myclass.getData());
        myclass.addValue(22);
        System.out.println(myclass.data);
        myclass.data += 350;
        System.out.println(myclass.data);
        return;
     }

}
