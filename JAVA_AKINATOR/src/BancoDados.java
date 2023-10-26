import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BancoDados {

    public String[] ImportarPergunta() {
        String[] perguntas = {
                "A fruta é alongada?",
                "A fruta é amarela?",
                "A fruta é cítrica?",
                "A fruta é comestível?",
                "A fruta é conhecida por seu aroma?",
                "A fruta é consumida com casca?",
                "A fruta é consumida cozida?",
                "A fruta é consumida em forma de compota?",
                "A fruta é consumida em forma de geléia?",
                "A fruta é consumida em forma de purê?",
                "A fruta é consumida em saladas?",
                "A fruta é consumida principalmente fresca?",
                "A fruta é consumida seca?",
                "A fruta é de cor vermelha?",
                "A fruta é doce?",
                "A fruta é encontrada em arbustos?",
                "A fruta é encontrada em árvores?",
                "A fruta é encontrada em cachos?",
                "A fruta é encontrada em grandes cachos?",
                "A fruta é encontrada em regiões tropicais?",
                "A fruta é encontrada em vinhas?",
                "A fruta é grande?",
                "A fruta é originária da América do Sul?",
                "A fruta é originária da Ásia?",
                "A fruta é originária da Europa?",
                "A fruta é pequena?",
                "A fruta é popular em sobremesas geladas?",
                "A fruta é popular no inverno?",
                "A fruta é popular no verão?",
                "A fruta é redonda?",
                "A fruta é rica em antioxidantes?",
                "A fruta é rica em fibras?",
                "A fruta é rica em minerais?",
                "A fruta é rica em vitamina C?",
                "A fruta é tropical?",
                "A fruta é usada em conservas?",
                "A fruta é usada em doces?",
                "A fruta é usada em molhos?",
                "A fruta é usada em recheios?",
                "A fruta é usada em saladas de frutas?",
                "A fruta é usada em smoothies?",
                "A fruta é usada em sobremesas?",
                "A fruta é usada em sucos detox?",
                "A fruta é usada em tortas?",
                "A fruta é usada para fazer geleias?",
                "A fruta é usada para fazer suco?",
                "A fruta é usada para fazer vinho?",
                "A fruta é verde quando madura?",
                "A fruta possui casca espessa?",
                "A fruta possui sementes?"
        };
        return perguntas;
    }

    public Map<String, String> ImportarMapeamento() {
        Map<String, String> mapeamento = new HashMap<>();
        mapeamento.put("A fruta é alongada?", "isAlongada");
        mapeamento.put("A fruta é amarela?", "isAmarela");
        mapeamento.put("A fruta é cítrica?", "isCitrica");
        mapeamento.put("A fruta é comestível?", "isComestivel");
        mapeamento.put("A fruta é conhecida por seu aroma?", "isConhecidaPorSeuAroma");
        mapeamento.put("A fruta é consumida com casca?", "isConsumidaComCasca");
        mapeamento.put("A fruta é consumida cozida?", "isConsumidaCozida");
        mapeamento.put("A fruta é consumida em forma de compota?", "isConsumidaEmFormaDeCompota");
        mapeamento.put("A fruta é consumida em forma de geléia?", "isConsumidaEmFormaDeGeleia");
        mapeamento.put("A fruta é consumida em forma de purê?", "isConsumidaEmFormaDePure");
        mapeamento.put("A fruta é consumida em saladas?", "isConsumidaEmSaladas");
        mapeamento.put("A fruta é consumida principalmente fresca?", "isConsumidaPrincipalmenteFresca");
        mapeamento.put("A fruta é consumida seca?", "isConsumidaSeca");
        mapeamento.put("A fruta é de cor vermelha?", "isCresceEmArvores");
        mapeamento.put("A fruta é doce?", "isDoce");
        mapeamento.put("A fruta é encontrada em arbustos?", "isEncontradaEmArbustos");
        mapeamento.put("A fruta é encontrada em árvores?", "isEncontradaEmArvores");
        mapeamento.put("A fruta é encontrada em cachos?", "isEncontradaEmCachos");
        mapeamento.put("A fruta é encontrada em grandes cachos?", "isEncontradaEmGrandesCachos");
        mapeamento.put("A fruta é encontrada em regiões tropicais?", "isEncontradaEmRegioesTropicais");
        mapeamento.put("A fruta é encontrada em vinhas?", "isEncontradaEmVinhas");
        mapeamento.put("A fruta é grande?", "isGrande");
        mapeamento.put("A fruta é originária da América do Sul?", "isOriginariaDaAmericaDoSul");
        mapeamento.put("A fruta é originária da Ásia?", "isOriginariaDaAsia");
        mapeamento.put("A fruta é originária da Europa?", "isOriginariaDaEuropa");
        mapeamento.put("A fruta é pequena?", "isPequena");
        mapeamento.put("A fruta é popular em sobremesas geladas?", "isPopularEmSobremesasGeladas");
        mapeamento.put("A fruta é popular no inverno?", "isPopularNoInverno");
        mapeamento.put("A fruta é popular no verão?", "isPopularNoVerao");
        mapeamento.put("A fruta possui casca espessa?", "isPossuiCascaEspessa");
        mapeamento.put("A fruta possui sementes?", "isPossuiSementes");
        mapeamento.put("A fruta é redonda?", "isRedonda");
        mapeamento.put("A fruta é rica em antioxidantes?", "isRicaEmAntioxidantes");
        mapeamento.put("A fruta é rica em fibras?", "isRicaEmFibras");
        mapeamento.put("A fruta é rica em minerais?", "isRicaEmMinerais");
        mapeamento.put("A fruta é rica em vitamina C?", "isRicaEmVitaminaC");
        mapeamento.put("A fruta é tropical?", "isTropical");
        mapeamento.put("A fruta é usada em conservas?", "isUsadoEmConservas");
        mapeamento.put("A fruta é usada em doces?", "isUsadoEmDoces");
        mapeamento.put("A fruta é usada em molhos?", "isUsadoEmMolhos");
        mapeamento.put("A fruta é usada em recheios?", "isUsadoEmRecheios");
        mapeamento.put("A fruta é usada em saladas de frutas?", "isUsadoEmSaladasDeFrutas");
        mapeamento.put("A fruta é usada em smoothies?", "isUsadoEmSmoothies");
        mapeamento.put("A fruta é usada em sobremesas?", "isUsadoEmSobremesas");
        mapeamento.put("A fruta é usada em sucos detox?", "isUsadoEmSucosDetox");
        mapeamento.put("A fruta é usada em tortas?", "isUsadoEmTortas");
        mapeamento.put("A fruta é usada para fazer geleias?", "isUsadoParaFazerGeleias");
        mapeamento.put("A fruta é usada para fazer suco?", "isUsadoParaFazerSuco");
        mapeamento.put("A fruta é usada para fazer vinho?", "isUsadoParaFazerVinho");
        mapeamento.put("A fruta é verde quando madura?", "isVerdeQuandoMadura");
        return mapeamento;
    }

    public ArrayList<Fruta> ImportarFrutas() {
        ArrayList<Fruta> frutas = new ArrayList<>();
        frutas.add(new Fruta("Maçã", true, false, true, true, true, false, false, false, true, true, true, false,
                false, false, false, false, false, true, true, false, false, true, false, true, true, false, false,
                false, true, true, false, false, false, true, false, false, true, true, false, true, false, false,
                false, true, false, true, true, true, true, false));
        frutas.add(new Fruta("Banana", false, true, true, false, true, false, true, false, true, true, false, false,
                false, false, false, false, false, true, false, false, false, false, true, true, false, false, false,
                false, false, false, false, false, false, false, true, false, true, true, true, false, false, false,
                false, false, false, false, false, false, false, false));
        frutas.add(new Fruta("Orange", false, true, true, false, true, true, true, false, true, true, false, false,
                false, false, false, false, false, true, false, false, false, false, true, true, false, false, false,
                false, false, false, false, false, false, false, true, false, true, true, true, false, false, false,
                false, false, false, false, false, false, false, false));
        return frutas;
    }

}
