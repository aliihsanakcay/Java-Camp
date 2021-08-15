# MACERA OYUNU 

Metin tabanlı bir macera oyunu yapıyoruz. 

## KARAKTERLER 

| Karakter | ID  | Hasar | Sağlık | Para | 
|:---:|:---:|:---:|:---:|:---:| 
| Samuray  | 1   | 5     |  21    | 15   | 
| Okçu  | 2 | 7 | 18 | 20 | 
| Şövalye | 3| 8 | 24 | 5 |

## CANAVARLAR 

| Canavar | ID | Hasar | Sağlık | Para | 
|:---:|:---:|:---:|:---:|:---:|
| Zombi | 1 | 3 | 10 | 4 | 
| Vampir | 2 | 4 | 14 | 7 | 
| Ayı | 3 | 7 | 20 | 12 | 
| Yılan | 4 | 3-6 (Randomly) | 12 | 0 | 

## SİLAHLAR 

| Silah | ID | Hasar | Para | 
|:---:|:---:|:---:|:---:| 
| Tabanca | 1 | 2 | 25 | 
| Kılıç | 2 | 3 | 35 |
| Tüfek | 3 | 7 | 45 | 

## ZIRHLAR 

| Zırh | ID | Engelleme | Para | 
|:---:|:---:|:---:|:---:| 
| Hafif | 1 | 1 | 15 | 
| Orta | 2 | 3 | 25 | 
| Ağır | 3 | 5 | 40 | 

## MEKANLAR 

- Güvenli Ev 
    - Özellik : Can yenileniyor. 
- Mağara 
    - Canavar : Zombi (1-3 Adet) 
    - Özellik : Savaş + Ganimet 
    - Eşya : Yemek (Food) 
- Orman 
    - Canavar : Vampir (1-3 Adet) 
    - Özellik : Savaş + Ganimet 
    - Eşya : Odun (Firewood) 
- Nehir 
    - Canavar : Ayı (1-3 Adet) 
    - Özellik : Savaş + Ganimet 
    - Eşya : Su (Water) 
- Maden 
    - Canavar : Yılan (1-5 Adet) 
    - Özellik : Savaş ve Ganimet 
    - Para, Silah veya Zırh (Randomly) 
- Mağaza 
    - Özellik : Destekleyici eşyalar satın almak 
    - Silah : Tabanca, Kılıç, Tüfek 
    - Zırh : Hafif, Orta, Ağır 


## OYUNUN ŞARTLARI 

- Oyunu bitirebilmek için savaş bölgelerindeki tüm düşmanlar temizlendikten sonra bölgeye özel ödülü oyunucun envanterine eklenmelidir. Eğer oyuncu tüm ödülleri toplayıp "Güvenli Eve" dönebilirse oyunu kazanır. Ayrıca ödül kazanılan bölgeye tekrar giriş yapılamaz. 
- Ödül alsa da almasa da **sadece** Maden bölgesine istediği kadar giriş ve çıkış yapabilir. 

    - Mağara => Yemek (Food) 
    - Orman => Odun (Firewood) 
    - Nehir => Su (Water) 
    - Maden => Bu bölgenin amacı yenilen rakiplerden rastgele para, silah veya zırh kazanma ihtimali olması. Bu ihtimaller : 
        - Silah Kazanma İhtimali => 15% 
            - Tüfek Kazanma İhtimali : 20% 
            - Kılıç Kazanma İhtimali : 30% 
            - Tabanca Kazanma İhtimali : 50% 
        - Zırh Kazanma İhtimali : 15% 
            - Ağır Zırh Kazanma İhtimali : 20% 
            - Orta Zırh Kazanma İhtimali : 30% 
            - Hafif Zırh Kazanma İhtimali : 50% 
        - Para Kazanma İhtimali : 25% 
            - 10 Para Kazanma İhtimali: 20% 
            - 5 Para Kazanma İhtimali: 30% 
            - 1 Para Kazanma İhtimali: 50% 
        - Hiç birşey kazanamama ihtimali : 45% 
    
-  Oyuncu bir canavarla karşılaştığında ilk hamleyi kimin yapacağını, %50 şans ile belirlenmelidir. 