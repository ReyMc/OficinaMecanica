package oficinamecanica;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cliente {
    private String id = UUID.randomUUID().toString();
    private String nome;
    private List<Veiculo> veiculos = new ArrayList<>();
    private String telefone;

    public Cliente(String nome, Veiculo veiculo, String telefone) {
        this.nome = nome;
        this.veiculos.add(veiculo);
        this.telefone = telefone;
    }

    public Cliente() {}

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Veiculo> getVeiculoList() {
        return this.veiculos;
    }

    public void setVeiculosList(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", veiculos=" + veiculos +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
