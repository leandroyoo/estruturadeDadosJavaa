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


cada ELEMENTO só sabe qual é o seu próprio valor e que é o seu PROXIMO

Para adicionar e excluir muitos elementos a Lista Ligada é melhor 

o seu tamanho é dinâmico

obs: para buscar muitos elementos o Vetor é melhor

representação 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/869b3228-f99c-482b-b23e-7b4e66f0aaed)

vamos ao código
---

Vamos Criar uma Classe para Representar a Lista Ligada ![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/c73cb7c7-f393-4d36-b8a6-0ef6c454a92b)

LISTA LIGADA
---

oque a lista sabe ?

quem é seu primeiro e ultimo valor! 

na lista ligada vamos criar o conceito da lista que foi citado:

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/62f6f4d7-edeb-4b3a-8cf0-e336ce66b529)


ELEMENTOS
---
cada bolinha representada vamos chamar de elemento ![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/0703e974-b138-492f-b215-5f1c9542d14f)


então vamos criar a classe Elemento(alguns chamam de nó/node) ![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/ca9ee0dc-952f-46e0-be6c-8ee27b71ef0d)


"cada ELEMENTO só sabe qual é o seu próprio valor e que é o seu PROXIMO"


e oque elemento sabe ?
ele sabe o seu valor 
e sabe que é o seu próximo elemento

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/4a01a381-9660-4aae-abcf-1146c88acb80)


em Elemento vamos criar os metodos GET e SETs

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/d23ec6d2-b0dc-4b72-a8e0-fdfe9c50ebbf)


voltando pra Lista Ligada
---
- vamos adicionar uma variavel tamanho para saber o tamanho daquela lista ![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/852fa398-a275-4bce-aeab-01b442ef3374)


- ajustar o ELEMENTO ( o elemento é aquela bolinha da representação ou seja ela sabe quem é o primeiro e ultimo elemento)

execução

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/66ab524d-9fb4-41e7-b804-04adefc42776)




na classe Lista Ligada  vamos criar os metodos GET e SET 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/e95ed7f4-212c-4612-80ed-7f099098dc8a)


Oque a Lista Ligada tem que fazer?
--
- Adicionar Elementos 

- Remover Elementos

- Pegar Elementos

então vamos criar esses metodos:

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/cc647df9-925b-4de0-9b5c-c6b762b7c4a6)


agora vamos criar o nossa classe programa ![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/7df83daa-a86c-4fcd-9b38-e78cce8f4062)

na classe programa vamos utilizar o metodo construtor e criar uma lista

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/8df2bf0e-bcf2-43b0-be24-69cc58d9445b)


só que quando criamos a lista ela ainda tá vázia então temos que criar-la na lista ligada o método construtor 

quando criarmos a lista o tamanho dela é 0

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/50b4b2b9-7b5e-4275-842c-5a298d3a3f41)


Então observe que

ao pegar o tamanho da nossa lista 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/5d0307ac-da32-4f05-9e26-613e94e50723)


o tamanho retorna  ![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/d0b47a81-643e-4bc2-a271-c3ed1df3df11)



Metodos da Lista
---

- Metodo Adicionar  

se eu quero adicionar um elemento eu vou criar um elemento 

e dentro desse elemento vai adicionar o novoValor

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/ee3c5267-78db-44d4-8872-c79016381573)

o erro aconteceu ai porque essa bolinha(elemento) está fora da lista 

e como se fosse uma bolinha(elemento) viajando pelo espaço 

então devemos criar na classe Elemento um método construtor Novo valor 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/ba2c2a46-1877-4c5c-8232-37ac0396d924)


Entendendo como funciona o Método Adicionar
----
1 entrada do dado
--
executando o metodo adicionar ![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/389ff8aa-207b-4842-ae1d-374c79574590)

2 execuçao que recebe o dado e instanciação do objeto
 --
![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/91f129a1-c2ac-4d01-aad7-3149b0b8448c)

o metodo adiconar recebe o dado(novoValor) dentro do seu parametro

instancia a classe Elemento criando um objeto(novoElemento) 


3 criação do objeto com o dado recebido
---
A classe Elemento executa o metodo construtor recebendo esse valor

passa o dado inserido para o atributo valor do objeto instanciado

pois o objeto(novoElemento) e esse dado(novoValor) passam a existir

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/4264823b-e8e9-448c-b0bc-8351c4f5acab)

.
---
lógica da lista Ligada 
---
Na classe da Lista Ligada temos 

os seguintes dados e um metodo construtor:

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/ba6df03e-09ab-4b01-895b-e4b38e3abc7a)


Logica pra adiconar
 
se 
primeiro nullo e ultimo nullo = lista vazia

então novoElemento vai ser o primeiro da lista e também o ultimo valor da lista!

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/4175b27d-ca39-40c9-9ef9-c1347f7e9d96)

o tamanho++ vai adicionar +1 ao seu valor a cada Elemento na lista!!

executando
---
adicionando essa logica já conseguimos inserir o primeiro elemento e pegar 

o primeiro valor

o ultimo valor

tamanho da lista 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/d024abfc-8428-4e9c-a4a0-17d5e120fce0)

então teremos o resultado ![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/1d846595-b51a-4977-b1ff-18626bb0756b)

adicionando mais valores 
---

se eu tentar adicionar outros valores nao vou obter sucesso ![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/6cc1e594-3459-4de8-979e-97571e3b5323)


pois trará o mesmo resultado ![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/936ecbe8-227d-4a7e-9d50-b9d92619d4da)


então terei que mexer nessa lógica 

representação 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/7fc348e2-4bba-4802-9a94-92e261d91f95)



lembrando que elemento sabe quem é o seu próximo 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/dd0da9fd-4ddd-4ca4-a59b-a3a36c31ee3a)



na estrutra acima criaremos um else(senão)


pois se o  RJ é o primeiro e ultimo então ao entrar um novo dado terá de ser o próximo no caso a BA 

então RJ vai indentificar que ele tem um próximo e vai deixar de ser o ultimo da lista!

se inserimos também CE ele vai cair no else o ultimo vai setar como proximo esse elemento e vai ele vai se tornar o ultimo 

e a cada dado que for inserido vai caindo no else pois primeiro e ultimo já estarão preeenchidos 

o ultimo da lista vai sempre setar esse novo objeto como o proximo e deixar de ser o ultimo da lista

então e esse novo dado se tornará o ultimo da lista 

o tamanho++ foi pra fora do if e else pq independe de por onde passar no if ou else tamanho da Lista ligada aumentará

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/4779add2-6ca9-4a6f-a6fd-f46dce39aa08)

Executando o código acima


![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/8ed6b962-4ee1-49e3-8408-4d54d5b26575)


obterei o resultado 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/cc839683-5ed4-4722-8b26-342f6dd2f34a)








