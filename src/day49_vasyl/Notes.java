package day49_vasyl;

public class Notes {
	/*What we are covering today: 
	- inheritance 
	- this() and super() keywords, what's the difference, when do we use them.
	- this. super. - keywords
	- super/parent class 
	- child class, sub class, derived class - same things... 
	- extends keyword, important attribute of inheritance 

============================

		WARMUP TASK

============================

Please create a class called Book.

This class has 5 instance variables: author, pageCount, price, chapterCount, title

Then, based on Book class, we need to create a class called AudioBook
in this class we need to create a few instance variables: length (double). size (double)

One more class that extends Book class, PaperBook with instance variables: isHardcover (boolean), weight. 

//make all instance variables public.

===================================

The type AudioBook cannot subclass the final class 
 PaperBook

 If you make class final - no one will be able to extend this class.

 REMEMBER: WE CANNOT EXTEND 2 CLASS AT SAME TIME. 
 extends Vehicle, Animal -- illegal!!!!!

final it's a  keyword that make variable immutable, class not inheritable.  

For example, when variable is final we call it constant. Usually we type final variables all upper case.

difference among final, finally, finalize - very funny interview question...


We can make class final, for example Book, but it doesn't make sense to make this class final, because we  will create a bunch of sub classes, that will inherit all properties and behavior (methods) from that class. We cam inherit everything that is not PRIVATE!

In java, all classes automatically inherits from Object class.
So when we auto generate constructor, we are getting super() keyword on the first line. What happens, our constructor calls super class constructor.

super keyword is used to call parent class constructor or method.
super() in the constructor, this how we call parent constructor.

original version of toString()
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

  since Object class is a super class for every class in Java, we can override toString() method that actually stand for string representation of an object. JVM calls toString() automatically when we print an object (for example). We don't create a new toString() method, we override existing method from parent class.     


 Our version of toString() method. 

@Override
	public String toString() {
		return "Book [author=" + author + ", pageCount=" + pageCount + ", price=" + price + ", chapterCount="
				+ chapterCount + ", title=" + title + "]";
	}
If in super class, we only have a constructor with parameters, sub class must have the same constructor. If super class has default constructor or no args constructor - sub class are not require to define constructor with arguments. 

BREAK TILL 9:15!

 
EBook ebbok1= new EBook();
ebbok1.author = "Walter Savitch";
//WHY ONLY author property is available?
ebbok1.setTitle("Java 8");
System.out.println(ebbok1);

Ebook inherits Book class. Since Ebook class is in different package, Ebook will inherit only protected and public variables/methods. Methods/variables that are default  (no keyword!) they are not inherited. 

Private instance variables/methods will be only visible in the class. 

Constructor chaining ?

this() we are calling other constructor withing a same class.
super() we are calling parent constructor from parent class.






*/

}
