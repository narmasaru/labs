package BaseBall;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BatterClass {
	
	private String playerName;
	double battingAverage;
	int noOfAtBat;
	int noOfHits;
	int sum1=0;
	int single=0, doub=0, triple=0 , homerun=0, out=0;
	ArrayList<Integer> basesEarned = new ArrayList<Integer>();


	public BatterClass(String playerName ) {
		this.playerName = playerName;
		
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	

   public void setBasesEarned(ArrayList<Integer> basesEarned) {
		this.basesEarned = basesEarned;
	}

   public int getBasesEarned() {
	   int sum=0;
	   for(int i=0; i<basesEarned.size(); i++){
	   sum += basesEarned.get(i);
	   
	   }
	   return sum;
	   
	   }
   
   public double getBattingAverage()  {
	   noOfAtBat=basesEarned.size();
	  
	   for(Integer base : basesEarned)
		{
			switch(base)
			{
			case 0 : out = base;break;
			case 1 : single  += base;noOfHits++;break;
			case 2 : doub  += base;noOfHits++;break;
			case 3 : triple  += base;noOfHits++;break;
			case 4 : homerun += base;noOfHits++;break;
			}
		}

       return (double)noOfHits /(double) noOfAtBat;
   }

	public String getFormatedBattingAverage() {
		return formatNumber(getBattingAverage());
	}

	
	public double getsluggingPercentage() {
		double sum1= getBasesEarned();
	       
    	double noOfAtBat= basesEarned.size();
		return (double) sum1 / (double)noOfAtBat;
        
	}
	
	public String getFormatedSluggingPercentage() {
		return formatNumber(getsluggingPercentage());
	}

	
	

	public String formatNumber(double x)
	{
		return String.format("%.3f", x);
	}

	 
	
	
	
}
