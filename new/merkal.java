
// lis [1,2,3,4,5]

// {
//     1:hash
//     data:{
//             sender:public
//             receiver:public
            // previous_block:hash
//         }

// }

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;


class merkal{
    static HashMap<Integer,String> data_chain= new HashMap<>();
      static  int transaction=0;

    static byte[] hash(String data)throws NoSuchAlgorithmException{
         MessageDigest md = MessageDigest.getInstance("SHA-256");
         return md.digest(data.getBytes(StandardCharsets.UTF_8));
    }

    static String toHexString(byte[] hash)
    {
        BigInteger number = new BigInteger(1, hash);
        StringBuilder hexString = new StringBuilder(number.toString(16));
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }
        return hexString.toString();
    }

static void create_trans(int tran_no,String sender){
    try{
    data_chain.put(tran_no,toHexString(hash(sender)));
    transaction++;
        // System.out.println("::" + transaction);
        
    }
   catch (Exception e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
}




static  String check(int item){
    String d;
    if(item%2 == 0){
        // left
       d= data_chain.get(item).toString()+data_chain(item-1).toString();
    }
    else{
        // right
        
       d= data_chain.get(item)+data_chain(item+1);
    }
    return d;

}

    public static void main(String args[]){
    
        

        try{
        // System.out.println(toHexString(hash("asdadads")));
create_trans(1,"ass");
create_trans(3,"asasas");
create_trans(2,"aasdadss");
create_trans(4,"aasdadss");
create_trans(5,"aasdadss");

        }
         catch (Exception e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }


        for(int i=1;i<=transaction;i++){
            System.out.println(i+":"+data_chain.get(i));
        
        }
    }
}