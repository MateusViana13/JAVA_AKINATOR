public class Fruta {
    private String nome;
    private int pontos = 0;
    private boolean alongada;
    private boolean amarela;
    private boolean citrica;
    private boolean comestivel;
    private boolean conhecidaPorSeuAroma;
    private boolean consumidaComCasca;
    private boolean consumidaCozida;
    private boolean consumidaEmFormaDeCompota;
    private boolean consumidaEmFormaDeGeleia;
    private boolean consumidaEmFormaDePure;
    private boolean consumidaEmSaladas;
    private boolean consumidaPrincipalmenteFresca;
    private boolean consumidaSeca;
    private boolean cresceEmArvores;
    private boolean doce;
    private boolean encontradaEmArbustos;
    private boolean encontradaEmArvores;
    private boolean encontradaEmCachos;
    private boolean encontradaEmGrandesCachos;
    private boolean encontradaEmRegioesTropicais;
    private boolean encontradaEmVinhas;
    private boolean grande;
    private boolean originariaDaAmericaDoSul;
    private boolean originariaDaAsia;
    private boolean originariaDaEuropa;
    private boolean pequena;
    private boolean popularEmSobremesasGeladas;
    private boolean popularNoInverno;
    private boolean popularNoVerao;
    private boolean possuiCascaEspessa;
    private boolean possuiSementes;
    private boolean redonda;
    private boolean ricaEmAntioxidantes;
    private boolean ricaEmFibras;
    private boolean ricaEmMinerais;
    private boolean ricaEmVitaminaC;
    private boolean tropical;
    private boolean usadoEmConservas;
    private boolean usadoEmDoces;
    private boolean usadoEmMolhos;
    private boolean usadoEmRecheios;
    private boolean usadoEmSaladasDeFrutas;
    private boolean usadoEmSmoothies;
    private boolean usadoEmSobremesas;
    private boolean usadoEmSucosDetox;
    private boolean usadoEmTortas;
    private boolean usadoParaFazerGeleias;
    private boolean usadoParaFazerSuco;
    private boolean usadoParaFazerVinho;
    private boolean verdeQuandoMadura;

    public Fruta(String nome,
            boolean redonda,
            boolean amarela,
            boolean cresceEmArvores,
            boolean consumidaComCasca,
            boolean comestivel,
            boolean citrica,
            boolean tropical,
            boolean grande,
            boolean possuiSementes,
            boolean doce,
            boolean usadoParaFazerSuco,
            boolean popularNoVerao,
            boolean alongada,
            boolean possuiCascaEspessa,
            boolean originariaDaAmericaDoSul,
            boolean usadoEmSaladasDeFrutas,
            boolean encontradaEmArvores,
            boolean consumidaPrincipalmenteFresca,
            boolean usadoParaFazerGeleias,
            boolean encontradaEmCachos,
            boolean consumidaCozida,
            boolean ricaEmVitaminaC,
            boolean pequena,
            boolean consumidaSeca,
            boolean usadoEmSobremesas,
            boolean originariaDaAsia,
            boolean encontradaEmArbustos,
            boolean popularNoInverno,
            boolean ricaEmFibras,
            boolean usadoEmTortas,
            boolean encontradaEmRegioesTropicais,
            boolean usadoParaFazerVinho,
            boolean consumidaEmFormaDeGeleia,
            boolean usadoEmDoces,
            boolean verdeQuandoMadura,
            boolean usadoEmSucosDetox,
            boolean ricaEmAntioxidantes,
            boolean consumidaEmSaladas,
            boolean originariaDaEuropa,
            boolean usadoEmSmoothies,
            boolean encontradaEmVinhas,
            boolean popularEmSobremesasGeladas,
            boolean usadoEmConservas,
            boolean consumidaEmFormaDePure,
            boolean encontradaEmGrandesCachos,
            boolean usadoEmMolhos,
            boolean ricaEmMinerais,
            boolean consumidaEmFormaDeCompota,
            boolean usadoEmRecheios,
            boolean conhecidaPorSeuAroma) {
        this.nome = nome;
        this.alongada = alongada;
        this.amarela = amarela;
        this.citrica = citrica;
        this.comestivel = comestivel;
        this.conhecidaPorSeuAroma = conhecidaPorSeuAroma;
        this.consumidaComCasca = consumidaComCasca;
        this.consumidaCozida = consumidaCozida;
        this.consumidaEmFormaDeCompota = consumidaEmFormaDeCompota;
        this.consumidaEmFormaDeGeleia = consumidaEmFormaDeGeleia;
        this.consumidaEmFormaDePure = consumidaEmFormaDePure;
        this.consumidaEmSaladas = consumidaEmSaladas;
        this.consumidaPrincipalmenteFresca = consumidaPrincipalmenteFresca;
        this.consumidaSeca = consumidaSeca;
        this.cresceEmArvores = cresceEmArvores;
        this.doce = doce;
        this.encontradaEmArbustos = encontradaEmArbustos;
        this.encontradaEmArvores = encontradaEmArvores;
        this.encontradaEmCachos = encontradaEmCachos;
        this.encontradaEmGrandesCachos = encontradaEmGrandesCachos;
        this.encontradaEmRegioesTropicais = encontradaEmRegioesTropicais;
        this.encontradaEmVinhas = encontradaEmVinhas;
        this.grande = grande;
        this.originariaDaAmericaDoSul = originariaDaAmericaDoSul;
        this.originariaDaAsia = originariaDaAsia;
        this.originariaDaEuropa = originariaDaEuropa;
        this.pequena = pequena;
        this.popularEmSobremesasGeladas = popularEmSobremesasGeladas;
        this.popularNoInverno = popularNoInverno;
        this.popularNoVerao = popularNoVerao;
        this.possuiCascaEspessa = possuiCascaEspessa;
        this.possuiSementes = possuiSementes;
        this.redonda = redonda;
        this.ricaEmAntioxidantes = ricaEmAntioxidantes;
        this.ricaEmFibras = ricaEmFibras;
        this.ricaEmMinerais = ricaEmMinerais;
        this.ricaEmVitaminaC = ricaEmVitaminaC;
        this.tropical = tropical;
        this.usadoEmConservas = usadoEmConservas;
        this.usadoEmDoces = usadoEmDoces;
        this.usadoEmMolhos = usadoEmMolhos;
        this.usadoEmRecheios = usadoEmRecheios;
        this.usadoEmSaladasDeFrutas = usadoEmSaladasDeFrutas;
        this.usadoEmSmoothies = usadoEmSmoothies;
        this.usadoEmSobremesas = usadoEmSobremesas;
        this.usadoEmSucosDetox = usadoEmSucosDetox;
        this.usadoEmTortas = usadoEmTortas;
        this.usadoParaFazerGeleias = usadoParaFazerGeleias;
        this.usadoParaFazerSuco = usadoParaFazerSuco;
        this.usadoParaFazerVinho = usadoParaFazerVinho;
        this.verdeQuandoMadura = verdeQuandoMadura;
    }

    public Fruta(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }    

    public int getPontos() {
        return pontos;
    }

    public void addPontos(int x) {
        this.pontos += x;
    }

    public void subPontos(int x) {
        this.pontos -= x;
    }

    public boolean isAlongada() {
        return alongada;
    }

    public boolean isAmarela() {
        return amarela;
    }

    public boolean isCitrica() {
        return citrica;
    }

    public boolean isComestivel() {
        return comestivel;
    }

    public boolean isConhecidaPorSeuAroma() {
        return conhecidaPorSeuAroma;
    }

    public boolean isConsumidaComCasca() {
        return consumidaComCasca;
    }

    public boolean isConsumidaCozida() {
        return consumidaCozida;
    }

    public boolean isConsumidaEmFormaDeCompota() {
        return consumidaEmFormaDeCompota;
    }

    public boolean isConsumidaEmFormaDeGeleia() {
        return consumidaEmFormaDeGeleia;
    }

    public boolean isConsumidaEmFormaDePure() {
        return consumidaEmFormaDePure;
    }

    public boolean isConsumidaEmSaladas() {
        return consumidaEmSaladas;
    }

    public boolean isConsumidaPrincipalmenteFresca() {
        return consumidaPrincipalmenteFresca;
    }

    public boolean isConsumidaSeca() {
        return consumidaSeca;
    }

    public boolean isCresceEmArvores() {
        return cresceEmArvores;
    }

    public boolean isDoce() {
        return doce;
    }

    public boolean isEncontradaEmArbustos() {
        return encontradaEmArbustos;
    }

    public boolean isEncontradaEmArvores() {
        return encontradaEmArvores;
    }

    public boolean isEncontradaEmCachos() {
        return encontradaEmCachos;
    }

    public boolean isEncontradaEmGrandesCachos() {
        return encontradaEmGrandesCachos;
    }

    public boolean isEncontradaEmRegioesTropicais() {
        return encontradaEmRegioesTropicais;
    }

    public boolean isEncontradaEmVinhas() {
        return encontradaEmVinhas;
    }

    public boolean isGrande() {
        return grande;
    }

    public boolean isOriginariaDaAmericaDoSul() {
        return originariaDaAmericaDoSul;
    }

    public boolean isOriginariaDaAsia() {
        return originariaDaAsia;
    }

    public boolean isOriginariaDaEuropa() {
        return originariaDaEuropa;
    }

    public boolean isPequena() {
        return pequena;
    }

    public boolean isPopularEmSobremesasGeladas() {
        return popularEmSobremesasGeladas;
    }

    public boolean isPopularNoInverno() {
        return popularNoInverno;
    }

    public boolean isPopularNoVerao() {
        return popularNoVerao;
    }

    public boolean isPossuiCascaEspessa() {
        return possuiCascaEspessa;
    }

    public boolean isPossuiSementes() {
        return possuiSementes;
    }

    public boolean isRedonda() {
        return redonda;
    }

    public boolean isRicaEmAntioxidantes() {
        return ricaEmAntioxidantes;
    }

    public boolean isRicaEmFibras() {
        return ricaEmFibras;
    }

    public boolean isRicaEmMinerais() {
        return ricaEmMinerais;
    }

    public boolean isRicaEmVitaminaC() {
        return ricaEmVitaminaC;
    }

    public boolean isTropical() {
        return tropical;
    }

    public boolean isUsadoEmConservas() {
        return usadoEmConservas;
    }

    public boolean isUsadoEmDoces() {
        return usadoEmDoces;
    }

    public boolean isUsadoEmMolhos() {
        return usadoEmMolhos;
    }

    public boolean isUsadoEmRecheios() {
        return usadoEmRecheios;
    }

    public boolean isUsadoEmSaladasDeFrutas() {
        return usadoEmSaladasDeFrutas;
    }

    public boolean isUsadoEmSmoothies() {
        return usadoEmSmoothies;
    }

    public boolean isUsadoEmSobremesas() {
        return usadoEmSobremesas;
    }

    public boolean isUsadoEmSucosDetox() {
        return usadoEmSucosDetox;
    }

    public boolean isUsadoEmTortas() {
        return usadoEmTortas;
    }

    public boolean isUsadoParaFazerGeleias() {
        return usadoParaFazerGeleias;
    }

    public boolean isUsadoParaFazerSuco() {
        return usadoParaFazerSuco;
    }

    public boolean isUsadoParaFazerVinho() {
        return usadoParaFazerVinho;
    }

    public boolean isVerdeQuandoMadura() {
        return verdeQuandoMadura;
    }
}