package OO5;

class MyClass {
	void func1(int a) { 
		System.out.println(a);
	} 
	void func2(String str) {
		System.out.println(str);
	}
}

class NewClass extends MyClass { 
	void func2(String str) {
		System.out.println("NewClass:func2 :" + str); 
	}

}
public class overriding{
public static void main(String[] args) { 
	NewClass obj = new NewClass(); 
	obj.func1(123);
	obj.func2("I'm NewClass"); 
}
}
