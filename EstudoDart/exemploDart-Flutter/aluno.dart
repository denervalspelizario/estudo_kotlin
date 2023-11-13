import  'pessoa.dart';

class Aluno extends Pessoa { // pegando os dados da classe Pessoa
  
  String ra; // atrubuto ra
  
  Aluno({required this.ra, required String nome, required String sobrenome})
    : super(nome: nome, sobrenome: sobrenome);
}