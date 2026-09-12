# ☕ Trilha Java Back-End — Alura
## Nível 1: Aplicações Web com Java e Spring
### 📌 Módulo 2: Aplicando a Orientação a Objetos

Este repositório reúne as anotações, conceitos, desafios e exercícios práticos desenvolvidos ao longo do **Módulo 2** da formação de **Desenvolvimento Back-End em Java** na Alura. 

> 🎯 **Status do Módulo:** Todos os desafios e exercícios propostos pelos instrutores foram devidamente implementados, testados e concluídos, consolidando os pilares da Programação Orientada a Objetos (POO) na prática.

---

## 📚 Conteúdo Detalhado por Aula & Exercícios

### 🧱 Aula 01: Abstração, Classes e Objetos
* **Classes e Instanciação**: Compreensão do conceito de classe como molde ("blueprint") e a criação de instâncias (objetos) na memória.
* **Atributos e Métodos**: Mapeamento das características (atributos) e comportamentos/ações (métodos) de entidades do mundo real.
* **Pensamento Orientado a Objetos**: Modelagem de entidades reais traduzidas em código Java estruturado.
* **Desafios Concluídos**: Criação de classes simples (como `Pessoa`, `Calculadora`, `Musica`, `Carro` e `Aluno`) com definição de seus respectivos atributos e métodos de exibição de dados.

---

### 🛡️ Aula 02: Encapsulamento, Pacotes e Modificadores de Acesso
* **Encapsulamento**: Proteção dos dados internos da classe garantindo o controle de acesso às variáveis.
* **Modificadores de Acesso**: Diferença e aplicação prática do `public` e `private`.
* **Getters e Setters**: Implementação de métodos de leitura (`get`) e modificação (`set`) de atributos.
* **Uso do `this` e `import`**: Utilização do `this` para diferenciar variáveis de instância e parâmetros, e `import` para utilização de classes em pacotes distintos.
* **Organização de Pacotes**: Boas práticas na estruturação de pacotes seguindo a convenção de domínio invertido (ex: `br.com.alura.screenmatch`).
* **Desafios Concluídos**: Refatoração de classes para tornar atributos privados e adição de validações dentro dos métodos *setters* (ex: `ContaBancaria`, `IdadePessoa`, `Produto`, `Aluno`).

---

### 🧬 Aula 03: Herança e Polimorfismo
* **Reutilização de Código**: Resolução do problema de duplicação de lógica por meio do conceito de herança.
* **Palavra-chave `extends`**: Definição da relação de "é um" entre superclasses (classes mãe) e subclasses (classes filhas).
* **Sobrescrita de Métodos (`@Override`)**: Customização do comportamento de métodos herdados.
* **Polimorfismo**: Capacidade de tratar objetos de diferentes classes derivadas de forma genérica através da superclasse.
* **Desafios Concluídos**: Criação de hierarquias de classes como `Carro` -> `ModeloCarro`, `Animal` -> `Cachorro`/`Gato`, e `ContaBancaria` -> `ContaCorrente`, aplicando sobrescrita de métodos para cálculo de tarifas e comportamentos específicos.

---

### 🔌 Aula 04: Interfaces e Polimorfismo Avançado
* **Herança Simples no Java**: Compreensão da regra de que o Java suporta apenas herança simples entre classes.
* **Conceito de Interfaces**: Contratos que definem métodos que devem ser obrigatoriamente implementados por classes que a assinam.
* **Declaração de Métodos**: Uso do conceito onde todos os métodos em uma interface são implicitamente `public` e `abstract`.
* **Polimorfismo com Interfaces**: Aplicação de polimorfismo flexível desacoplando código por meio de contratos/interfaces.
* **Desafios Concluídos**: Implementação de interfaces como `ConversorMoeda`, `CalculadoraSalaRetangular`, `TabuadaMultiplicacao` e `Vendavel`, permitindo que diferentes classes compartilhem contratos comportamentais.

---

### 🎵 Aula 05: Projeto Prático – Sistema de Músicas (Audio Player)
* **Aplicação Consolidada**: Construção de uma aplicação completa para gerenciamento de áudios (músicas e podcasts) consolidando os 4 pilares da POO.
* **Integração de Conceitos**:
  * Abstração e Encapsulamento de preferências e contadores de reprodução/curtidas.
  * Criada a superclasse `Audio` estendida por `Musica` e `Podcast` (Herança).
  * Sobrescrita do método de classificação (`getClassificacao`) adaptado para a lógica de avaliação de cada tipo de áudio (Polimorfismo).
  * Interface ou classe de serviço para controle de reprodução e listas de favoritos.
* **Desafios Concluídos**: Validação do sistema completo de áudio, simulação de reproduções/curtidas e exibição de estatísticas via terminal.

---

## 🛠️ Tecnologias e Ferramentas

* **Linguagem**: Java 17
* **IDE**: IntelliJ IDEA
* **Paradigma**: Programação Orientada a Objetos (POO)
* **Plataforma**: Alura (Trilha Desenvolvimento Back-End Java)

---

## 🚀 Como Executar os Projetos

1. Certifique-se de possuir o **JDK 17** instalado em sua máquina.
2. Clone o repositório e abra o projeto no **IntelliJ IDEA**.
3. Navegue até o diretório `src/` para encontrar o código organizado nos respectivos pacotes (`modelos`, `calculos`, `principal`, etc.).
4. Execute a classe que contém o método `main` correspondente ao exercício ou aplicação desejada.
