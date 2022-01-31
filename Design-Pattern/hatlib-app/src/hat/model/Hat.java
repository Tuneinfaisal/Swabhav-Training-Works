package hat.model;

public class Hat {
	
	private String shortName;
	private String longName;
	private double basePrice;
	private final double gst = 8;
	
	public Hat(String shortName, String longName, double basePrice)
	{
		this.shortName = shortName;
		this.longName = longName;
		this.basePrice = basePrice;
	}
	
	public void calculateGst()
	{
		this.basePrice += (basePrice/100)*8;
	}
	
	public String getShortName()
	{
		return shortName;
	}
	
	public String getLongName()
	{
		return longName;
	}
	
	public double getPrice()
	{
		return basePrice;
	}

}
