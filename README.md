# CorpFleet Manager

## Problem Statement
Empresas de logística enfrentam dificuldades críticas na gestão descentralizada de frotas, resultando em dados inconsistentes sobre a disponibilidade de veículos e histórico de manutenção. A falta de validação na entrada de dados (como quilometragem inconsistente ou duplicidade de registros) gera prejuízos operacionais e decisórios.

## Solution
O **CorpFleet Manager** é um sistema de gestão de ativos desenvolvido em Java, focado na integridade de dados em memória. A solução centraliza o controle de estado da frota, permitindo operações de alocação, manutenção preventiva e auditoria de rodagem através de uma arquitetura baseada em listas dinâmicas e tipagem forte.

## Key Features
* **Controle de Estado Seguro:** Utilização de `Enums` para garantir transições de status válidas (Disponível/Manutenção).
* **Validação de Integridade:** Algoritmos de verificação pré-inserção impedem duplicidade de chaves (Placas) e inconsistências lógicas (Km negativa ou regressiva).
* **Busca Otimizada:** Implementação de métodos de busca eficientes para manipulação de objetos dentro de estruturas `List`.
* **CRUD Dinâmico:** Gerenciamento completo do ciclo de vida do veículo sem limitação fixa de memória (diferente de vetores estáticos).

## Tech Stack
* **Language:** Java 17+
* **Core Concepts:** POO (Encapsulamento, Static Members), Collections Framework (`ArrayList`, `List`), Enumerations.
* **Architecture:** Separação de Entidades e Regras de Negócio.

## How to Run
1.  Clone o repositório.
2.  Compile o projeto:
    ```bash
    javac Program.java
    ```
3.  Execute a aplicação:
    ```bash
    java Program
    ```