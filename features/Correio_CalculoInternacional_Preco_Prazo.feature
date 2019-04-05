#language: pt
@CalculoInternacional
Funcionalidade: Calculo Internacional de preco e prazo para entrega

@CalculoInternacionalValidoCEP
Cenario: 		Criacao de calculo internacional valido de preco e prazo por CEP
                Dado que estou realizando o calculo de Preco e Prazo internacional
                E que informo CEP Remente valido
                E que informo um Pais Destinatario valido
                E que informo uma cidade de destino valida
                E que informo um Peso valido
                Então o calculo deve ser salvo com sucesso


@CalculoInternacionalValidoCidadeEstado
Cenario: 		Criacao de calculo internacional  valido de preco e prazo por Estado
                Dado que estou realizando o calculo de Preco e Prazo internacional
                E que informo um Estado Origem valido
                E que informo um Cidade Origem valido
                E que informo um Pais Destinatario valido
                E que informo uma cidade de destino valida
                E que informo um Peso valido
                Então o calculo deve ser salvo com sucesso


@CalculoInternacionalCEPInvalido
Cenario: 		Valida calculo internacional CEP invalido
                Dado que estou validando o calculo de Preco e Prazo internacional
                E que informo CEP Remente invalido
                Então o sistema deve apresentar mensagem de erro

@CalculoInternacionalDadosObjeto
Cenario:        Criar cadastro de Calculo Internacional com Dados Objeto
                 Dado que estou realizando o calculo de Preco e Prazo internacional
                 E que informo CEP Remente valido
                 E que informo um Pais Destinatario valido
                 E que informo uma cidade de destino valida
                 E que informo o dado do Objeto Nao Documento
                 E que o tipo envelope
                 E que informo um Peso valido
                Então o calculo deve ser salvo com sucesso

@CalculoInternacionalValidaPeso
Cenario:        Criar cadastro de Calculo Internacional valida o Peso
                Dado que estou realizando o calculo de Preco e Prazo internacional
                E que informo CEP Remente valido
                E que informo um Pais Destinatario valido
                E que informo uma cidade de destino valida
                E que informo o dado do Objeto Nao Documento
                E que o tipo envelope
                Então o sistema deve validar a falta do Peso

@CalculoInternacionalValidaPaisInvalido
Cenario:        Validar selecao de pais invalido Calculo Internacional
                Dado que estou realizando o calculo de Preco e Prazo internacional
                E que informo CEP Remente valido
                E que informo um Pais Destinatario invalido
                Então o sistema deve realizar a verificacao e apresentar mensagem de erro

@CalculoInternacionalValidaDadosDestinoInvalido
Cenario:        Validar dados invalidos de pais Destinatario
                Dado que estou realizando o calculo de Preco e Prazo internacional
                E que informo CEP Remente valido
                E que informo o Destinatario invalido
                Então o sistema deve realizar a verificacao e apresentar mensagem de erro informando sobre os dados invalidos
