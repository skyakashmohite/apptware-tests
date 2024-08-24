/** This class is expected to be a singleton. Please make necessary changes. */
package com.apptware.interview.singleton;

public class Singleton {
  private static Singleton single_instance = null;
  private static boolean createdFlag = false;

  public String s;

  private Singleton() {

   if (createdFlag) {
	   throw new RuntimeException("Singleton instance already created. Reflection is not allowed.");
	// custom type exception can be created
   }
   createdFlag = true;
    s = "Hello I am a string part of Singleton class";
  }

  public static synchronized Singleton getInstance() {
    if (single_instance == null) single_instance = new Singleton();

    return single_instance;
  }
}
