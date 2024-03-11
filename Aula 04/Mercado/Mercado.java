public class Mercado {
    public static void main(String[] args) {
        Pedido  p01 = new Pedido();

        p01.produto.descricao = "Pão";
        p01.quantidade = 10;
        p01.produto.preco = 1.00;
        p01.formapgto.tipo = "dinheiro";

        System.out.println(p01.produto.descricao);
        System.out.println(p01.quantidade);
        System.out.println(p01.produto.preco);
        System.out.println(p01.formapgto.tipo);

        System.out.println(p01.valorPedido());
    }
}
