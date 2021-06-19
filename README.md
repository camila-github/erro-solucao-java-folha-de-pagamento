## Exercicio (Java): Folha de Pagamento

O exercicio publicado é referente ao treinamento do Bootcamp Java Developer - Introdução a Programação com Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor hora. Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse colaborador. Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.

#### Entrada: 

Você receverá 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada.

#### Saída: 

Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
25 | NUMBER = 25
100 | SALARY = U$ 550.00
5.50

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
1 | NUMBER = 1
200 | SALARY = U$ 4100.00
20.50

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
6 | NUMBER = 6
145 | SALARY = U$ 2254.75
15.55


#### Java　

```java
//SOLUCAO 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class FolhaDePagamento {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int numeroDoFuncionario = Integer.parseInt(st.nextToken());
 
    st = new StringTokenizer(br.readLine());
    int quantidadeHoraTrabalhada = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    double valorPorHora = Double.parseDouble(st.nextToken());

    double salario = quantidadeHoraTrabalhada * valorPorHora; 
    
    System.out.println("NUMBER = " + numeroDoFuncionario);
    System.out.printf("SALARY = U$ %.2f", salario);
  }
}
```

