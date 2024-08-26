//////fun demo(){
//////    print("hi syed")
//////}
//////fun main(){
//////    demo()
//////}
//////
//////
//////
////fun main() {
////    //add(10,20);
////   add()
////
////
////}
////fun add(a:Int=10, b:Int=20){
////    var c=a+b;
////    println(c)
////
////}
//
//fun main() {
// //   var num1=readln().toInt();
// //   var num2=readln().toInt();
//    val num1 = 20
//    val num2 = 40
//    toCelsius(num1);
//    toFahernheit(num2);
//
//}
//
//fun toCelsius(a:Int){
//    var d= (a *1.8)+32;
//    println("Fahrenheit to Celsius: $d");
//
//}
//
//fun toFahernheit(a:Int){
//    // var e=()
//    var e= (a-32)*(5/9);
//    println("Celsius to Fahrenheit $e");
//
//}

fun main() {

    var num1=readln().toInt();
    var num2=readln().toInt();
    toCelsius(num1);
    toFahernheit(num2);



}

fun toCelsius(a:Int){
    var d= (a *1.8)+32;
    println("Fahrenheit to Celsius: $d");

}

fun toFahernheit(b:Int){
    var e= (b-32)*(5/9);
    println("Celsius to Fahrenheit $e");

}
