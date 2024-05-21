public class Produto extends SQLClass {
    @Key
    int id;

    String descricao;
    String um;
    double preco;    

    Produto(){
        this.setTableName("PRODUTOS");
    }   
    
    public void printObject(){
        System.out.println(
            this.id + ", " +
            this.descricao + ", " +
            this.preco + ", " +
            this.um
        );
    }
}
