package cg.nic.ankosample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)
    }

    fun validate(uname: String, pass: String) {
        if (uname.trim().toString().equals("")) {
            this.toast("Enter username.")
        } else if (pass.trim().toString().equals("")) {
            this.toast("Enter password.")
        } else if (uname.equals("mukesh") && pass.equals("123")) {
            this.toast("Login success.")
            startActivity(Intent(this@MainActivity, HomeActivity::class.java))
        } else {
            this.toast("Username/Password incorrect.")
        }

    }

}
