# estruturadeDadosJavaa
Esse repositório e pra revisar os conteúdos aprendidos no curso de Estrutura de Dados em Java vão me ajudar a recordar dos assuntos aprendidos para consultar quando necessário


Introdução as variaveis
---
As variaveis não armazenas mais de um valor elas apenas substituem os valores existem por outros.

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/10bc7281-13f0-442e-8fe5-db3ebb7ea446)

      obs: nesse exemplo ele vai imprimir a o 4 ;
Vetores
---
O vetor é uma lista

O Vetor tem posições e essas posições são pra acessar os valores .. 

O vetor tem um tamanho .. 


O nosso vetorzão tem 10 posições 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/01c1069c-effe-4cd7-9f0d-00a2d7a0fe6b)



introdução
---


Como declarar um vetor em java 
---
o new int[10] serve para instanciar um vetor com o tamanho de 10 posições 


![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/5b4206b9-f80e-4684-a38e-5cd7f6f2683d)

atribuindo valores ao vetor e imprimindo a posição 0
--
ou seja :

na posição 0 do vetor temos o valor 3 

na posição 1 do vetor temos o valor 4

na posição 2 do vetor temos o valor 8 
 
 e assim sucessivamente

obs: as posições que não foram preenchidas vão está com o valor 0 num vetor int

obs: a posição é referente ao indice do vetor e nessa posição será armazenado o valor(dado).


![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/65c5ff06-e8ec-470b-b1c4-284bf76fd145)


lendo um vetor com uma estrutura de repetição
--
com uma estrutura for poderemos usar o length para pegar o tamanho do vetor e com uma variavel de controle vamos percorrer cada posição do indice do vetor 



![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/a5ef0ca7-efc3-411b-83a4-42f7f42e4eda)

Vetor de String e Busca Linear 
---

Nesse caso vamos ter um vetor com letras que são dados do tipo string. 

Listas com 10 estados.

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/8ed46480-1e6a-4d0e-b2cb-5c8061c457bc)



Declarando um Vetor String e lendo suas respectivas posições
---
![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/6b56228e-baf1-4ee0-b5c6-39d968a7f9ab)


Fazendo uma busca dentro do vetor 
--
Digamos que queremos verificar se determinado existe dentro do vetor .. 

criamos e importamos o scaner 


Criando
![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/01f9a719-ccd4-440b-94d4-87802a28882d)

Importando 
![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/f9fff3a4-6c7e-4ea1-b444-4c97423f29fa)


apos isso vamos trabalhar com o scanner 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/9cfbfb36-8fee-49d3-a9f9-6aa73a1d3fcd)



ou seja como temos um tipo texto utilizamos 


e faz com que o nextLine aguarde uma entrada do usuário.


![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/3e58d05b-7a33-4c15-88b9-e8ad300e21cf)


            então a siglaBusca recebera o valor que o usuario digitar
            
            
            



 

                 
                 
Busca Linear                
---

 A busca linear fará como que 
 
 A variavel elemento receba o valor da indice do vetor estado
 
 e o loop vai indo de posição em posição atribuindo sempre um novo valor aquela várivel
 
  então o if vai pegar o elemento e comparar com o siglaBusca utilizando o .equals()
  
O método equals é utilizado para comparações. A classe String e as classes Wrapper sobrescrevem equals() para garantir que dois objetos desses tipos, com o mesmo conteúdo, possam ser considerados iguais.


            então dentro da variável elemento que a mágica da comparação acontece pois ele recebe o valor de cada indice e
            vai indo de posição em posição percorrendo todas as posições do vetor 
            tentando encontrar o valor digitado na siglaBusca
            
fazendo assim o loop vai procurar nos indices dos estados atribuir a elemento comparar com buscaSilga e se ele encontrar/se for igual
ele vai dizer "achou" e vai para o break saindo do loop.

e se ele percorrer aquele indice dos estaos que foi atribuido a elemento e comparar com a siglaBusca e não econtrar/não for igual ele       vai cair no else e vai dizer "nao achou". 

            
            
            
![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/9886355e-3762-4d5f-b088-fc566e8b6b36)




            conclusão: para ocorrer essa busca teremos que criar uma variavel para ir pegando o valor de cada indice e 
            é comparando até encontrar um valor que seja oque queremos.



Melhorando o código de buscar linear
---

declaramos uma variável booleana que recebe false

e quando ela encontrar se tornar (true) vai pro break encerrar o loop 

ai teremos uma condicional que vai dizer 
se a variavel ficar verdeira (true) ela diz encontrou
se a variavel continuar falso(false) ela diz não encontrou

então terremos ela dizendo se encontrou ou nao encontro! sem escrever não encontrou diversas vezes

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/ccb8d9e3-d45c-43b8-a34a-69d5b4bd8961)



resultado:

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/d91f5191-0441-4e95-a216-d6251df85bea)


![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/376a33f8-f73a-4f19-9127-dfa692690c4c)




..
---
Lista Ligada (Lista Encadeada)
---

Na lista ligada os elementos não tem uma posição fixa 


cada ELEMENTO só sabem qual é o seu próprio valor e que é o seu PROXIMO

Para adicionar muito elementos a Lista Ligada é melhor

obs: para buscar muitos elementos o Vetor é melhor

representação 
![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/d0c7cdd5-f0d2-4673-af04-ca56bfd2267c)



]


