
package ordenacao1;


public class SelectionSort implements OrdenationAlgorithm{
    private int[] array;
    private int imin, temp;

    public SelectionSort(int[] array) {
        this.array = array;
        this.imin = 0;
        this.temp = 0;
    }
    
    

    @Override
    public int[] run() {
        for (int i = 0 ;i < array.length; ++i){
            imin = i;
            for (int j = i+1; j < array.length; ++j){
                if (array[j] < array[imin]) imin = j;
            }
            if (array[i] != array[imin]){
                temp = array[i];
                array[i] = array[imin];
                array[imin] = temp;
            }
        }
        return array;
    }
}
