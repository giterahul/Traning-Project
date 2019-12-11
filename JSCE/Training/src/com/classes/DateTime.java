package com.classes;

public class DateTime {
	private Date date;
	private Time time;
	public DateTime(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public DateTime() {
		super();
	}
	@Override
	public String toString() {
		return "DateTime [date=" + date + ", time=" + time + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		DateTime otherDateTime=(DateTime) obj;
		return date.equals(otherDateTime.getDate()) && time.equals(otherDateTime);
		//return super.equals(obj);
	}
	public static void main(String args[])
	{
		Date date=new Date(12,2,8888);
		Time time=new Time(1,33,45);
		System.out.println(date);
		System.out.println(time);
		DateTime datetime=new DateTime(date,time);
		System.out.println(datetime);
	}
	

}
