package book.ios.taku.iso8583;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String bitmpa ="723CE5812AE09010";

        Map<String,String> hashmap = new HashMap<>();
        hashmap.put("0","0000");
        hashmap.put("1","0001");
        hashmap.put("2","0010");
        hashmap.put("3","0011");
        hashmap.put("4","0100");
        hashmap.put("5","0101");
        hashmap.put("6","0110");
        hashmap.put("7","0111");
        hashmap.put("8","1000");
        hashmap.put("9","1001");
        hashmap.put("A","1010");
        hashmap.put("B","1011");
        hashmap.put("C","1100");
        hashmap.put("D","1101");
        hashmap.put("E","1110");
        hashmap.put("F","1111");

















        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<bitmpa.length();i++)
        {

           String c = String.valueOf(bitmpa.charAt(i));
            sb.append(hashmap.get(c));




        }

String binary = sb.toString();

        for(int i=0;i<binary.length();i++)
        {

            if(String.valueOf(binary.charAt(i)).equals("1"))
            {

                list.add(String.valueOf(i+1));

            }


        }
        Log.d("asdasdsad",sb.toString());
        Log.d("asdasdsad",list.toString());



    }
}
