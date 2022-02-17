# desafio-capgemini
## Desafio de programação para a Academia Técnica Capgemini

### Versão utilizada: Java 17

### 1) Como verificar as questões

Os códigos para cada questão foram elaborados em arquivos separados (QuestaoUm.java e QuestaoDois.java), e para sua execução devem ser chamados no Main, de forma similiar à um modelo de aplicação com models e controller.

As funções referentes às questões podem ser chamadas da seguinte forma:

#### Questão 1:
QuestaoUm.printSteps(n) ; sendo n um inteiro maior que zero.

#### Questão 2:
QuestaoDois.checkPasswordLength(password) ; sendo password uma String qualquer.

### 2) Quais testes já foram feitos?

Os seguintes testes já foram feitos e estão presentes no Main.java:

#### Questão 1:
n = 6 (exemplo fornecido no enunciado do desafio)<br />
n = 0<br />
n = -2<br />
n = 10<br />
n = 1<br />
Nota: Um erro ira ocorrer caso "n" não seja um inteiro, portanto não foram testados estes cenários.

#### Questão 2:
password = "Ya3" (exemplo fornecido no enunciado do desafio);<br />
password = "AukaIAJMA" (um exemplo onde o número mínimo de caracteres é superado);<br />
password = "" (uma String vazia);<br />
password = "   " (uma String com 3 espaços vazios. O código foi elaborado de uma forma que espaços em branco serão intencionalmente ignorados para a verificação do tamanho da string);<br />
password = "IJjHgT" (uma String com o número exato de caracteres requeridos).<br />

Nota: os System.out.println() vazios foram adicionados apenas para tornar a leitura dos resultados no prompt mais fácil.
