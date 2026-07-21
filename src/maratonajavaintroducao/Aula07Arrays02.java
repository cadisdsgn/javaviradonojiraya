package maratonajavaintroducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Camila";
        nomes[1] = "Rodrigues";
        nomes[2] = "Maria";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }




    }
}
