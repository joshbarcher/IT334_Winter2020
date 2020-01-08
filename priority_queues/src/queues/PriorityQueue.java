package queues;

import java.util.Arrays;

public class PriorityQueue<T extends Comparable<T>> implements IPriorityQueue<T>
{
    private T[] heap;
    private int size;

    public PriorityQueue()
    {
        heap = (T[])new Comparable[10];
    }

    @Override
    public void insert(T element)
    {
        //do we have enough room in the array for the new element?
        if (size + 1 >= heap.length)
        {
            resize();
        }

        size++;
        heap[size] = element;
        swim(size);
    }

    private void swim(int index)
    {
        while (index / 2 != 0)
        {
            int parentIndex = index / 2;

            //check if child and parent elements are out of order
            if (heap[index].compareTo(heap[parentIndex]) < 0)
            {
                swap(index, parentIndex);
                index = parentIndex;
            }
            else //otherwise stop!
            {
                break;
            }
        }
    }

    private void swap(int index, int parentIndex)
    {
        T temp = heap[index];
        heap[index] = heap[parentIndex];
        heap[parentIndex] = temp;
    }

    private void resize()
    {
        //TODO write this later...
    }

    @Override
    public T deleteMin()
    {
        return null;
    }

    @Override
    public T peek()
    {
        return null;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    @Override
    public String toString()
    {
        return Arrays.toString(heap);
    }
}
