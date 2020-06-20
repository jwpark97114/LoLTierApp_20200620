package kr.co.namu.loltierapp_20200620

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        MMR - 1250 미만 : 브론즈, 1250~1500 : 실버, 1500~1800 : 골드, 1800~2100 : 플레티넘, 2100~ : 다이아

        calcBtn.setOnClickListener {
//            입력한 점수가 몇점인지 숫자로 변경.
            val mmrScore = mmrScoreEdt.text.toString().toInt()

            if(mmrScore < 1250){
                tierTxt.text = "당신은 브론즈입니다."
            }
            else if(mmrScore < 1500){
                tierTxt.text="당신은 실버입니다."
            }
            else if(mmrScore<1800){
                tierTxt.text="당신은 골드입니다."
            }
            else if(mmrScore<2100){
                tierTxt.text="당신은 플레티넘입니다."
            }
            else{
                tierTxt.text="당신은 다이아입니다."
            }
        }
    }
}