# Diário de decisões

## Etapa 1: Java puro no console (concuída)

**Data:** 05/10/2026

**O que fiz:**
- Criei o repositório `financas-api` no GitHub e cloneei pelo IntelliJ
- Pesquisei o que um sistema de finanças pessoais precisa ter
- Desenhei o domínio no papel antes de escrever código
- Criei a classe com.davidreis.financas_api.Categoria com atributo nome, construtor, getter e setter
- criei a classe com.davidreis.financas_api.Categoria e testei no Main
- criei com.davidreis.financas_api.TipoTransacao (enum), com.davidreis.financas_api.Transacao e guardei várias transações numa ArrayList
- guardei as transações numa ArrayList e calculei o saldo percorrendo ela com for e if
- criei a classe com.davidreis.financas_api.Carteira para guardar a lista de transações e calcular o saldo, em vez de deixar tudo no Main. Assim cada classe tem uma responsabilidade só
- criei o cálculo das despesas de um mês, filtrando por tipo e por mês com &&


**Decisões:**
- Comecei pelo núcleo: `com.davidreis.financas_api.Transacao` e `com.davidreis.financas_api.Categoria`. Metas, reserva de emergência e investimentos ficam para etapas futuras, porque dependem de as transações já existirem.
- `com.davidreis.financas_api.Transacao` é uma classe só, com um campo de tipo (receita ou despesa), porque as duas guardam as mesmas informações e só o tipo muda.
- Campos da `com.davidreis.financas_api.Transacao`: descrição, valor, data, tipo e categoria.
- Totais, como "gastos no mês", não ficam guardados. Eles são calculados somando as transações.
- Um repositório por projeto, separado do projeto de estudos, para manter o histórico limpo.
- enum para o tipo, sem setters na com.davidreis.financas_api.Transacao, double para o valor por simplicidade nesta etapa (em projeto real de dinheiro se usa BigDecimal)

**Erros e dificuldades:**
- No começo imaginei o sistema como uma loja, com cliente e número de compras. Percebi que aqui o dono do dinheiro é o próprio usuário.
- Não achei o menu File no IntelliJ novo (fica dentro do ☰).
- Tive dificuldade para entender o construtor e para escolher o atributo da com.davidreis.financas_api.Categoria. Entendi que o atributo é o que a classe guarda (nome), e que "Alimentação" é um valor, não um atributo
- confundi o atributo com o valor (usei alimentacao em vez de nome) e demorei para entender o construtor; renomeei a classe Main e o método ficou com letra maiúscula, o que impedia de rodar

**O que aprendi:**
- Diferença entre repositório Git e projeto Java
- Dado guardado x dado calculado
- Receita é dinheiro que entra, despesa é dinheiro que sai
- Construtor roda na criação do objeto e entrega os valores iniciais; setter recebe e guarda um valor (void), getter devolve
- : o construtor entrega os valores iniciais na criação do objeto
- uma classe pode ter outra como atributo, e ArrayList<com.davidreis.financas_api.Transacao> guarda objetos, não só números
- o for-each percorre uma lista item por item, e a comparação do enum usa ==
- um método que calcula não deve imprimir, ele devolve o valor; a lista ficou privada e só se mexe nela por métodos da classe
- o gasto do mês não fica guardado, é calculado somando as transações, e o LocalDate tem métodos prontos como getMonthValue()

## Etapa 2: API com Spring Boot (em andamento)


**Decisões:**
- continuei no mesmo repositório para o histórico mostrar a evolução; usei Maven; escolhi o Java 25 por ser LTS; adicionei só o Spring Web por enquanto, para entender o que cada dependência faz

**Erros e dificuldades:**
- o IntelliJ não carregou o Maven (vermelho no código), apesar de o terminal compilar certo; resolvi com Sync project

**O que aprendi:**
- Spring Boot liga um servidor web (Tomcat) na porta 8080; o Maven baixa as bibliotecas listadas no pom.xml