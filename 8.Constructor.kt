class PInfoCon()// class
{
    // instance variables
    var salary:Double =3.0
    var totalSalary= bonusfn(salary)


    constructor(name:String,age:Int,dept:String,salary:Double) : this()//"constructor" execute when an instance created,"this()" is used to fire PersonalInfo first
    {
        println("Name $name")
        println("age $age")
        println("dept $dept")
        println("salary $salary")

        println("salary"+this.salary)// "this." call the value inside the class
    }
    constructor(name:String) : this() // constructor overloading
    {
        println("$name welcome to kotlin programming")
    }

    fun bonusfn (salary: Double):Double {
        var bon=salary/10
        return bon+salary
    }
}
fun main(args:Array<String>){
    var name1="eldho"

    var eldho = PInfoCon(name1,27,"cse",10.0)// instance of the class
    println("Total salary:"+eldho.totalSalary) // access values outside class using "." operator

    var eldhoWelcome=PInfoCon(name1)//calls the second constructor
}