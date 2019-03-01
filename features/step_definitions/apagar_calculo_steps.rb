Dado("clico em Calculos Salvos") do
    @homescreen.tap_menuOptions_button
    @homescreen.go_to_saveCalcs_page
end
  
Quando("seleciono e apago o meu calculo salvo anteriormente") do
    @calc_save_screen = CalcSaveScreen.new(5)
    @calc_save_screen.select_save_option
    @calc_save_screen.tap_delete_option
end
  
Entao("devo deixar de ver o calculo salvo") do
    @calc_save_screen.no_saved_calc_exists
end