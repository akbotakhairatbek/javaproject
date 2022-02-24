package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginRepository implements IUserRepository{
    private final IDB db;

    public LoginRepository(IDB db) {
        this.db=db;
    }

    @Override
    public boolean createLogin(User user) {
        Connection con=null;
        try {
            con= db.getConnection(); //connects to the database
            String sql="insert into users(login, password) values (?,?)";
            PreparedStatement stmt=con.prepareStatement(sql);

            stmt.setString(1,user.getLogin());
            stmt.setString(2,user.getPassword());

            stmt.execute();
            return true;
        } catch (SQLException throwables) { //in this catch block conclude code on handling the SQLException exception
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) { //in this catch block conclude code on handling the ClassNotFoundException exception
            e.printStackTrace();
        } finally { // in the block finally close the stream
            try { // if a stream is closed, an exception is possible, for example, if it has not been opened, so "wrap" the code in the try block
                con.close();
            } catch (SQLException throwables) { // write exception processing when closing stream
                throwables.printStackTrace();
            }
        }
        return false;
    }
}
