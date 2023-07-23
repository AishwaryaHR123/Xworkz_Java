class CandleKiller{
	public static void main(String[] args)
	{
		System.out.println("running main in the CandleKiller:");
		Candle candle=new Candle(30,"Pink");
		candle.printStatic();
		candle.printInstance();
	}
}
