package subsistema1;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade){
        System.out.println("Salvo no Sistema 01");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(estado);
        System.out.println(cidade);
    }
}
