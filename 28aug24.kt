//class Rectangle(var a:Double, var b:Double){
//    fun area():Double{
//        return a*b ;
//    }
//    //        fun area(a:Double,b:Double):Double{
////            this.length=a;
////            this.breadth=b;
////            return a*b;
////
////        }
//    fun display(){
//
//        println("The area of rectangle with $a and $b is ${area()}");
//    }
//
//}
//
//fun main(){
//    var x=Rectangle(5.00,8.00);
//    x.display();
//
//}

open class Rectangle(var a:Double, var b:Double){
    fun area():Double{
        return a*b ;
    }
    //        fun area(a:Double,b:Double):Double{
//            this.length=a;
//            this.breadth=b;
//            return a*b;
//
//        }
    open fun display(){

        println("The area of rectangle with $a and $b is ${area()}");
    }

}




//Write a program recurrsion to find the factorial of a number

class square(var s:Double):Rectangle(s,s){

    override fun display(){
        println("The area of square with $a and $b is ${area()}");
    }

}
fun main(){
    var x=Rectangle(5.00,8.00);
    var y=square(10.0);
    x.display();
    y.display();

}
