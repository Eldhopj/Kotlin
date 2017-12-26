interface Calc3{            //interface
    fun add(a:Int,b:Int):Int
    {return a+b}
    fun sub(a:Int,b:Int):Int
    {return a-b}
}
class CalcTen:Calc3 {          //implements Calc3 to CalcTen
    override fun add(a: Int, b: Int): Int {// overrides functions
        return a + b + 10
    }

    override fun sub(a: Int, b: Int): Int {
        return a - b + 10
    }
}
class Calctwenty:Calc3{         //implements Calc3 to CalcTwenty
    override fun add(a: Int, b: Int): Int {
        return a+b+20
    }

    override fun sub(a: Int, b: Int): Int {
        return a-b+20
    }
}
class Calcdefault:Calc3 // the default values from parent interface will inherits

fun main (args:Array<String>){
    var ten=CalcTen()
    var twenty=Calctwenty()
    var default=Calcdefault()
    println(ten.add(10,20))
    println(twenty.add(10,20))
    println(default.add(10,20))
}
