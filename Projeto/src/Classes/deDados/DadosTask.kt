package Classes.deDados

import Classes.Task

data class DadosTask(
    val title: String,
    val description: String,
    val duaDate: Triple<Int, Int, Int>,
    var status: Boolean)