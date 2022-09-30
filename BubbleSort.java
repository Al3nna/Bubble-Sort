//Alenna - alenna.castaneda@oneidaihla.org
//for CTE software development 1
//instructor Mr Gross
public class BubbleSort {
    //switching the lower index and the one next to it
    static int[] swapTwoArrayElements(int[] arrayToSort, int lowerIndex) {
        int temp = arrayToSort[lowerIndex];
        arrayToSort[lowerIndex] = arrayToSort[lowerIndex+1];
        arrayToSort[lowerIndex+1] = temp;
        return arrayToSort;
    }
    //comparing lower index to the one next to it
    static int[] compareTwoArrayElements(int[] arrayToSort, int lowerIndex) {
        for (int index = 0; index < arrayToSort.length-1; index++){
            for (lowerIndex = 0; lowerIndex < arrayToSort.length-index-1; lowerIndex++) {
                if (arrayToSort[lowerIndex] > arrayToSort[lowerIndex+1]) {
                    //running the sort function
                    arrayToSort = swapTwoArrayElements(arrayToSort, lowerIndex);
                }
            }
        }
        return arrayToSort;
    }
    //printing the array
    static int[] printBubbleSort(int[] arrayToSort) {
        for (int index = 0; index < arrayToSort.length; index++) {
            System.out.print(arrayToSort[index] + ", ");
        }
        return arrayToSort;
    }
    public static void main(String[] args) {
        //creating & initializing the array
        int[] arrayToSort = {15,43,86,91,12,7,3,4,104,64,256,25,73,29,128,32,19};
        //printing unsorted array
        System.out.println("Unsorted Array");
        arrayToSort = printBubbleSort(arrayToSort);
        System.out.println(); //creating new line

        //comparing and sorting array
        arrayToSort = compareTwoArrayElements(arrayToSort, 0);

        //printing sorted array
        System.out.println(); //creating new line
        System.out.println("Bubble Sorted Array");
        arrayToSort = printBubbleSort(arrayToSort);
        
    }
}