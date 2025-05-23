import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for (int i = 1; i <= test_case; i++) {
			long result = 0;		
			int size = sc.nextInt();
			int[] arr= new int[size];
			
			for (int j = 0; j < size; j++) {
				arr[j] = sc.nextInt();
			}
			int max = arr[size - 1];
			
			for (int g = size - 2; g >= 0; g--) {
				if (max > arr[g]) {
					result += max - arr[g]; 
				}
				else if (arr[g] > max) {
					max = arr[g];
				}
			}
			System.out.println("#" + i + " " + result);
		}
	}
}