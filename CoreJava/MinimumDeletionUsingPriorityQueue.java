package CoreJava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


/**Given a string, 
 * find the minimum number of characters to be deleted in a string so that the frequency of each character in the string is unique.
 * String s = 'aaaabbbcccdddd'
 * Frequency of characters : { a=4, b=3, c=3, d=4 }
 * a nd d both have same frequency 4, similarly b and c have same frequency 3. so frequency is repeated and we need to make it unique.
 * we need to delete three character from a, one characters from b to make their frequency different.
 * s = 'abbcccdddd'
 * Frequency of characters : { a=1, b=2, c=3, d=4 }
 * */

/**
 * Detailed Description: 
 * we need to make the frequency unique,
 * Either we need to delete one character from a or d so that we break the same frequency.
 * so we delete a, now string is "aaabbbcccdddd"
 * Now the frequency of a is 3, b is 3, c is 3 and d is 4
 * the frequency of a, b and c is repeating, we need to delete one character from a,
 * s = 'aabbbcccdddd'
 * Now the frequency of a is 2, b is 3, c is 3 and d is 4
 * the frequency of b and c is repeating, we need to delete one character from b, but this will make b count to 2 which will be 
 * same as a count, so we will delete 2 characters from b so the frequency will be 1.
 * s = 'aabcccdddd'
 * Now the frequency of a is 2, b is 1, c is 3 and d is 4, so is unique now.
 * Answer is 4 because we delete 4 characters to make the frequency unique.
*/
public class MinimumDeletionUsingPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countFrequency("aaaabbbcccdddd"));
	}

	private static int countFrequency(String str) {

		if (str == null || str.length() < 2) {
			return 0;
		}

		// Taking a map to find unique occurrence of each character in a string.
		Map<Character, Integer> frequencyCount = new HashMap<>();
		for (char ch : str.toCharArray()) {
			int count = frequencyCount.getOrDefault(ch, 0);
			frequencyCount.put(ch, count + 1);
		}

		// Taking a PriorityQueue for processing the count of each occurrence of
		// a character
		// Putting the values in reverse order so that higher counts are at head
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

		// dumping the frequency of each characters in a Priority queue.
		for (Map.Entry<Character, Integer> entry : frequencyCount.entrySet()) {
			priorityQueue.add(entry.getValue());
		}

		int deletionCount = 0;

		while (!priorityQueue.isEmpty()) {
			int frequency = priorityQueue.poll();

			// If there is no element left after poll, It means we are done,
			// return deletionCount.
			if (priorityQueue.size() == 0) {
				return deletionCount;
			}

			// Here we are comparing the polled count with the count at the
			// head. since our PriorityQueue is in reverse order
			// Counts that are same will be grouped together. So idea is to
			// check polled and peek and if they are same it means we
			// need to delete one occurrence of a character to make it unique,
			// but the catch is after deletion, the count which we encountered
			// may also be the occurrence count of other character present in a
			// queue, so we have to repeat this process.
			// number of time we delete the occurrence, we add that in our
			// deletionCount.
			if (frequency == priorityQueue.peek()) {
				// it means we have to delete one character to make the
				// frequency unique
				priorityQueue.add(frequency - 1);

				// Number of time we delete the character to make frequency
				// unique, we have to increase the deletionCount.
				deletionCount++;
			}
		}
		return deletionCount;
	}
}
