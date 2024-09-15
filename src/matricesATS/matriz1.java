package matricesATS;

import java.util.Scanner;

public class matriz1 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int n = 10, v=0;
        int m=0;
        boolean asc = true, igual=false;
        int [] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            //System.out.println("Ingresa un numero para la posicion "+(i+1));
            numeros[i]=leer.nextInt();
            if (numeros[i]>0 && numeros[i]>m) {
                m=numeros[i];
                continue;
            }else{
                asc=false;
                break;
            }
        }
        if (asc==false) {
            System.out.println("La lista no es ascendente");
        }else{
            System.out.println("Ingresa Un Numero: ");
            int numBusq=leer.nextInt();
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i]==numBusq) {
                    v=i+1;
                    igual=true;
                }
            }
            if (igual==true) {
                System.err.println("EL NUMERO "+numBusq+" SE ENCUENTRA EN LA POSICION: "+v);
            }else{
                System.out.println("EL NUMERO "+numBusq+" NO SE ENCUENTRA EN LA LISTA");
            }
        }
        
        leer.close();
    }
}

