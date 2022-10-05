import java.util.HashMap;
import java.util.Map;

/** 
 * Description: Counts the occurrence of the word in a string input
 */
public class StringWordCount {

	public static void main(String[] args) {
		Map<String, Integer> charCountMap = getWordCountInString("India is a country in South Asia. It is the seventh largest country by area and second-most populous country. It is most populous democracy in the world.");
		for(Map.Entry<String, Integer> entry :charCountMap.entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}

	/**
	 * Counts the word count in the string
	 * @param str string input to count the words
	 * @return map with word count
	 */
	public static Map<String, Integer> getWordCountInString(String str) {
		String[] words = str.replaceAll("[.,''\"]", "").toLowerCase().split(" ");
		System.out.println("Number of words: "+words.length);
		Map<String, Integer> charCountMap = new HashMap<>();
		for (String word: words) {
			if(charCountMap.containsKey(word)) {
				charCountMap.put(word, charCountMap.get(word)+1);
			} else {
				charCountMap.put(word, 1);
			}
		}
		return charCountMap;
	}
}
