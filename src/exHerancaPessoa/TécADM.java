package exHerancaPessoa;

public class T�cADM extends Servidor {
    String cargo;

    public T�cADM(String cpf, String nome, int siape, String cargo) {
        super(cpf, nome, siape);
        this.cargo = cargo;
    }
}
