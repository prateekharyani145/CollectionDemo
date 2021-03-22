package CoreTopics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserDetails implements Serializable{
	String userName = "PrateekHaryani";
	String userID ="prateekharyani2018@gmail.com";
	transient String pass ="Hexaview@123";
	int age = 23;
}

public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		UserDetails userDetails = new UserDetails();
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(userDetails);
		oos.close();
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		UserDetails userDetailsCopy = (UserDetails)ois.readObject();
		ois.close();

		System.out.println(userDetailsCopy.userName);
		System.out.println(userDetailsCopy.userID);
		System.out.println(userDetailsCopy.pass);
		System.out.println(userDetailsCopy.age);
		
//		PrateekHaryani
//		prateekharyani2018@gmail.com
//		null
//		23

		
	
	}


	
}
