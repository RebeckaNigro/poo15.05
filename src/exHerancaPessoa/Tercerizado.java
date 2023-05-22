package exHerancaPessoa;

public class Tercerizado extends Pessoa {
    String função;

    public Tercerizado(String cpf, String nome, String função) {
        super(cpf, nome);
        this.função = função;
    }
}
