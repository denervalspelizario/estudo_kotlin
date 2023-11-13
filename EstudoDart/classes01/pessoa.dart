// Orientação ao Objeto
class Pessoa {
  // atributos
  late String nome;
  late String sobrenome;

  // Construtor opção 01
  //Pessoa(String nome, String sobrenome) {
  //  this.nome = nome;
  //  this.sobrenome = sobrenome;
  //}

  // Construtor opção 02
  Pessoa(this.nome, this.sobrenome);

  // Pessoa({required this.nome, required this.sobrenome});

  // método
  String nomeCompleto() {
    return '${this.nome} ${this.sobrenome}';
  }
}

void main() {
  // Exemplo de uso da classe Pessoa
  Pessoa pessoa = Pessoa('João', 'Silva');
  print(pessoa.nomeCompleto()); // Saída esperada: João Silva
}
