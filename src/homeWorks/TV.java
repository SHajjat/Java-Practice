package homeWorks;

public class TV {
	private int channel =1, volumeLevel = 1;
	private boolean on = false;
	public String brand = "undefined";
	public TV(){
		System.out.println("Creating TV object using no Args- constructor");
	}
	public TV(String brand){
		this.brand = brand ;
		System.out.println("Creating TV object using 1 arg - constructor");
	}
	public void setChannel(int channel){
		if (channel>120 || !on || channel<=0){
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}else{
			this.channel = channel;
		}
	}
	public int getChannel(){
		return channel;
	}
	public void setVolumeLevel(int volumeLevel){
		if (volumeLevel>7 || volumeLevel<0 || !on){
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}else{
			this.volumeLevel = volumeLevel;
		}
	}
	public int getVolumeLevel(){
		return volumeLevel;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public boolean isOn(){
		return on;
	}
	
	
	
	public void channelUp(){
		setChannel(++channel);
	}
	public void channelDown(){
		setChannel(--channel);
	}
	public void volumeUp(){
		setVolumeLevel(++volumeLevel);
	}
	public void volumeDown(){
		setVolumeLevel(--volumeLevel);
	}
	public void turnOn(){
		if (on){
			System.out.println("TV is already ON");
		}else{
			on =!on;
		}
	}
	public void turnOff(){
		if (!on){
			System.out.println("TV is already OFF");
		}else{
			on =!on;
		}
	}
	
	
	
	
}

