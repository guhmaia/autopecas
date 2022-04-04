# Projeto Java AutoPecas

### Este projeto consiste em simular uma loja de auto peças, contendo uma tela de login, cadastro, consulta e alteração.

## Tecnologias utilizadas

- [iText](https://itextpdf.com/en);
- [JFrame](https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html);
- [MySQL](www.mysql.com);
- [Apache NetBeans](https://netbeans.apache.org/download/index.html).

## Como utilizar o projeto

<b>Passo 1 </b>- Ao executar o projeto, a tela principal abrirá, e o usuário terá 2 opções na barra de menu: cadastro e venda. Navegando pelo menu de Cadastro, o usuário terá opções de cadastrar cliente, fornecedor, funcionário, peças, usuário e alterar algum cadastro. Já no menu de Venda, terão as opções de realizar uma nova venda ou uma consulta de alguma venda já efetuada. Você deve primeiramente realizar o cadastro de um novo usuário para utilizar o restante do projeto.

<b>Passo 2 </b>- Primeiro, na tela de cadastro de usuário, você irá cadastrar um usuário e uma senha, confirmando a mesma e selecionando o tipo de usuário (administrador ou normal). Administradores têm permissões gerais e usuários normais têm permissões limitadas.

<b> Passo 3 </b>- No menu "Cadastro", na opção "Cliente", o usuário poderá cadastrar um cliente, inserindo o nome, endereço, CPF e telefone. Já na opção "Fornecedor", o usuário irá cadastrar um fornecedor, inserindo nome, telefone e e-mail. Na opção "Funcionário", o usuário irá cadastrar um funcionário inserindo nome, endereço, CPF, telefone, salário, data de nascimento e e-mail. Na opção "Peças", o usuário irá cadastrar uma peça inserindo nome, preço, quantidade em estoque, fornecedor e código do mesmo. Na última opção "Alterar Cadastro", o usuário poderá alterar qualquer cadastro feito anteriormente, inserindo as informações de acordo com o tipo de cadastro alterado. Salvo a última opção, todas as outras contém a opção de gerar um relatório pdf de cadastros.

<b> Passo 4 </b>- No menu "Venda", na opção "Nova Venda", o usuário poderá efetuar uma venda, inserindo o nome do produto e com auxílio do botão "Pesquisar", o usuário terá acesso às informações do produto cadastrado, para que possa inserir o código do produto em questão e a quantidade de produtos a serem vendidos, em seguida, basta clicar no botão "Adicionar ao carrinho" e o produto será adicionado ao carrinho. Ao final da tela, o usuário pode clicar no botão "Ir para o carrinho" para abrir a tela do carrinho com todos os produtos daquela venda. Na tela de "Carrinho", serão mostrados todos os produtos, quantidades, preços e valores totais da venda, selecionando então a forma de pagamendo que poderá ser: cartão de crédito, débito, à vista ou cheque. Então, poderá finalizar a compra ou gerar um relatório pdf da mesma. <br>
Já na opção "Consulta Venda", o usuário irá para uma tela de relatório das vendas efetuadas, com código, data e valor total da mesma.
