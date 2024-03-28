package com.hexaware.dao;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hexaware.model.Applicant;
import com.hexaware.DBUtil.DbUtil;

public class ApplicantDao {
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;

	public void addApplicant(Applicant applicant) {
		try {
			con = DbUtil.getDBConn();
			ps = con.prepareStatement(
					"insert into applicants values(?,?,?,?,?,?)");
			ps.setInt(1, applicant.getApplicantID());
			ps.setString(2, applicant.getFirstName());
			ps.setString(3, applicant.getLastName());
			ps.setString(4, applicant.getEmail());
			ps.setString(5, applicant.getPhone());
			ps.setString(6, applicant.getResume());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " inserted Successfully in DB");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void reteriveApplicant(Applicant applicant) {
		try {
			con = DbUtil.getDBConn();
			ps = con.prepareStatement("Select * from applicants");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("ApplicantId :" + " " + rs.getInt(1) + " " + "FirstName :" + " " + rs.getString(2)
						+ " " + "LastName :" + " " + rs.getString(3) + " " + "Email :" + " " + rs.getString(4) + " "
						+ "Phone :" + " " + rs.getString(5) + " " + "Resume" + " " + rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
