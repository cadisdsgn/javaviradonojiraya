package maratonajavaintroducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        }else{
            System.out.println("Nao autorizado a comprar bebida alcoólica");
        }

        if(!isAutorizadoComprarBebida) {
            System.out.println("Nao autorizado a comprar bebida alcoólica");
        }

    }
}
