
// função main
main(){

  // variaveis
   print('variaveis');
  int ano = 1987; // tipando
  var ano02 = 1988; // tipagem automatica
  print(ano);
  print(ano02);

  print('\n');

  // Interpolaçao de strings
  print('Interpolação de strings');
  print('Anos = $ano - $ano02');

  print('\n');

  // Condicionais
  print('Condicionais');
  int numero = 5;
  if(numero % 2 == 0){
    print('O numero é par');
  } else {
    print('O numero é impar');
  }

  print('\n');

  // Trabalhando com arrays
  print('Trabalhando com arrays');
  var lista = [1,2,3];

  lista.add(4); // adicionando 4 no final da array lista

  print(lista.contains(4)); // retornando um boolean se existir 4 no array lista

  // map

  var aluno = <String, List>{ // indicando que vai ser uma List de strings
    'joao': [10,9,8] // chave o joão e a lista são as notas(numbers) do joão
  };

  print(aluno['joao']); // [10, 9, 8]

}

