# Academia Técnica Capgemini 2022

Este repositório é destinado aos Desafios de Programação da Academia Técnica Capgemini.s

# Desafios de Programação

- ## Proposta do Desafio 1 ##

  ***Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.***

  **Exemplo:**

  Entrada:
  `n = 6`

  Saída:

           *
          **
         ***
        ****
       *****
      ******
    
  ### Opções ###
  [Vizualizar código-fonte](README.md#Executa o Desafio 1)

  [Exemplo de Execução (Desafio 1)](README.md#Desafio 1)

  [Comando de Execução (Desafio 1)](README.md#Executa o Desafio 1)


- ## Proposta do Desafio 2 ##

  #### Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

    - ##### Possui no mínimo 6 caracteres. #####

    - ##### Contém no mínimo 1 digito. #####

    - ##### Contém no mínimo 1 letra em minúsculo. #####

    - ##### Contém no mínimo 1 letra em maiúsculo. #####

    - ##### Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ #####

    #### Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura. ####
    **Exemplo:**

  Entrada:
  `Ya3`

  Saída:
  `3`

  ### Opções ###
  [Vizualizar código-fonte](README.md#Executa o Desafio 2)

  [Exemplo de Execução (Desafio 2)](README.md#Desafio 2)

  [Comando de Execução (Desafio 2)](README.md#Executa o Desafio 2)


- ## Proposta do Desafio 3 ##

  #### Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
  **Exemplo 1:**

  Entrada:
  `ovo`

  Saída:
  `2`

  **Exemplo 2:**

    Entrada:
  `ifailuhkqq`
  
    Saída:
  `3
`
  ### Opções ###
  [Vizualizar código-fonte](README.md#Executa o Desafio 3)

  [Exemplo de Execução (Desafio 3)](README.md#Desafio 3)

  [Comando de Execução (Desafio 3)](README.md#Executa o Desafio 3)


## Explicações/Algoritmos
- ## Desafio 1
  Levando em consideração a entrada `n = 3`:

  Para cada loop `x` realizado, sendo o total de loops = `n`

  \
  *Quantidade de Espaços = (n - x)*

  *Quantidade de Asteristicos = (x)*

  Saída: "{espaços}{asteristicos}" 
  \
\
    **Loop #1:**\
    Quantidade de Espaços = 2 (`3-1`)\
    Quantidade de Asteristicos = 1 
  \
    **Loop #2:**\
    Quantidade de Espaços = 1 (`3-2`)\
    Quantidade de Asteristicos = 2
  \
    **Loop #3:**\
    Quantidade de Espaços = 0 (`3-3`)\
    Quantidade de Asteristicos = 3
  \
  \
    Saída:
  
          *
         **
        ***

- ## Desafio 2
  Levando em consideração a entrada `@Test`:

  São realizados diversos testes de condições para verificar se o texto informado atende aos critérios de segurança.
  
  A saída esperada é:

      Senha fraca!
      Adicione 1 caracteres
      Adicione ao menos 1 dígito númerico!
  Motivos:
    - [ ] Possui no mínimo 6 caracteres.
    - [ ] Contém no mínimo 1 digito.
    - [x] Contém no mínimo 1 letra em minúsculo.
    - [x] Contém no mínimo 1 letra em maiúsculo.
    - [x] Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
  \
  \
A saída informa se a senha está **forte** ou **fraca**, e informa todos os outros requisitos que não foram atendidos.


- ## Desafio 3
  Levando em consideração a entrada `concurso`:
    - Uma estrutura de repetição separa todas as combinações de substring teste da palavra escolhida.
    - As combinações são adicionadas numa lista para verificar se a combinação é um Anagrama Par de outra combinação.
    - A próxima estrutura faz a chamada da função isAnagram() para verificar se a combinação1 é um anagrama da combinação2.
    - Caso as combinações sejam Anagramas de si mesmas, é verificado se essa combinação já se encontra na lista, a fim de evitar duplas combinações.
    - No final, é exibido a quantidade de Anagramas Pares dentro da String informada. 
    \
  \
  A saída esperada é:

      4


## Instalação
Para utilizar este programa, é necessário ter o Java instalado.

// Git clone

// Download



## Sintaxe para Execução

Para utilizar o programa usando o Java utilize no terminal o comando desejado, com a sintaxe abaixo:

>java (ClassName) (DesafioX) (Texto) (-detalhes)

Sendo:

- ClassName (Obrigatório)
    - Capgemini
    - Desafio1
    - Desafio2
    - Desafio3
- DesafioX (*Opcional*)
    - Desafio1
    - Desafio2
    - Desafio3
    - default: empty // Todos os desafios serão realizados.
- Texto (*Opcional*)
    - Apenas texto sem espaços
    - default: empty // Será perguntado qual será o valor de Entrada.
- -Detalhes (*Opcional*) (Apenas Desafio3)
    - Será dado informações adicionais sobre o Desafio3
    - default: empty // Não será exibido informações adicionais.
    - Este argumento -Detalhes foi adicionado devido a um problema no documento disponibilizado para realização dos desafios. (Detalhes)

## Exemplos de Uso
## Utilizando o comando `java` no terminal ##
- #### Executa todos os Desafios propostos.
  >java Capgemini
- #### Executa o Desafio 1
  >java Desafio1
  ou
  >java Capgemini Desafio1
- #### Executa o Desafio 1 com entrada definida
  >java Capgemini Desafio1 6
- #### Executa o Desafio 2
  >java Desafio2
  ou
  >java Capgemini Desafio2
- #### Executa o Desafio 2 com entrada definida
  > java Capgemini Desafio2 Ya3
- #### Executa o Desafio 3
  >java Desafio3
  ou
  >java Capgemini Desafio3
- #### Executa o Desafio 3 com entrada definida
  >java Capgemini Desafio3 ovo

