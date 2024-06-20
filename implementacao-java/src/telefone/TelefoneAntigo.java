package telefone;

public class TelefoneAntigo implements TelefoneInterface{

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
