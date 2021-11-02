package com.nepplus.kotilnbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {

//    Ctrl + / : 이 줄을 주석으로 변경. / 주석 해체
//         주석 : 코드에 메모 남기기.

//            로그를 찍어보기
            Log.d("메인화면", "로그찍기 버튼이 눌림")
            Log.e("메인화면","Log.e로 찍어보기")


        }

        btnToast.setOnClickListener {

            Toast.makeText(this, "토스트 버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show()

        }


        btnToast2.setOnClickListener {
            Toast.makeText(this, "두번째 버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show()
        }

        btnCopyText.setOnClickListener {
//            1.입력칸에 어떤 내용이 있는지? => 컴퓨터에게 메모 시키자. => 변수를 만들고 값을 담아두자.
            val inputcontent = edtContent.text.toString()

//            2. 텍스트뷰에 알아낸 내용을 세팅. => 메모해둔 내용을 => 텍스트뷰의 text 속성에 대입.
            txtCopyResult.text = inputcontent
        }

        btnContentToast.setOnClickListener {
            val inputcontent = edtContent.text.toString()

            Toast.makeText(this, inputcontent, Toast.LENGTH_SHORT).show()
        }

    }
}