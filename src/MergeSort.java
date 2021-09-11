public class MergeSort extends SortingUtility
{
	void mergeSort(int array[], int low, int high)
	{
		int mid = (low + (high - 1)) / 2;
		mergeSort(array, low, mid);
		mergeSort(array, mid + 1, high);
		merge(array, low, mid, high);
	}

	int[] merge(int array[], int low, int mid, int high)
	{
		int sizeOfSubArray1 = mid - low + 1;
		int sizeOfSubArray2 = high - mid;

		int L[] = new int[sizeOfSubArray1];
		int R[] = new int[sizeOfSubArray2];

		for (int i = 0; i < sizeOfSubArray1; i++)
		{
			L[i] = array[low + i];
		}
		for (int j = 0; j < sizeOfSubArray2; j++)
		{
			R[j] = array[mid + j + 1];
		}

		int i = 0;
		int j = 0;
		int k = low;
		while (i < sizeOfSubArray1 && j < sizeOfSubArray2)
		{
			if (L[i] <= R[j])
			{
				array[k] = L[i];
				i++;
			}
			else
			{
				array[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < sizeOfSubArray1)
		{
			array[k] = L[i];
			i++;
			k++;
		}
		while (j < sizeOfSubArray2)
		{
			array[k] = R[j];
			j++;
			k++;
		}
		return array;
	}
}
