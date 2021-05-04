class BubbleSort
{
    void bubbleSort(int arr[])
    {            // 6
        int n=arr.length;
                      // 5
        for(int i=0;i<n-1;i++)
                      // 4
        for(int j=0; j<n-i-1;j++)
        if(arr[j]>arr[j+1])
        {
            // Swap arr[j+1] and arr[j]
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
void printArray(int arr[] ) Desktop 
{
    int n=arr.length;
    for(int i=0; i<n; ++i)
    System.out.print(arr[i]+" ");
    System.out.println();

}
public static void main(String[] args)
{
    BubbleSort obj=new BubbleSort();
    int arr[]={74,44,35,22,11,80};
    obj.bubbleSort(arr);
    System.out.println("Sorted Array = ");
    obj.printArray(arr);
}
}