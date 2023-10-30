import org.junit.Test  /** untuk mengimpor anotasi @Test */
import org.junit.Assert.assertEquals  /** untuk mengimport method assertEquals */

class StringConcatenatorTest {  /** membuat class bernama StringConcantenatorTest untuk menguji class StringConcatenator */
    @Test  /** method yang ditandai dengan @Test akan dijalankan sebagai pengujian oleh kerangka pengujian */
    fun testConcatenateStrings(){  /** adalah method pengujian yang dijalankan */
        val concatenator = StringConcatenator()  /** membuat objek concatenator dari class StringConcatenator, ini adalah objek yang akan digunakan untuk menguji method concatenate */
        val result = concatenator.concatenate("Hello, ", "World!")  /** baris ini memanggil method concatenate pada objek concatenator dan hasilnya disimpan dalam variabel result */
        assertEquals("Hello, World!", result)  /** method assertEquals digunakan untuk memeriksa apakah result sama dengan string yang diujikan yaitu "Hello, World!" */
        /** Jika kedua nilai sama, pengujian akan berhasil. Jika tidak, pengujian akan gagal */
    }
}