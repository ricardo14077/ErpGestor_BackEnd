#  Domain Architecture - Domain (DDD)

Este repositório contém a implementação do núcleo de domínio de uma aplicação baseada nos princípios de **DDD (Domain-Driven Design)**. O objetivo principal é garantir o isolamento das regras de negócio, utilizando estruturas de *Aggregate Roots*, *Entities* e *Value Objects*.

---

## - Estrutura de Arquitetura do Domínio

O design do código segue a separação tática do DDD para garantir alta coesão e baixo acoplamento:

```text
src/
└── main/
    └── java/
        └── com/
            └── seu_pacote/
                ├── core/                  # Classes base/abstratas compartilhadas
                │   ├── AggregateRoot.java
                │   └── Entity.java
                └── domain/                # Modelagem rica do negócio
                    ├── cliente/
                    │   ├── Cliente.java   # [Aggregate Root]
                    │   └── Endereco.java  # [Entity / Value Object]
                    └── loja/
                        └── Loja.java      # [Aggregate Root]
```

---

## - Componentes Táticos do DDD Implementados

### 1. Classes de Infraestrutura de Domínio (`/core`)
*   **`Entity`**: Classe abstrata que define a identidade única de um objeto de domínio através de um identificador (`ID`), garantindo a rastreabilidade ao longo do ciclo de vida.
*   **`AggregateRoot`**: Classe abstrata que estende `Entity`. Ela funciona como a "porta de entrada" de um agregado, sendo responsável por garantir a consistência interna de todas as entidades e objetos de valor subordinados a ela.

### 2. Agregados do Domínio (`/domain`)

#### 👤 Agregado de Cliente
*   **`Cliente` (Aggregate Root)**: Controla o estado, as regras de negócio de cadastro, validações de documentos e o vínculo com endereços. Nenhuma alteração de dados do cliente ou seus endereços acontece fora desta classe.
*   **`Endereco` (Entity / Value Object)**: Representa a localização do cliente. É gerenciado diretamente pela raiz `Cliente`.

#### - Agregado de Loja
*   **`Loja` (Aggregate Root)**: Centraliza as regras de operação e identificação do estabelecimento comercial.

---

## - Qualidade de Código & Testes

A integridade do domínio é garantida através de testes unitários que validam comportamentos, estados e invariantes de negócio sem dependências externas (banco de dados ou APIs).

*   **`ClienteTest`**: Classe responsável por validar as regras de negócio do agregado de Cliente (ex: regras de validação, alteração de endereço e fluxos alternativos).

---

## - Como Executar os Testes no IntelliJ

1. Abra o IntelliJ IDEA.
2. Navegue até a classe `ClienteTest` dentro de `src/test/java/`.
3. Clique com o botão direito sobre a classe ou método e selecione **Run 'ClienteTest'** (ou use o atalho `Ctrl + Shift + F10` / `Cmd + Shift + R`).

---
Desenvolvido com ☕ e boas práticas de arquitetura de software por [Seu Nome](https://github.com).
