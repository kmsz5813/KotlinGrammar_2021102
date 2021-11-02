package com.nepplus.kotlingrammar_2021102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

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

//            변수의 데이터 변경
//            myName = "kim min" // val 변수는 변경 불가능.
            myHeigh = 172.3 // var 은 변경 가능

//            3. 데이터 활용
            Log.d("이름", myName)
            Log.d("키", myHeigh.toString())

//            참고 - 모든 변수는 참조형변수, 부가 기능들이 있다. => 공통 기능 : String으로 변환 가능. => tostring

        }

        btnVariable02.setOnClickListener {
//            변수를 만들고 -> 바로 데이터 대입
//            보토응ㄴ

            val myBirthYear = 1988 // 대입한 값의 형태? 정수 (int) => myBirthYear

            Log.d("출생년도", myBirthYear.toString())

            val myKoreanAge = 2021 - myBirthYear + 1 // 변수를 대입할때, 기능 실행(계산식)의 결과를 바로 대입 가능.

            Log.d("나이", myKoreanAge.toString())

        }

    }
}