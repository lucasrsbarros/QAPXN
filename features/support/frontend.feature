#language: pt

Funcionalidade: Validar Hello World!

    @helloWorld
    Cenário: Hello World é exibido
        Dado que eu acesso "/dynamic_loading/1"
        Quando clico no botão "Start"
        E aguardo carregamento
        Então verifico que a mensagem "Hello World!" é exibida

    @loginSucess @login
    Cenário: Login com sucesso
        Dado que eu acesso a área de login "/login"
        Quando faço login com "tomsmith" e "SuperSecretPassword!"
        Então devo ver "Secure Area" na área logada

    @loginErrorUsername @login
    Cenário: Login com erro no Username
        Dado que eu acesso a área de login "/login"
        Quando faço login com "outroLogin" e "SuperSecretPassword!"
        Então devo ver a mensagem de erro "Your username is invalid!"

    @loginErrorPassword @login
    Cenário: Login com erro no Password
        Dado que eu acesso a área de login "/login"
        Quando faço login com "tomsmith" e "QualquerOutraSenha!"
        Então devo ver a mensagem de erro "Your password is invalid!"