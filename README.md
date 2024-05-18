### Deskripsi ###
Proyek ini merupakan bagian dari Praktikum Mata Kuliah Pengujian Perangkat Lunak yang bertujuan untuk mempelajari Web Testing dengan pendekatan otomatisasi menggunakan library Cucumber dan Selenium pada aplikasi website Swag Labs https://www.saucedemo.com/ .

Tujuan
- Memahami konsep BDD
- Memahami konsep pengujian website secara otomatis
- Memahami penggunaan library selenium dan cucumber, termasuk feature file, step definition, runner test, dan page object model

### Build with / Teknologi ###
Proyek pengujian Web otomatis ini dibangun dengan melibatkan dua library:
- Cucumber
- Selenium

### Prerequisite ###
Untuk menjalankan proyek pengujian ini, diperlukan beberapa equipment sebagai persiapan environment proyek :
- Bahasa pemrograman : JDK versi 11
- Build Tool : Apache Maven
- Web Browser : Microsoft Edge Version 124.0.2478.97
- IDE : Intellij IDEA

### Konfigurasi ### 
Proses konfigurasi project menggunakan build automation pada file pom.xml. Semua dependency yang dibutuhkan ditambahkan di dalam dependencies, seperti: 
1. Dependency untuk menulis step definitions dalam bahasa Java 
    ```
      <dependency>
          <groupId>io.cucumber</groupId>
          <artifactId>cucumber-java</artifactId>
          <version>7.17.0</version>
          <scope>test</scope>
      </dependency>
    ```
    
2. Dependency untuk menjalankan skenario Cucumber dengan JUnit
    ```
    <dependency>
          <groupId>io.cucumber</groupId>
          <artifactId>cucumber-junit</artifactId>
          <version>7.17.0</version>
          <scope>test</scope>
    </dependency>
    ```

3. Dependency untuk mengotomatisasi dalam berinteraksi dengan browser
    ```
    <dependency>
          <groupId>org.seleniumhq.selenium</groupId>
          <artifactId>selenium-java</artifactId>
          <version>4.20.0</version>
    </dependency>
    ```

4. Dependency untuk mengotomatisasi pengujian di browser Microsoft Edge
    ```
     <dependency>
          <groupId>org.seleniumhq.selenium</groupId>
          <artifactId>selenium-edge-driver</artifactId>
          <version>4.20.0</version>
    </dependency>
    ```

### How to Run ###
Untuk melakukan eksekusi pengujian web otomatis ini, terdapat dua cara yang dapat dilakukan yaitu menggunakan terminal dan Class Test Runner. 

#### Terminal ####
Langkah-langkah melakukan proses eksekusi web testing menggunakan terminal : 
1. Pastikan terminal berada dalam direktori `/B4-WebAutomatedTest`
2. Ketik perintah berikut dalam terminal untuk menjalankan program:
    ```
    mvn test
    ```

#### Class Test Runner  ####
Untuk melakukan proses eksekusi API testing melalui class Test Runner cukup dengan melakukan running test dengan menekan icon run pada class file `src/test/java/CucumberTestRunner.java` yang ada pada IDE. 

![WhatsApp Image 2024-05-18 at 20 54 22](https://github.com/aininurulazizah/B4-WebAutomatedTest/assets/95161912/bcc86bf5-3725-470b-8c46-caf5689caaff)

### Persiapan data ###
Sebelum melakukan eksekusi program dan menjalankan test case, data test perlu dipersiapkan terlebih dahulu, seperti: 
1. Username valid (standard_user) dan username invalid 
2. Password valid (secret_sauce) dan password invalid

### Fitur software under test ###
Pengujian dilakukan pada aplikasi website Swag Labs https://www.saucedemo.com/ untuk pengujian : 
- Login 
- Logout

### Test case ###
Pada proyek ini, dibuat delapan skenario pengujian otomatis untuk fitur login dan logout berdasarkan test case yang telah dibuat sebelumnya, yaitu tujuh skenario pengujian untuk fitur login dan satu skenario pengujian untuk fitur logout. Rincian skenario pengujian tersebut adalah sebagai berikut:
1. Login 
   - Skenario login berhasil dengan username dan password valid 
   - Skenario login gagal dengan username valid namun password invalid (tidak terdaftar) 
   - Skenario login gagal dengan username invalid (tidak terdaftar) namun password valid 
   - Skenario login gagal dengan username dan password invalid (tidak terdaftar) 
   - Skenario login gagal dengan username valid namun password tidak diisi 
   - Skenario login gagal dengan username tidak diisi namun password valid 
   - Skenario login gagal dengan username dan password tidak diisi 

2. Logout 
   - Skenario logout berhasil 

Untuk lebih lengkapnya seluruh test case dapat dilihat pada [Test Cases Design](https://docs.google.com/spreadsheets/d/1EFZ4QCp-1uzH-Zub0y9JuZR-RrZTreOi/edit?usp=drive_link&ouid=102578719204334952162&rtpof=true&sd=true)

### Author ###
1. Aini Nurul Azizah (211524034)
2. Amelia Nathasa (211524036)
3. Nayara Saffa (211524052)

D4 - Teknik Informatika '21

### Referensi ###
- [Cucumber](https://cucumber.io/docs/cucumber/)
- [Cucumber Guides](https://cucumber.io/docs/guides/)
- [Cucumber Course](https://school.cucumber.io/ )
- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [Selenium Guide](https://www.browserstack.com/guide/selenium-with-java-for-automated-test)

