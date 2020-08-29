package com.mycode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mycode.conexion.Conexion;
import com.mycode.model.Producto;


public class ProductoDAO {
	
	private Connection connection;
	private PreparedStatement statement;
	private boolean estadoOperacion;
	
	//Metodo para guardar 
	public boolean guardar(Producto producto) throws SQLException {
		String sql=null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO producto (id, nombre, cantidad, precio, fecha_crear, fecha_actualizar) VALUES (?,?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, null);
			statement.setString(2, producto.getNombre());
			statement.setDouble(3, producto.getCantidad());
			statement.setDouble(4, producto.getPrecio());
			statement.setDate(5, producto.getFechaCrear());
			statement.setDate(6, producto.getFechaActualizar());
			
			estadoOperacion = statement.executeUpdate()>0;
			
			connection.commit();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			connection.rollback();
			e.printStackTrace();
		}
		
		return estadoOperacion;
	}
	
	//Metodo para editar un pruducto
	public boolean editar(Producto producto) {
		
		return true;
	} 
	
	//Metodo para eliminar un producto
	public boolean eliminar(int idProducto) {
		
		return true;
	}
	
	//Metodo para obtener todos los productos de la BD
	public List<Producto> obtenerProductos() throws SQLException{
		ResultSet resultset = null;
		List<Producto> listaProductos = new ArrayList<>();
		
		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();
		
		try {
			sql = "SELECT * FROM producto";
			statement=connection.prepareStatement(sql);
			resultset = statement.executeQuery();
			while (resultset.next()) {
				Producto p = new Producto();
				p.setId(resultset.getInt(1));
				p.setNombre(resultset.getString(2));
				p.setCantidad(resultset.getDouble(3));
				p.setPrecio(resultset.getDouble(4));
				p.setFechaCrear(resultset.getDate(5));
				p.setFechaActualizar(resultset.getDate(6));
				listaProductos.add(p);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listaProductos;
	}
	
	//Obtener un solo producto
	public Producto obtenerProducto(int idProducto) {
		
		return null;
	}
	
	private Connection obtenerConexion() throws SQLException {
		
		return Conexion.getConnection();
	}
	

}
