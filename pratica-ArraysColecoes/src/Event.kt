data class Event(
    val title: String,
    val description: String? =null,
    val dayPart: DayPart,
    val time: Int,
)