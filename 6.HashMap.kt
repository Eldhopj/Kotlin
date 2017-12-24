fun main(args:Array<String>){
    var hashmap=HashMap<Int,String>()
    hashmap.put(1,"Eldho")
    hashmap.put(2,"Thara")     //".put" used to insert the value
    hashmap.put(99,"HouseName")

    hashmap.put(99,"Panackal") //updating the value

    println(hashmap[99])       //to get value or use .get()

    for (k in hashmap.keys)//to print the value (Important)
    {
        println(hashmap[k])
    }
}
// Note: There is no guarantee how HashMap will print