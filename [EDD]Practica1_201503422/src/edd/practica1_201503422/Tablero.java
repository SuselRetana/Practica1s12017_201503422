/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1_201503422;

import Listas.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.TableColumn;

/**
 *
 * @author freni_000
 */
public class Tablero extends javax.swing.JFrame {
    public static Nodo_Lista_Circular jugadorInicial = new Nodo_Lista_Circular();
    public static Nodo_Lista_Simple jugadorFichas = new Nodo_Lista_Simple();
    public static Lista_Circular jugadores = new Lista_Circular();
    public static Cola Fichas = new Cola();
    public static Lista_Simple casillas = new Lista_Simple();
    public static Lista_Simple diccionario = new Lista_Simple();
    public static int dim=0;
    public static int x_b=0;
    public static int y_b=0;
    public static Matriz_Ortogonal tab = new Matriz_Ortogonal();
    
    public Tablero(int i) {            
        initComponents();   
        if(i==0){
        tab.crear(dim,tablero.getWidth(),tablero.getHeight());
        Nodo_Matriz aux = tab.getCabeza();
          Nodo_Matriz aux1= tab.getCabeza();       
        while (aux!=null){
          while (aux.getDerecha()!=null){
              tablero.add(aux.getCasilla());
              aux = aux.getDerecha();
        }   
            tablero.add(aux.getCasilla());            
            aux=aux1.getAbajo();
            aux1=aux;
    }
        }        
    }
    public void enviarListaSimple(Lista_Simple casillas, Lista_Simple diccionario , int dim){
        this.casillas=casillas;
        this.diccionario=diccionario;
        this.dim=dim;
    }
    
    public void enviarJugadores(Lista_Circular jugadores, Cola fichas ){
        this.jugadores=jugadores;
        this.Fichas=fichas;
          jugadorInicial = jugadores.getInicio();
          Jugador.setText(jugadorInicial.getValor());
          actualizar();
    }
    public void  actualizar(){
     jugadorFichas=jugadorInicial.getLetras().getInicio();
          L1.setText(jugadorFichas.getValor());
          C1.setText(jugadorFichas.getValor());
          jugadorFichas = jugadorFichas.getSiguiente();          
          L2.setText(jugadorFichas.getValor());
          C2.setText(jugadorFichas.getValor());
          jugadorFichas = jugadorFichas.getSiguiente();          
          L3.setText(jugadorFichas.getValor());
          C3.setText(jugadorFichas.getValor());
          jugadorFichas = jugadorFichas.getSiguiente();                    
          L4.setText(jugadorFichas.getValor());
          C4.setText(jugadorFichas.getValor());
          jugadorFichas = jugadorFichas.getSiguiente();
          L5.setText(jugadorFichas.getValor());
          C5.setText(jugadorFichas.getValor());
          jugadorFichas = jugadorFichas.getSiguiente();
          L6.setText(jugadorFichas.getValor());
          C6.setText(jugadorFichas.getValor());
          jugadorFichas = jugadorFichas.getSiguiente();
          L7.setText(jugadorFichas.getValor());          
          C7.setText(jugadorFichas.getValor());       
          
          int pos=0;          
          Nodo_Lista_Circular aux = jugadores.getInicio();
            do{          
            puntajes.setValueAt(aux.getValor(),pos,0);
            puntajes.setValueAt(aux.getPunteo(),pos,1);
            aux=aux.getSiguiente();
            pos++;
          }while(aux!=jugadorInicial);     
            Reportes r =new Reportes();
            
           
            rJugador.setIcon(new ImageIcon(r.Jugadores(jugadores).getImage().getScaledInstance(fichas.getWidth(), fichas.getHeight(), Image.SCALE_DEFAULT)));
            rJugador.repaint();
            rMano.setIcon(new ImageIcon( r.Mano(jugadorInicial.getLetras(), jugadorInicial.getValor()).getImage().getScaledInstance(fichas.getWidth(), fichas.getHeight(), Image.SCALE_DEFAULT)));
            rMano.repaint();
            fichas.setIcon(new ImageIcon(r.TotalFichas(Fichas).getImage().getScaledInstance(fichas.getWidth(), fichas.getHeight(), Image.SCALE_DEFAULT)));
            fichas.repaint();
            rDicc.setIcon(new ImageIcon(r.diccionario(diccionario).getImage().getScaledInstance(fichas.getWidth(), fichas.getHeight(), Image.SCALE_DEFAULT)));
            rDicc.repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        L1 = new javax.swing.JToggleButton();
        L2 = new javax.swing.JToggleButton();
        L3 = new javax.swing.JToggleButton();
        L6 = new javax.swing.JToggleButton();
        L5 = new javax.swing.JToggleButton();
        L7 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        puntajes = new javax.swing.JTable();
        Jugador = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        R_Diccionario = new javax.swing.JPanel();
        rDicc = new javax.swing.JLabel();
        R_Mano = new javax.swing.JPanel();
        rMano = new javax.swing.JLabel();
        R_tablero = new javax.swing.JPanel();
        rTab = new javax.swing.JLabel();
        R_Fichas = new javax.swing.JPanel();
        fichas = new javax.swing.JLabel();
        R_Jugadores = new javax.swing.JPanel();
        rJugador = new javax.swing.JLabel();
        L4 = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        PalabraNew = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        C1 = new javax.swing.JCheckBox();
        C2 = new javax.swing.JCheckBox();
        C3 = new javax.swing.JCheckBox();
        C4 = new javax.swing.JCheckBox();
        C5 = new javax.swing.JCheckBox();
        C6 = new javax.swing.JCheckBox();
        C7 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tablero = new javax.swing.JPanel();
        movL1 = new javax.swing.JLabel();
        movL2 = new javax.swing.JLabel();
        movL3 = new javax.swing.JLabel();
        movL4 = new javax.swing.JLabel();
        movL5 = new javax.swing.JLabel();
        movL6 = new javax.swing.JLabel();
        movL7 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        L1.setBackground(new java.awt.Color(255, 255, 204));
        L1.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        L1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        L1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L1.setLabel("A");
        L1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                L1MouseDragged(evt);
            }
        });
        L1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                L1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                L1MouseReleased(evt);
            }
        });
        L1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L1ActionPerformed(evt);
            }
        });
        getContentPane().add(L1);
        L1.setBounds(70, 560, 59, 44);

        L2.setBackground(new java.awt.Color(255, 255, 204));
        L2.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        L2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        L2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L2.setLabel("A");
        getContentPane().add(L2);
        L2.setBounds(160, 560, 59, 44);

        L3.setBackground(new java.awt.Color(255, 255, 204));
        L3.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        L3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        L3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L3.setLabel("A");
        getContentPane().add(L3);
        L3.setBounds(250, 560, 59, 44);

        L6.setBackground(new java.awt.Color(255, 255, 204));
        L6.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        L6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        L6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L6.setLabel("A");
        getContentPane().add(L6);
        L6.setBounds(520, 560, 59, 44);

        L5.setBackground(new java.awt.Color(255, 255, 204));
        L5.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        L5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        L5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L5.setLabel("A");
        getContentPane().add(L5);
        L5.setBounds(430, 560, 59, 44);

        L7.setBackground(new java.awt.Color(255, 255, 204));
        L7.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        L7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        L7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L7.setLabel("A");
        getContentPane().add(L7);
        L7.setBounds(610, 560, 59, 44);

        puntajes.setAutoCreateRowSorter(true);
        puntajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Jugador", "Punteo"
            }
        ));
        jScrollPane1.setViewportView(puntajes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(920, 40, 170, 190);

        Jugador.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        Jugador.setText("Jugador");
        getContentPane().add(Jugador);
        Jugador.setBounds(920, 0, 270, 30);

        rDicc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout R_DiccionarioLayout = new javax.swing.GroupLayout(R_Diccionario);
        R_Diccionario.setLayout(R_DiccionarioLayout);
        R_DiccionarioLayout.setHorizontalGroup(
            R_DiccionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(R_DiccionarioLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(rDicc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        R_DiccionarioLayout.setVerticalGroup(
            R_DiccionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rDicc, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista Diccionario", R_Diccionario);

        rMano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout R_ManoLayout = new javax.swing.GroupLayout(R_Mano);
        R_Mano.setLayout(R_ManoLayout);
        R_ManoLayout.setHorizontalGroup(
            R_ManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(R_ManoLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(rMano, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        R_ManoLayout.setVerticalGroup(
            R_ManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rMano, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Fichas Activas", R_Mano);

        rTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout R_tableroLayout = new javax.swing.GroupLayout(R_tablero);
        R_tablero.setLayout(R_tableroLayout);
        R_tableroLayout.setHorizontalGroup(
            R_tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(R_tableroLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(rTab, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        R_tableroLayout.setVerticalGroup(
            R_tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rTab, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Gráfica Tablero", R_tablero);

        fichas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout R_FichasLayout = new javax.swing.GroupLayout(R_Fichas);
        R_Fichas.setLayout(R_FichasLayout);
        R_FichasLayout.setHorizontalGroup(
            R_FichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(R_FichasLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(fichas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        R_FichasLayout.setVerticalGroup(
            R_FichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fichas, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cola Total Fichas", R_Fichas);

        rJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout R_JugadoresLayout = new javax.swing.GroupLayout(R_Jugadores);
        R_Jugadores.setLayout(R_JugadoresLayout);
        R_JugadoresLayout.setHorizontalGroup(
            R_JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(R_JugadoresLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(rJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        R_JugadoresLayout.setVerticalGroup(
            R_JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Jugadores", R_Jugadores);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(1110, 40, 270, 530);

        L4.setBackground(new java.awt.Color(255, 255, 204));
        L4.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        L4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        L4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L4.setLabel("A");
        getContentPane().add(L4);
        L4.setBounds(340, 560, 59, 44);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(1100, 30, 2, 530);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel1.setText("Cambiar Letras");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(920, 380, 150, 33);
        jLabel1.getAccessibleContext().setAccessibleName("");

        PalabraNew.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        getContentPane().add(PalabraNew);
        PalabraNew.setBounds(920, 280, 160, 25);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jButton1);
        jButton1.setBounds(710, 590, 110, 31);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel2.setText("Nueva Palabra");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(930, 250, 150, 33);

        C1.setText("A");
        getContentPane().add(C1);
        C1.setBounds(920, 420, 33, 23);

        C2.setText("B");
        getContentPane().add(C2);
        C2.setBounds(920, 450, 31, 23);

        C3.setText("C");
        getContentPane().add(C3);
        C3.setBounds(920, 480, 33, 23);

        C4.setText("D");
        getContentPane().add(C4);
        C4.setBounds(970, 420, 33, 23);

        C5.setText("E");
        getContentPane().add(C5);
        C5.setBounds(970, 450, 31, 23);

        C6.setText("F");
        getContentPane().add(C6);
        C6.setBounds(970, 480, 31, 23);

        C7.setText("G");
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        getContentPane().add(C7);
        C7.setBounds(1020, 420, 33, 23);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(940, 320, 110, 31);

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jButton3.setText("Cambiar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1020, 470, 70, 31);

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jButton4.setText("Validar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(710, 550, 110, 31);

        tablero.setBackground(new java.awt.Color(255, 255, 255));
        tablero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablero.setLayout(null);
        getContentPane().add(tablero);
        tablero.setBounds(10, 4, 900, 540);

        movL1.setText("jLabel3");
        getContentPane().add(movL1);
        movL1.setBounds(670, 560, 34, 40);

        movL2.setText("jLabel3");
        movL2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movL2MouseDragged(evt);
            }
        });
        movL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movL2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                movL2MouseReleased(evt);
            }
        });
        getContentPane().add(movL2);
        movL2.setBounds(130, 560, 34, 40);

        movL3.setText("jLabel3");
        getContentPane().add(movL3);
        movL3.setBounds(220, 560, 34, 40);

        movL4.setText("jLabel3");
        getContentPane().add(movL4);
        movL4.setBounds(310, 560, 34, 40);

        movL5.setText("jLabel3");
        getContentPane().add(movL5);
        movL5.setBounds(400, 560, 34, 40);

        movL6.setText("jLabel3");
        getContentPane().add(movL6);
        movL6.setBounds(490, 560, 34, 40);

        movL7.setText("jLabel3");
        getContentPane().add(movL7);
        movL7.setBounds(580, 560, 34, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jugadorInicial = jugadorInicial.getSiguiente();
        Jugador.setText(jugadorInicial.getValor());    
        
        actualizar();
                
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        diccionario.insertar(PalabraNew.getText());
        diccionario.imprimir();
        actualizar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(C1.isSelected()){
        Fichas.offer(C1.getText());
        jugadorInicial.getLetras().eliminarElemento(C1.getText());
        jugadorInicial.getLetras().insertar(Fichas.peek());
        C1.setSelected(false);
        }                
        if(C2.isSelected()){
        Fichas.offer(C2.getText());
        jugadorInicial.getLetras().eliminarElemento(C2.getText());
        jugadorInicial.getLetras().insertar(Fichas.peek());
        C2.setSelected(false);
        }
        if(C3.isSelected()){
        Fichas.offer(C3.getText());
        jugadorInicial.getLetras().eliminarElemento(C3.getText());
        jugadorInicial.getLetras().insertar(Fichas.peek());
        C3.setSelected(false);
        }
        if(C4.isSelected()){
        Fichas.offer(C4.getText());
        jugadorInicial.getLetras().eliminarElemento(C4.getText());
        jugadorInicial.getLetras().insertar(Fichas.peek());
        C4.setSelected(false);
        }
        if(C5.isSelected()){
        Fichas.offer(C5.getText());
        jugadorInicial.getLetras().eliminarElemento(C5.getText());
        jugadorInicial.getLetras().insertar(Fichas.peek());
        C5.setSelected(false);
        }
        if(C6.isSelected()){
        Fichas.offer(C1.getText());
        jugadorInicial.getLetras().eliminarElemento(C6.getText());
        jugadorInicial.getLetras().insertar(Fichas.peek());
        C6.setSelected(false);
        }
        if(C7.isSelected()){
        Fichas.offer(C7.getText());
        jugadorInicial.getLetras().eliminarElemento(C7.getText());
        jugadorInicial.getLetras().insertar(Fichas.peek());
        C7.setSelected(false);
        }
        actualizar();
        System.out.println("_"+Fichas.tamaño()+"_");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void L1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseDragged
        // TODO add your handling code here:}
        
    }//GEN-LAST:event_L1MouseDragged

    private void L1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L1ActionPerformed

    private void L1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_L1MousePressed

    private void L1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_L1MouseReleased

    private void movL2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movL2MouseDragged
        // TODO add your handling code here:
        L1.setLocation(x_b+evt.getX(),y_b+evt.getY());
    }//GEN-LAST:event_movL2MouseDragged

    private void movL2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movL2MouseReleased
        // TODO add your handling code here:
        System.out.println(L1.getX()+"_"+L1.getY());
        System.out.println(tab.getCabeza().getDerecha().getCasilla().getX()+"_"+tab.getCabeza().getDerecha().getCasilla().getY());
    }//GEN-LAST:event_movL2MouseReleased

    private void movL2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movL2MousePressed
        // TODO add your handling code here:
        x_b=L1.getX();
        y_b=L1.getY();
        
        //L1.setBounds(evt.getX(),evt.getY(), L1.getWidth(), L1.getHeight());
    }//GEN-LAST:event_movL2MousePressed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox C1;
    private javax.swing.JCheckBox C2;
    private javax.swing.JCheckBox C3;
    private javax.swing.JCheckBox C4;
    private javax.swing.JCheckBox C5;
    private javax.swing.JCheckBox C6;
    private javax.swing.JCheckBox C7;
    private javax.swing.JLabel Jugador;
    private javax.swing.JToggleButton L1;
    private javax.swing.JToggleButton L2;
    private javax.swing.JToggleButton L3;
    private javax.swing.JToggleButton L4;
    private javax.swing.JToggleButton L5;
    private javax.swing.JToggleButton L6;
    private javax.swing.JToggleButton L7;
    private javax.swing.JTextField PalabraNew;
    private javax.swing.JPanel R_Diccionario;
    private javax.swing.JPanel R_Fichas;
    private javax.swing.JPanel R_Jugadores;
    private javax.swing.JPanel R_Mano;
    private javax.swing.JPanel R_tablero;
    private javax.swing.JLabel fichas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel movL1;
    private javax.swing.JLabel movL2;
    private javax.swing.JLabel movL3;
    private javax.swing.JLabel movL4;
    private javax.swing.JLabel movL5;
    private javax.swing.JLabel movL6;
    private javax.swing.JLabel movL7;
    private javax.swing.JTable puntajes;
    private javax.swing.JLabel rDicc;
    private javax.swing.JLabel rJugador;
    private javax.swing.JLabel rMano;
    private javax.swing.JLabel rTab;
    private javax.swing.JPanel tablero;
    // End of variables declaration//GEN-END:variables
}
