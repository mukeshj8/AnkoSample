package cg.nic.ankosample

import android.view.View
import android.widget.EditText
import android.widget.Toast
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        /*relativeLayout {

            val textFieldUsername = editText {
                hint = "Enter username"
            }.lparams(width = matchParent) {
                margin = dip(12)
                topMargin = dip(30)

            }

            val textFieldPass = editText {
                hint = "Enter password"
            }.lparams(width = matchParent) {
                margin = dip(12)
                topMargin = dip(80)

            }

            val loginButton = button {
                text = "Login"
                onClick {
                    Toast.makeText(context.applicationContext, "You clicked", Toast.LENGTH_SHORT).show()
                }
            }.lparams(width = matchParent) {
                margin = dip(12)
                topMargin = dip(140)
            }

        }*/

        verticalLayout {
            padding = dip(30)
            editText {
                hint = "Name"
                textSize = 24f
            }
            editText {
                hint = "Password"
                textSize = 24f
            }
            val login = button("Login") {
                textSize = 26f
                onClick {
                    ui.ctx.toast("you clicked.")
                }
            }
        }

    }
}