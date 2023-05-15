package compras;

public class ItemCompra {
    private float qtde;
    private float valorUnit;
    private float valorTotal;
    private Produto produto; //Relacionamento

    public ItemCompra(float qtde, Produto produto) {
        this.qtde = qtde;
        this.produto = produto;
        this.valorUnit = this.produto.getValor();
        this.valorTotal = this.qtde * this.valorUnit;
    }
    
    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public float getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(float valorUnit) {
        this.valorUnit = valorUnit;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
