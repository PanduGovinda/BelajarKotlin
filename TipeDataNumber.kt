fun main() {
    //BASIC SYNTAX PENGGUNAAN NUMBER DATA TYPE 
    // Code untuk coba-coba tipe data number di kotlin
    var cobaInt: Int = 200
    println(cobaInt)

    //ATURAN DASAR TIPE DATA NUMBER
    //code untuk coba convert biner langsung ke int
    var apalah: Int = 0b01110 // 0b code untuk menandakan kalo bilangan yang ditulis berbentuk biner ada juga 0x untuk bilangan hexadecimal
    println(apalah)
    //dalam penggunaan float perlu adanya tambahan berupa akhiran "F" pada bilangan agar tidak terbaca sebagai Double
    var cobaFloat: Float = 12.10F
    println(cobaFloat)
    //dalam penggunaan double lebih flexibel karena tidak perlu menggunakan akhiran tambahan
    var cobaDouble: Double = 123.22222
    println(cobaDouble)
    //penggunaan akhiran juga digunakan dalam tipe data long yang berakhiran "L"
    var cobaLong: Long = 1200000000L


    //SYNTAX KONVERSI TIPE DATA NUMBER
    var pecahan: Float = 123.34F
    var pembulatan: Int = pecahan.toInt()
    println(pembulatan)
    //sedikit catatan hati-hati adanya overflow dari perubahan data type yang dikarenakan perbedaan panjang/limit ukuran bilangan yang dapat di tampung 

    //SYNTAX TAMBAHAN
    var cobaUnderscore: Long = 12_000_000L //bilangan dapat diberikan underscore yang tidak akan berpengaruh kepada nilai, namun bisa mempermudah dalam membaca bilangan
    println(cobaUnderscore)
}