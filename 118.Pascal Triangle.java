import java.util.*;

/*
/////First method with input as row and coloumn
public class Main
{
    public static int pascalTriangle(int n,int r){
        
        int res=1;
        for(int i=0;i<r;i++){
            
            res=res*(n-i);
            res=res/(i+1);
        }
        
        return res;
    }
    
    
    
	public static void main(String[] args) {
		int r=6;
		int c=3;
		
		int result =pascalTriangle(r-1,c-1);
		System.out.print(result);
		
	}
}

////second method  print the row  with given input r
public class Main
{
    public static int ncr(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
        res=res*(n-i);
        res=res/(i+1);
    }
    return res;
    
    }
    
 public static void main(String[] args){
         int n=6;
         for(int c=1;c<=n;c++){
         System.out.print(ncr(n-1,c-1) + " ");
            
         }
     }
}
*/
////Third method with hole pascal triangle
public class Main{
   
public static int ncr(int n,int r){
    int res=1;
    for(int i=0;i<r;i++){
        res=res*(n-i);
        res=res/(i+1);
    }
    return res;
}

public static List<List<Integer>> pascalTriangle(int n){
   List<List<Integer>> ans=new ArrayList<>();
   for(int row=1;row<=n;row++){
       List <Integer> temp=new ArrayList<>();
       for(int col=1;col<=row;col++){
           temp.add(ncr(row-1,col-1));
       }
       ans.add(temp);
   }
   return ans;
}




public static void main(String[] args){
     Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        List<List<Integer>> ans =pascalTriangle(n);
        for(int i=0;i<ans.size();i++){
            List<Integer> row=ans.get(i);
            
            for(int j=0;j<row.size();j++){
                
                System.out.print(row.get(j)+" ");
            }
            System.out.println();
        }
        
    }
}


