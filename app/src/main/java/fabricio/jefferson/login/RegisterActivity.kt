package fabricio.jefferson.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnCancel = findViewById<Button>(R.id.btnCancelRegister)
        btnCancel.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnConfirm = findViewById<Button>(R.id.btnConfirmRegister)
        val editTxtName = findViewById<EditText>(R.id.editTxtName)
        val editTxtCPF = findViewById<EditText>(R.id.editTxtCPF)

        btnConfirm.setOnClickListener {
            val intent = Intent(this, ResultRegisterActivity::class.java)

            intent.putExtra("name", editTxtName.text.toString())
            intent.putExtra("cpf", editTxtCPF.text.toString())
            startActivity(intent)
        }
    }

}
