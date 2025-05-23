import java.util.*;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            			int maxKey = 0;
			int maxValue = 0;
			int testCount = sc.nextInt();
			HashMap<Integer, Integer> hash = new HashMap<>();
			for (int count = 0; count < 1000; count++) {
				int num = sc.nextInt();
				hash.put(num, hash.getOrDefault(num, 0) + 1);
			}
			for (Integer n : hash.keySet()) {
				int x = hash.get(n);
				if (maxValue == x) {
					maxKey = Math.max(maxKey, n);
				}else {
					maxValue = Math.max(x,  maxValue);
					if (x == maxValue) {
						maxKey = n;
					}
				}
			}
			System.out.println("#" + test_case + " "+ maxKey);
		}
	}
}