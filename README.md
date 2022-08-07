# SistemaDistribuidoCalificaciones
Sistema distribuido que registra calificaciones en un servidor que crea alertas hacia los estudiantes y a un servidor de bienestar universitaro.

ejecutar el siguiente comando en cmd antes de correr las aplicaciones para crear un puerto local
"C:\Program Files\Java\jdk1.8.0_202\bin\orbd" -ORBInitialHost localhost -ORBInitialPort 2020

orden de ejecucion:
1) co.unicauca.servicios.ServObjBien.java
2) co.unicauca.servicios.ServObjEst.java
3) co.unicauca.servidor.servicios.ServidorDeObj.java
4) package co.unicauca.servicios.ClienteDeObj.java

la cuarta aplicacion tiene datos quemados para cargar al Servidor de objetos.
