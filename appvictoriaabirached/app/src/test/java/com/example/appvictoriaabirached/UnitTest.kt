import org.junit.Test

class MyViewModelTest {

    @Test
    fun testComparison() {
        val viewModel = MyViewModel()

        viewModel.compareNumbers("5", "3")
        assert(viewModel.result.value == "Número 1 es mayor")

        viewModel.compareNumbers("2", "8")
        assert(viewModel.result.value == "Número 2 es mayor")

        viewModel.compareNumbers("abc", "def")
        assert(viewModel.result.value == "Ingresa números válidos")
    }
}
