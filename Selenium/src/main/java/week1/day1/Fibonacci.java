package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println(firstNum);
		
		// 0 1 1 2 3 5 8 13 21 35 56
		for (int i=2;i<11;i++) {
			 sum = firstNum+secNum; //0+1
			 firstNum = secNum;
			 secNum = sum;
		
			
			System.out.println(sum);
		}
		

	}

}
