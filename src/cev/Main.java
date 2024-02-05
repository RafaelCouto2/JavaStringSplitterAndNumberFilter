package cev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Separador s1 = new Separador();
        String teste = "EMPTY OR NULL";

        for(String a : s1.separar(teste)) {
            System.out.println(a);
        }
    }
}