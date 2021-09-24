package typometer;

import java.util.stream.IntStream;

public class WordUtility
{
	public int countWords(String testFieldText)
	{
		return testFieldText.split("\\s+").length;
	}
	
	public double wordsPerMinute(double time, int words)
	{
		return (double)words/((double)time/60000);
	}
	
	public float acurracy(String testString, String userInput)
	{
		int mistakes = (int) IntStream.range(0, testString.length()).filter(i->testString.charAt(i) == userInput.charAt(i)).count();
		
		return (float) mistakes/testString.length();
	}
}