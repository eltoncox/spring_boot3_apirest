package com.elton.med.voll.api.domain.paciente;

import com.elton.med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosEndereco endereco
) {
}