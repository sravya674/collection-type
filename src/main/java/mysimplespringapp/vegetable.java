package mysimplespringapp;

public class vegetable {
	
	 public vegetable() {};
     private String myName;

 	public String getMyName() {
 		return myName;
 	}

 	public void setMyName(String myName) {
 		this.myName = myName;
 	}
 	
 	public vegetable(String pName)
 	{
 		setMyName(pName);
 	}
		public String talkaboutyourself() 
		{
	
			String speech= "Hello i am a vegetable";
		    if( myName != null  && myName != "")  
		    	speech = speech +"my name is "+ myName ;
		    return speech;
	    }
	}


