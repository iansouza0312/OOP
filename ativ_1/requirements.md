## Resoulução de problemas utilizando Orientação a Objetos

#### Em um banco, para se cadastrar uma conta bancaria, e neccessário informar o número da conta, o nome do titular da conta, e o valor de depóstio inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, no entanto, é opcional : se o titular não realizar um depósito na criação da conta, seu saldo inicial será 0.

#### _Importante : toda vez que uma nova conta for aberta, o número da conta jamais poderá ser alterado. Já o nome do titular pode ser alterado_

#### Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, é só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de $ 2,50. Nota : a conta pode ficar com o saldo negativo caso o saldo seja insuficiente para realizar o saque e/ou pagar a taxa de transferência.

<hr>

## Solução Proposta

#### Criar um programa que realize o cadastro de uma conta, dando a opção para que seja informado ou não qual será o valor de depósito inicial(se realizado). Em seguida, o usuário deve conseguir realizar depósitos e saques, com o programa sempre mostrando os dados da conta após cada operação executada.

## Exemplo :

- Enter with your account number : 12785
- Enter with your account holder : Ian Souza
- Is there an inital deposit (y/n)? : y
- Enter with the initial deeposit value : 100.00
<hr>

- Account Data Balance

  - Account 12785, Holder: Ian Souza, Balance: $ 100.00

- Enter a Deposit Value : 500

  - Update Account Data
  - Account 12785, Holder: Ian Souza, Balance: $ 600.00

- Enter a Withdraw Value : 150
  - Update Account Data
  - Account 12785, Holder: Ian Souza, Balance: $ 450
