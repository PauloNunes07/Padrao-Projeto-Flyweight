package factory;
import blocos.TipoBloco;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class BlocoFactory {
    private static final Map<String, TipoBloco> bloco = new HashMap<>();

    public static TipoBloco getBloco(String nome, String textura, boolean solido) {
        String chave = nome.toUpperCase() + "-" + textura.toUpperCase() + "-" + solido;

        if(!bloco.containsKey(chave)) {
            bloco.put(chave,new TipoBloco(nome, textura, solido));
        }

        return bloco.get(chave);
    }
}
