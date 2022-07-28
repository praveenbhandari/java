class selectionsort{


	public static void main(String[] args) {
		int a[]={3,2,62,6,11,0,99,55,1,5,6,2,7,8};
		 for(int i=0;i<a.length-1;i++){
		 	int small=i;
		 	// System.out.println(small);
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[small]){
					small=j;
				}

			}

			int t=a[small];
			a[small]=a[i];
			a[i]=t;
		 }

		 for(int as:a){
		 	   System.out.print(as+" ");

		 }








	}
}