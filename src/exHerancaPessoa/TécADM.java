package exHerancaPessoa;

public class TécADM extends Servidor {
    String cargo;

    public TécADM(String cpf, String nome, int siape, String cargo) {
        super(cpf, nome, siape);
        this.cargo = cargo;
    }
}
