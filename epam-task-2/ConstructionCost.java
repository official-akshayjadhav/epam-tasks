public class ConstructionCost{
	
	/*      inputs: 
	*	1. material standard 
	8*	2. area of house, in square feet
	*/
	public int estimateValue(int standard, int area){
		int c_cost = 0;
		switch(standard){
			case 1:
				c_cost = 1200;
				break;
			case 2:
				c_cost = 1500;
				break;
			case 3:
				c_cost = 1800;
				break;
			case 4:
				c_cost = 2500;
				break;	
		}
		
		return area * c_cost;
	}
}
		
		
