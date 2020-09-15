package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		for(int i : tabell)
		{
			System.out.println();
		}
		//throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String[] tall = new String[tabell.length];
		String alleTall = "[";
		for(int i = 0; i < tabell.length; i++)
		{
			tall[i] = Integer.toString(tabell[i]);
			if(i < tabell.length-1)
			{
				alleTall += tall[i] + ",";
			}
			else
			{
				alleTall +=tall[i];
			}
			
		}
		
		alleTall += "]";
		return alleTall;
		
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {

		int total = 0;
		for(int i : tabell)
		{
			total += i;
		}
		//loopen ovenfor funker, men kan ikke legge til alle 3 loopene.
		total = 0;
		
		for(int i = 0; i < tabell.length; i++)
		{
			total += tabell[i];
		}
		//loopen ovenfor funker, men kan ikke legge til alle 3 loopene.
		total = 0;
		
		int j = 0;
		while(j < tabell.length)
		{
			total += tabell[j];
			j += 1;
		}
		
		return total;
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean tallet = false;
		
		for(int i = 0; i <tabell.length; i++)
		{
			if(tall == tabell[i])
			{
				tallet = true;
			}
		}
		
		return tallet;
		
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

	int tallet = -1;
	int j = 0;
		
		while(j < tabell.length && tallet == -1)
		{
			if(tall == tabell[j])
			{
				tallet = j;
			}
		}
		
		return tallet;
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reverseTabell = new int[tabell.length];
		
		for(int i = tabell.length-1; i >= 0; i--)
		{
			reverseTabell[i] = tabell[i];
		}
		return reverseTabell;
		
		
		//throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		if(tabell.length > 0)
		{
		int tabellVerdi = tabell[0];
		for(int i : tabell)
		{
			if(tabellVerdi <= i)
			{
				tabellVerdi = i;
			}
			else
			{
				sortert = false;
			}
		}
		}
		
		return sortert;
		
		
		//throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int sammen[] = new int[tabell1.length + tabell2.length];
		int index = 0;
		for(int i : tabell1)
		{
			sammen[index] = i;
			index++;
		}
		
		for(int i : tabell2)
		{
			sammen[index] = i;
			index++;
		}
		
		return sammen;
		//throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
