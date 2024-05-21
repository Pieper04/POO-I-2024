public class Produto extends SQLClass {
    @Key
    int id;

    String descricao;
    String um;
    double preco;    

    Produto(){
        this.setTableName("PRODUTOS");
    }   

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public String getUm() {
        return um;
    }

    public void Cadastro(Integer id, String desc, String um, double preco){
        setId(id);
        setDescricao(desc);
        setPreco(preco);
        setUm(um);
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
