import java.time.LocalDate
public class InputMenu 
{
    public void info(def purpose)
    {

        print("\n\nName: ")
        def name = System.in.newReader().readLine()
        
        Boolean number = false;
        while (!number){
         try 
		{ 
        print("\nDate of birth (ex. ddmmyyyy):")
        def bday = System.in.newReader().readLine()
			Integer.parseInt(bday); 
            number=true;
           // print (bday)
            //bday=bday;

        print("\nBirthplace: ")
        def bpace = System.in.newReader().readLine()
        print("\nAddress: ")
        def address = System.in.newReader().readLine()
        LocalDate sched = LocalDate.now().plusDays(5)
        //String bday = Integer.toString(birthday);
        
        File file = new File("record.txt")
        if (!file.exists()) 
        {
            def newFile = new File("record.txt")
            newFile.createNewFile() 
            
            file.write(String.format("%20s %18s %30s %30s %25s %20s\n", 'NAME','BIRTHDATE','BIRTHPLACE','ADDRESS','DOCUMENT REQUESTED','DATE TO CLAIM'))
            file.append(String.format( "%20s %18s %30s %30s %25s %20s",name , bday ,  bpace ,  address ,  purpose, sched))

        }
        else if (file.exists())
        {
            file.append(String.format("\n%20s %18s %30s %30s %25s %20s", name , bday , bpace , address , purpose, sched))
        }
        }
        catch (NumberFormatException e)  
		{ 
			System.out.println("Please input a number"); 
		} }

    }
    public void welcome()
    {

        print("\n\t\t\tWELCOME")
        print("\n\tBarangay Dela Paz Online Document Request APP");
        println("\n\nAre you a resident of Barangay Dela Paz?");

        Boolean quit = false;
        while(!quit) 
        {
        println("PLEASE INPUT y/n only:");

        def res = System.in.newReader().readLine()
        def ress=res.toUpperCase()

            switch (ress)
            {
                case 'Y':
                display_menu();
                quit=true;
                break;

                case 'N':
                print("You must be a resident of Barangay Dela Paz to use this service, thank you.")
                System.exit(0)
            }
        }
        
    }
    public void display_menu() 
    {
        
        print("\n\nPlease enter your name: ");
        def userInput = System.in.newReader().readLine()
        println "\n\n\nHello $userInput,"

        println("\nThese are the documents you can request:");
        println("\n1 - Barangay Clearance");
        println("2 - Barangay Certificate");
        println("3 - Indigency");
        println("4 - Barangay ID");
        println("5 - Cedula");
        println("6 - Request Summary");
        println("7-Exit");

        Boolean next = false;
        while(!next){
        print("\nPlease input the number corresponding to the documents you wish to request: ");
        Scanner in = new Scanner(System.in);
        try {
	        switch (in.nextInt()) 
	            {
            case 1:
            println ( "You picked option 1\nProceeding to request of Barangay Clearance..." );
            bClearance();
            break;

            case 2:
            println ( "You picked option 2\nProceeding to request of Barangay Certificate..." );
            bCertificate();
            break;

            case 3:
            println ( "You picked option 3\nProceeding to request of Indigency..." );
            indigency();
            break;

            case 4:
            println ( "You picked option 4\nProceeding to request of Barangay ID..." );
            brgyID();
            break;

            case 5:
            println ( "You picked option 5\nProceeding to request of Cedula..." );
            cedula();
            break;

            case 6:
            println ( "You picked option 6\nProceeding to Summary of Requests..." );
            reqSummary();
            break;

            case 7:
            println ( "Thank you!" );
            System.exit(0);
                }
            } 
            catch (InputMismatchException ex){
            println "Please provide proper input. Thank you."
            display_menu();
          }
	    } 
     }

    public void bClearance()
    {
        def purpose = "Barangay Clearance"
        info(purpose);
        LocalDate sched = LocalDate.now().plusDays(5)
        print("\nRequest for Barangay Clearance confirmed get it on " + sched);
        other();
    }

    public void bCertificate()
    {
        def purpose = "Barangay Certificate"
        info(purpose);
        LocalDate sched = LocalDate.now().plusDays(5)
        print("\nRequest for Barangay Certificate confirmed get it on " + sched);
        other();
    }

    public void indigency()
    {
        def purpose = "Indigency"
        info(purpose);
        LocalDate sched = LocalDate.now().plusDays(5)
        print("\nRequest for Indigency confirmed get it on " + sched);
        other();
    }
    
    public void brgyID()
    {
        def purpose = "Barangay ID"
        info(purpose);
        LocalDate sched = LocalDate.now().plusDays(5)
        print("\nRequest for Barangay ID confirmed get it on " + sched);
        other();
    }

    public void cedula()
    {
        def purpose = "Barangay Cedula"
        info(purpose);
        LocalDate sched = LocalDate.now().plusDays(5)
        print("\nRequest for Barangay Cedula confirmed get it on " + sched);
        other();
    
    }

    public void reqSummary()
    {
        print("\n\nRequest Summary\n\n");
        File file = new File("record.txt") 
        println file.text 
        other();
        
        
    }
 
    public InputMenu() 
    {
        welcome();
    }
    public void other()
    {
        print("\n\nDo you want to request another document?")
        Boolean next = false;
        while(!next)
        {
            println("\nPLEASE INPUT y/n only:");
            def res = System.in.newReader().readLine()
            def ress=res.toUpperCase()

            switch (ress)
            {
                case 'Y':
                println ( "Going back to main menu" );
                display_menu();
                break;


                case 'N':
                println ( "Thank you!" );
                System.exit(0)
                break;
            }
        }
    }
 
    public static void main (String[]args) 
    {
	    new InputMenu();
    }
}
