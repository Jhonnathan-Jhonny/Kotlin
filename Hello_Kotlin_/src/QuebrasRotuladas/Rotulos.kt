package QuebrasRotuladas

fun rotulos(){
    Loop@ for (i in 1..100) {
        print("$i ")
        for (j in 1..100) {
            if (i > 10) break@Loop  //quebra para o loop externo
        }
    }
}

fun main(){
    rotulos()
}
