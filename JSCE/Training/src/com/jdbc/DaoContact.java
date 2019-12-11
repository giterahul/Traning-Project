package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoContact {
	protected Connection connection;
	protected Statement statement;
	protected String tableName;

	// Constructors
	/**
	 * @param connection
	 * @param statement
	 * @param tableName
	 */
	public DaoContact(Connection connection, Statement statement, String tableName) {
		// super();
		setConnection(connection);
		setStatement(statement);
		setTableName(tableName);
	}

	/**
	 * @param connection
	 * @param tableName
	 * @throws SQLException
	 */
	public DaoContact(Connection connection, String tableName) throws SQLException {
		// super();
		this(connection, connection.createStatement(), tableName);
	}

	/**
	 * @param statement
	 * @param tableName
	 * @throws SQLException
	 */
	public DaoContact(Statement statement, String tableName) throws SQLException {
		// super();
		this(statement.getConnection(), statement, tableName);
	}

	// Getters And Setters
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public int addContact(String firstName, String lastName, String phoneNumber) throws SQLException {
		String insertStatement = "INSERT INTO " + getTableName() + " (FIRSTNAME,LASTNAME,PHONENUMBER) VALUES (?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertStatement);
		preparedStatement.setString(1, firstName);
		preparedStatement.setString(2, lastName);
		preparedStatement.setString(3, phoneNumber);
		return preparedStatement.executeUpdate();
	}

	public ResultSet findContact(int id) throws SQLException {
		String findStatement = "select * from " + getTableName() + " where ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(findStatement);
		preparedStatement.setInt(1, id);
		return preparedStatement.executeQuery();
	}

	public int deleteContact(int id) throws SQLException {
		String deleteStatement = "delete from " + getTableName() + " where ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(deleteStatement);
		preparedStatement.setInt(1, id);
		return preparedStatement.executeUpdate();
	}

	public int update(int findid, String firstName, String lastName, String phoneNumber) throws SQLException {
		String updateStatement = "update " + getTableName()
				+ " set FIRSTNAME=? , LASTNAME =?,PHONENUMBER =? where ID=?";
		PreparedStatement preparedStatement = connection.prepareStatement(updateStatement);
		preparedStatement.setString(1, firstName);
		preparedStatement.setString(2, lastName);
		preparedStatement.setString(3, phoneNumber);
		preparedStatement.setInt(4, findid);
		return preparedStatement.executeUpdate();
	}

}
