class CalcSaveScreen < BaseScreen
    def initialize(seconds = 5)
        catch_for_accessibility_id('Teste', seconds)
        catch_for_accessibility_id('Origem: 04306-020', seconds)
        catch_for_accessibility_id('Destino: 05065-080', seconds)
        catch_for_id('chk_selecao', seconds)
        catch_for_id('action_delete', seconds)
    end

    def select_save_option
        touch_element_for_id('chk_selecao')
    end

    def tap_delete_option
        touch_element_for_id('action_delete')
    end

    def delete_saved_calc
        self.select_save_option
        self.tap_delete_option
    end

    def no_saved_calc_exists(seconds = 5)
        catch_for_accessibility_id('Nenhum cálculo realizado foi salvo.', seconds)
    end
end