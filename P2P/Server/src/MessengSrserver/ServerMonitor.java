package MessengSrserver;

import java.awt.BorderLayout;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ListSelectionModel;
import java.util.*;

public class ServerMonitor extends javax.swing.JFrame {

    ServerManager serverManager;
    ServerStatusListener statusListener;
    ClientListener clientListener;
    static HashMap<String,String> hm = new HashMap<String,String>();
    /** Creates new form ServerMonitor */
    public ServerMonitor(ServerManager getManager)
    {
        serverManager=getManager;
        statusListener=new MyStatusListener();
        clientListener=new MyClientListener();
        initComponents();
        createListModel();
    }

    void createListModel()
    {
        list_model=new javax.swing.DefaultListModel();
        list_online_clients = new javax.swing.JList(list_model);
        list_online_clients.setBorder(javax.swing.BorderFactory.createTitledBorder("ONLINE CLIENTS"));

        dlsm=new DefaultListSelectionModel();
        dlsm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	list_online_clients.setSelectionModel(dlsm);
        list_panel.setLayout(new BorderLayout());
        list_panel.add(list_online_clients);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_monitor_clients = new javax.swing.JTextArea();
        list_panel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        but_start = new javax.swing.JButton();
        but_stop = new javax.swing.JButton();
        lb_status = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("H-Server");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        ta_monitor_clients.setColumns(20);
        ta_monitor_clients.setEditable(false);
        ta_monitor_clients.setRows(5);
        ta_monitor_clients.setBorder(javax.swing.BorderFactory.createTitledBorder("MONITOR CLIENTS"));
        jScrollPane1.setViewportView(ta_monitor_clients);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout list_panelLayout = new javax.swing.GroupLayout(list_panel);
        list_panel.setLayout(list_panelLayout);
        list_panelLayout.setHorizontalGroup(
            list_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        list_panelLayout.setVerticalGroup(
            list_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );

        but_start.setText("Start");
        but_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_startActionPerformed(evt);
            }
        });

        but_stop.setText("Stop");
        but_stop.setEnabled(false);
        but_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_stopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(but_start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(but_stop)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_start)
                    .addComponent(but_stop))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_status.setFont(new java.awt.Font("Tahoma", 1, 14));
        lb_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_status.setText("Server is Stoped");
        lb_status.setBorder(javax.swing.BorderFactory.createTitledBorder("Server Status"));
        lb_status.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_status, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(list_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_startActionPerformed
        // TODO add your handling code here:
        but_stop.setEnabled(true);
        but_start.setEnabled(false);
        serverManager.startServer(statusListener,clientListener);

    }//GEN-LAST:event_but_startActionPerformed

    private void but_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_stopActionPerformed
        // TODO add your handling code here:
        serverManager.stopServer(statusListener);
        but_stop.setEnabled(false);
        but_start.setEnabled(true);
    }

    class MyStatusListener implements ServerStatusListener
    {
        public void status(String message)
        {
            lb_status.setText(message);
        }
    }

    class MyClientListener implements ClientListener
    {
        public void signIn(String userName)
        {
            list_model.addElement((Object)userName);
        }
        public void signOut(String userName)
        {
            list_model.removeElement((Object)userName);
        }
        public void clientStatus(String status)
        {
            ta_monitor_clients.append(status+"\n");
        }
        public void mapped(String nam,String ip)
        {
          if(hm.get(nam) == null)
          {
      
      	    hm.put(nam,ip);
      	    System.out.println(nam+" "+ip);
          }	
        }
    }


    public javax.swing.JButton but_start;
    private javax.swing.JButton but_stop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lb_status;
    private javax.swing.JPanel list_panel;
    public javax.swing.JTextArea ta_monitor_clients;
    public javax.swing.DefaultListModel list_model;
    public javax.swing.DefaultListSelectionModel dlsm;
    public javax.swing.JList list_online_clients;
}
