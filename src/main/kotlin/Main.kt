fun main() {
    val person = human("Kesa",20,40.5)

    person.eat(15.0)

    println(person.weight)

    person.speak("Edna")

    person.birthday()

    val me = User("Levin","Nelly","levinnelly@gmail.com","0711242173","ednaadhiambo")

    println(me.firstName)

    println(me.lastName)



}
 class human(var name:String, var age:Int, var weight: Double){
     fun eat(foodWeight:Double){
         weight += foodWeight
         println("Iam eating $foodWeight kgs of food")
     }

     fun speak(speech:String){
       println(speech)

     }

     fun birthday(){
         age += 1
         println(age)

     }
}

class User(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:String){
    fun details(firstName: String, lastName:String, email:String, phoneNumber:String, password:String){
        println(firstName)
        println(lastName)

    }

}

