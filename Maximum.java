public class Maximum
{
    public static void main(String[] args)
    {
        int a[]={42,56,53,25,98};
         int max=a[0];
         
        
        for (int i=1;i<a.length;i++)
        {
          if (a[i]>max) 
          {
              max =a[i];
        }
        
        }
        System.out.println("max"+max);
       
        }
}
