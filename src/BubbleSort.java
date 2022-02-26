public class BubbleSort extends SortingUtility
{
	int[] bubbleSort(int[] array)
	{
		for (int i = 0; i < array.length - 1; i++)
		{
			for (int j = 0; j < array.length - 1; j++)
			{
				if (array[j] > array[j + 1])
				{
					swap(array, array[j], array[j + 1]);
				}
			}
		}
		return array;
	}
}
