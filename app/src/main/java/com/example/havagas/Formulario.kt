package com.example.havagas

class Formulario(
    var nome : String,
    var email : String,
    var desejaEmail : Boolean,
    var telefone : String,
    var telefoneTipo : String,
    var desejaCelular : Boolean,
    var celular : String,
    var sexo : String,
    var dataNascimento: String,
    var formacao: String,
    var anoFormaçao : String,
    var anoConclusao: String,
    var instituicao : String,
    var tituloMonografia : String,
    var orientador : String,
    var vagasIntresse: String
){

    override fun toString(): String {
        return "Nome: '$nome\n' Email: '$email\n' Deseja receber oportunidades por email? $desejaEmail\n Telefone: '$telefone\n' Tipo de Telefone: '$telefoneTipo\n' Deseja adicionar um celular? '$desejaCelular\n' Celular: '$celular\n' Sexo: '$sexo\n', Data de Nascimento: '$dataNascimento\n' Formação: '$formacao\n' Ano de Formaçao: '$anoFormaçao\n' Ano de Conclusão: '$anoConclusao\n' Instituição: '$instituicao\n' Titulo da Monografia: '$tituloMonografia\n' Orientador: '$orientador\n' Vagas de Intresse: '$vagasIntresse\n'"
    }
}