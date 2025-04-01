public class PracticeProblem{
	static int sumOfDigits(int x){
		if(x < 0) x *= -1;
		if(x < 10){
			return x;
		}
		return sumOfDigits(x / 10) + x % 10;
	}

	static int factorial(int n){
		if(n == 0){
			return 1;
		}else if(n < 0){
			return 0;
		}
		
		return n * factorial(n-1);
	}

	public static void main(String args[]){}
}
