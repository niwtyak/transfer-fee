
fun transferFee(amount:Int):Double{
    val fee = amount * 0.0075
    return if (fee >= 35) fee else 35.0
}

fun main(){
    val amount1 = 1500000
    val amount2 = 1000

    println("Комиссия за перевод ${amount1 / 100} рублей: ${transferFee(amount1)} копеек")
    println("Комиссия за перевод ${amount2 / 100} рублей: ${transferFee(amount2)} копеек")
}