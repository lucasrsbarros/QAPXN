#Hello World
Dado('que eu acesso {string}') do |url|
    visit "/dynamic_loading/1" 
  end
  
  Quando('clico no botão {string}') do |startButton|
    find("#start").click
    click_button('Start')
  end
  
  Quando('aguardo carregamento') do
    find("#loading").click
    sleep 3
  end
  
  Então('verifico que a mensagem {string} é exibida') do |message|
    find("#finish").click
    expect(page).to have_content message
  end

#Login
  Dado('que eu acesso a área de login {string}') do |urlLogin|
    visit "/login" 
  end
  
  Quando('faço login com {string} e {string}') do |username, password|
    find("#username").set username
    find("#password").set password
    click_button "Login"
    sleep 3
  end

#Login Sucess
  Então('devo ver {string} na área logada') do |message|
    expect(page).to have_content message
    #Não há token na aplicção para realizar uma validação de login mais segura
  end

#Login Error
  Então('devo ver a mensagem de erro {string}') do |message|
    expect(page).to have_content message
  end