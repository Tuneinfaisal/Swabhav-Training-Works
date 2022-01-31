package com.lsp.solution;

public class Square extends Rectangle implements IPolygon{
	
	public Square(int side)
	{
		super(side, side);
	}
//	
//	@Override
//	public void setWidth(int width)
//	{
//		this.width = this.height = width;
//	}
//	
//	@Override
//	public void setHeight(int height)
//	{
//		this.width = this.height = height;
//	}

	@Override
	public void claculateArea()
	{
		this.area = this.width * this.height;
	}

}
