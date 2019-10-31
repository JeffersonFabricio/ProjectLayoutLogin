package fabricio.jefferson.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnCancel = findViewById<Button>(R.id.btnCancelRegister)
        btnCancel.setOnClickListener {
            finish()
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
