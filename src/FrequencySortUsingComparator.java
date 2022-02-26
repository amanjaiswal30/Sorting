import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class FrequencySortUsingComparator
{
	private static class SortComparator implements Comparator<Integer>
	{
		HashMap<Integer, Integer> frequencyMap;

		SortComparator(HashMap<Integer, Integer> hashMap)
		{
			this.frequencyMap = hashMap;
		}

		@Override
		public int compare(Integer o1, Integer o2)
		{
			Integer frequencyOfFirstNumber = frequencyMap.get(o1);
			Integer frequencyOfSecondNumber = frequencyMap.get(o2);
			if (frequencyOfFirstNumber != frequencyOfSecondNumber)
			{
				return frequencyOfSecondNumber - frequencyOfFirstNumber;
			}
			return o1 - o2;
		}
	}

	public List<Integer> sort(List<Integer> unsortedArray)
	{
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (Integer arrayElement : unsortedArray)
		{
			hashMap.put(arrayElement, hashMap.getOrDefault(arrayElement, 0) + 1);
		}
		SortComparator comparator = new SortComparator(hashMap);
		Collections.sort(unsortedArray, comparator);
		return unsortedArray;
	}
}
