package com.lsp.solution.test;

import com.lsp.solution.Rectangle;
import com.lsp.solution.Square;

public class LspSolutionTest {
	
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(8,5);
//		Rectangle r = new Rectangle(8,5);
		shouldNotModifyHeightIfWidthIsChange(r);
		
		System.out.println();
		Square s = new Square(10);
		shouldNotModifyHeightIfWidthIsChange(s);
	}

	private static void shouldNotModifyHeightIfWidthIsChange(Rectangle r)
	{
		int heightBeforeChange = r.getHeight();
		r.setWidth(r.getWidth() + 10);
		
		int heightAfterChange = r.getHeight();
		
		System.out.println(heightBeforeChange);
		System.out.println(heightAfterChange);
		
		System.out.println();
		System.out.println(heightBeforeChange == heightAfterChange);
	}

}
