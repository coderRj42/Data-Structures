public static int bsearch(int arr[],int low,int high ,int x) {
	if(low>high) return -1;
	int mid =(high+low)/2;
	if(arr[mid]==x)return mid;
	else if (arr[mid]>x)
		return bsearch(arr, mid-1, high, x);
	else 
		return bsearch(arr,low,mid+1, x);
}
