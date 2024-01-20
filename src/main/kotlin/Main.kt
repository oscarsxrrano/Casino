import org.example.*

fun main() {

    val errorINT = "Has d'introduir un número positiu!"

    do {
        // Mostrar menú
        println(CYAN_BACKGROUND_BRIGHT + BLACK_BOLD_BRIGHT)
        menu()
        // Elegir juego
        val opcio = readInt("A quin joc vols jugar?", errorINT)
        opciones(opcio)
    } while (true)

}