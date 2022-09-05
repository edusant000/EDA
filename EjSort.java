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
        return n;
    }

    public static int fibonacci(int n, int actual, int anterior) {
        if (n > 0){
            System.out.println("n|" + n + " actual|" + actual);
            return fibonacci(n-1, actual + anterior, actual);
        }
        
        return actual;
    }

    public static int contarDigitos(int n, int m, int count) {
        if ((n / m) > 1 ) {
            return contarDigitos(n, m * 10, count + 1);
        }
        return count;
    }

    public static int sumaDigitos(double n, int suma) {
        if (n > 1) {
            return sumaDigitos(n/10, (int)(suma + (n%10)));
        }
        return suma;
    }

    public static int gcd(int n, int m, int gcd, int count){
        if (count <= m) {
            if ((n % count == 0) && (m % count == 0)) {
                System.out.println(gcd);
                return gcd(n, m, count, count+1);
            }
            return gcd(n, m, gcd, count+1);
        }
        return gcd;
    }

    public static int mayorElemento(int[] arr, int pos, int mayor) {
        if (pos < arr.length){
            if (arr[pos] > mayor) {
                return mayorElemento(arr, pos+1, arr[pos]);
            }
            return mayorElemento(arr, pos+1, mayor);
        }
        return mayor;
    }

    public static int ordenarArray(int[] arr, int pos) {
        if (pos < arr.length - 1) {
            if (arr[pos] > arr[pos + 1]){
                int aux = arr[pos];
                arr[pos] = arr[pos + 1];
                arr[pos + 1] =  aux;
                return ordenarArray(arr, pos+1);
            }
            System.out.println("pos|" + pos);
            return ordenarArray(arr, pos+1);
        }
        return arr[arr.length - 1];
    }
    
    public static void invertirString(String s, int pos, int count) {
        if (pos < s.length()){ 
            System.out.println("pos+1|" + (pos+1) + " count-1|" + (count-1));
            invertirString(s, pos+1, count - 1);
            
        }
        System.out.println("pos-1|" + (pos-1) + " count+1|" + (count + 1));
        if (pos > count) {
            System.out.println("s.charAt(pos - 1)|" + s.charAt(pos - 1) + " s.substring(count + 1, pos - 1)|" + s.substring(count + 1, pos - 1) + " s.charAt(count)|" + s.charAt(count));
            s = s.charAt(pos - 1) + s.substring(count + 1, pos - 1) + s.charAt(count);  
            System.out.println(s);
            
        }
            
    }

    public static int encontrarFactorial(int n) {
        if (n > 1) {
            return encontrarFactorial(n-1) * n;
        }
        return n;
    }

    public static String encontrarBinario(int entero, int resto) {
        if ((entero / 2) >= 1)
            return encontrarBinario(entero / 2, entero % 2) + String.valueOf(entero % 2);
        else if (entero / 2 == 0.5)
            return String.valueOf(1);
        return String.valueOf(entero);
    }

    public static boolean esPrimario(int n, int m) {
        if (n % m == 0) 
            return false;
        else if (m >= n/2)
            return true;
        System.out.println(m+1);
        return esPrimario(n, m+1);
        
    }
 
    
    
    public static void main(String[] args) {
            /*int[] arreglo = {2, 4, 1, 6, -1};
            arreglo = EjSort.bubbleSort(arreglo);
            for (int i = 0; i < arreglo.length; i++)
                System.out.println(arreglo[i]);
            }*/
            //EjSort.imprimeNumerosNaturales(0);
            //System.out.println(EjSort.sumaNNumeros(5) + "alvv");
            //System.out.println(EjSort.fibonacci(10, 1, 1));  
            //System.out.println(EjSort.contarDigitos(5400000, 1, 0));
            //System.out.println(EjSort.sumaDigitos(1234, 0));
            //System.out.println(EjSort.gcd(2022, 1011, 1, 1)); 
            //int [] arr = {1, 4, 6, 8, 3, 5};
            //System.out.println(EjSort.mayorElemento(arr, 0, 0));
            //System.out.println(EjSort.ordenarArray(arr, 0));
            String s = "hola";
            //EjSort.invertirString("pene", 0, s.length());
            //System.out.println(s.substring(0, 4));
            //System.out.println(s.charAt(3));
            //System.out.println(EjSort.encontrarFactorial(6));     
            //System.out.println(EjSort.encontrarBinario(309, 309%2));
            System.out.println(EjSort.esPrimario(1223, 2));
    }

}
