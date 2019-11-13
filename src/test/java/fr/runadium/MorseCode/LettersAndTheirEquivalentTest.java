package fr.runadium.MorseCode;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class LettersAndTheirEquivalentTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void correctInputNumberTest() {
		String input = ".....";
		assertEquals("5", MorseCodeDecoder.decodeMorse(input));
	}

	@Test
	public void incorrectInputTwoNumbersTest() {
		String input = "--... .....";
		assertNotEquals("15", MorseCodeDecoder.decodeMorse(input));
	}

	@Test
	public void correctInputTwoNumbersTest() {
		String input = "--... .....";
		assertEquals("75", MorseCodeDecoder.decodeMorse(input));
	}

	@Test
	public void incorrectInputLertterTest() {
		String input = ".-";
		assertEquals("A", MorseCodeDecoder.decodeMorse(input));
	}

	@Test
	public void correctCombinningLertterWithNumberTest() {
		String input = ".- --... .....";
		assertEquals("A75", MorseCodeDecoder.decodeMorse(input));
	}

	@Test
	public void patternGivenInKataTest() {
		String input = ".... . -.--   .--- ..- -.. .";
		assertEquals("HEY JUDE", MorseCodeDecoder.decodeMorse(input));
	}

	@Test
	public void wrongPhraseTest() {
		String input = ".---- . -.--   .--- ..- -.. .";
		assertNotEquals("Wrong", MorseCodeDecoder.decodeMorse(input));
	}

	@Test
	public void negativeInputThrown() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("Wrong input detected!!");
		MorseCodeDecoder.decodeMorse("-5");

	}

}
