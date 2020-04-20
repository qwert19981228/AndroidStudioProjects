package com.example.dan

// 主构造函数
//class `yjw0420-class-Student`(val sno:String, val grade:Int, name:String, age:Int): `yjw0420-class-Person`(name,age) {
//    init{
//        println("sno is " + sno)
//        println("grade is " + grade)
//    }
// 次构造函数
//    constructor(name: String,age: Int) : this("",0,name,age){
//
//    }
//    constructor():this("",0){
//
//    }
//}

// 继承
class `yjw0420-class-Student`(name:String, age:Int): `yjw0420-class-Person`(name,age),`yjw0420-class-Study`{
    override fun readBooks() {
        println(name + " is reading")
    }
}
