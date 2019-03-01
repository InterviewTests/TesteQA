Dado("nao preencho o cep de origem") do
    @calc_screen = CalcScreen.new(5)
    @calc_screen.input_number_in_destino_testField('05065080')
    @calc_screen.tap_somentePrazo_checkbox
end

Quando("tento salvar o calculo") do
    @calc_screen.tap_proximo_button
end

Entao("nao devo conseguir salvar o cadastro") do
    @calc_screen = CalcScreen.new(5)
    @calc_screen.cep_origem_error
end

Dado("nao preencho o cep de destino") do
    @calc_screen = CalcScreen.new(5)
    @calc_screen.input_number_in_origem_testField('04306020')
    @calc_screen.tap_somentePrazo_checkbox
end
