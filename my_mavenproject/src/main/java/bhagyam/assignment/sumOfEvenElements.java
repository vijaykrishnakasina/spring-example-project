package bhagyam.assignment;

public class sumOfEvenElements {

	public static void main(String[] args) {
		
    int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
    int sumOfEven = 0;
    
    for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		
	if	((a[i][j])%2==0)
	sumOfEven=sumOfEven+a[i][j];
	}
	
}
    System.out.println("sum of even elements:"+sumOfEven);
    
	}
}
	

	

