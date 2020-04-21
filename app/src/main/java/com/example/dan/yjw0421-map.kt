package com.example.dan

fun main(){
    // 写法一
    val map = HashMap<String,Int>()
    map.put("Apple",1)
    map.put("Banana",2)
    map.put("Orange",3)
    map.put("Pear",4)
    map.put("Grape",5)

    // 写法二
    val map1 = HashMap<String,Int>()
    map["Apple"] = 1
    map["Banana"] = 2
    map["Orange"] = 3
    map["Pear"] = 4
    map["Grape"] = 5

    // 写法三
    val map2 = mapOf("Apple" to 1,"Banana" to 2,"Orange" to 3,"Pear" to 4,"Grape" to 5)
    for ((fruit,number) in map2){
        println("fruit is "+ fruit + " , number is " + number)
    }
}