import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar el ViewModel
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        // Configurar un clic en el botón para realizar la comparación
        compareButton.setOnClickListener {
            val num1 = editText1.text.toString()
            val num2 = editText2.text.toString()
            viewModel.compareNumbers(num1, num2)
        }

        // Observar el LiveData en el ViewModel y actualizar el TextView
        viewModel.result.observe(this, { result ->
            resultTextView.text = "Resultado: $result"
        })
    }
}
