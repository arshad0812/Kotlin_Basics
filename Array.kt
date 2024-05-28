fun main() {
    println("Array")
    var arr=arrayOf<Any>(1,2,3);
    var  arr1=arrayOf(3,4,5);
    var i:Int=0;
    //Empty Array
    var arr2=arrayOf<Int>();
    arr2=arr1+6 ;

    while(i<arr2.size)
    {
        print(arr2[i])
        i++;
    }
    i=0;
    
    //List
    var lst1=mutableListOf(1,2,3);
    lst1.add(6);
    while(i<lst1.size)
    {
        print(lst1[i])
        i++;
    }
    i=0;
    
    // Adding new element
    var newarr=arr+4;
    while(i<newarr.size)
    {
        print(newarr[i])
        i++;
    }
    
    //empty Array
    var arr3=Array<Int>(4){0};
    arr3=arr2+4;
    i=0;
    while(i<arr3.size)
    {
        println(arr3[i])
        i++;
    }
    
    
    //Hashmap
    var hmap=HashMap<Int,String>();
    var hmap1=hashMapOf(1 to "arshad",2 to "abi");
    hmap.put(1,"Arshad");
    hmap[0]="abi";
    for((key,value) in hmap1)
    {
        println("${key} and ${value}");
    }
    hmap.remove(1);
    println(hmap1.size);
    println(hmap.containsKey(2));

    //ArrayList 
    var arrlist=ArrayList<Int>(listOf(1,2,3));
    print(arrlist);
    



}
