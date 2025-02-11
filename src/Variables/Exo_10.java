package Variables;
import java.util.ArrayList;
import java.util.Date;

public class Exo_10 {
    public static void main(String[] args) {
        Byte my42Type1 = 127;
        System.out.println(my42Type1.getClass().getSimpleName());

        Integer my42Type2 = 5;
        System.out.println(my42Type2.getClass().getSimpleName());

        Float my42Type3 = 3.14f;
        System.out.println(my42Type3.getClass().getSimpleName());

        Double my42Type4 = 3.14;
        System.out.println(my42Type4.getClass().getSimpleName());

        Boolean my42Type5 = true;
        System.out.println(my42Type5.getClass().getSimpleName());

        Short my42Type6 = 1;
        System.out.println(my42Type6.getClass().getSimpleName());

        Long my42Type7 = 14541545712L;
        System.out.println(my42Type7.getClass().getSimpleName());

        Character my42Type8 = 'a';
        System.out.println(my42Type8.getClass().getSimpleName());

        String my42Type9 = "a";
        System.out.println(my42Type9.getClass().getSimpleName());

        Character [] my42Type10 = {'a','b','c','d','e','f'};
        System.out.println(my42Type10.getClass().getSimpleName());

        String [] my42Type11 = {"Hello", "World", "!:"};
        System.out.println(my42Type11.getClass().getSimpleName());

        Integer [] my42Type12 = {1,2,3,4,5,6,7,8,9};
        System.out.println(my42Type12.getClass().getSimpleName());

        ArrayList<Integer> my42Type13 = new ArrayList<>();
        System.out.println(my42Type13.getClass().getSimpleName());

        Date my42Type21 = new Date();
        System.out.println(my42Type21.getClass().getSimpleName());




    }
}
