class MulArray{

static void mulsum(int arr[], int n, int N)
{    
    int sum = 0;
     for (int i = 0; i < n; i++)
    {
 
        if (arr[i] % N == 0)
        {
            sum = sum + arr[i];
        }
    }
 
    System.out.println(sum);
}
 
public static void main(String[] args)
{
    
    int arr[] = { 1, 2, 3, 5, 6 };
    int n = arr.length;
    int N = 3;
    mulsum(arr, n, N);
}
}