public class Pedido {
    Produto produto = new Produto();

    int quantidade;
    double valorTotal;

    FormaPagament formapgto = new FormaPagament();


    double valorPedido (){
        return this.valorTotal = this.quantidade * this.produto.preco;
    }
}
