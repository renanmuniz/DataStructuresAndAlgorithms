package linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        //Busca linear, complexidade o(n).
        //Bom para poucos elementos, tempo de busca aumenta exponencialmente conforme numero de elementos.
        //Bom para estruturas sem acesso rendomico (LinkedList)

        int array[] = {1,4,2,7,5,9,5,0};
        System.out.println(linearSearch(array,2)); //encontrou na posicao 2
        System.out.println(linearSearch(array,8)); //nao encontrou (-1)

    }

    private static int linearSearch(int[] array, int value) {
        for(int x=0; x<array.length; x++) {
            if(array[x] == value) {
                return x;
            }
        }
        return -1;
    }
}
