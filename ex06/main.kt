fun main() {
    println("Digite a temperatura dos 30 dias do mês (separe os valores por ';')")
    val temps: List<String> = readln()!!.replace(",", ".").replace(" ", "").split(";")
    
    println("-----> Fazendo a média de ${temps.size} dias <-----")
    var temp: Float = temps[0].toFloat()
    var soma: Float = temp
    var maxTemp = floatArrayOf(temp, 0f)
    var minTemp = floatArrayOf(temp, 0f)
    
    for (i in 1..temps.size - 1) {
        temp = temps[i].toFloat()
        soma += temp
        
        if (temp > maxTemp[0]) {
            maxTemp[0] = temp
            maxTemp[1] = i.toFloat()
        } else if (temp < minTemp[0]) {
            minTemp[0] = temp
            minTemp[1] = i.toFloat()
        }
    }
    
    println("A média das temperaturas é: ${soma/temps.size}")
    println("A temperatura máxima foi ${maxTemp[0]} no dia ${maxTemp[1]}")
    println("A temperatura minima foi ${minTemp[0]} no dia ${minTemp[1]}")
}