package divideandconquer;

import utilities.SortingUtilities;

import java.util.Arrays;
import java.util.Random;

public class MergeSort
{
    private static int[] aux;

    public static void main(String[] args)
    {
        int[] testArray = {10, 13, 1, 2, 4, 18, 22, -10};
        testArray = SortingUtilities.genArray(10000, 1, 10000);
        mergeSort(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println("Inversions? " + SortingUtilities.hasInversions(testArray));
    }

    public static void mergeSort(int[] array)
    {
        //precondition
        if (array.length <= 1)
        {
            return; //already sorted...
        }

        //create the secondary array to help with merge()
        aux = new int[array.length];

        //recursively sort the array
        mergeSort(array, 0, array.length - 1);
    }

    //recursively sort the elements from index low to high (inclusive)
    private static void mergeSort(int[] array, int low, int high)
    {
        //base case
        if (high - low <= 0)
        {
            return; //a sub-array of length 1 or zero is sorted
        }

        //recursively sort the left and right sub-array
        int mid = (high + low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);

        merge(array, low, high);
    }

    private static void merge(int[] array, int low, int high)
    {
        //find my midpoint and set the left and right pointers (references)
        int mid = (high + low) / 2;
        int left = low;
        int right = mid + 1;
        int numToMerge = high - low + 1;

        for (int i = 0; i < numToMerge; i++)
        {
            //check first whether we have exhausted either sub-array
            if (left > mid)
            {
                aux[i] = array[right++];
            }
            else if (right > high)
            {
                aux[i] = array[left++];
            }
            //check for the smaller element of the two sub-arrays
            else if (array[left] < array[right])
            {
                aux[i] = array[left++];
            }
            else //if (array[right] <= array[left])
            {
                aux[i] = array[right++];
            }
        }

        //copy our merged sub-arrays from the aux array back to the original
        for (int i = 0; i < numToMerge; i++)
        {
            array[low + i] =  aux[i];
        }
    }

    private static int[] genArray(int size, int min, int max)
    {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = min + random.nextInt(max - min + 1);
        }

        return array;
    }

    private static boolean hasInversions(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] > array[i + 1])
            {
                return true;
            }
        }
        return false;
    }
}
