# ADA-Fintech-Java

## 📚 Enunciado Do Projeto

Iremos iniciar uma fintech. Para isso, a primeira coisa que devemos fazer é construir nossa boa base para que seja escalável. Como estamos começando, ainda não sabemos todas as funcionalidades que iremos desenvolver no futuro. Portanto, é necessário termos cuidado no início para evitar criar coisas desnecessárias e, ao mesmo tempo, garantir que o que criarmos seja passível de evolução e escalabilidade no momento certo.

O primeiro passo será a criação de um serviço separado do restante do nosso sistema. Esse serviço poderá ser utilizado em diversas áreas da nossa empresa e consistirá no cadastro de Pessoas Físicas e Jurídicas. Nele, devemos realizar o cadastro e a gestão de todas as pessoas que poderão participar de diferentes etapas dos nossos processos, como clientes, funcionários, fornecedores e qualquer outro papel que uma pessoa possa desempenhar no futuro.

Posteriormente, construiremos a base para nossa operação bancária. Essa base pode ser dividida em microserviços ou ser desenvolvida como um monolito, porém a decisão tomada deve ser justificada. Não existe um modelo ideal, mas devemos ser capazes de fazer escolhas considerando os ganhos e custos de todas as decisões que tomarmos.

Essa base deve ser capaz de gerenciar contas. Inicialmente, o único tipo de conta que teremos será a conta de pagamento, que deve conter todos os lançamentos, saldos e uma referência para os titulares da conta. Aceitaremos contas conjuntas.

Todas as entradas em uma conta devem originar-se de uma transação, que resultará em duas entradas: uma positiva na conta aonde o dinheiro irá entrar e a outra negativa na conta aonde o dinheiro saiu. Iniciaremos com três tipos de transações possíveis. Uma delas é a transferência entre contas do nosso banco, onde um usuário pode solicitar uma transferência para outra conta da nossa instituição. Outra transação possível será o empréstimo, onde nossa instituição terá uma conta e poderemos emprestar dinheiro para outros usuários. Como estamos prospectando clientes, não cobraremos nenhuma tarifa.

Por último, todos as contas terão um saldo em Real e em um saldo em Dólar, e eles poderão comprar ou vender essas moedas para nós, pagando sempre uma taxa fixa de 5 reais para cada dólar. Cobraremos do cliente o valor na moeda que ele oferecer e faremos um depósito do valor resultante em sua conta.

Os desenvolvedores têm a liberdade de criar de acordo com seu entendimento, e como utilizaremos metodologias ágeis, estaremos sempre em contato com o cliente para ajustar nossos rumos.

Para auxiliar, temos um modelo de arquitetura de referência. Este modelo deve ser usado como uma diretriz, mas não precisa ser implementado de forma rígida. Devemos adaptá-lo às necessidades do nosso negócio.

Você pode acessar o modelo de arquitetura de referência nos seguintes links:

https://bian.org/servicelandscape-11-0-0/views/view_31925.html
https://bian.org/servicelandscape-11-0-0/views/view_50605.html
https://bian.org/servicelandscape-11-0-0/views/view_50986.html

Tão importante quanto as funcionalidades que vamos criar será a qualidade do nosso código. Neste ponto, devemos nos preocupar com isso.
