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


vou criar da classe Elemento o objeto novoElemento(1..2..3) que vaõ receber parametros usado para atribuir valores iniciais aos atributos do objeto.

se eu quero adicionar um elemento eu vou criar um elemento 

e dentro desse elemento vai adicionar o novoValor

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/ee3c5267-78db-44d4-8872-c79016381573)

o erro aconteceu ai porque essa bolinha(elemento) está fora da lista 

e como se fosse uma bolinha(elemento) viajando pelo espaço 

então devemos criar na classe Elemento um método construtor Novo valor 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/ba2c2a46-1877-4c5c-8232-37ac0396d924)

O método construtor em uma classe tem a finalidade de inicializar os objetos dessa classe. 

Ele é chamado no momento da criação do objeto, quando utilizamos a palavra-chave "new", e é responsável por configurar o estado inicial do objeto.


Inicialização de atributos: O construtor é usado para atribuir valores iniciais aos atributos do objeto. 

Por exemplo, ele pode receber parâmetros que representam os valores iniciais dos atributos e atribuí-los a esses atributos durante a criação do objeto.








Entendendo como funciona o Método Adicionar
----




1 executando o metodo adicionar 
--
teremos a entrada do dados 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/389ff8aa-207b-4842-ae1d-374c79574590)

2 recebendo o dado e instanciação do objeto
 --
![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/91f129a1-c2ac-4d01-aad7-3149b0b8448c)

ao instanciar um objeto aprendemos que 

Você pode substituir Elemento() pelo construtor apropriado se a classe tiver parâmetros.

o metodo adiconar recebe o parametro e cria o objeto.



3 criação do objeto com o dado recebido
---
A classe Elemento recebendo esse valor executa o metodo construtor

passa o dado inserido para o valor do objeto instanciado

pois o objeto(novoElemento) e seu atributo (novoValor) passam a existir

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/4264823b-e8e9-448c-b0bc-8351c4f5acab)

.
---
lógica
---
Na classe da Lista Ligada temos 

os seguintes dados

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/ba6df03e-09ab-4b01-895b-e4b38e3abc7a)


Logica pra adiconar
 ---
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

se eu tentar adicionar outros valores nao vou obter sucesso 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/6cc1e594-3459-4de8-979e-97571e3b5323)


pois trará o mesmo resultado 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/936ecbe8-227d-4a7e-9d50-b9d92619d4da)




A Classe Elemento sabe quem é o seu próximo 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/dd0da9fd-4ddd-4ca4-a59b-a3a36c31ee3a)




então terei que mexer nessa lógica 

pois se o  AC é o primeiro e ultimo então ao entrar um novo dado terá de ser o próximo no caso a BA 


então AC vai indentificar que ele tem um próximo e vai deixar de ser o ultimo da lista!
representação 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/7fc348e2-4bba-4802-9a94-92e261d91f95)

Criaremos um Else (Senão)
---

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/4779add2-6ca9-4a6f-a6fd-f46dce39aa08)

caindo no else o ultimo vai setar como proximo esse elemento 

o elemento que entrar vai se torna o ultimo .

e conforme for sendo inseridos novos dados vao sempre cair no else pois primeiro e ultimo já estarão preeenchidos 

e o ultimo da lista vai estar sempre setando esse novo objeto como o proximo e deixando de ser o ultimo da lista

e cada objeto inserido  vai aumentando o tamanho++ independente se caia em if/else


então rodando

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/8ed6b962-4ee1-49e3-8408-4d54d5b26575)


obterei o resultado 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/cc839683-5ed4-4722-8b26-342f6dd2f34a)




Metodo Get
---


Sabemos quem é o primeiro e quem é o ultimo

vamos criar a variavel posição que vai ser inserida para buscarmos 

dentro do array aquela posiçao.

a posição será a variavel de controle  


criaremos a variavel atual invocando  da classe elemento o primeiro Elemento da lista para obtermos um ponto de partida.


então se 
	atual não tiver proximo 

		se proximo for diferente de null  (que seria o fim da lista)
		
		o atual vai ser ele mesmo!

		
             atual(rj)=this.primiero---getProximo(ba)----getproximo(ge)

ou seja a cada passada no loop ele vai verificando se nao 
acabou o array 

e a cada passada ele vai escrevendo na variavel atual o valor 

e a variavel de controle de posicao vai avançando e contando ate chega na posição escrita ex(4)

e o return vai retorna a posicao que queremos.


observe 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/0972bbcf-6719-4d64-acb0-104d46553311)




testando

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/a600adc8-5a17-4c91-9fda-ff84997a18ca)


obteremos 


![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/d1b4fa5e-aa7f-41cc-943b-e09bc3b731dc)


Metodo de Remover
---
 a função vai receber o parametro do valor procurado
       
variavel pra pegar o elemento anterior

variavel para pegar o primeiro elemento

se 
    	no valor atual for equivalente o valor procurado(encontrou o valor)

então 

  	variavel anterior seta seu proximo como o atual.getProximo()
  	e atual desaparece;
  
 
(senão) o valor nao for equivalente 
	a variavel(anterior) antes de avançar guarda o valor. (anterior = atual;)
            
         a variavel(atual) avança para o proximo da lista.
            atual = atual.getProximo();
	    
representação 

![WhatsApp Image 2023-05-29 at 13 22 47](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/e65d88d4-684d-4c28-a199-7f69c821847f)

	o proximo da anterior vai ser o proximo da atual e a atual vai ser removida


observe o código
	    
![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/127e47d9-2af0-4786-a3ef-8506d707d9c4)


obser na linha tamanho ![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/67390bd5-d931-419c-8988-5871bf6b66a9)

		obs: Apos excluir um elemento da lista o seu tamanho tem que diminuir!


LENDO OS VALORES

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/2b26a195-84d1-4603-83bb-7e93e038a1ff)


RESULTADO 

![image](https://github.com/leandroyoo/estruturadeDadosJavaa/assets/94478634/52cff1e5-67aa-4e06-8df9-d056d05a9786)


