fun main(args:Array<String>) {
    var arraylist = ArrayList<String>()
    arraylist.add("eldho")    // ".add" used to add the element to ArrayList
    arraylist.add("james")
    arraylist.add("thara")
    arraylist.add("mary")
    arraylist.add("HouseName")

    println(arraylist.get(1))  // ".get" fetch the values from the specific index

    arraylist.set(4,"Panackal")// ".set" update the value in the specific index

    if (arraylist.contains("eldho"))// ".contains" search for a value
        println("yes")

    for (i in arraylist)
        println(i)
}
//Note: you can access and update values by using index , no need of set and get
// eg: arraylist[4]="Panackal instead of using set