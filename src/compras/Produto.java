package compras;

public class Produto {
    private int c�digo;
    private String descri��o;
    private float valor;

    public Produto(int c�digo, String descri��o, float valor) {
        this.c�digo = c�digo;
        this.descri��o = descri��o;
        this.valor = valor;
    }
    
    public int getC�digo() {
        return c�digo;
    }

    public void setC�digo(int c�digo) {
        this.c�digo = c�digo;
    }

    public String getDescri��o() {
        return descri��o;
    }

    public void setDescri��o(String descri��o) {
        this.descri��o = descri��o;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
