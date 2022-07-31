import java.util.Arrays;
class searching_algo{
    static String linear_search(int arr[],int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                String aa="Element found at index "+i;
                return aa;
            }
        }

        return "Element not found";

    }
    static int binary_search(int arr[],int element,int low,int max){
        Arrays.sort(arr);
        int mid=(low+max)/2;
        if(arr[mid]==element){
            return mid;
        }

        if(element < arr[mid]){
           return binary_search(arr,element,0,mid-1);
        }
        if(element > arr[mid]){
            return binary_search(arr,element,mid+1,max);
        }if(element != arr[mid]){
            return -1;
        }

        display(arr);
        return -1;
    }

static void display(int arr[]){
    for(int i:arr){
        System.out.print(i+" ");
    }
}
    static int jump_search(int arr[],int element){
        int n=(int)Math.floor(Math.sqrt(arr.length));
        for(int i=0;i<arr.length;i=i+n){
            // System.out.println(arr[i]);
            if(arr[i] == element){
                return i;
            }
            if(arr[i]<=element){
                for(int j=i;j>0;j--){
                    // System.out.println(arr[j]);
                    if(arr[j] == element){
                        return j;
                    }
                }
            }
            else{
                for(int j=arr.length-1;j>0;j--){
                    // System.out.println(arr[j]);
                    if(arr[j] == element){
                        return j;
                    }
                }
            }
        }
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==element){
                return i;
                // System.out.print(k+" ");
            }
        }
        
        return -1;
        // System.out.println(n);
    }





    public static void main(String args[]){
        int a[]={3,2,62,6,11,0,99,55,1,5,6,2,7,8};
        Arrays.sort(a);
        display(a);
        System.out.println();
        System.out.println(linear_search(a,99));
        System.out.println("binary search "+binary_search(a,99,0,a.length));
        System.out.println("jump search "+jump_search(a,99));
    }
}