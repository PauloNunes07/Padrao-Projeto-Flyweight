package blocos;

import interfaces.Bloco;

public class TipoBloco implements Bloco {
    private final String nome;
    private final String textura;
    private boolean solido;

    public TipoBloco(String nome, String textura, boolean solido) {
        this.nome = nome;
        this.textura = textura;
        this.solido = solido;
    }

    @Override
    public void exibir(int x, int y, int z) {
        System.out.printf("Bloco %s | Textura: %s | Sólido: %b | Posição(%d,%d,%d) %n", nome, textura, solido, x, y, z);
    }
}
