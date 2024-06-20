package reprodutormusical;

public class IPod implements ReprodutorMusicalInterface{

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

}
