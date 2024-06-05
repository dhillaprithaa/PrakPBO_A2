package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {

    public MysqlMahasiswaService() {
        // Constructor
    }

    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    public void add(Mahasiswa mhs) {
        try (Connection conn = MysqlUtility.getConnection()) {
            String query = "INSERT INTO mahasiswa ( nama) VALUES (?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, mhs.getNama());
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Mahasiswa mhs) {
        try (Connection conn = MysqlUtility.getConnection()) {
            String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, mhs.getNama());
                stmt.setInt(2, mhs.getId());
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try (Connection conn = MysqlUtility.getConnection()) {
            String query = "DELETE FROM mahasiswa WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try (Connection conn = MysqlUtility.getConnection()) {
            String query = "SELECT * FROM mahasiswa WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, id);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        try (Connection conn = MysqlUtility.getConnection()) {
            String query = "SELECT * FROM mahasiswa";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    mahasiswaList.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mahasiswaList;
    }

    public void indexReset() {
        try (Connection conn = MysqlUtility.getConnection()) {
            String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isEmpty() {
        boolean empty = true;
        try (Connection conn = MysqlUtility.getConnection()) {
            String query = "SELECT COUNT(*) AS total FROM mahasiswa";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {
                if (rs.next() && rs.getInt("total") > 0) {
                    empty = false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empty;
    }

    public void closeConnection() {
        try (Connection conn = MysqlUtility.getConnection()) {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
