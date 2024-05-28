//Const coundnt be declared insider main
const val constwrd=1;

fun main(){

    //Typeinference
    var number=1;
    println(number);
    var wrd="Arshad";
    var condition=true;
    var percentage=1.1;
    println("${wrd} and ${condition} and ${percentage}");


    //Late decalration
    var number1:Int;
    number1=1;
    var wrd1:String;
    wrd1="Hello";
    var condition1:Boolean;
    condition1=true;
    var percentage1:Float;
    percentage1=1.1f;
    var accuracy:Double;
    accuracy=1.111111;
    var letter:Char;
    letter='a';

    //Empty variable
    var name1=null;
    println(name1);

    //Assign new values to variable
    var name2="arshad";
    name2="aashish";
    println(name2);

    //Late Val Defining
    var name3:String;
    name3="Jimmy";
    println(name3);

    //Any
    var anywrd:Any;
    anywrd="Hi";
    println(anywrd);

    //printing values
    println("${name1} and ${name2}");
    println("name 1:"+name1);


    //val aka final
    val finalwrd=1;
//    gives error finalwrd=3;
    print(finalwrd);

    print(constwrd);



}