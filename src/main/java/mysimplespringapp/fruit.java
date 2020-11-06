package mysimplespringapp;

import java.util.List;
import java.util.*;


	public class fruit {

	        
	        private List<String> fruitNameList;

	        private Map<String,String> fruitNameMap;
	        
	        public Map<String, String> getFruitNameMap() {
				return fruitNameMap;
			}

			public void setFruitNameMap(Map<String, String> fruitNameMap) {
				this.fruitNameMap = fruitNameMap;
			}

			public List<String> getFruitNameList() {
				return fruitNameList;
			}

			public void setFruitNameList(List<String> fruitNameList) {
				this.fruitNameList = fruitNameList;
			}
			

	        
			public String talkaboutyourself() {
		
				String speech= "Hello i am a fruit";
			    if( fruitNameList != null  && fruitNameList.size() > 0 )  
			    {
			    	speech += "\nLIST: " ;
			       for(int i = 0;i<fruitNameList.size();i++)
			       {
			    	speech += "name :" + fruitNameList.get(i);
			       }
			    }
			    if( fruitNameMap != null  && fruitNameMap.size() > 0 )  
			    {
			    	speech += "\nMap: ";
			    	for(Map.Entry<String, String> fruitName : fruitNameMap.entrySet()) 
			    	{
			    		speech += fruitName.getKey() + "==>" + fruitName.getValue() + "  ::  ";
			    	}
			  	}
			    return speech;
			}

			
		}


