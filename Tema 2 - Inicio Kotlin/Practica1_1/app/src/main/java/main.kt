fun main() {

    println("Hola mundo.")

    // Las variables pueden ser mutables (var) o inmutables (val):
    var m = "mutable"
    val n = "inmutable"

    //Se puede no especificar o especificar el tipo de dato:
    var cucu = 3
    var coco: Int
    var cece = Int

    // Se puede cambiar de tipo una variable y almacenarlo en otra.
    var dede = 3.5f // 'f' al final para indicar float.
    var didi = dede.toInt()


    // If else

    val lala = 19
    println("Tengo " + lala + " euros (€).")

    if (lala is Int) {
        println("La variable es un entero.")
    } else {
        println("La variable no es un numero entero.")
    }

    // Se pueden asignar valores a variables usando condiciones.
    val x = 5
    val y = 3
    val z = 8

    val max = if(x>y){
        x
    }else{
        y
    }


    // Sustituto de Switch case

    var provincia = "Granada"

    when(provincia){
        "Granada"-> {
            println("Bienvenido a Granada")
        }
        "Malaga" ->{
            println("Bienvenido a Malaga")
        }else ->{
            println("Bienvenido a la nada")
        }
    }


    // Otra forma de Switch case multiple
    when(provincia){
        "Granada","Malaga","Jaen","Almeria","Sevilla","Cadiz","Cordoba","Huelva" -> {
            println("Bienvenido a ${provincia}")
        }else ->{
            println("No estás en Andalucia")
        }
    }

    // Se pueden devolver booleanos comprobando varios valores a la vez
    when(provincia){
        "Granada","Malaga","Jaen","Almeria","Sevilla","Cadiz","Cordoba","Huelva" -> {
            true
        }else ->{
        false
        }
    }

    //Se puede usar el simbolo del dolar para llamar variables en Strings
    println("La variable tiene el valor $lala")

    // Arrays.

    val provinciasAndalucia = arrayOf("Granada","Málaga","Almeria","Córdoba","Sevilla","Huelva","Cádiz","Jaén")

    println("La primera provincia del array es ${provinciasAndalucia[0]}.")
    println("El número de elementos del array es ${provinciasAndalucia.size}.")


}

