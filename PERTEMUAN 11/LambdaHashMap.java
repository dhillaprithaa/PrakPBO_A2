//    File : LambdaHashMap.java  
//    Penulias : Dhila Pritha Amalia / 24060122140117

import java.util.*;

public class LambdaHashMap{
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("24060122140117","Dhila Pritha Amalia");
        map.put("26050119130059", "Esa Teguh Istiqomah");
        map.put("24060119130071", "Kaifano Zylanda Adhyatama");
        map.put("26050131130059", "Kiana Zeechestra Maheswari");

        map.forEach((key,value)-> {System.out.println("NIM/Key: "+key + " - Nama/Value : " + value);});
    }
}
