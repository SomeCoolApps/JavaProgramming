package programming.problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseWordString {
	
	
	public static void main(String[] args) {
		
		System.out.println(reverse("this is a string of size one"));
		//should print reverse of a string 
		//input  :this is a string of size one
		//output :one size of string a is this

	}
	
	public static String reverse(String input) {
		String currWord = "";
		String output = "";
		List<String> words = new ArrayList<String>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c == ' ') {
				words.add(currWord);
				currWord = "";
			} else {
				currWord = currWord + c;
			}
		}
		
		words.add(currWord);

		Iterator<String> it = words.iterator();
		while (it.hasNext()) {
			if (output.length() == 0) {
				output = it.next();
			} else {
				output = it.next() + " " + output;
			}
		}
		return output;

	}

}
