package cg.nic.ankosample

import android.view.View
import android.widget.EditText
import android.widget.Toast
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivityUI : AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {

        verticalLayout {
            padding = dip(30)
            val usernameEt = editText {
                hint = "Username"
                textSize = 20f
            }
            val passEt = editText {
                hint = "Password"
                textSize = 20f
            }
            val login = button("Login") {
                textSize = 22f
                onClick {
                    ui.owner.validate(usernameEt.text.toString(), passEt.text.toString())
                }
            }.lparams(width = matchParent, height = dip(60)) {
                topMargin = dip(20)
            }
        }

    }
}