fun main(args: Array<String>) {
        //Pedidndo informações ao usuário
        println("Nome: ")
        var nome: String? = readLine()
        println("Sexo: ")
        var sex: String? = readLine()
        println("Idade: ")
        val userInput: String? = readLine()
        val idade: Int? = userInput?.toInt()

        print("Nome: $nome\nIdade: $idade\nSexo: $sex\n")

        //Verificação
        when(idade){
            0 -> println("Idade vazia.")
            in 1..25 -> println("Jovem de $idade anos.")
            in 26..59 -> println("Adulto de $idade anos.")
            else -> println("Idoso de $idade anos")
        }

        //Criando vetores, adicionando valores e concatenandoos
        val lista1 = mutableListOf("","","","","")
        val array = arrayOf("","","","","")
        //Percorrendo os indices e os elementos ao mesmo tempo
        for((i, element) in lista1.withIndex()){
            print("Nome $i(Lista):\n")
            lista1[i] = readLine().toString()
            print("Nome $i(Array):\n")
            array[i] = readLine().toString()
        }
        println("Lista: $lista1\n")
        println("Array:\n"+java.util.Arrays.toString(array))
        val LA = lista1 + array
        println("Listas concatenadas: $LA\n")
        lista1.removeAt(2)
        println("Removando indice 2 da lista: $lista1")

        //Array de 5 elementos indo de 2 em 2
        var array2 = Array (5) {it * 2}
        print("Array de 5 elemntos indo de 2 em 2: " + java.util.Arrays.toString(array2))

        //percorrendo o array
        for(i in array2){
            print("\nArray percorrido:,$i")
        }

        for(i in 1..5) print(i)
        println()
        for(i in 5 downTo 1) print(i)
        println()
        for (i in 1..10 step 2) print(i)
        println()
        for (i in 'a'..'g') print(i)
        println()

        var i = 0

        while (i<10) i++
        println(i)
        do {
            i--
        }while (i>1)
        println(i)

        repeat(3){println("Me tornarei o melhor programador")}
    }