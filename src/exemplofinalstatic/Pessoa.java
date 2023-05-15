package exemplofinalstatic;

public class Pessoa {
    public final String cpf;
    public final static int maioridade = 18;


    Pessoa(String cpf) {
        this.cpf = cpf;
    }

    Pessoa() {
        this.cpf = "0000";
    }
}
