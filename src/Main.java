import blocos.TipoBloco;
import factory.BlocoFactory;
import interfaces.Bloco;

public class Main {
    public static void main(String[] args) {
        //Criação dos blocos
       Bloco pedra1 = BlocoFactory.getBloco("Pedra", "pedra.png",true);
       Bloco pedra2 = BlocoFactory.getBloco("Pedra", "pedra.png", true);
       Bloco grama = BlocoFactory.getBloco("Grama", "grama.png", true);
       Bloco madeira = BlocoFactory.getBloco("Madeira", "madeira.png", true);

       // exibindo Os blocos no mundo

       pedra1.exibir(10, 64, 20);
       pedra1.exibir(11, 64, 20);
       pedra1.exibir(12, 64, 20);

       grama.exibir(15, 64, 22);
       grama.exibir(16, 64, 22);

       madeira.exibir(30, 65, 10);
        System.out.println("Pedra1 e Pedra2 são o mesmo objeto? " + (pedra1 == pedra2));
        System.out.println("====================================================================");

    }
}
