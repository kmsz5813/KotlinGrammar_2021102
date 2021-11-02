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

        btnCondition01.setOnClickListener {

            val myAge : 24

            if ( myAge >= 20 ) {

//                질문내용이 맞으면 실행될 코드.
                Log.d("나이검사", "성인입니다.")

            }

            else if ( myAge >= 17 ){
                Log.d("나이검사", "고등학생입니다.")
            }
            else if ( myAge >= 14 ){
                Log.d("나이검사", "중학생입니다.")
            }
            else {
                Log.d("나이검사", "초등학생 이하 입니다.")
            }

        }

        btnCondition02.setOnClickListener {

//            장기 근속의 3대요소. 1. 연봉높음 2. 거리 3. 칼퇴

            val aCompanySalary = 5800
            val aCompanyMinute = 20
            val aCompanyFinishEalry = true

//            1번 지원자는 A회사에 취업할까?
//            연봉만 5천이상이면 OK

            if ( aCompanySalary >= 5000 ) {
                Log.d("1번지원자", "취업 OK")
            }
            else {
                Log.d("1번지원자", "다른회사")
            }

//            2번지원자는 출퇴근이 10분 이내면 취업

            if (aCompanyMinute <= 10 ){
                Log.d("2번지원자", "취업 OK")
            }
            else {
                Log.d("2번지원자", "다른회사")
            }

//            3번지원자는 칼퇴하는 회사면 취업
            if (aCompanyFinishEalry) {
                Log.d("3번지원자", "취업 OK")
            }
            else {
                Log.d("3번지원자", "다른회사")
            }

//            4번지원자는 연봉이 4천 이상, 거리도 10분 이내

            if (aCompanySalary >= 4000 && aCompanyMinute <= 10 ) {
                Log.d("4번지원자", "취업 OK")
            }
            else {
                Log.d("4번지원자", "다른회사")
            }

//            5번지원자는 거리가 20분 이내거나, 칼퇴하거나

            if (aCompanyMinute <=20 || aCompanyFinishEalry) {
                Log.d("5번지원자", "취업 OK")
            }
            else {
                Log.d("5번지원자", "다른회사")
            }


        }

    }
}