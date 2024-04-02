package com.example.deneme
import kotlin.math.max

fun main(){

    //https://kotlinlang.org/docs/collections-overview.html#collection-types

    //https://kotlinlang.org/docs/functions.html#single-expression-functions

    //https://halil-ozcan.medium.com/kotlin-collections-koleksiyonlar-i-85bb06c43979

    //https://kotlinlang.org/docs/classes.html

    //Advanced control structures: loops and when expressions
    //Defining and calling functions
    // Default and named arguments, vararg parameters
    //Lambdas and higher-order functions
    //Lists, sets, and maps
    //Collection operations: filtering, mapping, sorting
    //Exception handling and try-catch blocks

    // !!!!! Control Structures

    // Advanced control structures: loops and when expressions

    var x = 2
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    // when matches its argument against all branches sequentially until some branch condition is satisfied.

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        is Int -> println("x == 0 or x == 1") // you can check the value is particular type
        else -> println("otherwise")
    }

    // You can also check a value for being in or !in a range or a collection:

    when (x) {
        in 1..10 -> println("x is in the range")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    // For loops

    val collection = listOf<String>("a","b", "c") // türünü string olarak belirtmek neyi değiştirir?


    for (x in collection) println(x)

    for (i in 1..3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    collection.forEach { number ->
        println(number)
    }


    var y = 5

    while (y > 0) {

        //if (y==2) continue
        y--
        println(y) // satırı yukarı taşısak ne değişir?
        //if (y == 3) break
    }


    val myList = listOf(1, 2, 3, 4, 5)

    myList.forEach {
        if (it == 3) return
        print(it)
    }

    //  Collections

    //Liste, öğelere konumlarını yansıtan tamsayı sayıları olan indekslere göre erişim sağlayan sıralı bir koleksiyondur.
    // Bir listede öğeler birden fazla kez bulunabilir. Listeye örnek olarak bir telefon numarası verilebilir: bu bir rakam grubudur, sıraları önemlidir ve tekrarlanabilirler.

    // Set benzersiz öğelerden oluşan bir koleksiyondur. Kümenin matematiksel soyutlamasını yansıtır: tekrarı olmayan bir grup nesne.
    // Genellikle set elemanlarının sırasının bir önemi yoktur.

    //Map ( veya Dictionary ) bir anahtar/değer çiftleri kümesidir. Anahtarlar benzersizdir ve her biri tam olarak tek bir değerle eşleşir.
    // Değerler yinelenen olabilir. Haritalar, örneğin bir çalışanın kimliği ve konumu gibi nesneler arasındaki mantıksal bağlantıları depolamak için kullanışlıdır.

    val numbersNew = mutableListOf("one", "two", "three", "four")
    numbersNew.add("five")
    println(numbersNew)

    val stringList = listOf("one", "two", "one")
    // stringList.add yapamayız çünkü mutable değil, arraylist olsaydı yapabilirdik mutable mantığıyla çalıştığı için

    // Liste öğeleri (boş değerler dahil) çoğaltılabilir: bir liste, herhangi bir sayıda eşit nesneyi veya tek bir nesnenin oluşumunu içerebilir.
    // İki liste aynı boyutlara ve aynı konumlarda yapısal olarak eşit öğelere sahipse eşit kabul edilir .

    val deg = 0

    //val list1 = listOf(0,1,2)
    //val list2 = listOf(deg,1,2)
    //if (list1 == list2)


    //Set

    val numbersSet = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbersSet.size}")
    if (numbersSet.contains(1)) println("1 is in the set")

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbersSet == numbersBackwards}")


    //Map
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous

    // Pair "key4" to 1 gibi
    val myPair = Pair("b",5)
    val hashMapNums = hashMapOf<String,Int>(Pair("a",2),myPair)


    // Sırası önemsiz mapler eşittir
    val numbersMapN = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

    println("The maps are equal: ${numbersMapN == anotherMap}")

    // MutableMap is a Map with map write operations, for example,
    // you can add a new key-value pair or update the value associated with the given key.

    val numbersMapp = mutableMapOf("one" to 1, "two" to 2)
    numbersMapp.put("three", 3)
    numbersMapp["one"] = 11 // diğer atama yolu

    println(numbersMapp)


    // filtreleme işlemi
    val numberss = listOf("one", "two", "three", "four")
    numberss.filter { it.length > 3 }
    val longerThan3 = numberss.filter { it.length > 3 }
    println(longerThan3)

    //sorting
    val numbersSort = listOf(4, 2, 8, 1, 5)

    val sortedNumbers = numbersSort.sorted()
    println("Sorted numbers: $sortedNumbers")

    val descendingNumbers = numbersSort.sortedDescending()
    println("Descending numbers: $descendingNumbers")

    /*val people = listOf(
        Person("John", 1),
        Person("Doe", 2),
        Person("Mary",3)
    )
     // Sorting people by position in ascending order
    val sortedPeople = people.sortedBy { it.position }
    println("Sorted by position: $sortedPeople")

     */

    //!!!
    class Book(val title: String, val author: String, val publicationYear: Int)

    val books = listOf(
        Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
        Book("To Kill a Mockingbird", "Harper Lee", 1960),
        Book("1984", "George Orwell", 1949),
        Book("The Catcher in the Rye", "J.D. Salinger", 1951)
    )

    // Sorting books by publication year in ascending order using sortWith and a custom comparator
    val sortedBooks = books.sortedWith(compareBy { it.publicationYear })
    println("Books sorted by publication year: $sortedBooks")


    // Defining and calling functions

    // Fonksiyon, belirli sayıda verileri kullanarak bunları işleyen ve bir sonuç üreten komut grubudur.

    // Kotlin functions are declared using the fun keyword:


    fun double(x: Int): Int {
        return 2 * x
    }

    // Functions are called using the standard approach:
    double(2)

    // parameters: Function parameters are defined using Pascal notation -
    // name: type. Parameters are separated using commas, and each parameter must be explicitly typed

    fun powerOf(number: Int, exponent: Int): Int { return 0}



    // Function parameters can have default values, which are used when you skip the corresponding argument.
    fun read(
        b: ByteArray,
        off: Int = 0,
        len: Int = b.size,
    ) { /*...*/ }

    max(1,2)

    //Overloading functions

    fun newFun(a: Int):String{
        return (a*a).toString()
    }

    val doubleNum = 4.5

    fun newFun(a: Int, b: Int):String{
        return (a*b).toString()
    }

    fun newFun(a: Double):String{
        return (a*a).toString()
    }


    newFun(4)
    newFun(4,5)
    newFun(doubleNum)


    // Default and named arguments, vararg parameters


    // When calling this function, you don't have to name all its arguments:
    fun reformat(
        str: String,
        normalizeCase: Boolean = true,
        upperCaseFirstLetter: Boolean = true,
        divideByCamelHumps: Boolean = false,
        wordSeparator: Char = ' ',
    ) { /*...*/ }

    reformat("String value here") // diğerlerinin default değeri var
    reformat("String value here", false)
    reformat("String value here", false, false)

    // Kotlin allows functions to be defined such that they would accept a variable number of arguments.
    // Hence this feature is called varargs. Varargs allow users to pass in a comma-separated list of arguments,
    // which the compiler will automatically wrap into an array.


    //Bazı durumlarda fonksiyonda değişken sayıda parametreye ihtiyaç duyulacak.
    // Kotlin değişken sayıda argument içeren bir yapıya izin vermektedir.
    // Aslında tek parametre alıyor gibi gözükürken, içeride birden fazla parametre alabilir.
    // Parametre isminin önüne vararg modifier’ı getirilerek yapılır.
    // Birden fazla vararg parametre tanımlanamaz

    fun foo(vararg strings: String) { /*...*/ }

    foo(strings = arrayOf("a", "b", "c"))

    val numbers = intArrayOf(1, 2, 3)
    printNumbers(10, 20, *numbers, 30, 40) // vararg parametresi olarak arrayOf kullanılmak istenirse * operatörü (spread) eklenmelidir.




    //Unit returning functions
    fun printHello(name: String?): Unit {
        if (name != null)
            println("Hello $name")
        else
            println("Hi there!")
        // `return Unit` or `return` is optional
    }

    // Unit return type is also optional
    fun printHelloNew(name: String?) { println(name) }

    //Single expression functions
    fun doubleL(x: Int): Int = x * 2 // return type is optional

    // Class Nedir temel olarak değinmek gerekiyor.
    // Sınıf (Class) : Sınıflar nesne yönelimli (object oriented) programlamanın en önemli öğesidir.
    // Sınıflar sayesinde programlar parçalara bölünür ve karmaşıklığı azalır.
    // Yaratılan metodlar ve özellikler bir sınıfın içerisinde yer alır ve bir sınıf defalarca kullanılabilir.
    // Bir sınıfta hem fonsiyonlar hem de veriler aynı anda birbiriyle sıkı bir şekilde bağlı olarak bulunurlar.
    // Bir sınıf kendisinde oluşturulacak nesneler için bir takım üyeler içermelidir.
    // Bu üyeler; alanlar (fields), metodlar (methods), yapıcılar (constructor), özellikler (properties), olaylar (events), delegeler (delegates), vb...dir.
    // Sınıf nesneler için bir şablon görevi görmektedir. Yani sınıf nesnelerin durumları ile ilgili işlemleri ve özellikleri tanımlar.
    // Ortak özelliklere sahip nesnelere ait veri ve yordamlar bir sınıfın içinde toplanır.

    //Kotlin Fonksiyonların Scope'u

    // Local Fonksiyon
    // Kotlin’de bir fonksiyon içinde başka bir fonksiyon tanımlanabilir. Buna local fonksiyon denir.
    // Local fonksiyonlar kodların yeniden kullanması istendiğinde ancak member (üye) fonksiyon yapılmak istenmediği durumda kullanılabilir.
    // Çünkü yalnızca bir fonksiyondan çağrılacaktır. Local fonksiyonlar class’lardaki member fonksiyon sayısının azaltılmasına ve kodu yeniden kullanmaya yardımcı olur.

    // Public ve private visibility modifier’larının kullanımına local fonksiyonlarda izin verilmez.

    // Member Fonksiyon
    // Bir class’a ait olan fonksiyonlara member (üye) fonksiyon denir.
    // ornek asağıda

    //Extension Fonksiyon
    //Bir class’a yeni bir fonksiyon tanımlamayı sağlayan yapılara extension fonksiyon denir.
    // Örneğin değiştiremeyeceğiniz bir class için yeni bir fonksiyon yazabilirsiniz.
    // Bu tip fonksiyonlar orijinal class’ın methodu gibi olağan bir şekilde çağrılabilir.
    // Class ismine ise receiver type denir. Extension fonksiyon oluşturabilmek için bir receiver type’a ihtiyacımız olacak.
    //This keyword’u ise receiver type’ı referans verir. Verdiğimiz örnekte receiver type String class’ı.

    fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)
    "string".removeFirstLastChar()

    val str = "string"
    val str2 = str.removeFirstLastChar()

    println("str: ${str.removeFirstLastChar()}")
    println("str: $str2")


    //Infix Fonksiyonlar

    // Infix keywordu ile başlayan fonksiyonlar kodun daha okunaklı olması için kullanılır.
    // Fonksiyonu çağırırken nokta ve parantezleri kullanmadan çağırmayı sağlar.

    // Bir fonksiyonun infix fonksiyon olabilmesi için aşağıdaki şartları sağlaması gerekmektedir.
    // Bir üye fonksiyon (bir sınıfa ait bir fonksiyon) veya extension fonksiyon olmalıdır.
    // Sadece bir parametre almalıdır.
    // Bu parametre vararg veya default value olamaz.

    infix fun Int.multiply(param : Int):Int { return (this * param) }



    println("multiplier result: ${4 multiply 3}")

    //Lambdas and higher-order functions

    //Higher-Order fonksiyonlar, bir fonksiyonu parametre olarak alan veya bir fonksiyonu bir çıktı olarak döndüren fonksiyonlardır.
    // Bu fonksiyonlar, kodu daha anlaşılır ve güçlü bir şekilde yazmamıza izin verir.
    // Ayrıca, bu fonksiyonlar, daha önce yazılmış kodu çalıştırmak veya daha önce yazılmış kodu özelleştirmek için kullanılır.

    fun performCalculation(start: Int, end: Int, calculation: (Int) -> Int): List<Int> {
        val result = arrayListOf<Int>()
        for (i in start..end) {
            result.add(calculation(i))
        }
        return result
    }

    fun square(number: Int): Int{
        return (number * number)
    }

    val squaredNumbers = performCalculation(1, 5,::square)

    println(squaredNumbers)

    //Lambda ifadeleri, sadeleştirilmiş isimsiz fonksiyonlardır.
    // Bu ifadeleri kullanarak istenilen sayıda parametre geçilebilen ve değer döndüren isimsiz yerel fonksiyonlar oluşturabilirsiniz.
    // Bu ifadeler genellikle basit işlemleri bildirmekte kullanılır.

    //val variableName: (parameters) -> returnType = { arguments -> code }

    //variableName: Lambda ifadesine referans olacak olan değişkendir. Kotlin dili bize bu ifadeyi değişkene atayabilmemize olanak sağlar.

    //paramaters -> returnType: Parametreler parantez içine arasında virgül olacak şekilde yazılır. Ardından ‘->’ işareti eklenir ve fonksiyonun dönüş tipi yazılır.

    //{ arguments -> code }: Lambda ifadesinin gövde kısmıdır. Argümanlar virgül ile birbirinden ayrılır ve ‘code’ kısmı bu fonksiyonu çağırdığımızda çalışan kısımdır.

    val sum: (Int, Int) -> Int = { a, b -> a + b }
    val answer= sum(2,3) // Output: 5

    val greet: (String) -> Unit = { name -> println("Merhaba, $name!") }
    greet("Ertan")  // Output: Merhaba, Ertan!

    // Exception Handling

    try {
        // some code
    } catch (e: Exception) {
        // handler
    } finally {
        // optional finally block
    }

    val a: Int? = try {
        "6".toInt()
    } catch (e: NumberFormatException) {
        e.message

        null
    }



    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message) // exceptionu kendimiz de atabiliriz
    }


}

fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println("number: $number") }
}



class MyClass {

    private val classVariable : String = ""

    //protected fun a(a: Int): String = "here return string"
    //Protected: Sadece tanımlandığı sınıfta ya da o sınıfı miras alan sınıflardan erişilebilir.
    //yorum satırından çıkartıp gösterilebilir

    infix fun Int.multiplyOut(param : Int):Int { return (this * param) }

    fun a(){
        4 multiplyOut 5
    }

    fun publicFun(): String{
        return privateFun()
    }

    private fun privateFun():String {
        return "d"
    }

}