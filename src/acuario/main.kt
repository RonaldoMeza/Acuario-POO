package acuario

fun construirAcuario(){
    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()

}
fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El tiburón es de color ${tiburon.color}")
    println("El pez payaso es de color ${pezPayaso.color}")

    tiburon.comer()
    pezPayaso.comer()
}
fun main() {
    construirAcuario()
    crearPeces()
}
