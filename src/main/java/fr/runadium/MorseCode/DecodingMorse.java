package fr.runadium.MorseCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DecodingMorse {

	private static String[] lettersAndNumbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "A", "B", "C", "D",
			"E", "F", "G", "H", "I", "J", "k", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y",
			"Z" };
	private static String[] equivalentCode = { ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..",
			"----.", "-----", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

	private static Map<String, String> containerOfLettersAndCode = new HashMap<String, String>();

	private DecodingMorse() {
	}

	public static void put() {
		for (int i = 0; i < lettersAndNumbers.length; i++) {
			containerOfLettersAndCode.put(equivalentCode[i], lettersAndNumbers[i]);
		}
	}

	public static String get(String value) {
		String lettersAndNumbers = "";
		if (containerOfLettersAndCode.containsKey(value)) {
			lettersAndNumbers = containerOfLettersAndCode.get(value);
		} else {
			throw new IllegalArgumentException("Wrong input detected!!");
		}
		return lettersAndNumbers;
	}

	public static String decodeMorse(String inputMorseCode) {
		return Arrays.stream(inputMorseCode.trim().split("   ")).map(e -> DecodingMorse.findEquivalent(e))
				.collect(Collectors.joining(" "));
	}

	public static String findEquivalent(String words) {
		DecodingMorse.put();
		return Arrays.stream(words.split(" ")).map(e -> DecodingMorse.get(e)).collect(Collectors.joining());
	}

}
