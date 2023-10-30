class StringConcatenator {  /** merupakan deklarasi class bernama StringConcatenator */
    fun concatenate(str1: String, str2: String): String {  /** definisikan method concatenate dalam class StringConcatenator */
    /** fun merupakan keyword untuk mendefinisikan sebuah method dalam kotlin */
    /** concatenate merupakan nama method */
    /** (str1: String, str2: String) merupakan parameter yang diterima oleh method, keduanya memiliki tipe data string dan diharapkan hasil kembalian berupa string */
        return str1 + str2  /** merupakan isi dari method concatenate, mengambil dua string dan menggabungkannya dengan operator +,
        hasilnya adalah penggabungan dari kedua string */
    }
}