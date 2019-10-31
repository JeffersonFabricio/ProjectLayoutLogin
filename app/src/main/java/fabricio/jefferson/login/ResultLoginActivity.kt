package fabricio.jefferson.login

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_login)

        val login = findViewById<TextView>(R.id.txtViewResultLogin)
        login.text = intent?.getStringExtra("login")

        val password = findViewById<TextView>(R.id.txtViewResultPassword)
        password.text = intent?.getStringExtra("password")
    }

}
