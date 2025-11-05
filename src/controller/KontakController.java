
package controller;

import model.Kontak;
import model.KontakDAO;
import java.sql.SQLException;
import java.util.List;


public class KontakController {
    
    private KontakDAO contactDAO;

public KontakController() {
    contactDAO = new KontakDAO();
}

// Method untuk mengambil semua data kontak
public List<Kontak> getAllContacts() throws SQLException {
    return contactDAO.getAllContacts();
}

// Method untuk menambah kontak
public void addContact(String nama, String nomorTelepon, String kategori) throws SQLException {
    Kontak contact = new Kontak(0, nama, nomorTelepon, kategori);
    contactDAO.addContact(contact);
}

// Method untuk memperbarui kontak
public void updateContact(int id, String nama, String nomorTelepon, String kategori) throws SQLException {
    Kontak contact = new Kontak(id, nama, nomorTelepon, kategori);
    contactDAO.updateContact(contact);
}

// Method untuk menghapus kontak
public void deleteContact(int id) throws SQLException {
    contactDAO.deleteContact(id);
}

// Method untuk mencari kontak berdasarkan kata kunci
public List<Kontak> searchContacts(String keyword) throws SQLException {
    return contactDAO.searchContacts(keyword);
}

// Method untuk memeriksa apakah nomor telepon duplikat
public boolean isDuplicatePhoneNumber(String nomorTelepon, Integer excludeId) throws SQLException {
    return contactDAO.isDuplicatePhoneNumber(nomorTelepon, excludeId);
}
    
}
