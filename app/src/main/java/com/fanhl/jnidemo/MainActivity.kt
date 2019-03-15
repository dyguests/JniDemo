package com.fanhl.jnidemo

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var original: Bitmap

    private var brightness: Float = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        assignViews()
        initData()
    }

    private fun assignViews() {
        seek_bar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                brightness = progress / 10.0f
                tv_value.text = "Brightness = $brightness"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })
        tv_value.text = "Brightness = $brightness"
        btn_apply.setOnClickListener {
            val bitmap = original.copy(Bitmap.Config.ARGB_8888, true)
            ImageFilter.brightness(bitmap, brightness)
            image_view.setImageBitmap(bitmap)
        }
    }

    private fun initData() {
        original = BitmapFactory.decodeResource(resources, R.drawable.test)
    }
}
