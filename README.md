## Compilar Interfaces
En la carpeta cliente y servidor

- javac interfaces/*.java

## Building JAR
En la carpeta cliente y servidor

- mkdir build
- jar cvf build/methods.jar interfaces/*.class

## Compilar servidor y cliente
En la carpeta cliente
- javac -cp build/methods.jar rmi_client/Client.java

En la carpeta servidor
- javac -cp build/methods.jar rmi_server/Server.java

## Ejecutando servidor

rmiregistry -J-Djava.rmi.server.useCodebaseOnly=false

En Windows:

* java -Djava.rmi.server.codebase=file:/C:/Users/vladi/RMISAMPLE/server/build/methods.jar -Djava.rmi.server.hostname=192.168.1.5 rmi_server.Server

En Linux:

* java -Djava.rmi.server.codebase=file:/home/vladi/RMISAMPLE/server/build/methods.jar -Djava.rmi.server.hostname=192.168.1.5 rmi_server.Server

En esta seccion cambiar el path codebase si methods.jar se encuentra en otro lado, de la misma forma cambia el hostname.

## Ejecutando cliente
En Windows:

* java -Djava.rmi.server.codebase=file:/C:/Users/vladi/RMISAMPLE/server/build/methods.jar rmi_client.Client 192.168.1.5

En Linux:

* java -Djava.rmi.server.codebase=file:/home/vladi/RMISAMPLE/server/build/methods.jar rmi_client.Client 192.168.1.5
  
Al igual que el punto anterior modificar el path de codebase apuntando siempre a methods.jar y el host que deberia ser el mismo que se definio en el servidor.
