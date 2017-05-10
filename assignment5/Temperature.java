
import java.util.Scanner;

public class Temperature
{
  private double degrees;
  private char type;
  Scanner keyboard = new Scanner(System.in);

  //********************************************************
  // Constructor: Sets up temperature with specified values.
  //********************************************************
  public Temperature (double degrees1, char type1)
  {
    degrees = degrees1;
    type = type1;
  }

  //********************************************************
  // Constructor: Set up degrees with specified value.
  //********************************************************
  public Temperature (double degrees1)
  {
    type = 'C';
    degrees = degrees1;
  }

  //*************************************************************
  // Constructor: Sets up type with specified value.
  //*************************************************************
  public Temperature (char type1)
  {
    type = type1;
    degrees = 0.0;
  }

  //*************************************************************
  // Default Constructor: Sets up temperature with default value.
  //*************************************************************
  public Temperature()
  {
    degrees = 0.0;
    type = 'C';
  }

  //******************************************************
  // The writeOutput method display both parameter values.
  //******************************************************
  public void writeOutput()
  {
    System.out.println("Temperature = " + degrees + " " + type);
  }
    
  //********************************************************
  // The writeC method display the temperature in degrees C
  // even if value is Fahrenheit.
  //*********************************************************
  public void writeC()
  {
    if (type == 'F' || type == 'f')
    {
      degrees = (degrees-32.0)/(9.0/5.0);
      type = 'C';
      System.out.println(Math.round(degrees*10)/10.0 + " " +    type);
    }
    else
    {
      System.out.println(degrees + " " + type);
    }

  }
  
  //***********************************************************
  // The writeF method display the temperature in degress F
  // even if value is in Celsius.
  //************************************************************
  public void writeF()
  {
    if (type == 'C' || type == 'c')
    {
      degrees = ((degrees*9.0)/5.0)+32.0;
      type = 'F';
      System.out.println(Math.round(degrees*10)/10.0 + " " + type);
    }
    else
    {
      System.out.println(degrees + type);
    }
    
  }

  //**************************************************************
  // getC accessor get return temperature in degree C
  // even if current value is in Fahrenheit
  //**************************************************************
  public double getC()
  {
    if (type == 'F' || type == 'f')
    {
      degrees = 5.0*(degrees-32.0)/9.0;
      type = 'C';
      return degrees;
    }
    else
    {
      return degrees;
    }
  }

  //***********************************************************
  // getF accessor get return emperature in degree F
  // even if current value is in Celsius
  //***********************************************************
  public double getF()
  {
    if (type == 'C' || type == 'c')
    {
      degrees = degrees*9.0/5.0 + 32.0;
      type = 'F';
      return degrees;
    }
    else
    {
      return degrees;
    }
  }

  //************************************************************
  // degrees mutator
  //************************************************************
  public void set(double degrees1)
  {
    degrees = degrees1;
  }
  
  //***********************************************************
  // type mutator
  //************************************************************
  public void set(char type1)
  {
    type = type1;
  }


  //************************************************************
  // both degrees and type mutator
  //************************************************************
  public void set(double degrees1, char type1)
  {
    degrees = degrees1;
    type = type1;
  }

  //************************************************************
  // The equals method returns true if temperature 1 is equivalent 
  // to tempearture 2
  //**************************************************************
  public boolean equals(Temperature temp2)
  {
    // Check to see if both temp are the same 
    if (temp2.getC() == getC() && temp2.getF() == getF())
    {
      return true;
    }

    else
    {
      return false;
    }
  }

  //**************************************************************
  // The toString method returns the temperature as a string.
  //**************************************************************
  public String toString()
  {
    return "Temperature" + degrees + "F";
  }
  //**************************************************************
  // The readInput method prompt user for degrees and type and 
  // then read the values.
  //**************************************************************
  public void readInput()
  {
    double inputDegrees;
    String inputType; 
    char ch;
    
    // Get degrees from user.
    System.out.println("Please enter degrees: ");
    inputDegrees = keyboard.nextDouble();
    
    // Consume the remaining newline.
    keyboard.nextLine(); 

    // Get the temp's type
    do
    {
    System.out.println("Please enter C or c for Celsius and " +
                       "F or f for Fahrenheit: ");
    inputType = keyboard.nextLine();
    ch = inputType.charAt(0);
   
    // Validate the input.
    } while (ch != 'C' && ch != 'c' && ch != 'F' && ch !='f');
      
    degrees = inputDegrees;
    type = ch;
  }
} 


