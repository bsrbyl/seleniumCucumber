

  Feature: US1012 web tablosundaki sutunu yazdirma
@guru @pr2
    Scenario:TC16 kullanici sutun basligi ile liste alabilir


      Given kullanici "guruUrl" anasayfasinda
      And "Company", sutunundaki tum degerleri yazdirir
      Then sayfayi kapatir
