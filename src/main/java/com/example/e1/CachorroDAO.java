package com.example.e1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CachorroDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/crud";
    private static final String USER = "root";  // Altere conforme sua configuração
    private static final String PASSWORD = "pesquisador";  // Altere conforme sua configuração

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void addCachorro(Cachorro cachorro) throws SQLException {
        String sql = "INSERT INTO cachorros (nome, raca, cor) VALUES (?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cachorro.getNome());
            stmt.setString(2, cachorro.getRaca());
            stmt.setString(3, cachorro.getCor());
            stmt.executeUpdate();
        }
    }

    public List<Cachorro> getAllCachorros() throws SQLException {
        List<Cachorro> cachorros = new ArrayList<>();
        String sql = "SELECT * FROM cachorros";
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Cachorro cachorro = new Cachorro();
                cachorro.setId(rs.getInt("id"));
                cachorro.setNome(rs.getString("nome"));
                cachorro.setRaca(rs.getString("raca"));
                cachorro.setCor(rs.getString("cor"));
                cachorros.add(cachorro);
            }
        }
        return cachorros;
    }

    public void updateCachorro(Cachorro cachorro) throws SQLException {
        String sql = "UPDATE cachorros SET nome = ?, raca = ?, cor = ? WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cachorro.getNome());
            stmt.setString(2, cachorro.getRaca());
            stmt.setString(3, cachorro.getCor());
            stmt.setInt(4, cachorro.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteCachorro(int id) throws SQLException {
        String sql = "DELETE FROM cachorros WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
