package com.monocept;

public class Test {
	
	public static void main(String[] args)
	{
//		IOperation io = new IOperation() {
//			
//			@Override
//			public void showMessage()
//			{
//				System.out.println("Hello");
//			}
//		};
//		io.showMessage();
		
		IOperation io1 = (m)-> System.out.println("Hi " + m);
		io1.showMessage("Hello");
		
//		String message = "Hello";
//		IOperation io = (m) -> 
//		{
//			System.out.println("Hello " + m);
//			
//		};
//		io.showMessage(message);
//		
	}

}
