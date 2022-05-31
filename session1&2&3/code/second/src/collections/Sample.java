package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sample {


    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();

        var x=new ArrayList<>();



        Set<Integer> nums2=new HashSet<>();
        nums.add(5);
        nums.add(5);
        nums.add(15);
        nums.add(20);

        nums.remove(5);


        for(Integer i:nums){
            System.out.println(i);
        }

        nums.forEach(item ->{
            System.out.println(item);
        } );


    }
}
