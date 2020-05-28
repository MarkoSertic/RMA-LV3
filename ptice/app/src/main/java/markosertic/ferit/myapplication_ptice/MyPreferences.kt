package markosertic.ferit.myapplication_ptice

import android.content.Context

class MyPreferences(context:Context) {
    val PREFERENCE_NAME= "SharedPreference"
    val prefLOginCount="logincount"
    val prefColor="color"
    val preference=context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE)

    fun getLoginCOunt() : Int{
        return preference.getInt(prefLOginCount,0)
    }
    fun getButtonColor():Int{
        return preference.getInt("color",0)
    }

    fun setButtonColor(color:Int){
        val editor=preference.edit()
        editor.putInt(prefColor,color)
        editor.apply()
    }

    fun setLoginCount(count:Int){
        val editor=preference.edit()
        editor.putInt(prefLOginCount,count)
        editor.apply()
    }

}