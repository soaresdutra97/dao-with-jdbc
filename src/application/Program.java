package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import db.DB;
import db.DbIntegrityException;
import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDAO;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

		SellerDAO sellerDAO = DaoFactory.createSellerDao();

		System.out.println(seller);

	}
}
