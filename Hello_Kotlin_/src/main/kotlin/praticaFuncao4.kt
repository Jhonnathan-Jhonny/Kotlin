fun main(args: Array<String>){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val list = spices.filter { it.startsWith('c') && it.endsWith('e')}
    println(list)
}

//- Classificando curries pelo tamanho da string
//```
//spices.filter { it.contains("curry") }.sortedBy { it.length }
//```
//- Filtrando pelos que começam com 'c' e terminam com 'e'
//```
//spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}
//> [cayenne]
//```
//OU
//```
//spices.filter { {it.startsWith('c') && it.endsWith('e') }
//    > [cayenne]
//    ```
//    - Filtrando os 3 primeiros itens com 'c'
//    ```
//    spices.take(3).filter{it.startsWith('c')}
//    > [curry, cayenne]
//    ```