package aulasarray

fun main(){

    val arrayElementos =
        Array<String>(size = 4,
        init = {index -> "Elementos do Array ($index)"})

    println("Tamanho do Array: ${arrayElementos.size}")

    println("Elemento posição 0: ${arrayElementos.get(0)}")
    println("Elemento posição 1: ${arrayElementos.get(1)}")
    println("Elemento posição 2: ${arrayElementos.get(2)}")
    println("Elemento posição 3: ${arrayElementos.get(3)}")

    arrayElementos.set(1, "Campo Grande")

    println("Elemento posição 1: ${arrayElementos.get(1)}")

}