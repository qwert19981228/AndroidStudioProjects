package com.example.dan
fun main(){
    Thread(object : Runnable{
        override fun run() {
            println("Thread is running")
        }
    }).start()
    // 简化写法
    Thread(Runnable {
        println("Thread is running")
    }).start()
    // 继续简化
    Thread{
        println("Thread is running")
    }.start()

    //注册按钮的点击事件
//    button.setOnClickListener{
//    }
}
