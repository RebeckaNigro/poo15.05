package exHerancaPessoa;

public class Docente extends Servidor {
    String area;

    public Docente(String cpf, String nome, int siape, String area) {
        super(cpf, nome, siape);
        this.area = area;
    }

}
