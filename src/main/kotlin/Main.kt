val comission = 0.075 //комиссия 0.75%
val minComission = 35.00 //минимальная комиссия

fun main() {

    val amout = 1000.50 //сумма перевода
    val finalCommission = if (amout * comission < minComission) { minComission
    } else { amout * comission }
    val amoutFormat = String.format("%.2f", amout) //отформатированный до сотых вывод введеной суммы перевода
    val finalCommissionFormat = String.format("%.2f", finalCommission) //отформатированный до сотых вывод комиссии
    val finalSumFormat = String.format("%.2f", (amout - finalCommission)) //отформатированный до сотых вывод перевода

    println("При переводе " + amoutFormat + "\nКомиссия составит: " + finalCommissionFormat +
            "\nСумма к зачислению " + finalSumFormat)

}