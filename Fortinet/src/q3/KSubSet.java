package q3;

import java.util.*;

public class KSubSet {
	private static boolean isSeparable(List<Integer> list, int[] subsetSum, boolean[] taken, int subset, int K, int N,
			int curIdx, int limitIdx) {
		if (subsetSum[curIdx] == subset) {
			if (curIdx == K - 2)
				return true;

			return isSeparable(list, subsetSum, taken, subset, K, N, curIdx + 1, N - 1);
		}

		for (int i = limitIdx; i >= 0; i--) {
			if (taken[i])
				continue;
			int tmp = subsetSum[curIdx] + list.get(i);

			if (tmp <= subset) {
				taken[i] = true;
				subsetSum[curIdx] += list.get(i);
				boolean nxt = isSeparable(list, subsetSum, taken, subset, K, N, curIdx, i - 1);

				taken[i] = false;
				subsetSum[curIdx] -= list.get(i);
				if (nxt)
					return true;
			}
		}
		return false;
	}

	public static boolean separate(List<Integer> list, int k) {
		// If K is 1, then only one set is possible
		if (k == 1)
			return true;

		// If total number of partitions are more than size of list then not
		// divisible
		int n = list.size();
	
		if (list.size() < k)
			return false;

		// if array sum is not divisible by K then we can't divide list into K
		// partitions
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += list.get(i);
		if (sum % k != 0)
			return false;

		// the sum of each subset should be subset (= sum / k)
		int subset = sum / k;
		int subsetSum[] = new int[k];
		boolean[] taken = new boolean[n];

		// Initialize sum of each subset from 0
		for (int i = 0; i < k; i++)
			subsetSum[i] = 0;

		// mark all elements as not taken
		for (int i = 0; i < n; i++)
			taken[i] = false;

		// initialize first subset sum as last element of
		// array and mark that as taken
		subsetSum[0] = list.get(n - 1);
		taken[n - 1] = true;

		// call recursive method to check K-substitution condition
		return isSeparable(list, subsetSum, taken, subset, k, n, 0, n - 1);
	}

	public static void main(String arg[]) {
		List<Integer> mylist = new ArrayList<Integer>();
		mylist.add(2);
		mylist.add(1);
		mylist.add(4);
		mylist.add(5);
		mylist.add(6);
		if (separate(mylist, 3))
			System.out.println("Partitions into equal sum is possible.");
		else
			System.out.println("Partitions into equal sum is not possible.");
	}
}
//Time complexity: O(kn^2)  
// Space complexity: O(k)