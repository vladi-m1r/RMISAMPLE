methods: methods.jar
	javac -cp build/methods.jar rmi_server/Server.java

methods.jar: IMethods.class
	jar cvf build/methods.jar interfaces/IMethods.class

IMethods.class: interfaces/IMethods.java
	javac interfaces/IMethods.java
