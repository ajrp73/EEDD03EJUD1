public class Main {

    public static int ejMetEstáticoClaseSuma(int a, int b){
        return a + b;
    }

    //Crear un método para calcular y devolver los segundos a partir de los años, meses y días recibidos


    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte  segs=60;
        byte  mins=60;
        byte  horas=24;
        short  días=365;
        byte   años=0;

        short a = (short) 32768;
        System.out.println("a: " +  a);
        int segsAño= días * horas * mins * segs;
        System.out.println("segs Año: " +  segsAño);

        int num=0;

        num= ejMetEstáticoClaseSuma(10, 2);
        System.out.println("num: " + num);
    }
}