class Chick implements Animal 
{     
	private int RandomSOUNDS;
	private String myType;     
     private String mySound;     
     public Chick(String type, String sound2, String sound)     {         
         myType = type;         
         RandomSOUNDS = (int)(Math.random()*2);
          if (RandomSOUNDS == 0)
         {
         	mySound = sound;
         }
         else 
         {
         	mySound = sound2;
         }
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType() {return myType;} 
}
