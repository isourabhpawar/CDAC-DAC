Exception Handling

What is exception ? 
Run time error , detected by typically Java runtime environment : JRE (Typically by JVM's main thread )

Why exception handling ?

1. To continue with the program execution , even after run time errors occur(eg :invalid inputs,B.L(Business logic) failures,validation failures, file not found, invalid casting....)
2. To separate B.L (try block) from error handling logic(catch)
3. To avoid un necessary checking .


How does JVM perform exception handling ?

Any run time err occurs(eg file not found,accessing element beyond array size,accessing members  from null reference, divide by 0 , etc)

1. JRE(JVM 's main thrd) --- creates matching exception class instance(java.io.FileNotFoundException,java.lang.ArrayOutOfBoundsException,NullPointerException,ArithmeticException) n throws it to the code. (i.e raises the exception)

2. JRE checks -- if there exists any  exception handling code ? (i.e has programmer provided any exception handler ?)
If  No -- JRE provides the default exception handler n aborts java code
It prints details --Fully qualified exception class name,reason behind failure & location details(known as error stack trace)

If  YES (try---catch) JRE execs exception handling block & continues with the rest of the code.


Topics to learn : 
Key words in exception handling --- try,catch,finally,throw,throws
Inheritance hierarchy of exception related classes
unchecked vs checked exceptions.
Creating custom exceptions
JDK 1.7 onwards syntax --- try-with-resources(later useful in Java I/O)


Important : 
Checked & Unchked exception are detected or occur only in run-time.
JRE/JVM DOES NOT distinguish between them
Compiler(javac) differentiates between them
Javac forces handling of the checked exceptions. upon the prog.(Handling either by supplying matching try-catch block or including it in the throws clause.)

Legal  syntax

1. try {...} catch (ArithmeticException e){...}

2. try {...} catch (exc1 e){...} catch (exc2 e) {..} catch (exc3 e) {..}  ....

3. try {...} catch (NullPointerException e){} catch (ArithmeticException e) {}catch(Exception e){catch-all}

3.5  try {...} catch (NumberFormatException e){...} catch (NullPointerException | ArithmeticException | ClassCastException e) {...} catch(Exception e){catch-all}


4. throws syntax ---
method declaration throws comma separated list of exc classes.

eg : Integer class API
public static int parseInt(String s) throws NumberFormatException

DateFormat class API
public Date parse​(String source) throws ParseException
Parses text of the given string to produce a date.

Thread class API
public static void sleep(long ms) throws InterruptedException

FileReader API
public FileReader(String fileName) throws FileNotFoundException

throws --- keyword meant for javac
Meaning -- Method MAY raise specified exception.
Current method is NOT handling it , BUT its caller should handle.
Mandatory to add throws keyword --- only in case of un handled(no try-catch) checked exceptions(i.e classes not extended from RuntimeException).
Use case --used in delegating the exception handling to the caller.

4.5 Throwable class API
 
1. public String toString() -- rets Name of exception class & reason.(detailed error message)
2. public String getMessage() -- rets error message of exception
3. public void printStackTrace() --- Displays name of exception class, reason, location details.


5. finally --- keyword in exception handling : represents a block

 finally block ALWAYS survives(except System.exit(0) i.e terminating JVM)

It will be executed in the presence or absence of exceptions

What is the meaning ?

5.1 try{...} catch (Exception e){....} finally {....}  : legal

5.2 try{...} finally {....} catch (Exception e){....} : illegal

5.3 try{....ArithmeticException.....} catch (NullPointerException e){....} finally {....} : legal

5.4 try {...} finally {....} : legal

6. try-with-resources syntax

From Java SE 7 onwards --- Java has introduced java.lang.AutoCloseable -- i/f(interface)

It represents the resources that must be closed -- when they are no longer required.

java.lang.Autocloesable i/f 
Method
public void close() throws Exception-- to close the resources.
This will be automatically called by JVM , at the end of try-with-resources block.





Java I/O  classes(eg : BufferedReader,PrintWriter.....),Scanner -- have already implemented this i/f -- to automatically close resource when no longer required.

syntax of try-with-resources
try (can open one or multiple AutoCloseable resources)
{ ......
} //close 
catch(Exception e)
{
...
}
eg :
try(Scanner sc=new Scanner(System.in);
    FileReader fr=new FileReader(fileName))
{
 ..........
} catch -all 

7. Creating Custom Exception(User defined exception or application exception)
Need :

1.In case of  B.L failures (eg : funds transfer : insufficient finds)or Validations(invalid email id)  : 
JVM CAN NOT detect these errors.  Programmer will have to create a  custom exc class instance n throw it to the code

syntax of throw keyword :
throw Throwable instance;
eg : throw new MinBalanceException("curnt bal will < min bal....");
 

Steps 

1. Create a packaged public class which extends Throwable(not recommended but legal)/Exception(recommended)/Error(not recommended but legal)/RuntimeExc(not recommended but legal)

eg : public class MyException extends Exception{
   public MyException(String mesg)
   {
    super(mesg);
   }
}

public class MyException2 extends RunTimeException{....} : legal or illegal ? : legal 

public class MyException3 extends NullPointerException{....} : legal or illegal ? :
legal 
eg : throw new MyException3(....); --legal 

2.In the custom exception class , add a parameterized constructor ,  to invoke the super-class constructor with the error message.

Super class constructor :  
Exception (String msg)
OR  
public Exception(String message,Throwable cause)


Objective :
Check the speed of vehicle on a freeway or expressway. If the speed is within a range , allow driver to continue
Otherwise , alert the driver , by raising (throwing) custom exception, with suitable message.


keyword -- throw --for throwing  exception.
JVM uses it to throw built-in exceptions(eg : NullPointerExc , IOException etc) & prog uses it throw custom exception(user defined excs) in case of B.L or validation failures.

syntax :
throw Throwable instance;
eg : Comment on below , legal or illegal ?
throw new NullPointerExc();
throw new InterruptedExc();
throw new Throwable("abc");
throw new BankAccount(...);
throw new AccountOverdrawnException("funds too low...");
