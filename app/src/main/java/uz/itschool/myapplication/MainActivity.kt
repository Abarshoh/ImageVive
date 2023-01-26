package uz.itschool.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var imgArray:MutableList<Int> = mutableListOf()
    var count  = 0
    var position = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        imgArray.add(R.drawable.img1)
        imgArray.add(R.drawable.img3)
        imgArray.add(R.drawable.img4)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var img = findViewById<ImageView>(R.id.imgOne)
        var prev = findViewById<TextView>(R.id.textView)
        var next = findViewById<TextView>(R.id.textView2)
//        img.setOnClickListener{
//            if(count<imgArray.size-1){
//            img.setImageResource(imgArray[count++])
//            } else{
//                count = 0
//            }
//            img.setImageResource(imgArray[count])
//        }
        next.setOnClickListener{
            if (imgArray.size-1 == position){
                position = 0
            }else{
                position++
                img.setImageResource(imgArray[position])
            }
        }
        prev.setOnClickListener{
            if (position == 0){
                position = imgArray.size-1
            }else{
                --position
                img.setImageResource(imgArray[position])
            }
        }
    }
}