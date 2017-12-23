import java.util.*

fun main(args: Array<String>)
{
    var currentDate=Calendar.getInstance().get(Calendar.YEAR) // Getting year from system by instance of the Calendar class

    var yearOfBirth:Int?
    print("Enter your year of birth")
    yearOfBirth= readLine()!!.toInt()
    var age=currentDate-yearOfBirth

    print("Age= $age")// "$"Injecting value
}