package cev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //////////////////////////////////StringSplitter()///////////////////////////////////////

        /*StringSplitter s1 = new StringSplitter();
        String teste = "EMPTY OR NULL";
        for(String a : s1.split(teste)) System.out.println(a);**/

        ///////////////////////////__NumberFilter(StringSplitter instance)///////////////////////

        /*__NumberFilter num = new __NumberFilter(s1);
        float[] numbersFiltered = num.filterNumber();
        for(float filters : numbersFiltered) System.out.println(filters);**/

        /////////////////////////////NumberFilter(String){...}///////////////////////////////////
        //Split String and filter number. Inherit StringSplitter.

        /*NumberFilter n1 = new NumberFilter(teste);
        for(float filters : n1.filterNumbers()) System.out.println(filters);**/

    }
}