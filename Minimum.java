public class Minimum
{
    public static void main(String[] args)
    {
        int a[]={34,64,24,64,21,10};
         int min=a[0];
         
        
        for (int i=1;i<a.length;i++)
        {
          if (a[i]<min) 
          {
              min =a[i];
        }
        
        }
        System.out.println("min:"+min);
       
        }
}
