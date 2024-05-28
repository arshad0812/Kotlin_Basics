fun main() {
    println("Type Conversion")
    var wrd:String="123";

    var num=wrd.toInt()
    println("num : ${num} is ${num::class.java.simpleName}");

    var wrd2=num.toString();
    println("wrd2 : ${wrd2} is ${wrd::class.java.simpleName}");
    
    //float to int
    var fval=1.21;
    var ival=fval.toInt();
    println("num : ${ival} is ${ival::class.java.simpleName}");
    
    //int to float
    
    var ffval=ival.toDouble();
    println("num : ${ffval} is ${ffval::class.java.simpleName}");

    
}
