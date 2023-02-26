
package ru.netology

fun main() {

 val time = agoToText(660) // конструктор
    println(time)
}

fun agoToText(seconds: Int): String {
    //val secondInt2 = 61
    val hour = 60 * 60
    val minute = 60
    val day = hour * 24
    var timeOnlineSecond = when {
        seconds <= minute -> {
            "был только что"
        }

        seconds >= minute && seconds <= hour -> {
            var minute1 = seconds / 60
            var sec = minute1 % 10
            when {
                sec == 1 && minute1 != 11 -> {
                    "был(а) $minute1 минуту назад"
                }
                sec >= 2 && sec < 5 -> {
                    "был(а) $minute1 минуты назад"
                }
                else -> {
                    "был(а) $minute1 минут назад"
                }

            }
        }
        //Если количество секунд от 60 * 60 + 1 до 24 * 60 * 60 (сутки), вариант с x часов назад.
        seconds > hour && seconds <= day -> {
            val hour1 = seconds / hour
            var hour2 = hour1 % 10
            when {
                hour2 == 1 && hour1 != 11 -> {
                    "был(а) $hour1 час  назад"
                }

                hour2 >= 2 && hour2 < 5 -> {
                    "был(а) $hour1 часа назад"
                }

                else -> {
                    "был(а) $hour1 часов назад"
                }
            }
        }
           seconds >= day && seconds <= day * 2 ->
           { "вчера"}
           seconds >= day * 2 && seconds <= day * 3 -> {
               "позовчера"
           }
            else -> {
                "давно"
            }
        }
    return timeOnlineSecond
}

