class PersonalInfo(name:String,age:Int,dept:String,salary:Double)// class
{
    var salary:Double =3.0      // instance variable
    var totalSalary= bonusfn(salary)

    init {                      //init execute when an instance created
        println("Name $name")
        println("age $age")
        println("dept $dept")
        println("salary $salary")
    }
    fun bonusfn (salary: Double):Double {
        var bon=salary/10
        return bon+salary
    }
}
fun main(args:Array<String>){
    var name1="eldho"
    var eldho = PersonalInfo(name1,27,"cse",10.0)// instance of the class
    println("Total salary:"+eldho.totalSalary) // access values outside class using "." operator
}