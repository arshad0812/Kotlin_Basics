
class mthd(var name:String){
    var firstname:String="";
    
    fun mthd1(wrd:String):String{
        var newwrd:String="Hi,"+wrd;
        return newwrd;
    }
    
    fun mthd2(arr:Array<Int>):Array<Int>{
        arr[0]=10;
        return arr;
    }
    
    fun mthd3(arrlist:ArrayList<Int>):ArrayList<Int>{
        arrlist.add(10);
        return arrlist;
    }
    
    fun mthd4(hmap:HashMap<String,Int>):HashMap<String,Int>{
        hmap.put("final",4);
        return hmap;
    }
}


fun main() {

    println("Mehtods in Kotlin");
    
    //Passing and Returing String in class method
    var obj1=mthd("Method");
    println(obj1.mthd1("Arshad"));
    
    //Passing and retruning Array in class Method
    var arr=arrayOf<Int>(1,2,3);
    var brr=obj1.mthd2(arr);
    
    for(i in brr)
    {
        println(i);
    }
    
    //Passing and retruning Arraylist in class Method
    var arrlist=ArrayList<Int>(listOf(1,2,3));
    var brrlist=obj1.mthd3(arrlist);
    
    for(i in brrlist){
        println(i);
    }
    
    
    //Passing and retruning Arraylist in class Method
    var hmap=hashMapOf("arshad" to 1,"ahamed" to 2);
    hmap.put("abi",3);
    var hmap1=obj1.mthd4(hmap);
    
    for((key,value) in hmap1)
    {
        println("${key} and ${value}");
    }
    
    
    

}
