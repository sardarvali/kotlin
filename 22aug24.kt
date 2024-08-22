////////////fun main(){
////////////    for (i in 1 until 5){
////////////        print(i)
////////////    }
////////////}
//////////
//////////fun main(){
//////////    for (i in 1 .. 5){
//////////        print(i)
//////////    }
//////////}
////////
////////fun main(){
////////    for (i in 5 .. 1){
////////        print(i)                         // it will not work because it will work for increment
////////    }
////////}
//////
//////fun main(){
//////    for (i in  5 downTo 1){
//////        print(i)
//////    }
//////}
////
////
////fun main(){
////    for (i in 10 downTo 1 step 2){
////        print(i)
////    }
////}
//
//
//fun main(){
//    var letter = arrayOf("a" , "b" ,"c" , "d" , "e",100)
//    for(i in letter){
//        println(i)
//    }
//}


fun main(){
    var letter = arrayOf("hi", "Hello" , 123)
//    var firstLetter = letter[0]
//    var secondLetter = letter[1]
//    var thirdLetter = letter[2]
//    println("Element at  0 index is $firstLetter")
//    println("Element at  1 index is $secondLetter")
//    println("Element at  2 index is $thirdLetter")
    for(i in letter.indices){
        println("elemt at index $i is ${letter[i]}")
    }

}
