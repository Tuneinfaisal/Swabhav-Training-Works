package model;

public class ObjectCreation {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		// Creating an object by using newInstance method
		Student s1 = (Student) Class.forName("test.Student").newInstance();
		
		System.out.println(s1);
		
		s1.id = 102;
		System.out.println(s1.id);
	}

}
