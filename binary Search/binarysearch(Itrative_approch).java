  public static int bsearch(int arr[],int x,int n) {
	  int low =0;
	  int high= n-1;
	  while (low>=high)
	  {
		  int mid = (low +high)/2;
		  if(arr[mid]==x)return mid;
		  else if (arr[mid]>x) {
			  high=mid-1;
		  }
		  else low = mid+1;
	  }return -1;
  }
