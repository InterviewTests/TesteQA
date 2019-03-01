#enconding: uft-8

class BaseScreen
    def catch_for_id(id, timeout)
      $driver.wait_true(timeout) { $driver.exists { $driver.find_element :id, id } }
    rescue
      raise "Elemento de id '#{id}' nao encontrado"
    end

    def catch_for_class(class_name, timeout)
      $driver.wait_true(timeout) { $driver.exists { $driver.find_element :class, class_name} }
    rescue
      raise "Elemento de class '#{class_name}' nao encontrado"
    end

    def catch_for_name(name, timeout)
      $driver.wait_true(timeout) { $driver.exists { $driver.find_element :name, name } }
    rescue
      raise "Elemento de name '#{name}' nao encontrado"
    end

    def catch_for_xpathName(xpathName, timeout)
      $driver.wait_true(timeout) { $driver.exists { $driver.find_element :xpath, "//*[@name='#{xpathName}]" } }
    rescue
      raise "Elemento de name '#{xpathName}' nao encontrado"
    end

    def catch_for_xpath(xpath, timeout)
      $driver.wait_true(timeout) { $driver.exists { $driver.find_element :xpath, xpath } }
    rescue
      raise "Elemento de xpath '#{xpath}' nao encontrado"
    end

    def catch_for_accessibility_id(accessibility_id, timeout)
      $driver.wait_true(timeout) { $driver.exists { $driver.find_elements :accessibility_id, accessibility_id } }
    rescue
      raise "Elemento de accessibility_id '#{accessibility_id}' nao encontrado"
    end

    # VALIDACAO DE IDS QUE NAO DEVEM EXISTIR EM TELA
    # COMO VARIAVEIS, INFORMAR PRIMEIRO O TIMEOUT E DEPOIS O ID DO ELEMENTO QUE NAO DEVE EXISTIR EM TELA
    # EXIBE MENSAGEM DE ERRO INFORMANDO O ID QUE EH ENCONTRADO
    def id_not_exists_in_screen(timeout, id)
      fail("Elemento de id '#{id}' encontrado") if $driver.exists(timeout) {$driver.find_element(id: id)} == true
    end

    # TESTE DE ELEMENTOS ENCADEADOS:
    # 1. CHILDREN_TYPE: O TIPO DO ELEMENTO FILHO, QUE EH VALIDADO POR ULTIMO. P.EX: ID, CLASS, TEXT, ETC
    # 2. CHILDREN_ELEMENT: O ELEMENTO FILHO, QUE EH VALIDADO POR ULTIMO. P.EX: dash_board_button
    # 3. FATHER_TYPE: O TIPO DO ELEMENTO PAI, QUE EH VALIDADO PRIMEIRO. P.EX: ID, CLASS, TEXT, ETC
    # 4. CHILDREN_ELEMENT: O ELEMENTO PAI, QUE EH VALIDADO PRIMEIRO. P.EX: dash_board_button
    def test_chain_elements(children_type, children_element, father_type, father_element)
      $driver.find_element("#{children_type}": children_element).find_element("#{father_type}": father_element)
    end


    def swipe_to_find_element_by_id(id, direction_to_swipe, times_to_find_element)
      contador = 0
      element_already_exists = false
      while ( element_already_exists == false )
        $driver.swipe direction: "#{direction_to_swipe}"
        element_already_exists = $driver.exists { $driver.find_element :id, id }
        if ( contador >= times_to_find_element )
          break
        end
        contador = (contador + 1)
      end
      $driver.wait_true(1) { $driver.exists { $driver.find_element :id, id} }
    rescue
      raise "Elemento de id '#{id}' nao encontrado depois de '#{times_to_find_element}' tentativas"
    end

    def clear_element(id)
      $driver.find_element(:id, id).clear
    end

    def touch_element_for_class(class_name)
      $driver.find_element(:class, class_name).click
    end

    def touch_element_for_id(id)
      $driver.find_element(:id, id).click
    end

    def touch_element_for_name(name)
      $driver.find_element(:name, name).click
    end

    def touch_element_for_xpath(xpath)
      $driver.find_element(:xpath, xpath).click
    end

    def catch_id(id)
      $driver.find_element :id, id
    rescue
      raise "Elemento de id '#{id}' nao encontrado"
    end

    def catch_name(name)
      $driver.find_element :name, name
    rescue
      raise "Elemento de name '#{name}' nao encontrado"
    end

    def type_into_text_field_for_id(id, text_to_type)
      @text_to_catch = catch_id id
      @text_to_catch.send_keys text_to_type
    end

    def type_into_text_field_for_name(name, text_to_type)
      @text_to_catch = catch_name name
      @text_to_catch.send_keys text_to_type
    end

    # CHECAR SE ESTE METODO SO FUNCIONA EM DEVICES FISICOS
    # NAO FOI POSIVEL CONCLUIR O TESTE EM SIMULADORES DO IOS
    # def check_app_is_installed(bundleId, timeout)
    #   $driver.wait_true(timeout) { $driver.exists { $driver.app_installed? :bundleId, bundleId } }
    # rescue
    #   raise "Elemento de name '#{bundleId}' nao encontrado"
    # end

    # IMPLEMENTACAO NAO TESTADA DE ARRAYS DE IDS PARA VALIDACAO
    # BY FELIPE SIMOES
    # def wait_for_arrays_of_id(id, timeout)
    #   id.each do |nome_qualquer|
    #     $driver.wait_true(timeout) { $driver.exists { $driver.find_element :id, nome_qualquer } }
    #   end 
    # rescue
    #   raise "Elemento de id '#{id}' nao encontrado"
    # end

    def test_chain_elements(children_type, children_element, father_type, father_element)
      $driver.find_element("#{children_type}": children_element).find_element("#{father_type}": father_element)
    end

end
