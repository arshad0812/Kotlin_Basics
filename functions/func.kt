
fun func1(name:String):String{
    var nname:String="Hi,"+name;
    return nname;
}

fun func2(arr:Array<Int>):Array<Int>{
    arr[0]=10;
    return arr;
}

fun func3(hmap:HashMap<String,Int>):HashMap<String,Int>{
    hmap.put("Arshad",1);
    return hmap;
}


fun main(){

    println(func1("Arshad"));
    
    var arr=arrayOf<Int>(1,2,3);
    var brr=arrayOf<Int>();
    brr=func2(arr);
    
    for(i in brr){
        println(i);
    }
    
    var hmap=HashMap<String,Int>();
    hmap.put("Ahamed",2);
    hmap.put("abi",3);
    
    var hmap1=HashMap<String,Int>();
    hmap1=func3(hmap);
    
    for((key,value) in hmap1)
    {
        println("${key} and ${value}");
    }
    
    
}