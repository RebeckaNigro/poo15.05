package compras;

public class Principal {
    public static void main(String[] args) {
        
        Cliente cli = new Cliente("123456789", "Veiga");
        
        Compra comp = new Compra("08/05/2023", cli);
        
        Produto coca = new Produto(11, "Coca", 3);
        Produto lapis = new Produto(12, "Lápis", 2);
        Produto suco = new Produto(13, "Suco", 1);
        Produto salgado = new Produto(14, "Salgado", 5);
        
        ItemCompra ic = new ItemCompra(2, coca);
        
        comp.adicionaItem(ic);
        comp.adicionaItem(4, lapis);
        comp.adicionaItem(5, suco);
        comp.adicionaItem(3, salgado);
        comp.adicionaItem(2, suco);
        //comp.removeItem(0);
                
        comp.imprimir();
        
        //System.out.println(comp.itens.get(2).getProduto().getCódigo());
        
//        Ao adicionar um produto na lista, verificar se o produto
//        já encontra-se na lista. 
//        Caso positivo, basta somar a qtde ao item de compra 
//            já presente na lista.
//        Caso negativo, adiciona o item no final da lista.
        
    }
}
