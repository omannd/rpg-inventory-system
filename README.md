# RPG Inventory System (Java OOP)

Bu proje, Nesne Yönelimli Programlamada (OOP) sınıflar arası **Kompozisyon (Composition - "Has-A")** ilişkisini göstermek amacıyla geliştirilmiş bir oyun mekaniği simülasyonudur. Sistem, alt sınıflar türetmek (Inheritance) yerine, bağımsız modüllerin birleştirilerek kompleks yapıların inşa edilmesini temel alır.

## Mimari ve İş Mantığı

* **Composition (Kompozisyon):** `Player` sınıfı, diğer sınıflardan miras almak yerine `Weapon` ve `Armor` nesnelerini kendi içinde birer değişken (component) olarak barındırır. Bu yapı, oyun motorlarındaki (Örn: Godot, Unity) "Node/Component" tabanlı modüler mimarinin kod seviyesindeki karşılığıdır.
* **Encapsulation (Kapsülleme):** Silah hasarları ve zırh savunma puanları `private` olarak tanımlanmış, sisteme dışarıdan yetkisiz müdahale engellenmiştir. Güvenli veri okuma için Null check (NPE koruması) uygulanmıştır.
* **Modülerlik:** Yeni eşya tipleri (Örn: `Potion`, `Accessory`) mevcut karakter sınıfını veya hiyerarşiyi bozmadan sisteme kolayca entegre edilebilir.

## Kullanılan Teknolojiler
* Java (Composition, Encapsulation, Object-Oriented Design)
