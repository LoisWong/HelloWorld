package OO5;

class MyTime{
	private long hour;
	private long minute;
	private long second;

	public MyTime(MyTime t){
		this.hour = t.hour;
		this.minute = t.minute;
		this.second = t.second;
		//or this(t.hour, t.minute, t.second);
	}

	public MyTime(long H, long M, long S){
		this.hour = H;
		this.minute = M;
		this.second = S;
	}

	void setHour(long H){
		this.hour = H;
	}
	long getHour(){
		return this.hour;
	}
	void setMinute(long M){
		this.minute = M;
	}
	long getMinute(){
		return this.minute;
	}
	void setSecond(long S){
		this.second = S;
	}
	long getSecond(){
		return this.second;
	}
}