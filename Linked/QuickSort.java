/**
 * QuickSort
 */
public class QuickSort {

    Linked l;

    QuickSort(Linked l){

        this.l = l;
        
    }

    void sort(Linked arr, int start, int end){

        if(end <= start)
            return;

        int pivot = partition(arr, start, end);
        sort(arr, start, pivot-1);
        sort(arr, pivot+1, end);

    }

    int partition(Linked arr, int start, int end){

        int pivot = arr.getNode(end).getData();
        int i=start - 1;

        for(int j = start; j<=end-1 ; j++){

            if(arr.getNode(j).getData() < pivot){
                i++;
                int temp = arr.getNode(i).getData();
                arr.getNode(i).setData(arr.getNode(j).getData());
                arr.getNode(j).setData(temp);
            }

        }

        i++;
        int temp = arr.getNode(end).getData();
        arr.getNode(end).setData(arr.getNode(i).getData());
        arr.getNode(i).setData(temp);

        return i;
    }
}