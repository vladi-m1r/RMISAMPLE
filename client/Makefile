methods: methods.jar
	javac -cp build/methods.jar rmi_client/Client.java

methods.jar: IMethods.class
	jar cvf build/methods.jar interfaces/IMethods.class

IMethods.class: interfaces/IMethods.java
	javac interfaces/IMethods.java
