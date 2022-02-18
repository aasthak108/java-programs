class Triangle3
{
	public static void main(String args[]){
		int b,c,r;
		for(r=1;r<=5;r++){
			System.out.println("");
			for(b=1;b<=5-r;b++){ 
				System.out.print(" ");
			}
			for(c=1;c<=r;c++){
				System.out.print(r);
			}
		}
	}
}