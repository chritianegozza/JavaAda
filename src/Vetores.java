public class Vetores {
    public static void main(String[] args) {
        //vetores

        int[] numeros = new int[5];
        //[0] [1] [2] [3] [4]  = o inicie vai do zero em diante
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        for (int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
