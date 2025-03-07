import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int ejMetEstáticoClaseSuma(int a, int b){
        return a + b;
    }

    //Crear un método para calcular y devolver los segundos a partir de los años, meses y días recibidos

    public static long  getSegsFromAñoMesDía(byte años, byte meses, byte días){
        return (long) (años*365 + meses*30 + días)*24*60*60;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte  segs=60;
        byte  mins=60;
        byte  horas=24;
        short  días=365;
        byte   años=0;

        short a = (short) 32768;
        System.out.println("a: " +  a);

        // Todos los tipos primitivos tienen una wrap class con múltiples funcionalidades
        short maxShort= Short.MAX_VALUE;


        int segsAño= días * horas * mins * segs;
        System.out.println("segs Año: " +  segsAño);

        int num=0;

        num= ejMetEstáticoClaseSuma(10, 2);
        System.out.println("num: " + num);
        long totSegs= getSegsFromAñoMesDía((byte)127, (byte)127, (byte)127);
        System.out.println("totSegs: " + totSegs);

        int []arrIntTeclado1 = new int[2];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arrIntTeclado1.length; i++){
            System.out.println("Introduce el entero num. " + i +" ...");
            arrIntTeclado1[i]= sc.nextInt();
        }

        System.out.printf("arrIntTeclado: " + Arrays.toString(arrIntTeclado1));

        int []arrIntTeclado2= new int[2];
        sc = new Scanner(System.in);
        for(int i=0; i<arrIntTeclado2.length; i++){
            System.out.println("Introduce el entero num. " + i +" ...");
            String lectura= sc.next();
            arrIntTeclado2[i]= Integer.parseInt(lectura); //hacemos uso de la wrap class

        }

        System.out.printf("arrIntTeclado: " + Arrays.toString(arrIntTeclado2));


    }
}