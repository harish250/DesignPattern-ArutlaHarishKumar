package designpatternexample.Creational;

public class SingletonClass {
    
	private static SingletonClass instance;
	 
	public SingletonClass()
	{
		System.out.println("Singleton object created only once\n");
	}
	public static SingletonClass getInstance()
	{
		if(instance==null)
			return new SingletonClass();
		
		return instance;
	}
	
}
