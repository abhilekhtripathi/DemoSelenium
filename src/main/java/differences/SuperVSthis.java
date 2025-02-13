package differences;

public class SuperVSthis

{
/**
 * *********Super****************
 * Refers   >  to Parent class members
 * Variable Access> 	Accesses parent class variable (if hidden)
 * Method Access > 	Calls parent class method (if overridden)
 * constructor Call > 	Calls parent class constructor using super()
 * Use Case	 > Used when a child class wants to access parent class properties or behaviors
 * Allowed in Static Context? > No, because super is tied to instance members
 * 
 * 
 * **********this******************************
 * Current class members
 * Accesses current class variable
 * Calls current class method
 * Calls another constructor in the same class using this()
 * Used within the same class to differentiate instance variables or call another constructor
 * Allowed static context > ❌ No, because this refers to the current instance
 */
}
