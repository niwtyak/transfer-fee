
fun transferFee(amount:Int):Double{
    val fee = amount * 0.0075
    return if (fee >= 35) fee else 35.0
}

fun main(){
    val amount1 = 15000000
    val amount2 = 228000

    println("Комиссия за перевод ${amount1 / 100} рублей: ${transferFee(amount1) / 100} рублей")
    println("Комиссия за перевод ${amount2 / 100} рублей: ${transferFee(amount2) / 100} рублей")

}