public class Main {
    public static void main(String[] args) {

        ConfiguracoesGlobais configuracoes = ConfiguracoesGlobais.getInstancia();

        configuracoes.definirConfiguracao("api_url", "https://iot.exemplo.com");
        configuracoes.definirConfiguracao("timeout", "30");
        configuracoes.definirConfiguracao("modo_debug", "true");

        configuracoes.exibirConfiguracoes();


        String apiUrl = configuracoes.obterConfiguracao("api_url");
        System.out.println("\nApi URL :" + apiUrl);

        ConfiguracoesGlobais outraInstancia = ConfiguracoesGlobais.getInstancia();
        System.out.println("\nMesma instância? " + (configuracoes == outraInstancia));



    }
}
