package com.nepplus.kotlingrammar_2021102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVariable01.setOnClickListener {
//            기본적인 변수 만들고 / 대입하고 / 활용 (로그찍기)

            val myName : String
            var myHeigh : Double
//           2. 변수에 데이터 대입

            myName = "김민성"
            myHeigh = "173.2"

//            3. 데이터 활용
            Log.d("이름", myName)
            Log.d("키", myHeigh.toString())

//            참고 - 모든 변수는 참조형변수, 부가 기능들이 있다. => 공통 기능 : String으로 변환 가능. => tostring

        }

    }
}