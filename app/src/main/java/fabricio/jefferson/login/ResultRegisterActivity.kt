package fabricio.jefferson.login

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class ResultRegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_register)

        val name = findViewById<TextView>(R.id.txtViewName)
        name.text = intent?.getStringExtra("name")

        val cpf = findViewById<TextView>(R.id.txtViewCPF)
        cpf.text = intent?.getStringExtra("cpf")
    }

}
