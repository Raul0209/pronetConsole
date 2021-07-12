package com.balding.soap.ws.client.generated;

import java.sql.*;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Creamos la conexion a la base de datos

        //Carga al contexto de java la conexion a la base de datos
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        //ASignamos las configuraciones de nuestro SQLServer
        String uri = "jdbc:sqlserver://LAPTOP-UAU13H6M\\SQLEXPRESS:1433;database=pronet;user=pronet;password=123";

        //Relizamos la connexion
        Connection conn = DriverManager.getConnection(uri);
        System.out.println("Connected to database");

        //Almacenamos el query que vamos a realizar, en este caso es una insercion
        String query = "INSERT INTO cat_moneda(id,nombre) values(?,?)";

        //Seteamos el query al procedimiento a ejecutar
        PreparedStatement preparedStatement = conn.prepareStatement(query);

        System.out.println("DESPLIEGA LAS VARIABLES DISPONIBLES");

        //Invocamos al metodo que trae la data del WebService
        TipoCambio tipoCambioImplService = new TipoCambio();
        //Ciclo para recorrer todos y cada uno de los datos obtenidos de la consulta al WebService
        for (int i = 0; i < tipoCambioImplService.getTipoCambioSoap().variablesDisponibles().totalItems; i++) {
            //Manejamos posibles errores
            try {
                //Mostramos las monedas encontradas
                System.out.println(tipoCambioImplService.getTipoCambioSoap().variablesDisponibles().variables.variable.get(i).moneda + " " + tipoCambioImplService.getTipoCambioSoap().variablesDisponibles().variables.variable.get(i).descripcion);

             //Seteamos los valores a almacenar en la consulta
                preparedStatement.setInt(1, tipoCambioImplService.getTipoCambioSoap().variablesDisponibles().variables.variable.get(i).moneda);
                preparedStatement.setString(2, tipoCambioImplService.getTipoCambioSoap().variablesDisponibles().variables.variable.get(i).descripcion);
                //Ejecutamos el procedimiento
                preparedStatement.execute();
            } catch (Exception e) {
                //En caso de excepcion la mostramos en pantalla
                System.out.println("Error: " + e);
            }

        }
    }

}
