package com.example.deneme

open class   Item(var name : String, var price : Double) {

}

class Food(name: String, price: Double, var weight : String) : Item(name, price)

class Cloth(name: String, price: Double, var type : String) : Item(name, price) {

}

class ShoppingList(){
    var list = mutableListOf<Item>()
    fun addItem(){

        print("Enter the item type you want to add (1 for Food, 2 for Cloth : ")
        var cesit = readln().toInt()
        if(cesit == 1){
            print("Enter the item name you want to add: ")
            var foodName = readln()
            print("Enter the item price you want to add: ")
            var foodPrice = readln().toDouble()
            print("Enter the item weight you want to add: ")
            var foodWeight = readln()
            list.add(Food(foodName,foodPrice, foodWeight))
            println("${foodName} is added successfully!")
        }
        else if (cesit == 2){
            print("Enter the item name you want to add: ")
            var clothName = readln()
            print("Enter the item price you want to add: ")
            var clothPrice = readln().toDouble()
            print("Enter the item type you want to add: ")
            var clothType = readln()
            list.add(Cloth(clothName,clothPrice, clothType))
            println("${clothName} is added successfully!")
        }
        else{
            println("Invalid number.")
            addItem()
        }
    }

    fun displayItem(){
        for (i in list){
            if(i is Food) {
                println("${i.name} , ${i.price}$, ${i.weight}kg")
            }

            if(i is Cloth) {
                println("${i.name} , ${i.price}$, ${i.type}")
            }
        }

    }

    fun deleteItem(){
        println("Enter the item name you want to delete:")
        var item = readln()
        for (i in list){
            if(item == i.name) {
                list.remove(i)
                println("$item is deleted successfully! ")
                break
            }
        }
    }

}

fun main(){
    println("***** Welcome to Shopping List App *****")

    var shoppingList = ShoppingList()
    while (true){
        println("Make your choice: (1-2-3-4)")
        println("1. Add Item")
        println("2. Display Item")
        println("3. Delete Item")
        println("4. Exit")
        print("Your choice is: ")
        var choice = readln().toInt()
        if(choice ==1) shoppingList.addItem()
        else if (choice == 2) shoppingList.displayItem()
        else if (choice == 3) shoppingList.deleteItem()
        else if (choice == 4){
            println("Exiting...")
            break
        }
        else println("Wrong choice. Try again")
    }
}