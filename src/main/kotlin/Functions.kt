// Menu del programa amb les opcions
fun menu() {
    asciiBenvinguts()
    println("Escogeix una opció per a jugar!")
}

fun opciones(num: Int) {
    when (num) {
        1 -> pedraPaperTisores()
        2 -> adivinaNumero()
        3 -> ahorcado()
        4 -> buscaminas()
        5 -> memoria()
        6 -> tresEnRaya()
        7 -> laberinto()
        8 -> snake()
        9 -> pong()
        10 -> dados()
        11 -> ruleta()
    }
}

