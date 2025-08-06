# Projeto Conta Terminal

Este projeto simples em Java simula a criação de uma conta bancária via terminal (CLI). Ele coleta informações básicas do usuário, como nome, agência, número da conta e saldo inicial, e emite uma mensagem de boas-vindas personalizada com os dados informados.

## Como funciona?

Ao executar o programa, o sistema solicita interativamente ao usuário:
1. Nome completo
2. Número da agência
3. Número da conta
4. Valor do depósito inicial

No final, o programa exibe uma mensagem formatada com todos os dados.

##Detalhe importante: `nextLine()` vs `next()`

Durante a implementação, surgiu um comportamento inesperado: quando o usuário digitava um **nome com sobrenome** (ex: `João Silva`), o segundo nome (`Silva`) era capturado indevidamente pelo campo seguinte (`agência`), antes mesmo do sistema solicitar a entrada.

### Por que isso acontece?

O método `scanner.next()` lê apenas **até o primeiro espaço**. Isso significa que:
- `João` ia para `nomeCliente`
- `Silva` ficava no buffer e era automaticamente usado por `agencia = scanner.next()`

### A solução:

Foi adotado o método `scanner.nextLine()` para capturar o **nome completo**, pois ele lê a entrada **até o final da linha**, incluindo espaços. Com isso, o nome é capturado corretamente e o programa segue com os prompts esperados:

```java
System.out.println("Por favor, digite o seu nome:");
nomeCliente = scanner.nextLine(); // Lê nome completo com espaços
