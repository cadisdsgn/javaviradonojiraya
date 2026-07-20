package maratonajavaintroducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se e dia util ou final de semana
        // Considerando 1 como domingo

        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Final de Semana!");
                break;
            case 2:
                System.out.println("Dia util");
                break;
            case 3:
                System.out.println("Dia util");
                break;
            case 4:
                System.out.println("Dia util");
                break;
            case 5:
                System.out.println("Dia util");
                break;
            case 6:
                System.out.println("Dia util");
                break;
            case 7:
                System.out.println("Final de Semana!");
                break;
            default:
                 System.out.println("Opcao invalida");
                break;
        }
    }
}
