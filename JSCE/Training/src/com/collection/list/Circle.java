package com.collection.list;

public class Circle implements Comparable<Circle>{
	private double radius;
	final static public float pi=3.14f;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	@Override
	public int compareTo(Circle o) {
		// TODO Auto-generated method stub
		return 0;
	}
	 

}
