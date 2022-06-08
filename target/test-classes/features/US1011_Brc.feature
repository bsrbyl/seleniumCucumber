
Feature: US1011 bilgilerle site kullanimi
#TEST 1
#
#Hesap olusturun
#
  Scenario Outline: hesap olustur
    Given kullanici "brcUrl" anasayfasinda
    Then Kullanici Login butonuna basar
    And kullnici Create new user butonuna basar
    And  firstName bolumune "<firstName>" yazar
    And kullanici 1 sn bekler
    And lastName bolumune "<lastName>" yazar
    And kullanici 1 sn bekler
    And phoneNumber bolumune "<phoneNumber>" yazar
    And kullanici 3 sn bekler
    And adress bolumune "<address>" yazar
    And kullanici 1 sn bekler
    And zipCode bolumune "<zipCode>" yazar
    And kullanici 1 sn bekler
    And email bolumune "<email>" yazar
    And kullanici 1 sn bekler
    And password bolumune "<password>" yazar
    And kullanici 1 sn bekler
    And passwordConfirm bolumune "<passwordConfirm>" yazar
    And kullanici 1 sn bekler
    And register butonuna basar


    Examples:
      | firstName | lastName | phoneNumber |address    |zipCode    | email         | password | passwordConfirm |
      | ayse      | fatma    | 1234561212  |konya     | 789456    | abc@gmail.com | 12345    | 12345           |

#TEST 2
#
# Test 1 de olusturdugumuz hesapla
# login olalim
#2- Audi Q8 i secip reservasyon yapalim
#3- reservasyon yaptigimizi dogrulayalim
#
#
#TEST 3
#
#Servis Butonunu tiklayip
#Kiraladigimiz araclarin otomatik
#vitesli olup olmadigini kontrol edelim
#
#Test 4
#
#Login olmadan arac kiralamayacagimizi
#test edelim.
#
#1- verileri girelim
#2- continue reservation a tiklayalim
#3- 2 saniye beleyelim ve
#4- continue reservation hala görünür oldugunu test edelim
#
#TEST 5
#
#1- Servis e gidelim
#2- En ucuz arac fiyatinin 12 saatlik dolar oldugunu test edelim
#3- En paha li aracin fiyatinin 3500 $ oldugunu test edelim
#4- En ucuz ve en pahali arcin ekran resmini alalim
#
#TEST 6
#
#1- login olalim
#2- login olduktan sonra profile gideloim ve
# bilgilerin dogru oldugunu kontrol edelim
#3- logout u tiklayip sistemi terk edelim