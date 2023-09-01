package org.example.kotlin

class Person (val name : String, val age: Int){
    //Property Declaration
    lateinit var address: String

    init {
        println("Person with name $name and age $age has been created")
    }

    constructor(name : String, age: Int, address: String): this(name,age){
        //SomeCode
        this.address = address
    }

    fun introduce(){
        println("Hello i am $name, Iam $age Years Old")
    }

    companion object{
        //Static variable and Static methods here
    }


}