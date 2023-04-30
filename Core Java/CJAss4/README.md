Beginning of a mini Project , to apply the learnt concepts.

Final Aim : To Create a Java application for customer management system.
(signIn , signup, update password, un subsribe user ....)

Customer HAS-A 
customer id(int) ,first name,email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)

ServicePlan charges : 
SILVER : 1000 
GOLD : 2000
DIAMOND : 5000
PLATINUM : 10000

Depending on the plan chosen , customer will have to pay specific registration amount
customer id should be system generated , using auto increment.
check for Strong password else throw exception
Unique ID(Primary Key ) : email  (2 customers are SAME iff their email ids are same)
(...Will continue later)
