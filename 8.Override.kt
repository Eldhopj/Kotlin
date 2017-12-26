open class AddSub2       // this class doesn't have any constructors ,"open" class can only inherited
{
    open fun add(a:Int,b:Int):Int// makes fun open
    { return a+b }

    fun sub(a:Int,b:Int):Int
    { return a-b }
}
class Calc2 :AddSub2() { // class AddSub is inherited into Calc

    override fun add(a:Int,b: Int):Int// overriding the function
    {return a+b+1}

    fun mult(a:Int,b:Int):Int
    {return a*b}
    fun div(a:Double,b:Double):Double
    {return a/b}

}

fun main(args:Array<String>){
    var calculate=Calc2() // instance of the class
    var calculate2=AddSub2()
    println(calculate.mult(5,6))

    println(calculate2.add(5,10))// get value from parent class
    println(calculate.add(5,10))// get value from override function
}