class CalcScreen < BaseScreen
    def initialize(seconds = 4)
        catch_for_id('lbl_mensagem_ori_dest', seconds)
        catch_for_id('txt_data', seconds)
        catch_for_id('txt_cep_ori', seconds)
        catch_for_id('txt_cep_dest', seconds)
        catch_for_id('checkSoPrazo', seconds)
        catch_for_id('button_prox', seconds)
    end

    def tap_origem_textField
        touch_element_for_id('txt_cep_ori')
    end

    def tap_detino_testField
        touch_element_for_id('txt_cep_dest')
    end

    def input_number_in_origem_testField(cep_origin)
        sleep(1)
        clear_element('txt_cep_ori')
        sleep(1)
        type_into_text_field_for_id('txt_cep_ori', "#{cep_origin}")
    end

    def input_number_in_destino_testField(cep_destinity)
        sleep(1)
        clear_element('txt_cep_dest')
        sleep(1)
        type_into_text_field_for_id('txt_cep_dest', "#{cep_destinity}")
    end

    def tap_somentePrazo_checkbox
        touch_element_for_id('checkSoPrazo')
    end

    def tap_proximo_button
        touch_element_for_id('button_prox')
        sleep(15)
    end

    def cep_origem_error(seconds = 5)
        id_not_exists_in_screen(seconds, 'action_salvar')
    end

end