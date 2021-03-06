# Autor: Luis Farco Oviedo

@stories
Feature: Academy Choucair
  Como usuario quiero registrarme en el sitio utest y realizar automatizaciones en diversos proyectos

  @scenarion1
  Scenario: Registrar en el sitio Utest
    Given Luis quiere registrarse en el sitio Utest

    When  inicia el proceso de registro en Utest
        | strNombre| strApellido | strCorreo            | strIdioma | strDia  | strMes| strAno|strClave      |
        | Luis     | Cuper       | luis002fer@gmail.com | Spanish   |  5      | June  | 1997  |123456789Cuper|

    Then  verifica el proceso final de registro
          | strTitulo                                     |
          | Complete Setup |