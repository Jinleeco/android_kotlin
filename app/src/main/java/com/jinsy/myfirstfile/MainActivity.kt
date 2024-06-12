package com.jinsy.myfirstfile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jinsy.myfirstfile.ui.login.LoginActivity
import com.jinsy.myfirstfile.ui.login.LoginFormState
import com.jinsy.myfirstfile.ui.login.LoginViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면클릭 이벤트
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        image1.setOnClickListener{
            //Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_SHORT).show()
            // 2. 다음화면에 사진 표시
            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        image2.setOnClickListener{
            var intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        image3.setOnClickListener{
            var intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.bts_image_4)
        image4.setOnClickListener{
            var intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.bts_image_5)
        image5.setOnClickListener{
            var intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(R.id.bts_image_6)
        image6.setOnClickListener{
            var intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }

        val image7 = findViewById<ImageView>(R.id.bts_image_7)
        image7.setOnClickListener{
            var intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }

        var btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener{
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}