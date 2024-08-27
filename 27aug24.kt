// // class XYX{
// //    fun intro(){
// //        println("hello")
// //    } 
// // }
// // fun main(){
// //     var a =XYX()
// //     a.intro()
// // }


// // class Introducation{
// //     var name:String
// //     val age:Int
// //     constructor( x:String , y:Int){
// //         this.name = x
// //         this.age = y
// //     }
// //     constructor(x:String){
// //         age = 0;
// //         name = x;
// //     }
// //     constructor(){
// //         name ="syed"
// //         age = 30
// //     }
    
// // }

// // fun main(){
// // }

// class intro{                                   // secondary constructor
//     var name:String
//     var age:Int

//     constructor( x:String,  y:Int){
//         this.name=x
//         this.age=y
//     }

//     constructor( x:String){
//         this.name=x
//         this.age=0

//     }

//     constructor( ){
//         this.name="Unique";
//         this.age=0;
//     }

//     fun inttro(){
//         println("My name is $name and $age ");

//     }
// }


// fun main(){
//     var a=intro("Izaz",10);
//     a.inttro();
//     var b=intro("Syed");
//     b.inttro();
//     var c=intro();
//     c.inttro();


// }



class Intro(var name:String ,var age:Int){         //primary constructor
    constructor(x:String):this(){
        this.name=x
        this.age =0
    }             
    constructor():this("abc",40)
        
    
    fun intrro(){
        println("my name is $name and age is $age")
    }
}
fun main(){
    var a=Intro("Syed",20)
	a.intrro()
    var b=Intro()
    b.intrro()
}
