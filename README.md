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

Untuk lebih lengkapnya seluruh test case dapat dilihat pada [Test Cases Design] (https://docs.google.com/spreadsheets/d/1EFZ4QCp-1uzH-Zub0y9JuZR-RrZTreOi/edit?usp=drive_link&ouid=102578719204334952162&rtpof=true&sd=true)



