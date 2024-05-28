class obj{
var name:String="arshad";
var surname="";
}


fun main(){

var obj1=obj();
//Creating obj instance
obj1.surname="ahamed";
println("${obj1.name} and ${obj1.surname}");

//Modifing instance value
obj1.name="abi";
println("${obj1.name} and ${obj1.surname}");

}