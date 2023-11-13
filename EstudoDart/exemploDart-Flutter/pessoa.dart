// Orientação ao Objeto
class Pessoa {
  // atributos
  late String nome;
  late String sobrenome;


 Pessoa({required this.nome, required this.sobrenome});

  // método
  String nomeCompleto() {
    return '${this.nome} ${this.sobrenome}';
  }
}

