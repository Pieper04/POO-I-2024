public class Carro {

    String marca;
    String modelo;    
    int ano;

    private int hodometro;    

    int kmRodado(){
        return hodometro;
    }
    
    void andar(int km){
        this.hodometro = this.hodometro + km;
    }    
    
}
