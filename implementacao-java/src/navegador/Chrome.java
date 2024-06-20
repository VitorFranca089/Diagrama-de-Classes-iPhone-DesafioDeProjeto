package navegador;

public class Chrome implements NavegadorInterface{
    
    @Override
    public void exibirPagina(String url){
        System.out.println("Acessando: " + url + ".");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Nova aba.");
    }

}
