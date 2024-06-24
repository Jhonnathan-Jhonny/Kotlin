

fun main(){
    val colors = listOf("Red","Green","Blue")

    println(colors[2])

    println(colors.get(2))
}



//
//fun main() {
//    val event1 = Event("Study Kotlin","Commit to studying Kotlin at least 15 minutes per day.",DayPart.MORNING,15)
//    val event2 = Event("Study Java","Commit to studying Java at least 15 minutes per day.",DayPart.MORNING,15)
//    val event3 = Event("Study JavaScript","Commit to studying JavaScript at least 15 minutes per day.",DayPart.MORNING,15)
//    val event4 = Event("Study NodeJS","Commit to studying NodeJS at least 15 minutes per day.",DayPart.AFTERNOON,15)
//    val event5= Event("Study Go","Commit to studying Go at least 15 minutes per day.",DayPart.AFTERNOON,15)
//    val event6 = Event("Study Fluter","Commit to studying Fluter at least 15 minutes per day.",DayPart.AFTERNOON,15)
//    val event7 = Event("Study C++","Commit to studying C++ at least 15 minutes per day.",DayPart.AFTERNOON,15)
//    val event8 = Event("Study C#","Commit to studying C# at least 80 minutes per day.",DayPart.NIGHT,80)
//    val event9= Event("Study C","Commit to studying C at least 80 minutes per day.",DayPart.NIGHT,80)
//
//    val eventList: MutableList<Event> = mutableListOf(event1,event2,event3,event4,event5,event6,event7,event8,event9)
//
//    val eventShortest = eventList.filter { it.time < 60}
//    for(item in eventShortest) {
//        println(item)
//    }
//
//    val eventDayPart = {valor: DayPart -> eventList.filter { it.dayPart == valor }}
//    println("Morning: ${eventDayPart(DayPart.MORNING).size} events")
//    println("Afternoon: ${eventDayPart(DayPart.AFTERNOON).size} events")
//    println("Night ${eventDayPart(DayPart.NIGHT).size} events\n")
//                //OU
//    val groupedEvents = eventList.groupBy { it.dayPart}
//    groupedEvents.forEach {
//        println("${it.key}: ${it.value.size} events")
//    }
//
//    println("Last event is: ${eventList.last().title}")
//    println("Duration of first event of the day: ${eventList[0].durationOfEvent}")
//
//}
//
//val Event.durationOfEvent: String
//    get() = if (this.time < 60) {
//        "short"
//    } else {
//        "long"
//    }