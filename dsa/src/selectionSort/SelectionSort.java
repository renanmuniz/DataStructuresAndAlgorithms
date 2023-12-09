package selectionSort;

public class SelectionSort {
    //Assim como o bubble sort:
    //Metodo de ordenacao em que se compara os elementos de uma lista em pares e os troca de posicao de acordo
    //com seu valor.
    //Sua complexidade é alta o(n²), então há meios mais eficientes
    public static void main(String[] args) {

        int array[] = {9,1,8,2,7,3,6,4,5};

        for(int i : array) {
            System.out.print(i);
        }

        System.out.println();
        
        selectionSortAsc(array);
        for(int i : array) {
            System.out.print(i);
        }

        System.out.println();

        int array2[] = {9,1,8,2,7,3,6,4,5};

        for(int i : array2) {
            System.out.print(i);
        }

        System.out.println();

        selectionSortDesc(array2);
        for(int i : array2) {
            System.out.print(i);
        }

    }

    private static void selectionSortAsc(int[] array) {

        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    private static void selectionSortDesc(int[] array) {

        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] < array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
