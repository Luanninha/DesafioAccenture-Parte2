@tag
Feature: Colocar Elementos em Ordem Crescente

  @tag1
  Scenario: Ordenar elementos
    Given que eu acesse a url de ordem crescente "https://demoqa.com/"
    And escolho a opção "Interactions" na página inicial
    When clico submenu do "Sortable"
    Then utilizo métodos de drag and drop para colocar os elementos na ordem crescente
    And fecho o navegador de ordem crescente