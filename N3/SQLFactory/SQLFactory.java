public class SQLFactory {
    public static void main(String[] args){
        
        Produto produto1 = new Produto();
        
        /*produto1.Cadastro(8, "Pão", "kg", 2.8);
        Database.inserirRegistro(produto1);

        Database.abrirID(produto1, 8);
        System.out.println(produto1.descricao);

        produto1.Cadastro(8, "Pão", "kg", 2.8);
        Database.atualizarRegistro(produto1);

        Database.abrirID(produto1, 8);
        System.out.println(produto1.descricao);*/

        produto1.Cadastro(8, "Pão", "kg", 2.8);
        Database.deletarRegistro(produto1);

        Database.abrirID(produto1, 8);
        System.out.println(produto1.descricao);
    }
}
