import iphone.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        
        IPhone iPhone = new IPhone();

        System.out.println("------------------------------------");

        // Navegador
        iPhone.exibirPagina("www.google.com");
        iPhone.adicionarNovaAba();
        
        System.out.println("------------------------------------");

        // Reprodutor Musical
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Bohemian Rhapsody");
        
        System.out.println("------------------------------------");

        // Telefone
        iPhone.ligar(999999999);
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println("------------------------------------");
        
    }
}
