import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Line   {
Scanner s=new Scanner(System.in);
int charge;


 public void GreenLine() {
	 
	  System.out.println("*****greenLine******");

	 
	  		        String[] stations = {
	  		            "Parade Ground", "Secunderabad West", "Gandhi Hospital", "Musheerabad",
	  		            "RTC X-Road", "Chikkadpally", "Narayanguda", "Sultan Bazar", "MGBS"
	  		        };

	  		        int[][] ticketCosts = {
	  		            {0, 10, 20, 30, 40, 50, 60, 70, 80},  
	  		            {10, 0, 10, 20, 30, 40, 50, 60, 70},  
	  		            {20, 10, 0, 10, 20, 30, 40, 50, 60},  
	  		            {30, 20, 10, 0, 10, 20, 30, 40, 50},  
	  		            {40, 30, 20, 10, 0, 10, 20, 30, 40},  
	  		            {50, 40, 30, 20, 10, 0, 10, 20, 30},  
	  		            {60, 50, 40, 30, 20, 10, 0, 10, 20}, 
	  		            {70, 60, 50, 40, 30, 20, 10, 0, 10},  
	  		            {80, 70, 60, 50, 40, 30, 20, 10, 0}   
	  		        };

	  		        Scanner scanner = new Scanner(System.in);

	  		        System.out.println("Available Stations:");
	  		        for (int i = 0; i < stations.length; i++) {
	  		            System.out.println(i + 1 + ". " + stations[i]);
	  		        }

	  		        System.out.print("Enter the number of the 'from' station: ");
	  		        int fromStation = scanner.nextInt();

	  		        System.out.print("Enter the number of the 'to' station: ");
	  		        int toStation = scanner.nextInt();

	  		        if (fromStation == toStation || fromStation > stations.length)
	  		             {
	  		            System.out.println("Invalid station selection.");
	  		            scanner.close();
	  		            return;
	  		        }
	  		        
	  		        
	  		        
//                 if(fromStation==9) {
//	System.out.println("Enter 1 to Continue your journey");
//	System.out.println("Enter 2 to  exit");
//if(	s.nextInt()==1
//) {
//	System.out.println("Exit");
//	if(	s.nextInt()==2) {
//	}
//	
//}
//                         }
//	  		        
	  		        
	  		        
	  		        int ticketPrice = ticketCosts[fromStation-1][toStation-1 ];
	  		        System.out.println("Ticket Price: Rs " + ticketPrice);
	                  System.out.println("Enter Ticket Price to Confirm Your Ticket:");


	               
	                  LocalTime currentTime = LocalTime.now();

	                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	                  String formattedTime = currentTime.format(formatter);
                 
			       
	  		      if(ticketPrice==scanner.nextInt()) {
				        System.out.println("_______________________");
			        	System.out.println("L&T METRO RAIL");
			        	System.out.println(" "+" "+" "+"Hyderabad");
			        	System.out.println("************************");
		                  System.out.println("Ticked Booked at: " + formattedTime);
		                  System.out.println("\n");

			        	System.out.println("Ticket Details");
				        System.out.println("\n");
				        System.out.println("From"+" "+" : "+" "+stations[fromStation-1]);
				        System.out.println("To"+" "+"   : "+" "+stations[toStation-1]);
				        System.out.println("\n");
				        System.out.println("Ticket valid up to 3hrs");
				        System.out.println("_______________________");
				        System.out.println("please keep your ticket");
				        System.out.println("till the end of journey");
				        System.out.println("_______________________");

				        
			        }
			        else {
			        	System.out.println("Your Ticket was Cancelled");
		        }
 }
 
// ______________________________________________________________________________

	  		       
	  		    
//     __________________________________________________________________________________
 
 public void BlueLine() {
	  System.out.println("*****blueLine*****");
	  Scanner s=new Scanner(System.in);
	  int price=10;
	  String[] stations = {
	            "Nagole", "Uppal", "Uppal Stadium", "NGRI",
	            "Habsiguda", "Tarnaka","Mettuguda", "Secundrabad East",
	            "Parade Ground","Paradise","Rasoolpura","Prashantnagar",
	            "Begumpet","Ameerpet","Madhuranagar","Yusufguda",
	            "Road No 5 Jublihills","Jublihills Checkpost","Peddamma Gudi"
	            ,"Madhapur","Durgam Cheruvu","Hitech City","Raidurg"};
//	  int[][] ticketCosts = {
//	            {0, 10, 20, 30, 40, 50, 60, 70, 80,90,100,110,120,130,140,150,160,170,180,190,200,210,220},  // Costs from Station 1
//	            {10, 0, 10, 20, 30, 40, 50, 60, 70,80,90,100,110,120,130,140,150,160,170,180,190,200,210},  // Costs from Station 2
//	            {20, 10, 0, 10, 20, 30, 40, 50, 60,70,80,90,100,110,120,130,140,150,160,170,180,190,200},  // Costs from Station 3
//	            {30, 20, 10, 0, 10, 20, 30, 40, 50,60,70,80,90,100,110,120,130,140,150,160,170,180,190},  // Costs from Station 4
//	            {40, 30, 20, 10, 0, 10, 20, 30, 40,50, 60, 70,80,90,100,110,120,130,140,150,160,170,180},  // Costs from Station 5
//	            {50, 40, 30, 20, 10, 0, 10, 20, 30, 60,50,60, 70,80,90,100,110,120,130,140,150,160,170},  // Costs from Station 6
//	            {60, 50, 40, 30, 20, 10, 0, 10, 20,30,40,50, 60, 70,80,90,100,110,120,130,140,150,160},  // Costs from Station 7
//	            {70, 60, 50, 40, 30, 20, 10, 0, 10,20,30,40,50, 60, 70,80,90,100,110,120,130,140,150},  // Costs from Station 8
//	            {80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30,40,50, 60, 70,80,90,100,110,120,130,140},
//	            {90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30,40,50, 60, 70,80,90,100,110,120,130},
//	            {100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30,40,50, 60, 70,80,90,100,110,120},
//	            {110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30,40,50, 60, 70,80,90,100,110},
//	            {120,110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30,40,50, 60, 70,80,90,100},
//	            {130,120,110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30,40,50, 60, 70,80,90},
//	            {140,130,120,110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30,40,50, 60, 70,80},
//	            {150,140,130,120,110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30,40,50, 60, 70},
//	            {160,150,140,130,120,110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30,40,50, 60},
//	            {170,160,150,140,130,120,110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30,40,50},
//	            {180,170,160,150,140,130,120,110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30,40},
//	            {190,180,170,160,150,140,130,120,110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20,30},
//	            {200,190,180,170,160,150,140,130,120,110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10,20},
//	            {210,200,190,180,170,160,150,140,130,120,110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0,10},
//	            {220,210,200,190,180,170,160,150,140,130,120,110,100,90,80, 70, 60, 50, 40, 30, 20, 10, 0},
//
//	        };


	        System.out.println("Available Stations:");


	        for(int i=0; i<stations.length; i++) {
	        	System.out.println(i+1+"."+stations[i]);
	        }
	        
	        System.out.print("Enter the number of the 'from' station: ");
	        int fromStation = s.nextInt();
	     
	        System.out.print("Enter the number of the 'to' station: ");
	        int toStation = s.nextInt();


	       if(fromStation<toStation  ) {
	        	System.out.println(stations[fromStation-1]+" "+"TO"+" "+stations[toStation-1]);
	        System.out.println("Ticket cost is :"+price*(toStation-fromStation));
	        
	        System.out.println("Enter amount to continue :");
	        charge=s.nextInt();
	           charge=price*(toStation-fromStation);
	        }
	        
	        
	        
	        if(fromStation>toStation ) {
	        	System.out.println(stations[toStation-1]+" "+"to"+" "+stations[fromStation-1]);
		        System.out.println("Ticket cost is :" +price*(fromStation-toStation));
		        
		        
		        System.out.println("Enter amount to continue :");
		           charge=price*(fromStation-toStation);

		        charge=s.nextInt();
           }
		        
		    
		        	       
	        if(charge==price*(toStation-fromStation)|| charge==price*(fromStation-toStation)) {
        		   
	        	 System.out.println("_______________________");
		        	System.out.println("L&T METRO RAIL");
		        	System.out.println(" "+" "+" "+"Hyderabad");
		        	System.out.println("************************");
		        	System.out.println("Ticket Details\n");
			        System.out.println("From"+" "+" : "+" "+stations[fromStation-1]);
			        System.out.println("To"+" "+"   : "+" "+stations[toStation-1]);
			        System.out.println("Your ticket charge is :"+charge);
			        System.out.println("_______________________");
			        System.out.println("please keep your ticket");
			        		System.out.println(" till the end of journey");
			        System.out.println("_______________________");
	        
 }
        		   else {
        			   System.out.println("Your Ticket is Cancelled");
        		   }


 }	
 
 
 public void RedLine() {
	 int price=10;
	  System.out.println("*******redLine********");
String[] stations={"L.B nagar","Victoria Memorial","Chaitanyapuri","Dilshuknagar","Musarambagh","New Market","Malakpet","MG Bus Station","Osmania Medical College","GAndhi Bhavan","Nampelly","Assembly","Lakidikapul","Khairatabad","Errum Manzil","Panjagutta",
		"Ameerpet","SR Nagar","ESI Hospital","Erragadda","Bhagatnagar","Moosampet","Balanagar","Kukatpally","KPHB Colony","JNTUH College","Miyapur"};
Scanner s=new Scanner(System.in);

System.out.println("Red Line Stations");
for(int i=0;i<stations.length;i++) {
	System.out.println(i+1+"."+stations[i]);
}
System.out.println("Select From Station :");
int from=s.nextInt();

System.out.println("Select to Station :");
int to=s.nextInt();

if(from<to) {
	System.out.println("Ticket Price Is :"+price*(to-from));
	System.out.println("Enter Amount to Continue :");
	 charge=price*(to-from);
}
if(from>to) {
	System.out.println("Ticket Price Is :"+price*(from-to));
System.out.println("Enter Amount to Continue :");
 charge=price*(from-to);
}

if(charge==s.nextInt()) {
	 System.out.println("_______________________");
	System.out.println("L&T METRO RAIL");
	System.out.println(" "+" "+" "+"Hyderabad");
	System.out.println("************************");
	System.out.println("Ticket Details\n");
    System.out.println("From"+" "+" : "+" "+stations[from-1]);
    System.out.println("To"+" "+"   : "+" "+stations[to-1]);
    System.out.println("\n");
    System.out.println("Your Ticket Charge is"+charge);
    System.out.println("_______________________");
    System.out.println("please keep your ticket");
    System.out.println(" till the end of journey");
    System.out.println("_______________________");
	
}	 
else {
	
	System.out.println("Your ticket is cancelled");

}
}


public void Mg(){
	String[] stations={"MG Bus Station","Osmania Medical College","GAndhi Bhavan","Nampelly","Assembly","Lakidikapul","Khairatabad","Errum Manzil","Panjagutta",
	"Ameerpet","SR Nagar","ESI Hospital","Erragadda","Bhagatnagar","Moosampet","Balanagar","Kukatpally","KPHB Colony","JNTUH College","Miyapur"};
}
	
}
