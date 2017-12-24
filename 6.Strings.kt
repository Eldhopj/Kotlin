fun main(args:Array<String>){
    var hello="Hello "
    var world="World"

    var concatenate= hello+world // String concatenation
    println(concatenate)

    var chara=hello[1]// get a character
    println(chara)

    //operations
    println(concatenate.toUpperCase()) //to uppercase
    println(concatenate.toLowerCase()) //to lowercase
    println(concatenate.split(" "))// splitting into two , here based on space
    println(concatenate.trim('H'))// trims the H
}