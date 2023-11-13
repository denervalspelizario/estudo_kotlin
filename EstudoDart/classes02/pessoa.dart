// Orientação ao Objeto
class Pessoa {
  // atributos
  late String nome;
  late String sobrenome;
  late String _cpf;           // o _ indica que o atributo é privado

  get cpf => this._cpf; // função getter acessando o cpf privado
  set cpf(numero) => this._cpf; // função setters para alterar cpf privado

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
