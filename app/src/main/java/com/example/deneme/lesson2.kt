package com.example.deneme

/*
    💡 Kaynaklar:
    Telefon ekranini bilgisayara yansitma --> https://scrcpy.org/
    Kotlin Playground --> https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS45LjIyIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLyoqXG4gKiBZb3UgY2FuIGVkaXQsIHJ1biwgYW5kIHNoYXJlIHRoaXMgY29kZS5cbiAqIHBsYXkua290bGlubGFuZy5vcmdcbiAqL1xuZnVuIG1haW4oKSB7XG4gICAgdmFsIHNpbXBsZUFycmF5ID0gYXJyYXlPZigxLCAyLCAzKVxuICAgIHNpbXBsZUFycmF5LnBsdXMoNClcbiAgICBcbiAgICBwcmludGxuKHNpbXBsZUFycmF5LmNvbnRlbnRUb1N0cmluZygpKVxufSJ9
    Android Doc --> https://developer.android.com
    Kotlin Doc --> https://kotlinlang.org/


    ✔️ Comment(Yorum satiri) Olusturma :
    Tek satir icin --> //
    Coklu yorum satiri icin --> /* */

 */

fun main() {

    // ***************************** VARIABLES AND DATA TYPES *****************************

    /*
        Kotlinde degisken tanimlamak "var" ya da "val" keyword`leri kullanilmaktadir.

        var --> variable/deger sonradan degistirebilir.
        val --> value/deger sonradan degistirilemez.

        mutable? immutable? readonly? keywords

     */

    var age:Int = 24
    val name:String = "Tugce"

    age = 12
    //name = "Merve"

    println(age)
    println(name)
    println("Age: $age Name: $name")

    /*
        Tip vermeden de degisken tanimlanabilmektedir. Kotlinde tip belirtilmese bile Ide tarafindan o degiskenin tipi otomatik
        olarak cikartilabilmektedir. Buna "Type Inference" yani "Tip Cikarimi" denmektedir.
        Kotlin dili Type Inference`i destekleyen bir dildir.
     */

    var age2 = 24
    val name2 = "Ahmet"
    val myDouble = 2.3

    // Type Inference sayesinde tip cikarimi yapilabiliyorsa ne zaman tip belirtilmeli? 🤔
    // Degisken olusturulurken ilk deger atamasi yapilmayacaksa degiskenin tipi belirtilmelidir.

    val surname:String
    surname = "Aras"

    // val surname --> seklinde tanimlamaya izin vermez.

    /*
        Data Types :
        1) Nullable Veri tipleri
        2) Sayisal veri tipleri icin --> Byte, Short, Int, Long, Float, Double
        3) Karakter veri tipleri icin --> Char
        4) Mantiksal veri tipleri icin (true/false) --> Boolean
        5) Metinsel veri tipleri icin --> String
        6) Arrays

     */


    /*
        1) Nullable Veri Tipleri
           Bir degiskene null atamasi yapabilmek icin degisken tipinin sonuna "?" konulur.

     */

    var color: String? = null // Bu durumda color degiskenine, String ya da null bir deger alabilir demis oluyoruz.
    var price:Int? = null

    // val color2: String = null  --> izin vermez. Kotlin null safety`i saglamaktadir. 🎉

    // Elimizde nullable degisken/degiskenler varsa biz bunlar uzerinde bir islem yapacaksak: ya "!!" halini ya da "?." halini kullanmaliyiz.

    var number1:Int? = 1
    number1!!.plus(12)  // --> Degiskenin degerinin kesinlikle null olmadigini soyler
    number1?.plus(22)   // --> Deger null da olabilir olmayadabilir. Gelecek olan degere gore islem yapar.

    /*
        2) Sayisal Veri Tipleri
            Byte
            Short
            Int
            Long

            Ondalikli Sayilar :
            Float
            Double

        NOT: Tip cikarimi (Type inference) sirasinda degiskenin tipi belirtilmediyse ve degeri Int`in deger araligindaysa otomatik
        olarak degisken tipini Ide Int olarak alir. Deger Int araliginda degilse/ daha buyukse o zaman tipini Long olarak alir.

     */

    val myNumber = 5
    val myNumber2 = 10000000000

    /*
        Long kullaniminda --> sayinin sonuna "L" harfi konulur. (Neden kucuk l yok? 🤔)
        Float kullaniminda --> sayinin sonuna "F" ya da "f" koyulur.
        Double kullaniminda --> "." li gosterim
     */

    val intNumber = 12
    val longNumber = 12L
    val floatNumber = 12f
    val floatNumber2 = 12.2F
    val doubleNumber = 12.2


    /*
        3) Char Veri Tipleri
           Tek tirnak isareti kullanilarak tanimlama yapilir. Icerisine sadece tek bir karakter alir. Nullable deger alabilmekte.
     */

    val charValue:Char = 'T'
//     val charValue1: Char = "T"
//     val charValue2: Char = 'Tugce'
//     val charValue3 : Char = 'Tu'

    val myCharNumber:Char = '6'
    //val myCharNumber2:Char = '62'

    val nullableChar: Char? = null


    /*
        4) Boolean Veri Tipleri
           true ya da false degerini alir. 0 ya da 1 Boolean olarak kullanilmamakta.
           Nullable deger alabilmekte.

     */

    val isCat : Boolean = true
    val isDog : Boolean = false
    var isStudent : Boolean? = null


//     val isBoolean1 : Boolean = 0
//     val isBoolean2 : Boolean = 1

    /*

    NOT: Boolean ifadelerle kullanilan mantik operatorleri bulunmaktadir. Bunlar:

         || --> (or) veya operatoru
         && --> (and) ve operatoru
         !  --> (not) degil operatoru (Bir durumun tersini ifade eder.)

         Voleybol maci ornegi :)  (Uzun boy - siyah sac)
         true  && true   --> true
         true  && false  --> false
         false && false  --> false
         false && true   --> false

         Iki durumdan birinin dogru olmasi "veya" operatorunde yeterlidir.
         true  || true   --> true
         true  || false  --> true
         false || false  --> false
         false || true   --> true

     */

    if(isCat){

    }else{

    }

    if(isCat && isDog){

    }

    if (isCat and isDog){

    }

    if (isCat.and(isDog)){

    }

    if(isCat || isDog){

    }else{}

    if (isCat or isDog){

    }

    if (isCat.or(isDog)){

    }

    if (isCat.not()){

    }

    if (!isCat){

    }else{}

    /*
        NOT: Boolean ifadelerin true olup olmadigini kontrol ettirmek icin "==" kullanmaya gerek yoktur.
        Deger true ise suslu parantezler icine girerek ilgili islemi gerceklestirir.

        "==" ne zaman kullanilir peki? 🤔
     */

    if (isStudent == false){

    }


    /*
        5) Metinsel Veri Tipleri (String)
           Cift tirnak icerisinde gosterilir.
     */

//                 0-1-2-3-4-5
    val cityName = "Yalova"

    // index araligini getirir
    val getIndices = cityName.indices
    println("getIndices: $getIndices")

    // String deki tum index araliginin ilk basta alip ilk karakterin indeksini dondurur
    val firstCharOfCityName = cityName.indices.first
    println("First Char Index: $firstCharOfCityName")

    // Direkt ilk karakter alinir
    val firstCharOfCityName2 = cityName.first()
    println("First Char : $firstCharOfCityName2")

    // Direkt son karakter alinir
    val lastIndex3 = cityName.last()
    println("Last Char: $lastIndex3")

    // TUm indeks araligi ilk basta alinir. Sonra en son indeks degeri dondurulur.
    val lastIndex= cityName.indices.last
    println("Last Char Index1: $lastIndex")

    // Direkt string deki en son indeks dondurulur
    val lastIndex2 = cityName.lastIndex
    println("Last Char Index2: $lastIndex2")

    val charOfCityName1 = cityName[3]
    val charOfCityName2 = cityName[1]
    println("charOfCityName1 : $charOfCityName1")
    println("charOfCityName2 : $charOfCityName2")

    // Karakterin kacinci indeks`te oldugunu bulma
    val getCharIndex = cityName.indexOf('a')
    println("getCharIndex : $getCharIndex")

    // String icerisinde ("") degiskenimin ozelligini kullanmak istiyorsam:
    println("City length: ${cityName.length}")
    println("City length: $cityName")


    /*
        6) Arrays

        Belli sayida, belirttigimiz tipte ya da herhangi bir tipte veri tutan yapilardir.

        Temelde 2 sekilde olusturabilmekteyiz array`i :
        "arrayOf()" fonksiyonu ile ya da "Array" sinifini kullanarak

        arrayOf(), arrayOf<Any>() --> Ayni ya da farkli tipte veriler verilebilmektedir.

        Any: Tum tiplerin (String, Int, Double,..) uzerinde bulunan sinif. Herhangi bir veri tipini alabilir.
        (Any`i diger tiplerin annesi/babasi gibi dusunebilirsiniz :) )

        arrayOfNulls<type>(size) --> Belirtilen size kadar null icerir.
        emptyArray() --> Bos array olusturur.
     */


    val myStringArray1 = arrayOf("cat","dog","horse",3)

    val myStringArray2 = arrayOf<String>("Black","Blue","Yellow","Purple")

    val myArray = arrayOf(1,2,3,4,5)

    val myArray2 = arrayOf(1,2,3,4,"jjj",'y',4.5)

    val myArray3 = arrayOf<Any>(1,2,'t',"hello")

    val myDoubleArray = arrayOf<Double>(3.12,4.2,6.87,4.6)

    // Tip belirtilmezse hata verir.
    // joinToString() --> array icindeki tum parametreyi alip string olaraak geri dondurur.
    val arrayOfNulls = arrayOfNulls<Int>(4)
    println("arrayOfNulls : ${arrayOfNulls.joinToString()}")

    val emptyArray = emptyArray<String>()  // Size bilgisi vermiyoruz. (verildiginde hata verir)
    // emptyArray[3] = "kotlin"

    val intArray = Array<Int>(5){
        // code
        // code
        // code
        // ...
        it // --> 0 - 3 - 6 - 9 - 12
    }

    println("intArray : ${intArray.joinToString()}")


    /*
        Ne zaman arrayOf ne zaman Array<Int> li bir kullanim yapmaliyiz? 🤔
        Eger value lari bir isleme sokacaksak bu gibi durumlarda ikincisi tercih edilir.
        Ikinci kullaniminda ekstra kod yazma alani sagladigi icin baska baska islemlerde yapabilmemizi saglamakta.
        Baktiginizda ama ikiside ayni isleve sahiptir.


        Spesifik olarak ilgili tipe ozel array olusturabiliriz. (Okunaklik artar)
        intArrayOf()
        doubleArrayOf()
        floatArrayOf()
        shortArrayOf()
        longArrayOf()
        byteArrayOf()

     */

    val myIntArrayOf = intArrayOf(1,2,3,4,5)
    val myDoubleArrayOf = doubleArrayOf(1.2,3.24,7.8)

    // Array`ler ile birlikte kullanilabilecek fonksiyonlar: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/


    // ***************************** OPERATORS *****************************

    /*
        Aritmetik Operatorler :
        Toplama  (+)
        Cikarma  (-)
        Carpma   (*)
        Bolme    (/)
        Mod Alma (%)

     */

    val myFirstNum = 4
    val mySecondNum = 2

    val sumResult = myFirstNum + mySecondNum
    println("Sum result: $sumResult")
    println("Sum result2: ${myFirstNum+mySecondNum}")
    println("Sum result3: ${myFirstNum.plus(mySecondNum)}")

    val minusResult = myFirstNum - mySecondNum
    println("Minus Result: $minusResult")
    println("Minus Result2: ${myFirstNum-mySecondNum}")
    println("Minus Result2: ${myFirstNum.minus(mySecondNum)}")

    val multiResult = myFirstNum * mySecondNum
    println("Multiplication Result: $multiResult")
    println("Multiplication Result2: ${myFirstNum*mySecondNum}")
    println("Multiplication Result3: ${myFirstNum.times(mySecondNum)}")

    val divResult = myFirstNum/mySecondNum
    println("Div result: $divResult")
    println("Div result2: ${myFirstNum/mySecondNum}")
    println("Div result3: ${myFirstNum.div(mySecondNum)}")

    val modResult = myFirstNum % mySecondNum
    println("Mod result: $modResult")
    println("Mod result2: ${myFirstNum % mySecondNum}")
    println("Mod result3: ${myFirstNum.rem(mySecondNum)}")


    /*
        Sonucu ondalikli olarak almak istersek? 🤔
        Ya da tipleri birbirlerine donusturmek istersek? (Type Conversion) (String --> Int ya da Int --> Double ,..)

        toInt()
        toString()
        toDouble()
        toFLoat()
        toLong()
        toChar()
        toByte()
        toShort()
        toBoolean()

     */

    val randomNumber = "111111"
    val convertToInt = randomNumber.toInt()
    println("Phone Number: $convertToInt")

    val number = "2"
    println("Convert to Int: ${number.toInt()}")

    val number2 = 3
    println("Integer to Double: ${number2.toDouble()}")

    val intNum1 = 24
    val intNum2 = 7

    println("Convert to Double: ${intNum1.toDouble().div(intNum2.toDouble())}")
    // println("Convert to Double: ${(intNum1.div(intNum2)).toDouble()}")
    println("Convert to Double2: ${intNum1.toDouble()/intNum2.toDouble()}")

    // Number veri tiplerinin deger araliklari : https://kotlinlang.org/docs/numbers.html


    /*
        Atama Operatorleri
        Toplama --> +=
        Cikarma --> -+
        Carpma  --> *=
        Bolme   --> /=
        Mod     --> %=
     */

    var x = 2
    var y = 4

    x += y  // x = x+y
    println("Result x: $x")

    x -= y  // x = x-y
    println("Result2 x: $x")

    y *= 6  // y = y*6
    println("Result y: $y")

    y /= x  // y = y/x
    println("Result2 y: $y")

    x %= 4  // x = x % 4
    println("Result3 x: $x")


    // ***************************** IF/ELSE - WHEN - LOOPS *****************************

    /*
        IF - ELSE

        syntax:

        if(durum-kosul){

        }else{
           kosul saglanmadiginda bu blok calisir
        }

        Birden fazla durumumuz olabilir. O zaman syntax :

        if(1.durum){

        }else if(2.durum){

        }else if(3.durum){

        }else{

        }

        Eger if-else`in suslu parantezleri arasina tek satirlik bir kod yazilmissa bu durumda suslu parantez kullanilmasa da olur.
        If - else`in "State" ve "Expression" olmak uzere iki turlu kullanimi vardir.

        State kullanimi: Hepimizin bildigi if-else bloklarini acip kullandigimiz yapi

        Expression kullanimi: Bir degiskene esittir ile if-else yapisini yazmaktir.
        Expression kullaniminda son satirdaki value degiskenimizin degeri olmaktadir.

     */

    val isBook : Boolean = true

    // state kullanimi
    if (isBook){
        println("Yes")
    }else{
        println("No")
    }

    if (isBook)
        println("Yes")
    else
        println("No")

    if(isBook) println("Yes") else println("No")

    if (isBook) println("Yes")
    else println("No")

    // expression kullanimi
    val result: String = if (isBook){
        // other code
        // other code
        // other code
        // other code
        // other code
        "Yes"
    }else{
        "No"
    }
    println("Expression result: $result")

    val isChip : Boolean = false
    val result2: String = if (isChip){
        "Yes"
    }else{
        // other code
        // other code
        // other code
        // other code
        "No"
    }
    println("Expression resul2t: $result2")

    val newInt = 3

    var newResult:Int = if (newInt > 2){
        6
    }else{
        // code
        // code
        // code
        7
    }
    println("New result : $newResult")

    /*
    val newInt = 5

    var newResult:Int = if (newInt > 2){
        if(newInt>4){
            2
        }else{
            7
        }
    }else{
        // code
        // code
        // code
        7
    }
     */


    /*
        Karsilastirma Operatorleri
        >   --> buyuktur
        >=  --> buyuk esittir
        <   --> kucuktur
        <=  --> kucuk esittir
        ==  --> esittir

     */

    println("Notunuzu giriniz :")
    val examResult: Int = readln().toInt()

    // if (examResult > 80 && examResult<=100)
    if (examResult in 81..100){
        println("Harf notunuz : AA")
    }else if (examResult in 61..79){
        println("Harf notunuz : BB")
    }else{
        println("Harf notunuz : CC")
    }


    /*
        WHEN

        Switch case`lerin yerine kullanilirlar. Eger elimizde su sekilde bir kod blogu varsa :

        if
        else if
        else if
        else if
        else if
        else if
        else if
        else if
        ...
        else

       Bu sekilde if - else if - else yapisini kullanmak yerine when`i kullaniyor olacagiz.

     */

    println("Haftanin gunlerinden birini yaziniz : ")
    val day = readln().lowercase()
    when (day) {
        "pazartesi" -> println(1)
        "sali" -> println(2)
        "carsamba" -> println(3)
        "persembe" -> println(4)
        "cuma" -> println(5)
        "cumartesi" -> println(6)
        "pazar" -> println(7)
        else -> println("Geçersiz gün")
    }

    // when`i de if-else de oldugu gibi expression seklinde yazabiliriz.

    val myIntNum = 3
    val expressionResult:String = when(myIntNum){
        1 -> "Bir"
        2 -> "Iki"
        3 -> "Uc"
        else -> "gecersiz"
    }
    println("when expression result is : $expressionResult")


    /*
        LOOPS (For/While)

        FOR DONGUSU
        Belli araliktaki degerler uzerinde donmeyi ya da o degerler uzerinde islem/islemler yapabilmemizi saglayan yapilardir,

     */

    for (value in 1..10){
        println("Range for loop : $value")
    }

    val nameArray = arrayOf("Tugce","Merve","Ahmet","Mehmet")
    for (i in nameArray){
        println("Array for loop : $i")
    }

    for (getIndex in nameArray.indices){
        println("Get index for loop : $getIndex")
    }

    // Destructuring Declarations !
    for((index,value) in nameArray.withIndex()){
        println("Index : $index and Value: $value")
    }


    /*

        WHILE DONGUSU

        Belirli bir kosul dogru oldugu surece calismaya devam eder.
        for + if li yapilarin yerine kullanilabilmektedir.

        syntax :
        while(kosul){
            yapilacak islemler
        }

     */

    var a = 3
    while (a<=5){
        println("While Loop : $a")
        a++
    }

    var myValue2 = 0
    while (myValue2 < 5){
        println("While Loop2 : ${myValue2++}")
    }

    for (myValue in 0..10 step 2){
        if (myValue < 5){
            println("My value : $myValue ")
        }else{
            break
        }
    }
}