//Alenna - alenna.castaneda@oneidaihla.org
//for CTE software development 1
//instructor Mr Gross
public class BubbleSort {
    static int[] swapTwoArrayElements(int[] arrayToSort, int lowerIndex) {
        int temp = arrayToSort[lowerIndex];
        arrayToSort[lowerIndex] = arrayToSort[lowerIndex+1];
        arrayToSort[lowerIndex+1] = temp;
        return arrayToSort;
    }
    static int[] compareTwoArrayElements(int[] arrayToSort, int lowerIndex) {
        for (int index = 0; index < arrayToSort.length-1; index++){
            for (lowerIndex = 0; lowerIndex < arrayToSort.length-index-1; lowerIndex++) {
                if (arrayToSort[lowerIndex] > arrayToSort[lowerIndex+1]) {
                    arrayToSort = swapTwoArrayElements(arrayToSort, lowerIndex);
                }
            }
        }
        return arrayToSort;
    }
    static int[] printBubbleSort(int[] arrayToSort) {
        for (int index = 0; index < arrayToSort.length; index++) {
            System.out.print(arrayToSort[index] + ", ");
        }
        return arrayToSort;
    }
    public static void main(String[] args) {
        //creating & initializing the array
        int[] arrayToSort = {15,43,86,91,12,7,3,4,104,64,19,25,73,29,32,128,256};
        arrayToSort = compareTwoArrayElements(arrayToSort, 0);
        arrayToSort = printBubbleSort(arrayToSort);
        
    }
}