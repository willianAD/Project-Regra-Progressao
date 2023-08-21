# Regra de Progressao com Java

## Funcionalidades

Se lembra da sua época de escola? Onde seus/suas professores(as) colocavam um peso em cada prova e sempre a bimestral valia mais pontos?

Um programa em Java, que vai rodar no terminal, e precisa calcular uma média ponderada de algumas notas de exercícios que serão a entrada do seu programa

O que foi avaliado?

A organização do seu código
Sua lógica de programação

## Requisitos

<img src="https://raw.githubusercontent.com/willianAD/Project-Regra-Progressao/main/images/Projeto%20Regra%20de%20Progre%C3%A7%C3%A3o.png">

# Requisitos Obrigatórios

### 1 - Cadastrar atividades avaliativas

<details>
  <summary>Descrição</summary><br />

Como regra de negócio, você deve permitir à pessoa estudante que cadastre as atividades avaliativas para o período atual, que podem ser do tipo exercícios ou projetos. Cada atividade deve ter um nome descritivo que identifique sua natureza e um peso atribuída a ela.
Certifique-se de que a pessoa estudante possa cadastrar quantas atividades forem necessárias, para que todas sejam levadas em consideração no cálculo do percentual alcançado. É necessário que a soma de todos os pesos atinga o valor de 100.

Por exemplo, digamos que temos três atividades avaliativa em um dado período. O exercício alfa com peso 30, o exercício beta com peso 10 e o projeto gama com peso 60. Note que o somatório de todos os pesos (30+10+60) precisa, necessariamente, ser 100. Digamos que uma pessoa estudante atingiu a nota de 65 para o exercício alfa, 100 para o exercício beta e 93 no projeto gama, com isso o cálculo da nota final do período faz se:

$` {(30*65) + (10*100) + (60*93)\over(30+10+60)} = 85,3 `$

Assim, a nota dessa pessoa estudante no período foi de 85,3%.

A fórmula é:

$` {(Peso1*Nota1) + (Peso2*Nota2) + ... + (PesoN*NotaN)\over(Peso1 + Peso2 + ... + PesoN)} = NotaFinal `$

O programa deve seguir as seguintes regras:

- Exibir a mensagem `Digite a quantidade de atividades para cadastrar: ` para saber quantas atividades serão cadastradas para o período e salvar essa informação.
- Dado o número de atividades, repetir as mensagens `Digite o nome da atividade N: ` e `Digite o peso da atividade N:`  para salvar o nome da atividade e seu respectivo peso, sendo N o número da atividade.

_**Nota: As mensagens devem ser EXATAMENTE iguais como sugerido, caso contrario os testes irão falhar**_

Exemplo:

```bash
Digite a quantidade de atividades para cadastrar:
3
Digite o nome da atividade 1:
Projeto Lista de Tarefas
Digite o peso da atividade 1: 
30
Digite o nome da atividade 2:
Projeto Lista de Compras
Digite o peso da atividade 2: 
30
Digite o nome da atividade 3:
Projeto Jogo de Advinhação
Digite o peso da atividade 3: 
40
```

</details>

---

### 2 - Inserir as notas obtidas

<details>
  <summary>Descrição</summary><br />

Para cumprir este requisito, a pessoa estudante precisa ter a capacidade de inserir as notas obtidas em cada exercício ou projeto onde acabou de cadastrar seu nome e peso para o período em questão. Essas notas devem ser armazenadas para posteriormente às atividades correspondentes. Certifique-se de que o programa permita a inserção das notas de forma nítida e intuitiva, para que a pessoa estudante possa registrar sua pontuação em cada atividade avaliativa.

Em outras palavras:

- Repita para cada atividade cadastrada no período a mensagem `Digite a nota obtida para [Nome da Atividade]:` para obter sua respectiva nota.

Exemplo, continuando o exemplo anterior:

```bash
Digite a quantidade de atividades para cadastrar:
3
Digite o nome da atividade 1:
Projeto Lista de Tarefas
Digite o peso da atividade 1: 
30
Digite a nota obtida para Projeto Lista de Tarefas:
22
Digite o nome da atividade 2:
Projeto Lista de Compras
Digite o peso da atividade 2: 
30
Digite a nota obtida para Projeto Lista de Compras:
30
Digite o nome da atividade 3:
Projeto Jogo de Advinhação
Digite o peso da atividade 3: 
40
Digite a nota obtida para Projeto Jogo de Advinhação:
35
```

</details>

---

### 3 - Informar o resultado alcançado

<details>
  <summary>Descrição</summary><br />

A fim de avaliar o desempenho da pessoa estudante, é necessário calcular o percentual alcançado com base nas notas obtidas nas atividades avaliativas cadastradas. Após inserir todas as notas, o programa deve realizar o cálculo automático do percentual alcançado, considerando o peso de cada atividade. Em seguida, compare esse percentual com o valor de referência de 85.0%. Se o percentual for menor que 85.0%, a pessoa estudante será considerada reprovada. Caso contrário, com um percentual igual ou superior a 85.0%, ela será aprovada.

Em outras palavras:

- Após calcular o resultado considerando a nota de todas as atividades, utilize a mensagem:
- `Parabéns! Você alcançou [resultado]%! temos o prazer de informar que você obteve aprovação!`; ou
- `Lamentamos informar que, com base na sua pontuação alcançada neste período, [resultado]%, você não atingiu a pontuação mínima necessária para sua aprovação.

Exemplos:

```bash
Parabéns! Você alcançou 87.0%! E temos o prazer de informar que você obteve aprovação! 
```

```bash
Lamentamos informar que, com base na sua pontuação alcançada neste período, 70.0%, você não atingiu a pontuação mínima necessária para sua aprovação.
```

</details>
