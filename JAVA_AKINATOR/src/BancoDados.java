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
        frutas.add(new Fruta("Maçã",
            true, // redonda
            false, // amarela
            true, // cresce em árvores
            true, // consumida com casca
            true, // comestível
            false, // cítrica
            false, // tropical
            false, // grande
            true, // possui sementes
            true, // doce
            true, // usado para fazer suco
            true, // popular no verão
            false, // alongada
            false, // possui casca espessa
            false, // originária da América do Sul
            true, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            true, // usado para fazer geleias
            false, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            true, // pequena
            true, // consumida seca
            true, // usado em sobremesas
            true, // originária da Ásia
            false, // encontrada em arbustos
            false, // popular no inverno
            true, // rica em fibras
            true, // usado em tortas
            false, // encontrada em regiões tropicais
            false, // usado para fazer vinho
            true, // consumida em forma de geleia
            true, // usado em doces
            false, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            false, // originária da Europa
            true, // usado em smoothies
            false, // encontrada em vinhas
            true, // popular em sobremesas geladas
            true, // usado em conservas
            true, // consumida em forma de purê
            false, // encontrada em grandes cachos
            true, // usado em molhos
            true, // rica em minerais
            true, // consumida em forma de compota
            true, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Banana",
            false, // redonda
            true, // amarela
            false, // cresce em árvores
            true, // consumida com casca
            true, // comestível
            false, // cítrica
            true, // tropical
            false, // grande
            true, // possui sementes
            true, // doce
            false, // usado para fazer suco
            true, // popular no verão
            true, // alongada
            true, // possui casca espessa
            false, // originária da América do Sul
            false, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            false, // usado para fazer geleias
            true, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            true, // pequena
            false, // consumida seca
            true, // usado em sobremesas
            true, // originária da Ásia
            false, // encontrada em arbustos
            true, // popular no inverno
            true, // rica em fibras
            true, // usado em tortas
            true, // encontrada em regiões tropicais
            false, // usado para fazer vinho
            true, // consumida em forma de geleia
            true, // usado em doces
            false, // verde quando madura
            false, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            false, // originária da Europa
            true, // usado em smoothies
            false, // encontrada em vinhas
            true, // popular em sobremesas geladas
            false, // usado em conservas
            true, // consumida em forma de purê
            true, // encontrada em grandes cachos
            false, // usado em molhos
            true, // rica em minerais
            false, // consumida em forma de compota
            true, // usado em recheios
            false)); // conhecida por seu aroma
        frutas.add(new Fruta("Laranja",
            true, // redonda
            true, // amarela
            true, // cresce em árvores
            false, // consumida com casca
            true, // comestível
            true, // cítrica
            true, // tropical
            false, // grande
            true, // possui sementes
            false, // doce
            true, // usado para fazer suco
            true, // popular no verão
            false, // alongada
            false, // possui casca espessa
            false, // originária da América do Sul
            true, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            false, // usado para fazer geleias
            false, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            true, // pequena
            false, // consumida seca
            false, // usado em sobremesas
            true, // originária da Ásia
            false, // encontrada em arbustos
            false, // popular no inverno
            true, // rica em fibras
            false, // usado em tortas
            true, // encontrada em regiões tropicais
            false, // usado para fazer vinho
            false, // consumida em forma de geleia
            false, // usado em doces
            false, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            false, // originária da Europa
            false, // usado em smoothies
            false, // encontrada em vinhas
            false, // popular em sobremesas geladas
            false, // usado em conservas
            false, // consumida em forma de purê
            false, // encontrada em grandes cachos
            false, // usado em molhos
            true, // rica em minerais
            false, // consumida em forma de compota
            false, // usado em recheios
            false)); // conhecida por seu aroma
        frutas.add(new Fruta("Abacate",
            false, // redonda
            false, // amarela
            true, // cresce em árvores
            false, // consumida com casca
            true, // comestível
            false, // cítrica
            true, // tropical
            true, // grande
            true, // possui sementes
            false, // doce
            true, // usado para fazer suco
            false, // popular no verão
            true, // alongada
            false, // possui casca espessa
            true, // originária da América do Sul
            false, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            false, // usado para fazer geleias
            false, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            false, // pequena
            false, // consumida seca
            true, // usado em sobremesas
            false, // originária da Ásia
            false, // encontrada em arbustos
            false, // popular no inverno
            true, // rica em fibras
            false, // usado em tortas
            true, // encontrada em regiões tropicais
            false, // usado para fazer vinho
            false, // consumida em forma de geleia
            true, // usado em doces
            true, // verde quando madura
            false, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            false, // originária da Europa
            true, // usado em smoothies
            false, // encontrada em vinhas
            true, // popular em sobremesas geladas
            true, // usado em conservas
            true, // consumida em forma de purê
            false, // encontrada em grandes cachos
            true, // usado em molhos
            true, // rica em minerais
            true, // consumida em forma de compota
            true, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Melancia",
            true, // redonda
            false, // amarela
            false, // cresce em árvores
            true, // consumida com casca
            true, // comestível
            false, // cítrica
            true, // tropical
            true, // grande
            false, // possui sementes
            true, // doce
            true, // usado para fazer suco
            true, // popular no verão
            false, // alongada
            true, // possui casca espessa
            false, // originária da América do Sul
            true, // usado em saladas de frutas
            false, // encontrada em árvores
            true, // consumida principalmente fresca
            false, // usado para fazer geleias
            false, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            false, // pequena
            false, // consumida seca
            true, // usado em sobremesas
            true, // originária da Ásia
            true, // encontrada em arbustos
            false, // popular no inverno
            false, // rica em fibras
            false, // usado em tortas
            true, // encontrada em regiões tropicais
            false, // usado para fazer vinho
            false, // consumida em forma de geleia
            false, // usado em doces
            true, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            false, // originária da Europa
            false, // usado em smoothies
            false, // encontrada em vinhas
            false, // popular em sobremesas geladas
            false, // usado em conservas
            false, // consumida em forma de purê
            false, // encontrada em grandes cachos
            false, // usado em molhos
            true, // rica em minerais
            false, // consumida em forma de compota
            false, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Morango",
            false, // redonda
            false, // amarela
            false, // cresce em árvores
            true, // consumida com casca
            true, // comestível
            false, // cítrica
            false, // tropical
            false, // grande
            true, // possui sementes
            true, // doce
            true, // usado para fazer suco
            true, // popular no verão
            true, // alongada
            false, // possui casca espessa
            false, // originária da América do Sul
            true, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            true, // usado para fazer geleias
            false, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            true, // pequena
            true, // consumida seca
            true, // usado em sobremesas
            false, // originária da Ásia
            false, // encontrada em arbustos
            false, // popular no inverno
            true, // rica em fibras
            true, // usado em tortas
            false, // encontrada em regiões tropicais
            true, // usado para fazer vinho
            true, // consumida em forma de geleia
            true, // usado em doces
            false, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            false, // originária da Europa
            true, // usado em smoothies
            false, // encontrada em vinhas
            true, // popular em sobremesas geladas
            true, // usado em conservas
            true, // consumida em forma de purê
            false, // encontrada em grandes cachos
            true, // usado em molhos
            true, // rica em minerais
            true, // consumida em forma de compota
            true, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Abacaxi",
            true, // redonda
            true, // amarela
            false, // cresce em árvores
            false, // consumida com casca
            true, // comestível
            false, // cítrica
            true, // tropical
            false, // grande
            true, // possui sementes
            false, // doce
            true, // usado para fazer suco
            true, // popular no verão
            true, // alongada
            true, // possui casca espessa
            true, // originária da América do Sul
            true, // usado em saladas de frutas
            false, // encontrada em árvores
            true, // consumida principalmente fresca
            false, // usado para fazer geleias
            false, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            false, // pequena
            false, // consumida seca
            true, // usado em sobremesas
            false, // originária da Ásia
            true, // encontrada em arbustos
            false, // popular no inverno
            false, // rica em fibras
            true, // usado em tortas
            true, // encontrada em regiões tropicais
            false, // usado para fazer vinho
            false, // consumida em forma de geleia
            true, // usado em doces
            false, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            false, // originária da Europa
            false, // usado em smoothies
            false, // encontrada em vinhas
            true, // popular em sobremesas geladas
            false, // usado em conservas
            false, // consumida em forma de purê
            false, // encontrada em grandes cachos
            false, // usado em molhos
            true, // rica em minerais
            false, // consumida em forma de compota
            true, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Mamão",
            false, // redonda
            false, // amarela
            true, // cresce em árvores
            false, // consumida com casca
            true, // comestível
            false, // cítrica
            true, // tropical
            true, // grande
            true, // possui sementes
            true, // doce
            true, // usado para fazer suco
            true, // popular no verão
            true, // alongada
            true, // possui casca espessa
            true, // originária da América do Sul
            true, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            true, // usado para fazer geleias
            false, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            false, // pequena
            true, // consumida seca
            true, // usado em sobremesas
            true, // originária da Ásia
            false, // encontrada em arbustos
            true, // popular no inverno
            true, // rica em fibras
            true, // usado em tortas
            false, // encontrada em regiões tropicais
            false, // usado para fazer vinho
            false, // consumida em forma de geleia
            true, // usado em doces
            false, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            true, // originária da Europa
            true, // usado em smoothies
            false, // encontrada em vinhas
            false, // popular em sobremesas geladas
            true, // usado em conservas
            true, // consumida em forma de purê
            false, // encontrada em grandes cachos
            true, // usado em molhos
            true, // rica em minerais
            true, // consumida em forma de compota
            true, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Pera",
            false, // redonda
            false, // amarela
            true, // cresce em árvores
            true, // consumida com casca
            true, // comestível
            false, // cítrica
            false, // tropical
            false, // grande
            true, // possui sementes
            true, // doce
            false, // usado para fazer suco
            false, // popular no verão
            false, // alongada
            false, // possui casca espessa
            false, // originária da América do Sul
            false, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            false, // usado para fazer geleias
            false, // encontrada em cachos
            false, // consumida cozida
            false, // rica em vitamina C
            false, // pequena
            false, // consumida seca
            false, // usado em sobremesas
            false, // originária da Ásia
            false, // encontrada em arbustos
            false, // popular no inverno
            true, // rica em fibras
            false, // usado em tortas
            false, // encontrada em regiões tropicais
            false, // usado para fazer vinho
            false, // consumida em forma de geleia
            false, // usado em doces
            true, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            false, // originária da Europa
            false, // usado em smoothies
            false, // encontrada em vinhas
            true, // popular em sobremesas geladas
            true, // usado em conservas
            true, // consumida em forma de purê
            false, // encontrada em grandes cachos
            false, // usado em molhos
            false, // rica em minerais
            false, // consumida em forma de compota
            false, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Kiwi",
            false, // redonda
            false, // amarela
            true, // cresce em árvores
            true, // consumida com casca
            true, // comestível
            true, // cítrica
            false, // tropical
            false, // grande
            true, // possui sementes
            true, // doce
            false, // usado para fazer suco
            false, // popular no verão
            true, // alongada
            true, // possui casca espessa
            false, // originária da América do Sul
            false, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            false, // usado para fazer geleias
            true, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            false, // pequena
            true, // consumida seca
            false, // usado em sobremesas
            true, // originária da Ásia
            false, // encontrada em arbustos
            false, // popular no inverno
            true, // rica em fibras
            false, // usado em tortas
            false, // encontrada em regiões tropicais
            false, // usado para fazer vinho
            false, // consumida em forma de geleia
            true, // usado em doces
            false, // verde quando madura
            false, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            true, // originária da Europa
            false, // usado em smoothies
            false, // encontrada em vinhas
            false, // popular em sobremesas geladas
            true, // usado em conservas
            true, // consumida em forma de purê
            false, // encontrada em grandes cachos
            false, // usado em molhos
            true, // rica em minerais
            false, // consumida em forma de compota
            false, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Limão",
            false, // redonda
            true, // amarela
            true, // cresce em árvores
            false, // consumida com casca
            true, // comestível
            true, // cítrica
            true, // tropical
            false, // grande
            false, // possui sementes
            true, // doce
            false, // usado para fazer suco
            true, // popular no verão
            true, // alongada
            false, // possui casca espessa
            false, // originária da América do Sul
            false, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            true, // usado para fazer geleias
            false, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            false, // pequena
            false, // consumida seca
            true, // usado em sobremesas
            false, // originária da Ásia
            false, // encontrada em arbustos
            false, // popular no inverno
            true, // rica em fibras
            true, // usado em tortas
            false, // encontrada em regiões tropicais
            false, // usado para fazer vinho
            true, // consumida em forma de geleia
            true, // usado em doces
            false, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            false, // originária da Europa
            true, // usado em smoothies
            false, // encontrada em vinhas
            true, // popular em sobremesas geladas
            true, // usado em conservas
            true, // consumida em forma de purê
            false, // encontrada em grandes cachos
            true, // usado em molhos
            true, // rica em minerais
            true, // consumida em forma de compota
            true, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Manga",
            true, // redonda
            false, // amarela
            true, // cresce em árvores
            false, // consumida com casca
            true, // comestível
            false, // cítrica
            true, // tropical
            false, // grande
            true, // possui sementes
            true, // doce
            true, // usado para fazer suco
            true, // popular no verão
            true, // alongada
            false, // possui casca espessa
            true, // originária da América do Sul
            true, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            true, // usado para fazer geleias
            false, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            true, // pequena
            false, // consumida seca
            true, // usado em sobremesas
            true, // originária da Ásia
            false, // encontrada em arbustos
            false, // popular no inverno
            true, // rica em fibras
            true, // usado em tortas
            true, // encontrada em regiões tropicais
            true, // usado para fazer vinho
            true, // consumida em forma de geleia
            true, // usado em doces
            true, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            true, // originária da Europa
            true, // usado em smoothies
            true, // encontrada em vinhas
            true, // popular em sobremesas geladas
            true, // usado em conservas
            true, // consumida em forma de purê
            false, // encontrada em grandes cachos
            true, // usado em molhos
            true, // rica em minerais
            true, // consumida em forma de compota
            true, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Uva",
            false, // redonda
            false, // amarela
            true, // cresce em árvores
            false, // consumida com casca
            true, // comestível
            false, // cítrica
            true, // tropical
            false, // grande
            true, // possui sementes
            true, // doce (defina o valor de acordo com o tipo de uva que está representando)
            true, // usado para fazer suco
            false, // popular no verão
            true, // alongada
            false, // possui casca espessa
            false, // originária da América do Sul
            true, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            true, // usado para fazer geleias
            false, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            false, // pequena
            true, // consumida seca
            true, // usado em sobremesas
            true, // originária da Ásia
            false, // encontrada em arbustos
            false, // popular no inverno
            true, // rica em fibras
            true, // usado em tortas
            true, // encontrada em regiões tropicais
            true, // usado para fazer vinho
            true, // consumida em forma de geleia
            true, // usado em doces
            true, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            true, // originária da Europa
            true, // usado em smoothies
            false, // encontrada em vinhas
            true, // popular em sobremesas geladas
            true, // usado em conservas
            true, // consumida em forma de purê
            true, // encontrada em grandes cachos
            true, // usado em molhos
            true, // rica em minerais
            true, // consumida em forma de compota
            true, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Cereja",
            false, // redonda
            true, // amarela
            false, // cresce em árvores
            false, // consumida com casca
            true, // comestível
            false, // cítrica
            true, // tropical
            false, // grande
            true, // possui sementes
            true, // doce
            true, // usado para fazer suco
            true, // popular no verão
            false, // alongada
            false, // possui casca espessa
            false, // originária da América do Sul
            true, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            true, // usado para fazer geleias
            true, // encontrada em cachos
            false, // consumida cozida
            true, // rica em vitamina C
            true, // pequena
            true, // consumida seca
            true, // usado em sobremesas
            false, // originária da Ásia
            false, // encontrada em arbustos
            true, // popular no inverno
            true, // rica em fibras
            true, // usado em tortas
            false, // encontrada em regiões tropicais
            true, // usado para fazer vinho
            true, // consumida em forma de geleia
            true, // usado em doces
            false, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            false, // originária da Europa
            true, // usado em smoothies
            false, // encontrada em vinhas
            true, // popular em sobremesas geladas
            true, // usado em conservas
            true, // consumida em forma de purê
            true, // encontrada em grandes cachos
            true, // usado em molhos
            true, // rica em minerais
            true, // consumida em forma de compota
            true, // usado em recheios
            true)); // conhecida por seu aroma
        frutas.add(new Fruta("Pêssego",
            true, // redonda
            true, // amarela
            true, // cresce em árvores
            true, // consumida com casca
            true, // comestível
            false, // cítrica
            false, // tropical
            false, // grande
            true, // possui sementes
            true, // doce
            true, // usado para fazer suco
            true, // popular no verão
            true, // alongada
            false, // possui casca espessa
            false, // originária da América do Sul
            true, // usado em saladas de frutas
            true, // encontrada em árvores
            true, // consumida principalmente fresca
            true, // usado para fazer geleias
            false, // encontrada em cachos
            true, // consumida cozida
            true, // rica em vitamina C
            false, // pequena
            true, // consumida seca
            true, // usado em sobremesas
            false, // originária da Ásia
            false, // encontrada em arbustos
            false, // popular no inverno
            true, // rica em fibras
            true, // usado em tortas
            false, // encontrada em regiões tropicais
            true, // usado para fazer vinho
            true, // consumida em forma de geleia
            true, // usado em doces
            false, // verde quando madura
            true, // usado em sucos detox
            true, // rica em antioxidantes
            true, // consumida em saladas
            false, // originária da Europa
            true, // usado em smoothies
            false, // encontrada em vinhas
            true, // popular em sobremesas geladas
            true, // usado em conservas
            true, // consumida em forma de purê
            false, // encontrada em grandes cachos
            true, // usado em molhos
            true, // rica em minerais
            true, // consumida em forma de compota
            true, // usado em recheios
            true)); // conhecida por seu aroma
        return frutas;
    }

}