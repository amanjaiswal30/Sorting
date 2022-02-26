import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FrequencySortWithLambdaExpression
{
	public List<Integer> sort(List<Integer> unsortedArray)
	{
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (Integer arrayElement : unsortedArray)
		{
			hashMap.put(arrayElement, hashMap.getOrDefault(arrayElement, 0) + 1);
		}
		Collections.sort(unsortedArray, (firstNumber, secondNumber) -> {
			Integer frequencyOfFirstNumber = hashMap.get(firstNumber);
			Integer frequencyOfSecondNumber = hashMap.get(secondNumber);
			if (frequencyOfFirstNumber != frequencyOfSecondNumber)
			{
				return frequencyOfSecondNumber - frequencyOfFirstNumber;
			}
			return firstNumber - secondNumber;
		});
		return unsortedArray;
	}
}
