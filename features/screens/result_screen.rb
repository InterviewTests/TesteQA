class ResultScreen < BaseScreen
    def initialize(seconds = 5)
        catch_for_id('lbl_data', seconds)
        catch_for_id('lbl_origem', seconds)
        catch_for_id('tv_origem', seconds)
        catch_for_id('lbl_destino', seconds)
        catch_for_id('tv_destino', seconds)
        catch_for_id('lbl_mensagem_prazo', seconds)
        catch_for_id('lbl_mensagem_form', seconds)
        catch_for_id('action_salvar', seconds)
        catch_for_xpath('/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.ImageView', seconds)
        catch_for_xpath('/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView', seconds)
    end

    def tap_salvar_button
        touch_element_for_id('action_salvar')
    end

    def show_modal_salvar(seconds = 5)
        catch_for_id('title', seconds)
        catch_for_id('tv_nome_calculo', seconds)
        catch_for_id('ed_nome_calculo', seconds)
        catch_for_id('bt_ok', seconds)
        catch_for_id('bt_cancelar', seconds)
    end

    def put_calcName(calcName)
        type_into_text_field_for_id('ed_nome_calculo', "#{calcName}")
    end

    def tap_button_ok
        touch_element_for_id('bt_ok')
    end
end