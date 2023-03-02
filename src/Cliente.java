import java.util.ArrayList;
import java.util.regex.Pattern;

public class Cliente {
private String nome;
private String cpf;
private String endereco;
private ArrayList<String> InformacaoCadastral = new ArrayList<String>();


public Cliente (String nome,String endereco,String cpf){
    InformacaoCadastral.add(this.nome = nome);
    InformacaoCadastral.add(this.nome = endereco);
    InformacaoCadastral.add(this.cpf = cpf);


}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

      this.cpf = cpf;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void ImprimirDadosCliente(){
    for (int i = 0; i <  InformacaoCadastral.size();i++){
        System.out.println(InformacaoCadastral.get(i));
    }
}

}
