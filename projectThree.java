import java.util.Random;
import java.util.Scanner;

public class ProjectThree{
    final static int MIN_NUMBER=1;
    final static int MAX_NUMBER=8;
    public static int forward(int current_number){
        if(current_number<MAX_NUMBER)
            return current_number+1;
        else
            return MIN_NUMBER;
    }
 
    public static int backward(int current_number){
        if(current_number>MIN_NUMBER)
            return current_number-1;
        else
            return MIN_NUMBER;     
    }
 
    public static String createFileName(int current_number){
        return "picture"+current_number+".gif";
    }
 
    public static String createRandomName(){
        Random name = new Random();
            int generate_number = name.nextInt(7);
            
            return "picture"+generate_number+".gif";
}
    public static void showMenu(){
        boolean opt=true;
        int result=0;
        String resultFilename;
        String loopcont=" ";
        int optChoice,current_number=0;
        do{
            System.out.println("Please choose anything you want from the choices! ");
            System.out.println("1.Forward");
            System.out.println("2.Backward");
            System.out.println("3.CreateFileName");
            System.out.println("4.CreateRandomName");
            
            Scanner sc=new Scanner(System.in);     
            optChoice=sc.nextInt();
            if(optChoice==1 || optChoice==2 || optChoice==3){
   		System.out.println("Please Input current Number");
   		current_number=sc.nextInt();
            }   
            switch(optChoice){
                case 1:result=forward(current_number);
                    System.out.println("Image number is: "+result);
            break;
                case 2:result=backward(current_number);
                    System.out.println("Image number is: "+result);
            break;
                case 3:resultFilename=createFileName(current_number);
                    System.out.println("Name of the image is: "+resultFilename);
            break;
                case 4:resultFilename=createRandomName();
                    System.out.println("Name of the image is: "+resultFilename);
            break;
            
                default:System.out.println("No More Options");
            }
   	
        System.out.println("Would you like to continue?: Yes or No");
   	loopcont=sc.next();
   	if ( loopcont.equals("y") || loopcont.equals("Y") || loopcont.equals("Yes") || loopcont.equals("yes")){
            opt=true;
        }
   	else
            opt=false;
   }
   while(opt);
}
 
    public static void main(String args[]){
        showMenu();
    }
}
