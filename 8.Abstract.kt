abstract class CreditCard{  //abstract class
    fun cardId(){
        println("Card number 1234")
    }
    abstract fun pin()      //abstract method
}
class Id:CreditCard(){
    override fun pin() {    //must be override abstract method in abstract parent class
    }

}
fun main(args:Array<String>){
    //"var creditcard=creditcard()" cannot create instance of the abstract class
    var id=Id()             //create instance of the child to get the method of abstract parent class
    println(id.cardId())
}