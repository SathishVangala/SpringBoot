package com.teluskloTest.SpringJDBCTest.repository;

import com.teluskloTest.SpringJDBCTest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductRepo {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Product p) {
        String sql = "insert into Product(pId,pName,location) values (?,?,?)";
        int rows = jdbc.update(sql, p.getpID(), p.getpName(), p.getLocation());

        System.out.println(rows + " rows effected");
    }

    public List<Product> findAll() {
        String sql = "select * from product";
        RowMapper<Product> mapper = new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product s = new Product();
                s.setpID(rs.getInt("pId"));
                s.setpName(rs.getString("pName"));
                s.setLocation(rs.getString("location"));

                return s;
            }


        };
        return jdbc.query(sql,mapper);
    }

    public void saveUpdate(Product p) {
        String updateSql= " update product set pName = ? where pId=?";
        int rows = jdbc.update(updateSql,p.getpName(), p.getpID());

        System.out.println(rows + " rows effected");
    }
}
