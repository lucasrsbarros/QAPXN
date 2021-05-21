#language: pt

Funcionalidade: CRUD

  Cenário: Get Usuário
    Dado que realizo GET na API "/1"
    Quando for validado usuário "username" igual a "Bret"
    Então verifico schema do retorno

  Cenário: Crud - GET, POST, PUT e DELETE
    Dado que realizo GET na API "/2"
    Quando for efetuado um POST
    E for realizado um PUT
    Então verifico se foi realizado um DELETE

  Esquema do Cenario: Validação Get
    Dado que realizo GET na API "/10"
    Quando valido POST no <path> com <value>
    Então verifico schema do retorno

    Exemplos:
      |path|value|
      |"name"|"Clementina DuBuque"|
      |"username"|"Moriah.Stanton"|
      |"email"   |"Rey.Padberg@karina.biz"|
      |"phone"   |"024-648-3804"        |
      |"website" |"ambrose.net"|