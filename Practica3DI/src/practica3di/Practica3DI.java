package practica3di;

/**
 *
 * @author fonsi
 */
public class Practica3DI extends javax.swing.JFrame {
    
    public Practica3DI() {
        initComponents();
    }
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        

        jLabel1.setText("Indica la ruta del ejecutable");

        jButton1.setText("...");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addContainerGap(431, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                        .addGap(50,50,50)
                    .addComponent(jButton1))
                .addContainerGap(371, Short.MAX_VALUE))
        );

        pack();
    }
    

    public static void main(String[] args) {
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica3DI().setVisible(true);
            }
        });
    }
    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jButton1;
    
}
