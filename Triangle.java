package com.sushovan.springpractice;

public class Triangle
{
	public String type;
	public int height;
	
	public int getHeight() 
	{
		return height;
	}
	public String getType() 
	{
		return type;
	}

	/*
	 * public void setHeight(int height) { this.height = height; }
	 */
	/*
	 * public void setType(String type) { this.type = type; }
	 */
					public Triangle(String type)
						{
							this.type=type;
						}
					public Triangle(String type,int height)
						{
							 this.height=height;
							 this.type=type;
						}
	
	
	public void draw()
	{
		System.out.println(getType() + " Traingle Drwan with the height of "+ getHeight());
	}
}
