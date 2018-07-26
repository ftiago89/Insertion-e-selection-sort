
package ordenacao1;


public class InsertionSort implements OrdenationAlgorithm{
    private int[] array;
    private int pivo;
    private int i, j;
    
    public InsertionSort(int[] array){
        this.array = array;
        this.i = 1;
        this.j = 0;
        this.pivo = 0;
    }

    @Override
    public int[] run() {
        for (; i < array.length; ++i){
            pivo = array[i];
            j = i - 1;
            while ((j >= 0) && (array[j] > pivo)){
                array[j+1] = array[j];
                j = j - 1;
                
            }
            array[j+1] = pivo;
        }
        return array;
    }
    
}
