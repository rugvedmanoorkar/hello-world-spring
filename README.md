# Lab 0 hello-world-spring
Hello world for spring boot
In this lab, you build a HelloWorld Java console application with Spring’s application context. 

You will create a greeting bean with the ID “greeter”, which must be specified in your application context’s configuration file, named beans.xml. The class of the greeting bean implements the following interface:

  interface Greeter {
	void setName(String name); // name of the author
	String getGreeting();
  }

The value of the name property should be specified in beans.xml as well. 
