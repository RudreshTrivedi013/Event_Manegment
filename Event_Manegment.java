import java.util.*;
class Check_In
{
    Scanner sc=new Scanner(System.in);
    String mobile;
    String name;
    int password;
    int repassword;
    int x;
    int otp;
    String Departurestation;
    String Arrivalstaion;
    double distance;
    double price;

    void Login() {
        do {
            System.out.println(" for REGISTRATION ");
            System.out.println("PLEASE FILLUP ALL INFORMATION");
            System.out.println("ENTER YOUR MOBILE NUMBER");
            mobile = sc.next();
            System.out.println("ENTER YOUR NAME");
            name = sc.next();
            System.out.println("GENERATE PASSWORD");
            password = sc.nextInt();
            System.out.println("CONFIRM PASSWORD");

            do {
                repassword = sc.nextInt();
                if (password == repassword) {

                    x = (int) ((Math.random()) * 1000000);
                    System.out.println("YOUR OTP OF REGISTRATION IN IRCTC IS -- " + x);
                    System.out.println("");
                    System.out.println("OTP SENT ON YOUR ENTERED MOBILE NUMBER");
                    System.out.println("");
                    System.out.println("ENTER YOUR OTP");

                    do {
                        otp = sc.nextInt();

                        if (otp == x) {
                            System.out.println("REGISTRATION SUCCESSFULL");
                        } else {
                            System.out.println("ENTERED OTP IS INCORRECT PLEASE REENTER CORRECT OTP");

                        }

                    } while (otp != x);

                } else {
                    System.out.println("ENTER VALID CONFIRMATION PASSWORD");
                }

            } while(repassword==0);
        }while (repassword == 0);
    }
	
	void BirthDay(){
		System.out.println("## WELCOME TO BIRTH DAY PARTY EVENT !!");
	}
	
	void Concert(){
		System.out.println("WELCOME TO CONCERT EVENT !!");
		
	}
	
	void College_Fest(){
		System.out.println("WELCOME TO COLLAGE FEST EVANT !!");
	}
	
	void Wedding_Anniversery(){
		System.out.println("WELCOME TO WEDDING ANNIVERSURY EVENT !!");
	}
    }

    class Event_Manegment{
        public static void main(String []args){
			Scanner sc=new Scanner(System.in);
		System.out.println("****** WELCOME TO EVENT MANEGMENT ******");
		Check_In obj=new Check_In();
            obj.Login();
			System.out.println("ENTER YOUR CHOICE !!");
		System.out.println("PRESS 2 FOR MARIGE FUNCTION !");
		System.out.println("PRESS 1 FOR BIRTHDAY PARTY FUNCTION !");
		System.out.println("PRESS 3 FOR COLLEGE EVENT !");
		System.out.println("PRESS 4 CONCERT !");
		int choice=sc.nextInt();
		switch(choice){
			case 1:
			obj.BirthDay();
			break;
			case 2:
			obj.Concert();
			System.out.println();
			break;
			case 3:
			obj.College_Fest();
			System.out.println();
			break;
			case 4:
			obj.Wedding_Anniversery();
			System.out.println();
			break;
		}
            
			
        }
    }