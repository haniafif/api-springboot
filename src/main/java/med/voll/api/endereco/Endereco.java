package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.cep = dados.cep();
        this.bairro = dados.bairro();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
        this.complemento = dados.complemento();

    }

    public void atualizarInformacoes(DadosEndereco endereco) {
        if(endereco.bairro() != null){
            this.bairro = endereco.bairro();
        }
        if(endereco.cep() != null){
            this.cep = endereco.cep();
        }
        if(endereco.numero() != null){
            this.numero = endereco.numero();
        }
        if(endereco.logradouro() != null){
            this.logradouro = endereco.logradouro();
        }
        if(endereco.uf() != null){
            this.uf = endereco.uf();
        }
        if(endereco.cidade() != null){
            this.cidade = endereco.cidade();
        }
    }
}
