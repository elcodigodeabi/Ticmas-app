import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private val _result = MutableLiveData<String>()
    val result: LiveData<String> = _result

    fun compareNumbers(num1: String, num2: String) {
        val n1 = num1.toIntOrNull()
        val n2 = num2.toIntOrNull()

        if (n1 != null && n2 != null) {
            _result.value = if (n1 > n2) "Número 1 es mayor" else "Número 2 es mayor"
        } else {
            _result.value = "Ingresa números válidos"
        }
    }
}
