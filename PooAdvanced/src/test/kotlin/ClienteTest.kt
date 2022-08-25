import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ClienteTest {

    val cliente = Cliente(
        "luana",
        "rua blabla",
        "9999999"
    )

    @BeforeEach
    fun addCompratest() {
        cliente.addCompra("Arroz")
        cliente.addCompra("Feijão")
        cliente.addCompra("Macarrão")
        cliente.addCompra("nescau")

    }

    @Test
    fun addCompraTest() {

        assertEquals(4, cliente.listaComprastests.size)
        assertEquals(0, cliente.listaComprastests.indexOf("Arroz"))//comparando se a posição 0 da lista é Arroz

    }

    @Test
    fun removeCompraTest() {

        assertEquals(2, cliente.listaComprastests.indexOf("Macarrão"))//verificando se na posi 2 tem mac

        cliente.removeCompra("macarrão")//removendo o macarrão


        assertFalse(cliente.listaComprastests.contains("macarrão"))// verificando se realmente saiu da lista
    }
}