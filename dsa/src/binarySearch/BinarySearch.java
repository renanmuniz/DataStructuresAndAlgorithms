package binarySearch;

public class BinarySearch {
    // Busca binária, bom para grandes quantidades de valores. Devem estar ordenados para funcionar.
    // Complexidade O(log n), ou seja, quanto mais dados, mais eficiente é.
    // Busca é realizada em arrays ordenados e sempre cortando pela metade caso o valor esteja acima ou abaixo.

    public static void main(String[] args) {

        int array[] = new int[1000000];
        int target = 300000;

        //populando array:
        for (int x = 0; x < array.length; x++) {
            array[x] = x;
        }

        System.out.println(binarySearch(array, target));
    }

    private static int binarySearch(int[] array, int target) {
        int steps = 0; //not necessary

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            steps++;
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("Step: " + steps + " Middle: " + middle);
            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle; //target found
            }
        }
        return -1;
    }
}
