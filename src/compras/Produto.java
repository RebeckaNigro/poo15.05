package compras;

public class Produto {
    private int código;
    private String descrição;
    private float valor;

    public Produto(int código, String descrição, float valor) {
        this.código = código;
        this.descrição = descrição;
        this.valor = valor;
    }
    
    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
