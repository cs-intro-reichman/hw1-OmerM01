// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		if(hours > 12 && hours < 24){
			hours -= 12;
			System.out.println(hours + ":" + minutes + " PM");
		}
		else if(hours == 00){
			hours = 0;
			System.out.println(hours + ":" + minutes + " AM");
		}
		else{
			System.out.println(hours + ":" + minutes + " AM");
		}		
	}
}