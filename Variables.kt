//How to give variables in diffrent types

fun main(Args: Array<String>) {
    var rNum = 10 // var is read and write

    var college:String?= "Mbits" // Defining variable data type , can enter only string values

    var name:String?// "?" defines null values can be accepted
    name="Eldho"


    val PI:Float? //val means read only
    PI=3.14f // needs to put f at the edn bcoz else java convert it into Double

    println("College Name\t"+college)
    print("RegNumber\t"+rNum+"\nname\t"+name)

}