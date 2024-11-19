import java.util.HashMap;
import java.util.Map;


public class ConfiguracoesGlobais {

    static ConfiguracoesGlobais instancia;
    private Map<String, String> configuracoes;


    private ConfiguracoesGlobais() {
        configuracoes = new HashMap<>();
    }

    public static synchronized ConfiguracoesGlobais getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracoesGlobais();
        }
        return instancia;
    }

    public void definirConfiguracao(String chave, String valor){
        configuracoes.put(chave, valor);
    }

    public String obterConfiguracao(String chave){
        return configuracoes.getOrDefault(chave, "configuração não encontrada");
    }

    public void exibirConfiguracoes() {
        System.out.println("Configurações Globais:");
        configuracoes.forEach((chave, valor) -> System.out.println(chave+": "+valor));
    }
}
