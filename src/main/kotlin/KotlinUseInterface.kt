class KotlinUseInterface: JavaInterface {
    override fun hello() {
        println("hello!!")
    }
}

fun main(){
    val greeter = KotlinUseInterface()
    greeter.hello()
}
