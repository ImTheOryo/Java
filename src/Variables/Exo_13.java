package Variables;

public class Exo_13 {
    public static void main(String[] args) {
        Integer a = 24;
        Integer b = 57;
        Integer c ;
        System.out.printf("A = %d \n",a);
        System.out.printf("B = %d \n",b);
        System.out.println("Nouvelles Valeurs");
        c = a;
        a = b;
        b = c;
        System.out.printf("A = %d \n",a);
        System.out.printf("B = %d \n",b);
    }
}
