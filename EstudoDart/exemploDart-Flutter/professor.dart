import  'pessoa.dart';

class Professor extends Pessoa { // pegando os dados da classe Pessoa
  Professor({required String nome, required String sobrenome})
    : super(nome: nome, sobrenome: sobrenome);
}