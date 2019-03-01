# Santander
Teste Santander Fev/2019

Projeto de testes para Santander Android utilizando `Appium`, `Cucumber`, `Capybara` e `Ruby`.


# Instalação das Gems

Acessar via terminal a pasta do projeto `/automation-android`

Excutar o comando: 

```
bundle install
```


# Configuração do arquivo appium.txt

Altere o parametro `app` para o caminho completo do app, como em `/Users/felipefogal/workspace/Tests/Santander_TesteQA_FelipeFogal/TesteQA/calculaprecoprazo.apk`.


# Execução dos Testes

1. Iniciar o Appium
2. Abrir emulador do Android (ex: Gennymotion, Android AVD..)
3. Abrir o terminal na pasta do projeto /automation-android
4. Executar o comando:

```
bundle exec cucumber
```

# Reports

Os relatórios são criados automaticamente na pasta `/reports`


# Prova QA

As anotações dos bugs estão descritas no próprio arquivo.


# Commits do projeto

Os `commits` deste projeto estão no repositório `https://github.com/felipefogal/Santander.git`