//Reading inputs from keyboard

fun main(Args: Array<String>) {

    println("Enter college name")
    var cName = readLine() // readLine is used for to get keyboard inputs as "Strings"
    println("College name"+cName)

    println("Enter name")
    var name:String? //"?" accepts null value
    name= readLine()//declare like this to read from anywhere

    println("Enter Marks for 3 tests")
    var test1:Int?
    test1= readLine()!!.toInt() // convert string into int
    var test2:Int?
    test2= readLine()!!.toInt()//"!!" wont run unless it have an value
    var extra:Int?
    extra= readLine()!!.toInt()
    var marks:Int?= test2 + test1 +extra

    println("Hello "+name)
    println("Welcome to "+cName+" college")
    println("your Marks "+marks)

}
