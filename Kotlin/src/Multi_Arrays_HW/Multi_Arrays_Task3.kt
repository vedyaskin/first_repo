package Multi_Arrays_HW

fun main(){
    val matrix = Array(size = 5) { Array(size = 5) { 0 } }
    var count = 0

    for ( i in matrix.indices.reversed() ){

        for (j in 0 + count..matrix[i].lastIndex - count ){
            matrix[i][j] = 1
        }
        count++
    }
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            print("${matrix[i][j]} ")
        }
        println()
    }
}
