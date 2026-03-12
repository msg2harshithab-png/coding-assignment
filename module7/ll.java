public class BinarySearchRecursive {

    static int search(int[] arr,int l,int r,int target){

        if(l>r) return -1;

        int mid=(l+r)/2;

        if(arr[mid]==target) return mid;

        if(arr[mid]>target)
            return search(arr,l,mid-1,target);

        return search(arr,mid+1,r,target);
    }
}