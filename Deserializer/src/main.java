import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
User user = null;

FileInputStream fileIn = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Serializer\\UserInfo.ser");
ObjectInputStream in = new ObjectInputStream(fileIn);
user = (User)in.readObject();
in.close();
fileIn.close();

System.out.println(user.name);
System.out.println(user.password);
user.sayHello();


	}

}
