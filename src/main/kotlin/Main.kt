fun main(){
   sortedArray(arrayOf(1,2,3), arrayOf(4,5,6))
    println(reverseString("Teresiah"))

    removeDuplicates("banana")

}
fun sortedArray(num1:Array<Int>,num2:Array<Int>){
     var arr3=num1+num2
    println(arr3.contentToString())

}
fun reverseString(word:String):String{
    return word.reversed()
}
 fun removeDuplicates(name:String){
     val name1= name.toSet()

     println(name1)
 }