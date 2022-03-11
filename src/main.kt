fun main() {
    people("judith","sharon","joy","beril")
    cities()
    ages()
    var result=place(arrayOf())
    println(result.contentToString())

}
    fun people(a:String,b:String,c:String,d:String) {
        var names = arrayOf(a,b,c,d)
        println(names.contentToString())

}
    fun cities() {
        var cities = arrayOf("harare","mumbai","dodoma","jakarta")
        cities.sortedArray().forEach { y ->

            println(y.capitalize())
        }

    }
fun ages() {
    var numbers1 = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var sum = numbers1[1] + numbers1[4]
    println(sum)

    var sort=numbers1.indexOf(158)
    println(sort)

    var sort2=numbers1.sortedArray()
    println(numbers1.contentToString())

}

fun place(name:Array<String>):Array<String> {
    var result = arrayOf("Nairobi", "Kisumu", "Siaya")
    return result
}

