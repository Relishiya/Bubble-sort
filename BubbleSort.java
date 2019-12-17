package SortingAlgorithms;



public class BubbleSort {
    final static int arrayValues[] = {10,6,4,7,3,1,4,15,7,9,11,5,13,4,0,2,8,7,3,9,2,4,5,16,12,20,1};

    static int[] bubbleSort(int array[]){
        int lengthArray = array.length;

        for (int i =0 ; i<lengthArray-1; i++){
            for (int j = 0; j<lengthArray-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int sorted[] = bubbleSort(arrayValues);

        for(int i = 0; i< arrayValues.length ; i++){
            System.out.println(sorted[i]);
        }
    }
}
