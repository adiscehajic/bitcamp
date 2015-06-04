package exercises;

public class FixSpellingMethod {

	public static String fixSentence(String sentence) {

		for (int i = 0; i < sentence.length(); i++) {
			String str = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
			sentence = str;
			
			if (sentence.charAt(sentence.length() - 1) != '.') {
				sentence += '.';
			}
		}
		return sentence;
	}

	public static void main(String[] args) {

		System.out.println(fixSentence("all is good."));

	}
}
