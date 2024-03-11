import java.util.*;
public class Agenda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Contato contato = new Contato();    

        contato.nome = entrada.nextLine();
        contato.numero = entrada.nextLine();

        System.out.println("Contato salvo:");
        System.out.println(contato.nome);
        System.out.println(contato.numero);
    }
}
