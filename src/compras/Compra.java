package compras;

import java.util.ArrayList;

public class Compra {
    private String data;
    private float valorTotal;
    private Cliente cliente; //Relacionamento
    private ArrayList<ItemCompra> itens = new ArrayList<>();  //Relacionamento

    public Compra(String data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
        this.valorTotal = 0;
    }
    
    public void adicionaItem(ItemCompra ic){
        this.itens.add(ic);
        this.valorTotal = this.valorTotal + ic.getValorTotal();
    }

    public void adicionaItem(float qtde, Produto produto){
        ItemCompra ic = new ItemCompra(qtde, produto);
        this.itens.add(ic);
        this.valorTotal = this.valorTotal + ic.getValorTotal();
    }
    
    public void removeItem(int i){
        ItemCompra ic = this.itens.get(i);
        this.valorTotal = this.valorTotal - ic.getValorTotal();
        this.itens.remove(i);        
    }
    
    public void imprimir(){
        
        System.out.printf("*****************************\n");
        System.out.printf("Cliente: %s - %s\n", 
                this.cliente.getNome(), this.cliente.getCpf());
        System.out.printf("Data: %s\n", this.data);
        System.out.printf("-----------------------------\n");
        System.out.printf("Desc. \tQtde \tV.Unit \tTotal\n");
        
        for (int i = 0; i < itens.size(); i++) {
            ItemCompra item = itens.get(i);
            System.out.printf("%d - %s \t%.2f \t%.2f \t%.2f\n",
                    i, item.getProduto().getDescrição(),
                    item.getQtde(), item.getValorUnit(),
                    item.getValorTotal());
        }
        System.out.printf("Valor Total: %.2f\n", this.valorTotal);
        System.out.printf("*****************************\n");        
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
