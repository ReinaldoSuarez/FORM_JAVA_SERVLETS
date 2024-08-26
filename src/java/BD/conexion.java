/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {

    public static String url = "jdbc:mysql://localhost/bdventas";
    public static String usuario = "root";
    public static String clave = "";
    public static String clase = "com.mysql.cj.jdbc.Driver";  // Actualizado a la versión más reciente del driver
    private Connection conexion = null;

    public conexion() {
        conectar();
    }

    public Connection conectar() {
        try {
            Class.forName(clase);
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexión establecida.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
        return conexion;
    }

    public ResultSet ejecutarConsulta(String sql) {
        ResultSet rs = null;
        Statement st = null;
        try {
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
        return rs;
    }

    public int ejecutarActualizacionP(String sql, Object[] params) {
        int resultado = 0;
        PreparedStatement ps = null;
        try {
            ps = conexion.prepareStatement(sql);
            // Definir los valores para los parámetros
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            resultado = ps.executeUpdate(); // Retorna la cantidad de registros actualizados
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la actualización: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();  // Cerrando el PreparedStatement
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar el PreparedStatement: " + e.getMessage());
            }
        }
        return resultado;
    }

    public void desconectar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}

