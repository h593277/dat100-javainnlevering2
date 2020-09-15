package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] i : matrise)
		{
			for(int j : i)
			{
				System.out.print(j);
			}
		}
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String streng = "";
		for(int[] i : matrise)
		{
			for(int j : i)
			{
				streng += Integer.toString(j) + " ";
			}
			streng += "\n";
		}
		
		return streng;
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
	
		int[][]skalering = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i< matrise.length; i++)
		{
			for(int j = 0; j< matrise[i].length; j++)
			{
				skalering[i][j] = matrise[i][j]*tall;
			}
		}
		
		return skalering;
		//throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;
		if(a.length == b.length && a[0].length == b[0].length) {
			
		
		for(int i = 0; i< a.length; i++)
		{
			for(int j = 0; j< a[i].length; j++)
			{
				if(a[i][j] != b[i][j])
				{
					lik = false;
			    }
			}
		}
		}
		else
		{
			lik = false;
		}
			return lik;
		
		
		
		//throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

	int speilt[][] = new int [matrise.length][matrise[0].length];
		for(int i = 0; i< matrise.length; i++)
		{
			for(int j = 0; j< matrise[i].length; j++)
			{
				speilt[i][j] = matrise[i][j];
			}
			
		}
		
		for(int i = 0; i< speilt.length; i++)
		{
			for(int j = 0; j< speilt[i].length; j++)
			{
				speilt[i][j] = matrise[j][i];
			}
			
		}
		return speilt;
		//throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] multiplikasjon = new int[a.length][a[0].length];
		
		if(a.length == b.length && a[0].length == b[0].length)
		{
			
			for(int i = 0; i< a.length; i++)
			{
				for(int j = 0; j< a[i].length; j++)
				{
					for(int k = 0; k< a[i].length; k++)
					{
						multiplikasjon[i][j] += a[i][k]*b[k][j];
					}
					
				}
			}
		
		
		//throw new UnsupportedOperationException("multipliser ikke implementert");
	
		}
		return multiplikasjon;
	}
}
