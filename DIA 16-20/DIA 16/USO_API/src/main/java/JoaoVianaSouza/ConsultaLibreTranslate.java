package JoaoVianaSouza;

import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

public class ConsultaLibreTranslate {
    public static String obterTraducao(String texto, int lingua) {

        if (lingua == 1) {
            var resposta = Translator.translate(Language.PORTUGUESE, Language.ENGLISH, texto);
            return resposta;
        } else {
            var resposta = Translator.translate(Language.PORTUGUESE, Language.SPANISH, texto);
            return resposta;
        }
    }
}