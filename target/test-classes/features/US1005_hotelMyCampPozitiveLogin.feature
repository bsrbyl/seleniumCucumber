Feature: US1005 dogru kullanici adi ve sifre ile girisyapilabilmeli

@hmc
  Scenario: TC08 positive login test test
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And  sayfayi kapatir