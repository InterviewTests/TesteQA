class HomeScreen < BaseScreen
    def initialize(seconds = 5)
        catch_for_id('up', seconds)
    end

    def tap_menuOptions_button
        touch_element_for_id('up')
    end

    def go_to_newCalcs_page
        touch_element_for_xpath('/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView')
    end

    def go_to_saveCalcs_page
        touch_element_for_xpath('/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView')
    end

    def go_to_internationalCalcs_page
        touch_element_for_xpath('/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView')
    end
end