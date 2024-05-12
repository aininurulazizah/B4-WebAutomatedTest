Feature: Login Feature

  Scenario: Login berhasil dengan username dan password valid
    Given User sudah berada di halaman login page pada browser
    When User memasukkan valid username & password
    And User mengklik button Login
    Then User dinavigasikan ke halaman Dashboard

  Scenario: Login gagal dengan username valid namun password tidak terdaftar
    Given User sudah berada di halaman login page pada browser
    When User memasukkan valid username & invalid password
    And User mengklik button Login
    Then User mendapat pesan gagal login
