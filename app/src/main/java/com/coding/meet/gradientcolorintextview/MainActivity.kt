package com.coding.meet.gradientcolorintextview

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtCodingMeet = findViewById<TextView>(R.id.txtCodingMeet)
        val paint = txtCodingMeet.paint
        val width = paint.measureText(txtCodingMeet.text.toString())
        txtCodingMeet.paint.shader = LinearGradient(
            0f,0f,width,txtCodingMeet.textSize, intArrayOf(
                Color.parseColor("#FF0000"),
                Color.parseColor("#FF5722"),
                Color.parseColor("#FF9800"),
            ), null,Shader.TileMode.REPEAT
        )
    }
}