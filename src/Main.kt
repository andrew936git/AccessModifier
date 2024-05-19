import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val reg = Registration()
    println(reg.getEmail())
    reg.setPassword("abcde")

//2
    val random = Random
    val matrix1: Array<Array<Int>> = Array(4) { Array(4) { random.nextInt(0,100) } }
    evenNumbers(matrix1)
    println()

//3
    val matrix2: Array<Array<Int>> = Array(4) { Array(4) { 0 } }
    fillingArray(matrix2)
    for (i in matrix2.indices){
        for (j in matrix2[i].indices){
            print("${matrix2[i][j]}\t")
        }
        println()
    }
    println()

//4
    val array: Array<Int> = Array(10){random.nextInt(-10, 10)}
    for (i in array){
        print("$i ")
    }
    println()
    printPositiveElement(array)

}

fun evenNumbers(array: Array<Array<Int>>) {
    for (i in array.indices){
        for (j in array[i].indices){
            if (array[i][j] % 2 == 0) print("${array[i][j]} ")
        }
    }
}

fun fillingArray(array: Array<Array<Int>>): Array<Array<Int>>{
    val random = Random
    for (i in array.indices){
        for (j in array[i].indices){
            array[i][j] = random.nextInt(1, 17)
        }
    }
    return array
}

fun printPositiveElement(array: Array<Int>){
    for (i in array){
        if (isPositive(i)) print("$i ")
        else continue
    }
}
fun isPositive(num: Int): Boolean{
    return num > 0
}