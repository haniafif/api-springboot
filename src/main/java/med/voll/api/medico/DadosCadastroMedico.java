package med.voll.api.medico;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String crm,
        @NotBlank
        Especialidade especialidade,
        DadosEndereco endereco ) {
}
