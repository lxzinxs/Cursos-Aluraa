# ☕ Trilha Java Back-End — Alura
## Nível 1: Aplicações Web com Java e Spring
### 📌 Módulo 3: Trabalhando com Listas e Coleções de Dados

Este repositório reúne as anotações, conceitos, desafios e exercícios práticos desenvolvidos ao longo do **Módulo 3** da formação de **Desenvolvimento Back-End em Java** na Alura.

> 🎯 **Status do Módulo:** Todos os desafios e exercícios propostos pelos instrutores foram devidamente implementados, testados e concluídos, aprofundando o domínio sobre manipulação de coleções, ordenação e polimorfismo em Java.

---

## 📚 Conteúdo Detalhado por Aula & Exercícios

### 📜 Aula 01: Listas de Objetos e a Classe ArrayList
* **Uso da Classe `ArrayList`**: Representação e manipulação dinâmica de coleções de objetos na memória.
* **Operações Básicas**: Utilização dos métodos essenciais `.add()` (adicionar), `.size()` (obter tamanho) e `.get()` (buscar elemento por índice).
* **Classes de Lista**: Apresentação de diferentes classes que representam listas no Java.
* **Representação em Texto**: Sobrescrita e funcionamento do método `toString()` para formatar a exibição textual dos objetos.
* **Desafios Concluídos**: Criação de um `ArrayList` de objetos, adição de múltiplos elementos e exibição formatada da lista no console.

---

### 🏗️ Aula 02: Construtores e Herança na Prática
* **Passagem de Parâmetros na Instanciação**: Definição e uso de construtores customizados para inicializar objetos com atributos obrigatórios.
* **Construtor Default**: Compreensão do comportamento do construtor padrão fornecido implicitamente pelo Java.
* **Construtores e a Palavra `super`**: Chamada do construtor da classe mãe a partir de subclasses derivadas.
* **Desafios Concluídos**: Refatoração das classes do projeto para exigir dados na instanciação via construtor e propagação de parâmetros para superclasses.

---

### 🔄 Aula 03: Iteração, Type Casting e Instanceof
* **Percorrendo Listas com `foreach`**: Leitura simplificada e limpa de elementos contidos em coleções dinâmicas.
* **Casting de Objetos**: Conversão explícita de tipos de referência para acessar membros específicos de subclasses.
* **Verificação de Tipos com `instanceof`**: Validação de segurança antes do casting para evitar exceções do tipo `ClassCastException`.
* **Desafios Concluídos**: Implementação de loops iterativos para processar listas heterogêneas, checando os tipos de objetos com `instanceof` antes de executar métodos específicos.

---

### 📊 Aula 04: Ordenação, Interface List e Polimorfismo
* **Ordenação de Listas**: Utilização do método `Collections.sort()` e da interface `Comparable` para definir a ordem natural de objetos da aplicação.
* **Método `compareTo`**: Implementação da regra de comparação entre objetos de classes próprias (como a classe `Titulo`).
* **Critérios Flexíveis de Ordenação**: Uso do método `.sort()` da interface `List` combinando comparadores dinâmicos (ex: `Comparator.comparing`).
* **Interface `List` vs Implementações**: Diferença prática entre `ArrayList` e `LinkedList`.
* **Polimorfismo com Interfaces**: Declaração de variáveis do tipo interface (`List<T> lista = new ArrayList<>()`), permitindo trocar facilmente a implementação sem impactar o código.
* **Desafios Concluídos**: Aplicação de ordenação por título e por ano em listas de objetos, além de exercitar a declaração polimórfica usando a interface `List`.

---

### 🛒 Aula 05: Projeto Prático – Sistema de Compras
* **Aplicação Consolidada**: Desenvolvimento de uma aplicação completa para controle de limite de cartão de crédito e lista de compras.
* **Integração de Conceitos**:
  * Criação da entidade `CartaoDeCredito` e `Compra`.
  * Manipulação de um `ArrayList` para registrar o histórico de itens comprados.
  * Implementação da interface `Comparable` na classe `Compra` para ordenar a fatura pelo valor de cada item.
  * Validações contínuas de saldo disponível a cada nova tentativa de compra.
* **Desafios Concluídos**: Sistema de compras funcional via terminal com exibição da lista de compras ordenada por valor e saldo restante atualizado.

---

## 🛠️ Tecnologias e Ferramentas

* **Linguagem**: Java 17
* **IDE**: IntelliJ IDEA
* **Conceitos Chave**: Collections, `ArrayList`, `List`, Interface `Comparable`, `Comparator`, Polimorfismo
* **Plataforma**: Alura (Trilha Desenvolvimento Back-End Java)

---

## 🚀 Como Executar os Projetos

1. Certifique-se de possuir o **JDK 17** instalado em sua máquina.
2. Clone o repositório e abra o projeto no **IntelliJ IDEA**.
3. Navegue até o diretório `src/` para encontrar as classes organizadas por pacotes.
4. Execute a classe com o método `main` correspondente para testar as coleções ou o projeto de sistema de compras.
