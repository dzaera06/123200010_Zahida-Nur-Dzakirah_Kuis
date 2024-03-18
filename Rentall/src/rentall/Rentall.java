package rentall;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Rentall {

    public static void main(String[] args) {
       package rentalapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rental extends JFrame implements ActionListener {
    private JFrame frame;
    private JButton motorButton, mobilButton;
    private JLabel namaLabel, nomorLabel, jenisLabel, hargaLabel, jumlahLabel, totalLabel;
    private JTextField namaField, nomorField;
    private JRadioButton motor, mobil;
    private JTextField jumlahField;
    private JButton simpanButton, selesaiButton;
    private JPanel panel;
    private Kendaraan motorKendaraan, mobilKendaraan;
    private Penyewa penyewa;

    public Rental() {
        frame = new JFrame("Rental Kendaraan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Frame 1: Pilihan Kendaraan
        motorButton = new JButton("Motor");
        mobilButton = new JButton("Mobil");
        panel = new JPanel();
        panel.add(motorButton);
        panel.add(mobilButton);
        frame.add(panel, BorderLayout.CENTER);

        // Frame 2/3: Detail Penyewaan
        JPanel detailPanel = new JPanel();
        namaLabel = new JLabel("Nama Penyewa:");
        nomorLabel = new JLabel("Nomor Telepon:");
        jenisLabel = new JLabel("Jenis Kendaraan:");
        hargaLabel = new JLabel("Harga Sewa per Hari:");
        jumlahLabel = new JLabel("Jumlah Hari Sewa:");
        totalLabel = new JLabel("Total Harga:");
        namaField = new JTextField(20);
        nomorField = new JTextField(20);
        motor = new JRadioButton("Motor");
        mobil = new JRadioButton("Mobil");
        ButtonGroup group = new ButtonGroup();
        group.add(motor);
        group.add(mobil);
        jumlahField = new JTextField(20);
        simpanButton = new JButton("Simpan");
        selesaiButton = new JButton("Selesai");
        detailPanel.add(namaLabel);
        detailPanel.add(namaField);
        detailPanel.add(nomorLabel);
        detailPanel.add(nomorField);
        detailPanel.add(jenisLabel);
        detailPanel.add(motor);
        detailPanel.add(mobil);
        detailPanel.add(hargaLabel);
        detailPanel.add(jumlahLabel);
        detailPanel.add(jumlahField);
        detailPanel.add(totalLabel);
        detailPanel.add(simpanButton);
        detailPanel.add(selesaiButton);
        frame.add(detailPanel, BorderLayout.SOUTH);

        // Frame 4: Detail dan Total Harga
        JPanel detailHargaPanel = new JPanel();
        JLabel namaDetailLabel = new JLabel("Nama Penyewa:");
        JLabel nomorDetailLabel = new JLabel("Nomor Telepon:");
        JLabel jenisDetailLabel = new JLabel("Jenis Kendaraan:");
        JLabel hargaDetailLabel = new JLabel("Harga Sewa per Hari:");
        JLabel jumlahDetailLabel = new JLabel("Jumlah Hari Sewa:");
        JLabel totalDetailLabel = new JLabel("Total Harga:");
        JLabel namaDetail = new JLabel();
        JLabel nomorDetail = new JLabel();
        JLabel jenisDetail = new JLabel();
        JLabel hargaDetail = new JLabel();
        JLabel jumlahDetail = new JLabel();
        JLabel totalDetail = new JLabel();
        detailHargaPanel.add(namaDetailLabel);
        detailHargaPanel.add(namaDetail);
        detailHargaPanel.add(nomorDetailLabel);
        detailHargaPanel.add(nomorDetail);
        detailHargaPanel.add(jenisDetailLabel);
        detailHargaPanel.add(jenisDetail);
        detailHargaPanel.add(hargaDetailLabel);
        detailHargaPanel.add(hargaDetail);
        detailHargaPanel.add(jumlahDetailLabel);
        detailHargaPanel.add(jumlahDetail);
        detailHargaPanel.add(totalDetailLabel);
        detailHargaPanel.add(totalDetail);
        frame.add(detailHargaPanel, BorderLayout.NORTH);

        frame.setVisible(true);

        motorButton.addActionListener(this);
        mobilButton.addActionListener(this);
        simpanButton.addActionListener(this);
        selesaiButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == motorButton) {
            motorKendaraan = new Kendaraan("Motor", 10000);
            jenisDetail.setText(motorKendaraan.getJenis());
            hargaDetail.setText("Rp " + motorKendaraan.getHargaSewaPerHari());
        } else if (e.getSource() == mobilButton) {
            mobilKendaraan = new Kendaraan("Mobil", 20000);
            jenisDetail.setText(mobilKendaraan.getJenis());
            hargaDetail.setText("Rp " + mobilKendaraan.getHargaSewaPerHari());
        } else if (e.getSource() == simpanButton) {
            penyewa = new Penyewa(namaField.getText(), nomorField.getText(), motorKendaraan, Integer.parseInt(jumlahField.getText()));
            namaDetail.setText(
    }
    
}
} 

    }
    
}
