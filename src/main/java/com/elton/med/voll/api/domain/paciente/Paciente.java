package com.elton.med.voll.api.domain.paciente;

import com.elton.med.voll.api.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Paciente")
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String cpf;
    private String telefone;

    @Embedded
    private Endereco endereco;

    private Boolean ativo;

    public Paciente (DadosCadastroPaciente dados) {
        this.ativo = true;
        this.nome = dados.nome ( );
        this.email = dados.email ( );
        this.telefone = dados.telefone ( );
        this.cpf = dados.cpf ( );
        this.endereco = new Endereco ( dados.endereco ( ) );
    }

    public void atualizarInformacoes (DadosAtualizacaoPaciente dados) {
        if (dados.nome ( ) != null)
            this.nome = dados.nome ( );

        if (dados.telefone ( ) != null)
            this.telefone = dados.telefone ( );

    }

    public void inativar() {
        this.ativo = false;
    }
}
