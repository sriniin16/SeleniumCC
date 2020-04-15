package Steps;

public class sort {


    public static void main(String[] args)
    {
        int[] array = {576867878,23423,123,379870893};
        int length = array.length;
        sort s = new sort();
        s.quicksort(array,0,length-1);
        for (int i=0;i<length;i++)
        {
            System.out.println(array[i]);
        }
    }

    public void quicksort(int[] array,int lb,int ub)
    {
        if (lb<ub)
        {
            int pos = partition(array,lb,ub);
            quicksort(array,lb,pos-1);
            quicksort(array,pos+1,ub);
        }
    }


    public int partition(int[] array, int lb, int ub)
    {
        int pivot = array[lb];
        int start = lb;
        int end = ub;
        int temp;
        while(start<=end)
        {
            while (array[start]<pivot)
            {
                start++;
            }
            while (array[end]>pivot)
            {
                end--;
            }
            if (start<=end)
            {
                temp =array[start];
                array[start]=array[end];
                array[end]=temp;
                start++;
                end--;
            }
        }
        return start;
    }
}
