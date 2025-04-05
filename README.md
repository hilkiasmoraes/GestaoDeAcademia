# Projeto Senai POO

## Sistema de gestão de academia com os pilares da Programação Orientada a Objetos:

- **Encapsulamento** protege os dados das classes `Cliente` e `Instrutor`.
- **Herança** é aplicada com `Pessoa` sendo a classe pai de `Cliente` e `Instrutor`.
- **Polimorfismo** ocorre no método `getDescricao()`, que é sobrescrito em `Cliente` e `Instrutor`.
- **Composição** é utilizada na classe `Academia`, que contém uma lista de `Pessoa`.

### Detalhes do projeto:
- **Abstração e Herança**: A classe `Pessoa` é abstrata e serve como base para `Cliente` e `Instrutor`.
- **Encapsulamento**: Os atributos são privados e acessados por métodos públicos.
- **Polimorfismo**: O método `getDescricao()` é sobrescrito para retornar informações específicas de `Cliente` e `Instrutor`.
- **Composição**: A `Academia` contém uma lista de `Pessoa`, que pode ser `Cliente` ou `Instrutor`.

### Classe Pessoa (Herança aplicada)

### Classe Cliente (Herança e Encapsulamento)

### Classe Instrutor (Herança e Encapsulamento)

### Classe Academia (Composição e Polimorfismo)