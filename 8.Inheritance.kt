open class AddSub       // this class doesn't have any constructors ,"open" class can only inherited
{
    fun add(a:Int,b:Int):Int
    { return a+b }
    fun sub(a:Int,b:Int):Int
    { return a-b }
}
class Calc: AddSub() {// class AddSub is inherited into Calc
    fun mult(a:Int,b:Int):Int
    {return a*b}
    fun div(a:Double,b:Double):Double
    {return a/b}

}

fun main(args:Array<String>){
    var calculate=Calc() // instance of the class
    println(calculate.add(5,10))
    println(calculate.mult(5,6))
}