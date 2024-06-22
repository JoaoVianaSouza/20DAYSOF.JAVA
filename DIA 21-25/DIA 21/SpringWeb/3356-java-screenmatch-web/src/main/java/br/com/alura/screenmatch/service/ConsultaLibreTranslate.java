package br.com.alura.screenmatch.service;

import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

public class ConsultaLibreTranslate {
    public static String obterTraducao(String texto) {
        Translator.setUrlApi("https://libretranslate.de/translate");
        var resposta = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, texto);
        return resposta;
    }
}

