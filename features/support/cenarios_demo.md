# Cenários - Demo

A escolha de entregar esses cenários em .md parte de uma tentativa de simplificar o uso do cucumber, evitando que esses cenários sejam levados em considerção ao executar o comando 'cucumber', sem '-t @' que define um cenário específico, e possibilite fácil execução de todos os testes no terminal.

---

\#language: pt

Funcionalidade: Dashboard - Settings
Para que eu possa realizar ajustes no meu perfil
Sendo um usuário previamente logado
Posso alterar dados da minha conta



​       Cenário: Alterar USER INFORMATION com sucesso

​        Dado que estou no menu 'settings'

​        Quando preencho os campos com 'username', 'email address', 'first name' e 'last name' da sessão 'USER INFORMATION'

​        Então aciono o botão 'settings' para salvar as informações fornecidas



Cenário: Alterar CONTACT INFORMATION com sucesso

​        Dado que estou no menu 'settings'

​        Quando preencho os campos com 'address', 'city', 'country' e 'postal code' da sessão 'CONTACT INFORMATION'

​        Então aciono o botão 'settings' para salvar as informações fornecidas



Cenário: Alterar ABOUT ME com sucesso

​        Dado que estou no menu 'settings'

​        Quando preencho o campo 'about me' da sessão 'ABOUT ME'

​        Então aciono o botão 'settings' para salvar as informações fornecidas



Cenário: Validar campos obrigatórios

​        Dado que estou no menu 'settings'

​        Quando apago todos os dados dos campos do formulário

​		E aciono o botão 'settings' para salvar as informações fornecidas

​        Então recebo mensagem de validação que 'x' e 'y' são campos obrigatórios



Cenário: Validar username indisponível

​        Dado que estou no menu 'settings'

​        Quando preencho o campo 'username' da sessão ' USER INFORMATION' com username já utilizado

​		E aciono o botão 'settings' para salvar as informações fornecidas

​        Então recebo mensagem de validação que username informado está indisponível



Cenário: Validar email inválido

​        Dado que estou no menu 'settings'

​        Quando preencho o campo 'email address' da sessão ' USER INFORMATION' com valor incorreto

​		E aciono o botão 'settings' para salvar as informações fornecidas

​        Então recebo mensagem de validação que email não segue padrão de formatação esperado 'email@email.com'