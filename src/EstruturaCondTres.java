public class EstruturaCondTres {

        public static void main(String[] args) {
            int  nota = 80;
            String graduação;
            // A80 B70 C 60 D 0
            if(nota >= 80){
                graduação = "A";
            }else if (nota < 80 && nota >= 70){
                graduação = "B";
            }else if (nota < 70 && nota >= 60){
                graduação = "C";
            }else if (nota < 60 && nota >= 0){
                graduação = "D";
            }else {
                graduação = "";
            }

            //switch
            switch (graduação){
                case "A":
                case "B":
                    System.out.println("Aluno aprovado");
                    break;
                case "C":
                case "D":
                    System.out.println("Não aprovado");
                    break;
                default:
                    System.out.println("Graduação inválida");
            }
        }
    }


