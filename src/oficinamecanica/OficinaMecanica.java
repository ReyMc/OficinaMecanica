package oficinamecanica;

public class OficinaMecanica {

    public static void main(String[] args) {
        System.out.println("Te damos a s boas vindas! ");

        Cliente c = new Cliente();
        Atendente a = new Atendente();
        Funcionario f = new Funcionario();
        ItemServico i = new ItemServico();
        Mecanico m = new Mecanico();
        Servico s = new Servico();
        Veiculo v = new Veiculo();

        System.out.println(c);
        System.out.println(a);
        System.out.println(f);
        System.out.println(i);
        System.out.println(m);
        System.out.println(s);
        System.out.println(v);
    }
    
}
