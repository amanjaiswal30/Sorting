public class SelectionSort extends SortingUtility
{
	int[] selectionSort(int[] array)
	{
		for (int i = 0; i < array.length - 1; i++)
		{
			int min = array[i];
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[j] < min)
				{
					min = array[j];
				}
			}
			swap(array, min, array[i]);
		}
		return array;
	}
}
