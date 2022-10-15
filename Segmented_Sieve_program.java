
static void simpleSieve(int limit)
{

	boolean []mark = new boolean[limit];
	Arrays.fill(mark, true);

	for (int p = 2; p * p < limit; p++)
	{
		if (mark[p] == true)
		{
			for (int i = p * p; i < limit; i += p)
				mark[i] = false;
		}
	}

	for (int p = 2; p < limit; p++)
		if (mark[p] == true)
			System.out.print(p + " ");
}

