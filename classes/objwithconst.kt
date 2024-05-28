class obj(var name: String,var surname: String){
var firstname=name;
    

}



fun main(){
    var obj1=obj("arshad","ahamed");
    obj1.firstname="abi"
    println("${obj1.name} amnd ${obj1.surname} and ${obj1.firstname}");
}