package com.company.Controller;


import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import com.company.cmodels.Coffee;
import com.company.cmodels.Van;
import java.io.Serializable;
import java.util.ArrayList;

public class Storage implements Serializable {
    private ArrayList<Coffee> coffeeStorage;
    private ArrayList<Van> vansStorage;
    private static Storage instance = null;

    private Storage() {
        coffeeStorage = new ArrayList<Coffee>();
        vansStorage = new ArrayList<Van>();
    }

    public static synchronized Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public String[][] getCoffeeFromDb() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        String resultArr[][] = new String[10][4];
        Connection connection = null;
        String databaseName = "";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;

        String username = "root";
        String password = "1234";
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(url, username, password);
        if (connection.isValid(1)) {
            ResultSet resultSet = connection.prepareStatement(
                    "SELECT * FROM coffee.CoffeeInfo").executeQuery();
            int i = 0;
            while (resultSet.next()) {
                resultArr[i][0] = resultSet.getString(2);
                resultArr[i][1] = String.valueOf(resultSet.getInt(3));
                resultArr[i][2] = String.valueOf(resultSet.getInt(4));
                resultArr[i][3] = String.valueOf(resultSet.getInt(5));
                i++;
            }

            return resultArr;
        }
        return null;
    }


    public void addVan(String name, int vanVolume) {
        vansStorage.add(new Van(name, vanVolume));
    }

    public boolean deleteVan (Van selectedVan) {
        if(!vansStorage.isEmpty()) {
            return vansStorage.remove(selectedVan);
        }
        return false;
    }

    public synchronized void addCoffee(Coffee newCoffee) {
        coffeeStorage.add(newCoffee);
    }

    public synchronized boolean deleteCoffee (Coffee selectedCoffee) {
        if(!coffeeStorage.isEmpty()) {
            return coffeeStorage.remove(selectedCoffee);
        }
        return false;
    }

    public void setVansStorage(ArrayList<Van> vansStorage) {
        this.vansStorage = vansStorage;
    }

    public ArrayList<Van> getVansStorage() {
        return new ArrayList<Van>(vansStorage);
    }

    public void setCoffeeStorage(ArrayList<Coffee> coffeeStorage) {
        this.coffeeStorage = coffeeStorage;
    }

    public ArrayList<Coffee> getCoffeeStorage() {
        return new ArrayList<Coffee>(coffeeStorage);
    }
}

