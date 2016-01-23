package solution;

import java.util.HashMap;
import java.util.Map;

public class Q202 {
	/**********************************************/
	// Third Answer
	/**********************************************/
	public boolean isHappy(int n) {
		// the max value of integer is 2147483647,so can not lager than 810
		boolean[] record = new boolean[810];
		n = computeNext(n);
		while (n != 1) {
			if (record[n]) {
				return false;
			}
			record[n] = true;
			n = computeNext(n);
		}
		return true;
	}

	public int computeNext(int n) {
		int result = 0;
		while (n != 0) {
			int temp = n % 10;
			result += temp * temp;
			n = n / 10;
		}
		return result;
	}
	/**********************************************/
	// Second Answer
	/**********************************************/
	// Map<Integer, Boolean> record = new HashMap<Integer, Boolean>();
	//
	// public boolean isHappy(int n) {
	// while (n != 1) {
	// if (record.get(n) != null) {
	// return false;
	// }
	// record.put(n, true);
	// n = computeNext(n);
	// }
	// return true;
	// }
	//
	// public int computeNext(int n) {
	// int result = 0;
	// while (n != 0) {
	// int temp = n % 10;
	// result += temp * temp;
	// n = n / 10;
	// }
	// return result;
	// }
	/**********************************************/
	/* First Answer */
	/**********************************************/
	// Map<Integer, Boolean> record = new HashMap<Integer, Boolean>();
	//
	// public boolean isHappy(int n) {
	// if (n == 1) {
	// return true;
	// }
	// if (record.get(n) != null) {
	// return false;
	// }
	// record.put(n, true);
	// return isHappy(computeNext(n));
	// }
	//
	// public int computeNext(int n) {
	// int result = 0;
	// while (n != 0) {
	// int temp = n % 10;
	// result += temp * temp;
	// n = n / 10;
	// }
	// return result;
	// }
}
