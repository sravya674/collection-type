package mysimplespringapp;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.FileSystemXmlApplicationContext;

	public class myApp {
	public static void main(String args[])
	{
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		fruit myFruit = appContext.getBean("fruit" , fruit.class);
		
		vegetable myvegetable= (vegetable)appContext.getBean("vegetable");
		
		vegetable vegiwithname= (vegetable)appContext.getBean("vegetable");
		fruit myotherfruit= appContext.getBean("fruitwithlistandmap",fruit.class);
		
		
		
		System.out.println(myFruit.talkaboutyourself());
		

		System.out.println(myvegetable.talkaboutyourself());
		
		System.out.println(vegiwithname.talkaboutyourself());
		
		System.out.println(myotherfruit.talkaboutyourself());
		
		((FileSystemXmlApplicationContext) appContext) .close();
	}
	}



