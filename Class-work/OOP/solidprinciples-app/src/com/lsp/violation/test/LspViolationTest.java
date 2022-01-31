package com.lsp.violation.test;

import com.lsp.violation.Rectangle;
import com.lsp.violation.Square;

public class LspViolationTest {
	
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(8,5);
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