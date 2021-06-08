package Basics;

public class ByeWorld implements IWorld {

	String message;
	public void setMessage(String message)
	{
		this.message=message;
	}
	@Override
	public void getMessage() {
		// TODO Auto-generated method stub
		System.out.println("Bye World "+ message);
	}

	
}
