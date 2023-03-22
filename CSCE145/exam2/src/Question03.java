/*
 * <<Lian Liao>>
 * CSCE 145 S2021 Exam02 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 */
//Do not alter-----------------------------------------------------------------------
public class Question03 {

	//The array of boxes to be used by the method "getAverageWeight()"
	//This property is public for testing purposes
	public Box[] boxes;
	
	public Box getMinWeight()
	{
//-----------------------------------------------------------------------------------
		//Write your solution here
		Box a = null;
		for(int i=0;i<boxes.length;i++) {
			if(boxes[i]!= null && a == null)
				a = boxes[i];
			else if(boxes[i]!= null && boxes[i].getWeight() < a.getWeight())
				a = boxes[i];
		}
		return a;
	}//Do not alter
	public Box getMaxWeight()
	{
//-----------------------------------------------------------------------------------
		//Write your solution here
		Box a = null;
		for(int i=0;i<boxes.length;i++) {
			if(boxes[i]!= null && a == null)
				a = boxes[i];
			else if(boxes[i]!= null && boxes[i].getWeight() > a.getWeight())
				a = boxes[i];
		}	
		return a;
	}//Do not alter
//Do not alter-----------------------------------------------------------------------
	public static void main(String[] args) {
		
		Box[] boxArray = new Box[10];
		boxArray[0] = null;
		boxArray[1] = null;
		boxArray[2] = new Box("Box02",10.0);
		boxArray[3] = new Box("Box03",20.0);
		boxArray[4] = null;
		boxArray[5] = new Box("Box05",40.0);
		boxArray[6] = null;
		boxArray[7] = new Box("Box07",50.0);
		boxArray[8] = null;
		boxArray[9] = new Box("Box09",5.0);
		Question03 q3 = new Question03();
		q3.boxes = boxArray;
		
		System.out.println("Testing get max and min methods");
		System.out.println("The box with the minimum weight is: "+q3.getMinWeight().getString());
		System.out.println("The box with the maximum weight is: "+q3.getMaxWeight().getString());
		
		System.out.println("Resetting some of the Boxes, and testing the get max and min methods");
		boxArray[0] = new Box("Box00",4.0);
		boxArray[4] = new Box("Box04",19.0);
		boxArray[8] = new Box("Box08",58.0);
		
		System.out.println("The box with the minimum weight is: "+q3.getMinWeight().getString());
		System.out.println("The box with the maximum weight is: "+q3.getMaxWeight().getString());
		
		System.out.println("Testing get min and max methods with an empty Array");
		boxArray = new Box[10];
		q3.boxes = boxArray;
		
		System.out.println("The box with the minimum weight is: "+q3.getMinWeight());
		System.out.println("The box with the maximum weight is: "+q3.getMaxWeight());
		
	}

}
//-----------------------------------------------------------------------------------
/*Solution Description
 *  I did the getMinWeight method first. I declared ¡§a¡¨ as variable of box class and set it =null. I needed 
 *  to check every box in the array, so I created a loop to do it. Because ¡§a¡¨ is null in beginning,
 *  so give it a whatever value from the array. I used if boxes[i] and ¡§a¡¨ both are null, a will be
 *  boxes[i]. Then I can compare ¡§a¡¨ and boxes[i], but I still need to avoid boxes[i]= null otherwise
 *  it will have an error, then I only need the weight, so I use accessor(.getWeight()) to get both 
 *  of them. Finally, keep comparing them to get the minimum.
 *  For the getMaxWeight, just copy the code above and inverse the unequal sign. The most important is
 *  to return the ¡§a¡¨.
 *  I didn¡¦t have any errors in the test. One thing I don¡¦t understand that is a comment ¡§//The array of
 *  boxes to be used by the method "getAverageWeight()"¡¨. I hope I didn¡¦t miss anything.
 */