# language: pt

Funcionalidade: Realizar novos calculos no app

@first_scenario
Cenario: Realizar um novo calculo de prazo com sucesso
    Dado que estou na tela inicial do app
        E clico em Novo calculo
    Quando preencho os dados de calculo
        E seleciono a opcao de Calcular somente o prazo
    Entao devo ver os prazos exibidos na tela do app
        E devo conseguir visualizar o meu calculo salvo

@creating_data
Cenario: Acessar calculo salvo
    Dado que estou na tela inicial do app
        E clico em Calculos Salvos
    Quando seleciono e apago o meu calculo salvo anteriormente
    Entao devo deixar de ver o calculo salvo

@negative_test_1
Cenario: Realizar um novo calculo sem preencher cep origem
    Dado que estou na tela inicial do app
        E clico em Novo calculo
        Mas nao preencho o cep de origem
    Quando tento salvar o calculo
        Entao nao devo conseguir salvar o cadastro

@negative_test_2
Cenario: Realizar um novo calculo sem preencher cep destino
    Dado que estou na tela inicial do app
        E clico em Novo calculo
        Mas nao preencho o cep de destino
    Quando tento salvar o calculo
        Entao nao devo conseguir salvar o cadastro

@negative_test_3
Cenario: Realizar um novo calculo sem preencher cep nenhum
    Dado que estou na tela inicial do app
        E clico em Novo calculo
        Mas nao preencho nenhum cep
    Quando tento salvar o calculo
        Entao nao devo conseguir salvar o cadastro