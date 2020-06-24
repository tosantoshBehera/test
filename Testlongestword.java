package santosh.test.streamcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Testlongestword {
	public static ArrayList<String> getHashTags(String s) {
		ArrayList<String> result = new ArrayList<String>();
		String[] words = s.split(" ");
		List<String> list = Arrays.asList(words);
		int j = words.length - 3;
		int k = 3;
		List<String> wordList = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		if (0 < j) {
			for (int i = wordList.size() - 1; i >= wordList.size() - k; i--) {
				if (wordList.get(i).equals(wordList.get(i - 1))) {
					k++;
				} else {
					result.add("#" + wordList.get(i));
					//System.out.println(wordList.get(i));
				}
			}
		} else {
			for (int i = wordList.size() - 1; i >= 0; i--) {
				result.add("#" + wordList.get(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Create a Scanner object
		//System.out.println("Enter Headline");
		//String Headline = input.nextLine();
		//ArrayList<String> HashtagWords = getHashTags(Headline);
		//System.out.println("HashtagWords :" + HashtagWords);
	}

}// getHashTags("How the Avocado Became the Fruit of the Global Trade");
