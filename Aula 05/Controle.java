public class Controle {
    
    private boolean ligado;

    private void ligar(){
        this.ligado = true;
        System.out.println("Você ligou a TV.");
    }

    private void desligar(){
        this.ligado = false;
        System.out.println("Você desligou a TV.");
    }

    void botaoPower(){
        if (this.ligado) {
            this.desligar();
        } else
        {
            this.ligar();
        }
    }

}
