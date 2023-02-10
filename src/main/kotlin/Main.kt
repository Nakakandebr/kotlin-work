
fun main(){
    greetperson("Bridget")
    var x= getdivision(6,4)
    println(x)
    var z= addition(40, 30,60,20)
    println(z)
    factAboutmyself(" is  that I love Clubbing")
    factAboutmyself("is that Iam a social person")

}
fun greetperson(name: String){
    println("Hi $name")
}
fun getdivision(num1:Int, num2: Int): Int{
    var modulus = num1 % num2
    return modulus
}
fun addition(num1: Int,num2: Int, num3: Int, num4: Int): Int{
    var sum = num1+num2+num3+num4
    return sum
}
fun factAboutmyself(fact: String){
    println("The interesting thing about my self $fact")
}
