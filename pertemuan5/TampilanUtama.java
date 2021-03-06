/*
 * Nama : Ahmad Muhar Dian Lasmita
 * NIM  : 1210520098
 * Kelas: B
 */
package pertemuan5;

import kuis1.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author iyan
 */
public class TampilanUtama extends javax.swing.JFrame {

    /**
     * Creates new form TampilanUtama
     */
    public TampilanUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabelGambar = new javax.swing.JLabel();
        jButtonAmbilGambar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldX = new javax.swing.JTextField();
        jTextFieldY = new javax.swing.JTextField();
        jPanelUkuran = new javax.swing.JPanel();
        jLabelLebar = new javax.swing.JLabel();
        jLabelTinggi = new javax.swing.JLabel();
        jButtonGrayscale = new javax.swing.JButton();
        jLabelPesanError = new javax.swing.JLabel();
        jButtonHistogram = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jSliderKontras = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Praktikum Pengolahan Citra Versi 5.0.0");

        jScrollPane1.setViewportView(jLabelGambar);

        jButtonAmbilGambar.setText("Ambil Gambar");
        jButtonAmbilGambar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAmbilGambarMouseClicked(evt);
            }
        });

        jLabel2.setText("X");

        jLabel3.setText("Y");

        jTextFieldX.setText("0");

        jTextFieldY.setText("0");

        jPanelUkuran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelLebar.setText("Lebar: 0");

        jLabelTinggi.setText("Tinggi: 0");

        javax.swing.GroupLayout jPanelUkuranLayout = new javax.swing.GroupLayout(jPanelUkuran);
        jPanelUkuran.setLayout(jPanelUkuranLayout);
        jPanelUkuranLayout.setHorizontalGroup(
            jPanelUkuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
            .addGroup(jPanelUkuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUkuranLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jLabelTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(jLabelLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        jPanelUkuranLayout.setVerticalGroup(
            jPanelUkuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelUkuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelUkuranLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addGroup(jPanelUkuranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTinggi)
                        .addComponent(jLabelLebar))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jButtonGrayscale.setText("Grayscale");
        jButtonGrayscale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGrayscaleMouseClicked(evt);
            }
        });

        jLabelPesanError.setForeground(new java.awt.Color(241, 64, 24));

        jButtonHistogram.setText("Histogram");
        jButtonHistogram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHistogramMouseClicked(evt);
            }
        });

        jSlider1.setMaximum(255);
        jSlider1.setValue(0);

        jSliderKontras.setMaximum(255);
        jSliderKontras.setValue(0);
        jSliderKontras.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderKontrasStateChanged(evt);
            }
        });

        jLabel4.setText("Brigness");

        jLabel5.setText("Contrass");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jSliderKontras, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                        .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(15, 15, 15)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSliderKontras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAmbilGambar)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonGrayscale, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHistogram, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldX, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldY)))
                            .addComponent(jLabelPesanError))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelUkuran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jLabelPesanError)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAmbilGambar)
                            .addComponent(jButtonGrayscale)
                            .addComponent(jButtonHistogram))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String sumber;
    Image GambarIkon;
    int ukuranX;
    int ukuranY;
    
    private void jButtonAmbilGambarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAmbilGambarMouseClicked
        // kode yang dikerjakan saat tombol 'ambil gambar' diklik
        JFileChooser buka = new JFileChooser();
        int ambil = buka.showOpenDialog(jScrollPane1);
        
        if(ambil == JFileChooser.APPROVE_OPTION){
            sumber = buka.getSelectedFile().getPath();
            jLabelGambar.setIcon(new ImageIcon(sumber));
        }
        
        GambarIkon = new ImageIcon(sumber).getImage();
        ukuranX = GambarIkon.getWidth(null);
        ukuranY = GambarIkon.getHeight(null);
        
        jLabelLebar.setText("Lebar: " + ukuranX + " px");
        jLabelTinggi.setText("Tinggi: " + ukuranY + " px");
    }//GEN-LAST:event_jButtonAmbilGambarMouseClicked

    // method untuk meload gambar
    public static BufferedImage loadImage(String ref){
        BufferedImage bimg = null;
        
        try{
            bimg = ImageIO.read(new File(ref));
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return bimg;
    }
    
    private void jButtonGrayscaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGrayscaleMouseClicked
        // kode yang dikerjakan saat tombol grayscale diklik
        BufferedImage prosesGambar;
        ukuranX = GambarIkon.getWidth(null);
        ukuranY = GambarIkon.getHeight(null);
        
        BufferedImage loadImg = loadImage(sumber);
        prosesGambar = new BufferedImage(ukuranX, ukuranY, BufferedImage.TYPE_INT_RGB);
        Graphics grafik = prosesGambar.getGraphics();
        
        grafik.drawImage(GambarIkon, 0, 0, null);
        
        for(int x = 0; x < ukuranX; x++){
            for(int y = 0; y < ukuranY; y++){
            
                int rgb = loadImg.getRGB(x, y);
                int alpha = (rgb << 24)&0xff;
                int merahGrey = (rgb >> 16)&0xff;
                int hijauGrey = (rgb >> 8)&0xff;
                int biruGrey = (rgb >> 0)&0xff;
                
                int rataRata = (int) ((0.4 * merahGrey + 0.2 * hijauGrey + 0.4 * biruGrey) / 3);
                int grayscale = alpha | rataRata << 16 | rataRata << 8 | rataRata;
                prosesGambar.setRGB(x, y, grayscale);
                
            }
        }
        
        jLabelGambar.setIcon(new ImageIcon(prosesGambar));
    
    }//GEN-LAST:event_jButtonGrayscaleMouseClicked

    private void jButtonHistogramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHistogramMouseClicked
        // Kode yang dikerjakan saat tombol hostogram diklik
        BufferedImage prosesGambar;
        ukuranX = GambarIkon.getWidth(null);
        ukuranY = GambarIkon.getHeight(null);
        
        BufferedImage loadImg = loadImage(sumber);
        prosesGambar = new BufferedImage(ukuranX, ukuranY, BufferedImage.TYPE_INT_RGB);
        Graphics grafik = prosesGambar.getGraphics();
        
        grafik.drawImage(GambarIkon, 0, 0, null);
        
        for(int x = 0; x < ukuranX; x++){
            for(int y = 0; y < ukuranY; y++){
            
                int rgb = loadImg.getRGB(x, y);
                int alpha = (rgb << 24)&0xff;
                int merahGrey = (rgb >> 16)&0xff;
                int hijauGrey = (rgb >> 8)&0xff;
                int biruGrey = (rgb >> 0)&0xff;
                
                int rataRata = (int) ((0.4*merahGrey + 0.2*hijauGrey + 0.4*biruGrey) / 3);
                int grayscale = alpha | rataRata << 16 | rataRata << 8 | rataRata;
                //prosesGambar.setRGB(x, y, grayscale);
                
            }
        }
        
        jLabelGambar.setIcon(new ImageIcon(prosesGambar));
        bikinHistogram(prosesGambar, "Grafik Citra");
    }//GEN-LAST:event_jButtonHistogramMouseClicked

    private void jSliderKontrasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderKontrasStateChanged
        // TODO add your handling code here:
        int cerah = jSliderKontras.getValue();
        BufferedImage hasilBrig = kontras(sumber, cerah);
        int x = jLabelGambar.getWidth();
        int y = jLabelGambar.getHeight();
        ImageIcon imageIcon = new ImageIcon(hasilBrig);
        jLabelGambar.setIcon(imageIcon);
    }//GEN-LAST:event_jSliderKontrasStateChanged

    // Method untuk membuat histogram
    public void bikinHistogram(BufferedImage gmbr, String judul) {
        int lebar = gmbr.getWidth();
        int tinggi = gmbr.getHeight();
        int count[][] = new int[4][0x100];
        int merah = 0;
        int biru = 1;
        int hijau = 2;
        int total = lebar * tinggi;

        try {
            for (int x = 0; x < lebar; x++) {
                for (int y = 0; y < tinggi; y++) {

                    int rgb = gmbr.getRGB(x, y);
                    int merahGrey = (rgb >> 16) & 0xff;
                    int hijauGrey = (rgb >> 8) & 0xff;
                    int biruGrey = (rgb >> 0) & 0xff;
                    int grey = (merahGrey + hijauGrey + biruGrey) / 3;

                    count[merah][merahGrey]++;
                    count[biru][biruGrey]++;
                    count[hijau][hijauGrey]++;
                    count[3][grey]++;

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // membuat dataset dan mengisinya dengan perulangan
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int f = 0; f < 0x100; f++) {
            dataset.addValue(count[0][f], "Red", new Integer(f));
            dataset.addValue(count[2][f], "Blue", new Integer(f));
            dataset.addValue(count[1][f], "Green", new Integer(f));
            dataset.addValue(count[3][f], "Black", new Integer(f));
        }

        JFreeChart histo = ChartFactory.createBarChart("Histogram Citra", "Nilai", "Frekuensi", dataset, 
                PlotOrientation.VERTICAL, true, true, false);

        ChartFrame frame = new ChartFrame("Histogram Citra", histo);
        histo.setBackgroundPaint(Color.white);
        final CategoryPlot plot = (CategoryPlot) histo.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeMinorGridlinePaint(Color.white);

        frame.setSize(500, 300);
        frame.setLocation(380, 200);
        frame.setTitle(judul);
        frame.setVisible(true);

    }
 
    // method kontras
    public BufferedImage kontras(String sumber, int kontras){
        BufferedImage prosesGambar;
        BufferedImage loadImg = loadImage(sumber);
        
        ukuranX = loadImg.getWidth();
        ukuranY = loadImg.getHeight();
        
        prosesGambar = new BufferedImage(ukuranX, ukuranY, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesGambar.getGraphics();
        g.drawImage(loadImg, 0, 0, null);
        WritableRaster raster = prosesGambar.getRaster();
        
        for(int x=0; x < ukuranX; x++){
            for(int y=0; y < ukuranY; y++){
                int rgb = loadImg.getRGB(x, y);
                int alpha = (rgb << 24) & 0xff;
                int merahg = (rgb >> 16) & 0xff;
                int hijaug = (rgb >> 8) & 0xff;
                int birug = (rgb >> 0) & 0xff;
                int grey = (merahg + hijaug + birug ) / 3;
                int merah2 = merahg * kontras;
                int hijau2 = hijaug * kontras;
                int biru2 = birug * kontras;
                
                if(merah2 < 0){
                    merah2 = 0;
                }
                
                if(hijau2 < 0){
                   hijau2 = 0;
                }
                
                if(biru2 < 0){
                    biru2 = 0;
                }
                
                if(merah2 > 255){
                    merah2 = 255;
                }
                
                if(hijau2 > 255){
                    hijau2 = 255;
                }
                
                if(biru2 > 255){
                    biru2 = 255;
                }
                
                int rgb2 = alpha | merah2 << 16 | hijau2 << 8 | biru2;
                prosesGambar.setRGB(x, y, rgb2);
            }
        } 
        
        return prosesGambar;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TampilanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAmbilGambar;
    private javax.swing.JButton jButtonGrayscale;
    private javax.swing.JButton jButtonHistogram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelGambar;
    private javax.swing.JLabel jLabelLebar;
    private javax.swing.JLabel jLabelPesanError;
    private javax.swing.JLabel jLabelTinggi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelUkuran;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSliderKontras;
    private javax.swing.JTextField jTextFieldX;
    private javax.swing.JTextField jTextFieldY;
    // End of variables declaration//GEN-END:variables
}
