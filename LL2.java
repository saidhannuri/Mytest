package ds;

import java.util.*;
import java.util.Map.Entry;

public class LL2 {

public void Freq(int a[])
{
	
	HashMap<Integer,Integer> h=new HashMap();
	
	for (int i = 0; i < a.length; i++) {
		if(h.containsKey(a[i]))
		{
			int count=h.get(a[i]);
			count++;
			h.put(a[i], count);
			if(count>a.length/2)
			{
				System.out.println("the majority elenment is" + a[i]);
			}
			/*else 
				System.out.println("the majority elenment is not found");*/
		}
		else
		{
			h.put(a[i], 1);
			
		}
		
			
		} 
	
	     Set<Entry<Integer, Integer>> set = h.entrySet();
	     
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
        
        Collections.sort( list, new Comparator<Entry<Integer, Integer>>()
        {
            

			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				
				return o2.getValue().compareTo(o1.getValue());
			}
        } );
        int j=0;
        for(Entry<Integer, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
            for(int i = 0 ;  i<entry.getValue();i++){
            		a[j+i] = entry.getKey();
            		
            	}
            j=j+entry.getValue();
            }
       for(int e:a){
    	   System.out.print(e+" ,");
       }
	
 
}
public static void main(String[] args)
{
	LL2 l=new LL2();

	int a[]={2,2,3,4,8,6,6,6,6,3,3,5,5,9,3};
	l.Freq(a);
	}
}

