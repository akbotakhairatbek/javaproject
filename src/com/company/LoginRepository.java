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
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }
}
