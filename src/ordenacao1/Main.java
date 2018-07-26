
package ordenacao1;

import java.util.Arrays;


public class Main {

    
    public static void main(String[] args) {
        
        int[] ordenacaoContraria = {9,8,7,6,5,4,3,2,1};
        int[] ordenado = {1,2,3,4,5,6,7,8,9};
        int[] randomico = {6,2,8,5,9,3,1,7,4};
        
        System.out.print("Insertion Sort: array ordenado contrario => ");
        System.out.println(Arrays.toString(new InsertionSort(ordenacaoContraria).run()));
        System.out.print("Insertion Sort: array ordenado => ");
        System.out.println(Arrays.toString(new InsertionSort(ordenado).run()));
        System.out.print("Insertion Sort: array randomico => ");
        System.out.println(Arrays.toString(new InsertionSort(randomico).run()));
        
        
        System.out.print("Selection Sort: array ordenado contrario => ");
        System.out.println(Arrays.toString(new SelectionSort(ordenacaoContraria).run()));
        System.out.print("Selection Sort: array ordenado => ");
        System.out.println(Arrays.toString(new SelectionSort(ordenado).run()));
        System.out.print("Selection Sort: array randomico => ");
        System.out.println(Arrays.toString(new SelectionSort(randomico).run()));
    }   
    
}
