public class Funcao {

    public static void main(String[] args) {
        //Escopo de varivel
        String nomeOriginal = "Christiane";
        saudacao(nomeOriginal);
    }

    //Só precisa ter o mesmo nome igual no mesmo escopo
    public  static  void  saudacao(String nomeParamentro){
        System.out.println("Hello, " + nomeParamentro);
    }
}
