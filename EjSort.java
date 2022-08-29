
public class EjSort {
    

    public static int[] bubbleSort(int [] arreglo) {
        int  aux;
        for (int j = 0; j < arreglo.length;) {
            for (int i = 0; i < arreglo.length - 1; i++) {
                if (arreglo[i] > arreglo[i+1]){
                    aux = arreglo [i];
                    arreglo[i] = arreglo[i+1];
                    arreglo[i+1] = aux;
                }
                System.out.println(arreglo[i] + "|" + arreglo[i+1]);
                if (i+1 == arreglo.length -2){
                    j++;
                    i = j;
                }
            }
        }
        return arreglo;
    }

    public static void imprimeNumerosNaturales(int n) {
        
        if (n < 50){ 
            System.out.println(n);
            imprimeNumerosNaturales(n+1);
            System.out.println("no se alcanza este código" + (n+1));
        }
        System.out.println("definitivamente se alcanza este código" + (n+1));
    }

    public static int sumaNNumeros(int n) {
        if (n > 0){
            System.out.println(n + " " + (n-1));
            return n + sumaNNumeros(n-1);
        }
        System.out.println("que pedooo" + n);
        return n;
    }

    public static int fibonacci(int n) {
        if (n > 0){
            n = n-1;
            return fibonacci();
        }
    }
        

    
    
    public static void main(String[] args) {
        /*int[] arreglo = {2, 4, 1, 6, -1};
        arreglo = EjSort.bubbleSort(arreglo);
        for (int i = 0; i < arreglo.length; i++)
            System.out.println(arreglo[i]);
    }*/
    //EjSort.imprimeNumerosNaturales(0);
    System.out.println(EjSort.sumaNNumeros(5) + "alvv");;
    }

}
