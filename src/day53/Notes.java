package day53;

public class Notes {
/*Inheritance : 
    
  IS-A Relationship 
  a sub class can inherit all visible fields and methods from super class 
  we use extends keyword to build this relationship 
  visibility 
    public     -- everywhere 
    protected   -- same package + subclasses outside package 
            YOU MUST HAVE SUB CLASS OBJECT TO ACCESS THESE MEMBERS   
    default   -- same package 
    private   -- same class 
  We dont't inherit anything we dont see 
  Constructor in inheritance relationship 
    ITS NOT INHERITED 
    it can be called in sub class by using super(args...)
  What's the first statement of any constructor if no constructor call this(arg) super(arg) is already made 
    ----> super()  a call to super classes no argument constructor
    
    super(args)  or this(args) can only be called once and can not show up together
    It has to be the first statement all the time 
  Method overridng 
    we have option to override the super class method with new implementation to provde sub class version of the method 
    IT's exclusively for INSTANCE METHODS !!! 
    -- we can just overrdide the method to have same implemention 
    example. in super class : 
        public void doSomething(){
          print("do something ");
        }
         in sub class : 
        @Override
        public void doSomething(){
          //print("do something ");
          super.doSomething(); 
          print("do something more"); 
        }
  super. ---> is used to access super class's field and methods 
  public class Course{
    int capacity = 150; 
    
    public static void doStatic(){
      //
    }
  }
  public class OnlineCourse extends Course{
    int capacity = 300; 
    
    public static void doStatic(){
      //
    }
  }
  Hiding fields : 
    if sub class define a visible field that already exits in super class 
    it hides super class version of the field 
  hiding methods : 
    if sub class define a visible static methid that already exits in super class 
    it hides super class version of the method 
  
*/
}
