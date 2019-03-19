public class CalculateInterests{
	
	// method to calculate simple interest
	/*
	*	input:
	*	p: principle amount
	*	r: interest rate
	*	t: the number of years the money is invested
	*/
	public double calculateSimpleInterest(int p, float r, int t){
		return (p*r*t/100);
		
	}

	// method to calculate compound interest
	/*
	*	input:
	*	p: principle amount
	*	r: interest rate
	*	n: the number of times that interest is compounded per year
	*	t: the number of years the money is invested or borrowed for 
	*
	*
	*/
	public double calculateCompoundInterest(int p, float r, int n, int t){
		return p * Math.pow((1 + r / n), (n*t));
	}
}
