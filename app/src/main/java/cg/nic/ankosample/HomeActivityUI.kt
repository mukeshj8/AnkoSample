package cg.nic.ankosample

import android.view.Gravity
import android.view.View
import org.jetbrains.anko.*

class HomeActivityUI : AnkoComponent<HomeActivity> {
    override fun createView(ui: AnkoContext<HomeActivity>) = with(ui) {

        verticalLayout {

            gravity = Gravity.CENTER

            textView(text = "Welcome to Home"){
                textSize = 20f
                gravity = Gravity.CENTER
            }

        }

    }
}