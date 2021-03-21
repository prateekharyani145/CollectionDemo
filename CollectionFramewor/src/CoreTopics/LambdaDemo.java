package CoreTopics;

interface addable{
   int add(int a , int b);
}
interface name{
	String getName();
}

public class LambdaDemo {
	public static String tell() {
			return "PRATEEK";
	}
	
	public static void main(String[] args) {

		
		addable add1 = (a,b) ->{return a+b;};
		System.out.println(add1.add(10,20));

		addable add2 = (a,b) ->(a+b);
		System.out.println(add2.add(10,20));
//		30
//		30
		
		name getName1 = LambdaDemo::tell;
		
		System.out.println(getName1.getName() );
	}
	
//PRATEEK

}
