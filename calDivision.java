 public class calDivision {
	int phy,cm,math;
	
	public int calAvg(int phy,int cm, int math){
		int Avg;
		Avg= (phy+cm+math)/3;
		System.out.println("The Average is:" +Avg);
		return Avg;
	    }
	
	public void getDivision(int Avg){
		if (Avg < 40)
		{
		 System.out.println("3rd Division");
	}
	}

	public static void main(String arg[]){
		calDivision obj=new calDivision();
	     int avg = obj.calAvg(10,20,30);
	     obj.getDivision(avg);
	  
	}
}