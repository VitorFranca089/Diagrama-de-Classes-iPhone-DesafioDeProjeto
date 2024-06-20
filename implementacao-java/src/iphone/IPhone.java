package iphone;

import navegador.NavegadorInterface;
import reprodutormusical.ReprodutorMusicalInterface;
import telefone.TelefoneInterface;

public class IPhone implements NavegadorInterface, ReprodutorMusicalInterface, TelefoneInterface{

    @Override
    public void exibirPagina(String url){
        System.out.println("Acessando: " + url + ".");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Nova aba.");
    }

    @Override
    public void tocar(){
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar(){
        System.out.println("Parou a música.");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Música: " + musica + " selecionada.");
    }

    @Override
    public void ligar(int numero){
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender(){
        System.out.println("Atendendo telefone.");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }

}
