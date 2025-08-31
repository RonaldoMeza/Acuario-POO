package acuario

// Clase abstracta
abstract class Pez {
    abstract val color: String
}
// Interfaz
interface AccionPez {
    fun comer()
}
// Clases hijas
class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"

    override fun comer() {
        println("cazar y comer peces")
    }
}
class PezPayaso : Pez(), AccionPez {
    override val color: String = "dorado"

    override fun comer() {
        println("comer algas")
    }
}
