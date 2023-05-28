package br.com.cursoadasantander.java;



public class Main {

    public static void main(String[] args) {
	// write your code here

       // System.out.println("Hello Word!");
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol; //variavel = resultado
        System.out.println(vamosAPraia);
        //tabela verdade
        // Operador  && (AND)
        //true && true = true
        //true && false =  false
        //false && true =  false
        //false && false = false

        // Operador || (OR)
        // true || True = true
        //true && false =  true
        //false && true =  true
        //false && false = false
    }
}
