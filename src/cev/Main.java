package cev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringSplitter s1 = new StringSplitter();
        String teste = "EMPTY OR NULL";

        for(String a : s1.split(teste)) System.out.println(a);

        /*__NumberFilterA num = new __NumberFilterA(s1);
        float[] numbersFiltred = num.filterNumber();
        for(float filters : numbersFiltred) System.out.println(filters);**/

        NumberFilter n1 = new NumberFilter(teste);

        for(float filters : n1.filterNumbers()) System.out.println(filters);

    }
}