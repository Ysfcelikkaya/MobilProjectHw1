package com.example.yalovaders


// Object Oriented Programming: Bir Programlama Dili Paradigmasıdır. Günlük hayatta bir problemi çözmek için
// ihtiyaç duyduğumuz objeyi bilgisayar ortamına aktarmak için kullanıyoruz.

/* Örnek Araba
   Marka, Model, Yükseklik, Genişlik, En, Motor Hacmi etc...
 */

// classın yanına eklenen constructor Primary Costructor, javada yok, genelde belirtilmiyor ama visibility modifierı varsa yazmak zorundasın
class Car (wheelCount : Int, color : String = "Red"){

    val mWheelCount : Int
    val mColor : String

    // Bu blok constructorlarla beraber çalışır
    // initialize başlatmak. primary constructor'ın süslü parantezleri gibi düşünün.
    init {
        mWheelCount = wheelCount
        mColor = color
    }

    // Constructor: Tasarlanan sınıftan nesne üretilmesi anında çalışan metoddur. Yani bir nesne oluşturduğumuzda ilk olarak Constructor Method çalışır
    // Overload edilebilir
    // this ibaresi primary constructorı işaret eder
    constructor(name: String) : this(4) {
        "1. Secondary Constructor".printLog()

    }

    constructor(name: String, horsePower: Int): this(4){
        "2. Secondary Constructor".printLog()
        val mHorsePower : Int = horsePower
        println(mHorsePower)
    }

    constructor(name: String, horsePower: Int, age: Int) : this(4) {
        "3. Secondary Constructor".printLog()

    }
}

class Human(var firstName: String, var lastName: String) {
    var age: Int? = null

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)
    {
        this.age = if(age > 0) age else throw IllegalArgumentException("Yaş 0'dan büyük olmalıdır")
    }
}
//In an extension function or a function literal with receiver this denotes the receiver parameter that is passed on the left-hand side of a dot.
fun String.printLog(){
    println(this)
    println("------------------------------------")
}

fun main(){
    val car0 = Car(4)
    val car1 = Car( "MiniCooper")
    val car2 = Car(4, "Blue")
    val car3 = Car("BMW", 200)
    val car4 = Car("Renault", 75,7)


    val human = Human("Sertac", "Ayhan")


    println(human)
    println(human.firstName)
    println(human.lastName)


}