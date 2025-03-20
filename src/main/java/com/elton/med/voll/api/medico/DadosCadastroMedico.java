package com.elton.med.voll.api.medico;

import com.elton.med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco ) {
}
