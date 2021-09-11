public class QuickSort extends SortingUtility
{
	int[] quickSort(int array[], int low, int high)
	{
		if (low < high)
		{
			int partitioningIndex = partition(array, low, high);
			quickSort(array, low, partitioningIndex - 1);
			quickSort(array, partitioningIndex + 1, high);
		}
		return array;
	}

	int partition(int array[], int low, int high)
	{
		int pivot = array[high];
		int i = low - 1;
		for (int j = low; j <= high - 1; j++)
		{
			if (array[j] < pivot)
			{
				i++;
				swap(array, array[i], array[j]);
			}
		}
		swap(array, array[i + 1], array[high]);
		return i + 1;
	}
}
