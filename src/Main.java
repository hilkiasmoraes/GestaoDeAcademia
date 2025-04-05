import models.Academia;
import models.Cliente;
import models.Instrutor;

public class Main {
    public static void main(String[] args) {
        Academia academiaSenai = new Academia("Java Senai Fitness");

        Cliente clienteSenai = new Cliente("Paulo", 45, "Plus++");
        Cliente clienteSenai01 = new Cliente("Pedro", 25, "Básico");
        Cliente clienteSenai02 = new Cliente("Maria", 18, "Premium");


//        Instrutor instrutorSenai = new Instrutor("João", 35, "Musculação");
//        Instrutor instrutorSenai01 = new Instrutor("Eliana", 29, "Ginástica");
//        Instrutor instrutorSenai02 = new Instrutor("Carlos", 22, "Musculação");

        academiaSenai.adicionarPessoa(clienteSenai);
        academiaSenai.adicionarPessoa(clienteSenai01);
        academiaSenai.adicionarPessoa(clienteSenai02);

//        academiaSenai.adicionarPessoa(instrutorSenai);
//        academiaSenai.adicionarPessoa(instrutorSenai01);
//        academiaSenai.adicionarPessoa(instrutorSenai02);

        academiaSenai.listarPessoas();
    }
}