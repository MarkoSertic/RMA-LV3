package markosertic.ferit.myapplication_ptice

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mypreference=MyPreferences(this)
        var counter=mypreference.getLoginCOunt()
        var color=mypreference.getButtonColor()
        mypreference.setButtonColor(color)
        mypreference.setLoginCount(counter)
        textView.text=counter.toString()
        textView.setBackgroundColor(color)

        btnred.setOnClickListener{
            color=Color.RED
            counter++
            mypreference.setButtonColor(color)
            mypreference.setLoginCount(counter)
            textView.text=counter.toString()
            textView.setBackgroundColor(color)
        }
        btnblue.setOnClickListener{
            color=Color.BLUE
            counter++
            mypreference.setButtonColor(color)
            mypreference.setLoginCount(counter)
            textView.text=counter.toString()
            textView.setBackgroundColor(color)
        }
        btngreen.setOnClickListener{
            color=Color.GREEN
            counter++
            mypreference.setButtonColor(color)
            mypreference.setLoginCount(counter)
            textView.text=counter.toString()
            textView.setBackgroundColor(color)
        }
        btnyellow.setOnClickListener{
            color=Color.YELLOW
            counter++
            mypreference.setButtonColor(color)
            mypreference.setLoginCount(counter)
            textView.text=counter.toString()
            textView.setBackgroundColor(color)
        }
        btnreset.setOnClickListener{
            counter=0
            color=Color.GRAY
            mypreference.setButtonColor(color)
            mypreference.setLoginCount(counter)
            textView.text=counter.toString()
            textView.setBackgroundColor(color)
        }
    }

}
