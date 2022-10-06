package com.example.practica1_2

// Funcion que calcula el area de un triangulo
fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

// A las funciones se les pueden dar valores de variables de entrada predeterminados, que se usarán
// cuando no haya ninguno
fun f(a: Int, b: Int = 1, c: Int = 2): Int {
    return a * b + c
}

fun subrayarTexto(texto: String, subrayado: String = "*") {
    println(texto)
    for (i in 0..texto.length) {
        print(subrayado)
    }
    println()
}

fun main() {

//    println(areaTriangulo(12.5, 5.0))
//
//    println(f(1))
//
//    println(f(1, 2, 3))
//
//    println(f(1, c = 3))
//
//    println(f(2, 1))
//
//    subrayarTexto("Prueba de texto subrayado sin especificar simbolo")
//    subrayarTexto("Prueba de texto subrayado especificando simbolo", "-")


    val preguntas = arrayOf("¿En que año se descubrió América?","¿Cuáles son los cinco tipos de sabores primarios?","¿Cuál es el lugar más frío de la tierra?",
    "¿Cuál es el río más largo del mundo?"," ¿En qué continente está Ecuador?","¿Dónde originaron los juegos olímpicos?")

    val respuestas = arrayOf(arrayOf("1 - 1942","2 - 1492","3 - 1530"),
                             arrayOf("1 - Dulce, Salado, Amargo, Ácido, Motomami","2 - Salado, Dulce, Amargo, Fuerte, Umami"),"3 - Dulce, Amargo, Ácido, Salado, Umami");
                             arrayOf("1 - Lo mas profundo de la fosa de las marianas","2 - Antártida","3 - Antartica");
                             arrayOf("1 - Teide","2 - Nilo","3 - Amazonas");
                             arrayOf("1 - Europa","2 - África","3 - América");
                             arrayOf("1 - Grecia","2 - Venecia","3 - Roma")

    val correctas = arrayOf(2,3,2,3,3,1)

    for (i in 0..preguntas.size){
        println(preguntas[i])
        for(i in respuestas){

        }
    }

    // Inmutable 'val'
//    val provincias = arrayOf("Granada","Jaen","Almeria","Malaga")
//
//    for(p in provincias){
//        println(p)
//    }
//
//    for(i in 1..100) {
//        print("$i - ")
//    }
//
//    var suma = 0
//    for(i in 1..10){
//        println("Dime un valor: ")
//        val valor = readln().toInt()
//        suma += valor
//    }
//    println(suma)

    // Se pueden hacer for que vayan de varios en varios:
//
//    println("Los numeros pares entre 10 y 40 son: ")
//    for (i in 10..40 step 2){
//        println(" $i ")
//    }

    // Es posible contar hacia atrás, incluso texto usando el mismo texto como rango:
//
//    println("La palabra palindromo al revés es: ")
//
//    val palabra = "Palindromo"
//    // Es necesario usar downTo en este caso para ir marcha atrás.
//    for(i in "Palindromo".length-1 downTo 0){
//        print(palabra[i])
//    }
//    println("")
//
//    // La funcion .slice(x..y) devuelve lo que hay en el string desde x a y-1
//    println("La palabra Palindromo cogiendo de la letra 1 a la 3 es: ")
//    println(palabra.slice(1..3))

    // BUCLES WHILE
//
//    var x = 0
//    while(x<= 100){
//        print(x)
//        x++
//    }
//    println("Escribe un vehiculo de entre: 'Coche', 'Avion', 'Moto'")
//    do {
//        val vehiculo = readln();
//        if (vehiculo == "Coche") {
//            println("Tiene cuatro ruedas y corre hasta los 300 km/h.")
//        } else if (vehiculo == "Avion") {
//            println("Tiene 2 ruedas desplegables y vuela ")
//        } else if (vehiculo == "Moto"){
//            println("Tiene 2 ruedas y corre menos que un coche")
//        }else{
//            if(vehiculo == "Salir"){
//                println("Adios")
//            }else{
//                println("Escribe un vehiculo de entre: 'Coche', 'Avion', 'Moto'")
//            }
//        }
//    }while(vehiculo != "Salir")

//    var boolean = true
//    while(boolean){
//        print("Escribeme un numero del 1 al 10: ")
//        val num = readln().toInt()
//        if(num>10 || num<0){
//            println("Te dije del 1 al 10.")
//            break
//        }else{
//            var operando = (Math.pow(num.toDouble(),2.0))*30
//            println("Tu numero elevado a 2 y multiplicado por 30 es: $operando")
//        }
//    }

//    for(i in 0..100){
//        if(i % 5 != 0){
//            continue
//        }
//        println(i)
//
//
//    }

}