package bubbleSort;

public class BubbleSort {
    //Metodo de ordenacao em que se compara os elementos de uma lista em pares e os troca de posicao de acordo
    //com seu valor.
    //Sua complexidade é alta o(n²), então há meios mais eficientes que o bubble sort

    public static void main(String[] args) {
        System.out.println();
        int array[] = {9,1,8,2,7,3,6,4,5};
        for(int i: array) {
            System.out.print(i);
        }

        System.out.println();

        bubbleSortAscendingOrder(array);
        for(int i: array) {
            System.out.print(i);
        }

        //descending order:
        System.out.println();
        int array2[] = {9,1,8,2,7,3,6,4,5};
        for(int i: array2) {
            System.out.print(i);
        }

        System.out.println();

        bubbleSortDescendingOrder(array2);
        for(int i: array2) {
            System.out.print(i);
        }

    }

    private static void bubbleSortAscendingOrder(int[] array) {
        for(int i =0; i < array.length-1; i++) {
            for(int j =0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    private static void bubbleSortDescendingOrder(int[] array) {
        for(int i =0; i < array.length-1; i++) {
            for(int j =0; j < array.length-i-1; j++) {
                if(array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
