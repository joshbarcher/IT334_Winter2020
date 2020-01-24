package othersorts;

public class HeapSort
{
    public static void main(String[] args)
    {

    }

    public static void sort(int[] array)
    {
        //assemble a heap from our input
        for (int i = (array.length - 1) / 2; i >= 0; i--)
        {
            sink(array, i, array.length - 1);
        }

        //delete the max repeatedly to sort the array
    }

    private static void sink(int[] array, int index, int size)
    {
        //loop as long as the current element has children
        while (index <= size / 2)
        {
            int left = index * 2 + 1;
            int right = index * 2 + 2;

            //search for the larger child
            int largest = left;
            if (right <= size && array[right] > array[left])
            {
                largest = right;
            }

            //is the current index smaller than the largest child
            if (array[index] < array[largest])
            {
                swap(array, index, largest);
                index = largest; //move the current index to the larger child
            }
            else
            {
                break;
            }
        }
    }

    private static void swap(int[] array, int first, int second)
    {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
