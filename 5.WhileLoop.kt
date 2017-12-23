//Even numbers

fun main(args:Array<String>){
    print("enter the limit")
    var n:Int= readLine()!!.toInt()
    var i=2

    while (i<n)//Condition
    {
        println(i)
        i+=2// incrementer/decrementer
    }
}