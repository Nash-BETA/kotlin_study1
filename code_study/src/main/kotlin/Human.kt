class Human: JavaClass() {
    override fun cry(){
        println("ホーイ")
    }
}

fun main(){
    val java_class = Human()
    java_class.cry()

    val human = JavaClass()
    human.cry()
}
