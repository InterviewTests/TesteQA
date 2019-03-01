require 'appium_lib'
require 'pry'
require 'logger'
require 'httparty'
require 'json'
require 'rest-client'
require 'rspec/expectations'


Before do |scenario|
    $driver.start_driver

    scenario_tags = scenario.source_tag_names
    if scenario_tags.include?('@creating_data')
        steps %{
            Dado que estou na tela inicial do app
                Quando clico em Novo calculo
                    E preencho os dados de calculo
                    E seleciono a opcao de Calcular somente o prazo
                Entao devo ver os prazos exibidos na tela do app
                    E devo conseguir visualizar o meu calculo salvo
        }
    end
end
    
After do |scenario|

    if scenario.passed?
        screenshot_date = Time.now.strftime("%Y-%m-%d_%H-%M-%S")

        unless File.directory?("reports/screenshots/#{scenario.feature.name}_screenshots_#{screenshot_date}") 
            FileUtils.mkdir_p("reports/screenshots/#{scenario.feature.name}_screenshots_#{screenshot_date}")
        end

        time_stamp = Time.now.strftime("%Y-%m-%d_%H.%M.%S")

        screenshot_name = "#{time_stamp}.png"
        screenshot_file = File.join("reports/screenshots/#{scenario.feature.name}_screenshots_#{screenshot_date}", screenshot_name)
        $driver.screenshot(screenshot_file)
        embed("#{screenshot_file}", "image/png")

    else
        screenshot_date = Time.now.strftime("%Y-%m-%d_%H-%M-%S")

        unless File.directory?("reports/screenshots/#{scenario.feature.name}_screenshots_#{screenshot_date}") 
            FileUtils.mkdir_p("reports/screenshots/#{scenario.feature.name}_screenshots_#{screenshot_date}")
        end

        time_stamp = Time.now.strftime("%Y-%m-%d_%H.%M.%S")

        screenshot_name = "#{time_stamp}.png"
        screenshot_file = File.join("reports/screenshots/#{scenario.feature.name}_screenshots_#{screenshot_date}", screenshot_name)
        $driver.screenshot(screenshot_file)
        embed("#{screenshot_file}", "image/png")

    end

    $driver.driver_quit
    

end

at_exit do
    system "reports/report_builder.rb"
end