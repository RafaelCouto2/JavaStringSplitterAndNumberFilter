package cev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringSplitter s1 = new StringSplitter();
        String teste = "EMPTY 66 OR 021 NULL";

        for(String a : s1.split(teste)) {
            System.out.println(a);
        }
        NumberFilter num = new NumberFilter(s1);
        float[] a = num.filterNumber();
        for(float b : a) System.out.println(b);

    }
}