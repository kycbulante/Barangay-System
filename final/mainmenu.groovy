import java.time.LocalDate
public class InputMenu 
{
    public void info(def purpose)
    {
        println("Name:")
        def name = System.in.newReader().readLine()
        println("Date of birth:")
        def bday = System.in.newReader().readLine()
        println("Birthplace:")
        def bpace = System.in.newReader().readLine()
        println("Address:")
        def address = System.in.newReader().readLine()
        def purpose=purpose;

        File file = new File("C:/GROOVY/final/records.txt")
        if (!file.exists()) {
        //print("hatdog")
        def newFile = new File("C:/GROOVY/final/records.txt")
        newFile.createNewFile() 
        
        file.write("NAME\t\t\t\t\tBIRTHDATE\t\t\t\t\tBIRTHPLACE\t\t\t\t\tADRESS\t\t\t\t\tDOCUMENT")
        file.append("\n"+name+"\t\t\t\t\t"+bday+"\t\t\t\t\t"+bpace+"\t\t\t\t\t"+address)

        }
        else if (file.exists()){
            file.append("\n"+name+"\t\t\t\t\t"+bday+"\t\t\t\t\t"+bpace+"\t\t\t\t\t"+address)
        }
    }
    public void welcome()
    {
        int i=0;
        while (i==0 ){
        print("\n\tBarangay Dela Paz Online Document Request APP");
        print("\n\t\t\tWELCOME")
        println("\nAre you a resident of Barangay Dela Paz?");
        println("PLEASE INPUT y/n only");
        char res = System.in.newReader().readLine()
        if((res=='Y')||(res=='y'))
        {
            i++;
            display_menu();
            //print("low")
        }
        else if ((res=='N')||(res=='n'))
        {
             i++;
            print("You must be a Resident of Barangay Dela Paz to Use this Service, Thank You")
        }
        else 
        {
             i=0;
            print("Enter N to Exit..")
        }
        
    }
    }
    public void display_menu() 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        print("\nPlease enter your name: ");
        def userInput = br.readLine()
        println "\n\n\nHello $userInput,"

        println("\nThese are the documents you can request:");
        println("\n1 - Barangay Clearance");
        println("2 - Barangay Certificate");
        println("3 - Indigency");
        println("4 - Barangay ID");
        println("5 - Cedula");
        println("6 - Others");
        println("7 - Request Summary");
        print("\nPlease choose what documents you wish to request: ");
    }

    public void bClearance()
    {
        info();
        LocalDate sched = LocalDate.now().plusDays(5)
        def purpose = "Barangay Clearance"
        info(purpose);
        print("\nRequest for Barangay Clearance confirmed get it on " + sched);
    }

    public void bCertificate()
    {
        info();
        LocalDate sched = LocalDate.now().plusDays(5)
        print("\nRequest for Barangay Certificate confirmed get it on " + sched);
    }

    public void indigency()
    {
        info();
        LocalDate sched = LocalDate.now().plusDays(5)
        print("\nRequest for Indigency confirmed get it on " + sched);
    }
    
    public void brgyID()
    {
        info();
        LocalDate sched = LocalDate.now().plusDays(5)
        print("\nRequest for Barangay ID confirmed get it on " + sched);
    }

    public void cedula()
    {
        info();
        LocalDate sched = LocalDate.now().plusDays(5)
        print("\nRequest for Barangay Cedula confirmed get it on " + sched);
    }

    public void others()
    {
        print("\n\nOthers request\n");
    }

    public void reqSummary()
    {
        print("\n\nRequest Summary\n");
    }
 
    public InputMenu() 
    {
        Scanner in = new Scanner(System.in);
        welcome();
  
	switch (in.nextInt()) 
	{
	    case 1:
	    println ( "You picked option 1\nProceeding to request of Barangay Clearance" );
	    bClearance();
	    break;

        case 2:
	    println ( "You picked option 2\nProceeding to request of Barangay Certificate" );
	    bCertificate();
	    break;

        case 3:
	    println ( "You picked option 3\nProceeding to request of Indigency" );
	    indigency();
	    break;

        case 4:
	    println ( "You picked option 4\nProceeding to request of Barangay ID" );
	    brgyID();
	    break;

        case 5:
	    println ( "You picked option 5\nProceeding to request of Cedula" );
	    cedula();
	    break;

        case 6:
	    println ( "You picked option 6\nProceeding to Others" );
	    others();
	    break;

        case 7:
	    println ( "You picked option 7\nProceeding to Summary of your request" );
	    reqSummary();
	    break;

	    default:
	    System.err.println ( "Unrecognized option" );
	    break;
	}
    }
 
    public static void main (String[]args) 
    {
	    new InputMenu();
    }
}