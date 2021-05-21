# Quality Assurance Analyst Challenge

Desafio realizado com base nas instruções disponibilizadas [nesse repositório]( https://github.com/Pixeon/qa-challenge).

## 1- Cenários de Teste

Levantamento de cenários em Gherkin para a imagem abaixo ([demo](https://demos.creative-tim.com/notus-react/?_ga=2.154140984.1600938269.1610986568-1695319199.1610986568#/admin/settings)) estão disponíveis no arquivo **cenarios_demo.md** nesse repositório

![Prototipo](https://github.com/Pixeon/qa-challenge/raw/main/img/demo.png)

---

## 2- Automação de Front-end

A automação do front foi realizada em **Ruby** utilizando **Capybara, Selenium e Cucumber**.

No arquivo *Gemfile* encontrará detalhes das versões e maiores infomaçõessobre como instalar as gems necessárias.

Para execução dos testes com **relatório** execute o comando "cucumber --format html --out reports.html". Também é possível realizar os testes agrupados usando as tags @helloWorld ou @login.

Projeto criado no Visual Studio Code

---

## 3- Automação do Back-end

Para a automação do Backend foi utilizado **Rest-Assured** com **Junit**, cenários gherkin no **Cucumber**, validações no body com **Hamcrest**, **Json Schema Validator**.

Projeto criado no InteliJ