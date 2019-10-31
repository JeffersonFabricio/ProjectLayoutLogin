package fabricio.jefferson.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnCancel = findViewById<Button>(R.id.btnCancelLogin)
        btnCancel.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnConfirm = findViewById<Button>(R.id.btnConfirmLogin)
        val editTextLogin = findViewById<EditText>(R.id.editTxtLogin)

        btnConfirm.setOnClickListener {
            val intent = Intent(this, ResultLoginActivity::class.java)
            intent.putExtra("login", editTextLogin.text.toString())
            intent.putExtra("password", editTxtPassword.text.toString())
            startActivity(intent)
        }
    }

}
