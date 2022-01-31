package com.monocept.basic;

public class PassByValueTest {
	public static void main(String[] args)
	{
		PassByValueTest pbvt = new PassByValueTest();
		
		int score = 90;
		pbvt.updateScoreToZero(score);
		System.out.println(score);
		int[] scores = {80,90,100};
		
		pbvt.updateAllScoreToZero(scores);
		
		for(int item : scores)
		{
			System.out.println(item);
		}
		
		int[] foo = {80,90,100};
		System.out.println(foo.hashCode());
		
	}
	
	void updateScoreToZero(int pscore)
	{
		pscore = 0;
	}
	
	void updateAllScoreToZero(int[] pscores)
	{
		for(int i=0;i<pscores.length;i++)
		{
			pscores[i] = 0;
		}
		System.out.println(pscores.hashCode());
	}

}
