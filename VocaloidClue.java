//Yugioh LP counter

import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException; 
import java.io.*;
import javax.swing.Timer;
import java.io.File;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VocaloidClue extends JFrame implements ActionListener,MouseListener{
public JPanel MenuInicio,Historia,Investigacion,Talk,DenunciarP,DenunciarA,DenunciarL,Final;
public JLabel BackGround,Caja,RealLugar,RealKiller,FinalPerson,FinalLugar,FinalArma,cadaver;
public JLabel Instruccion;
public JTextArea Decir,Explicacion,Cuadro;
public Icon HUD,testigosBG,tes1,tes2,tes3,tes4;
public JButton Jugar,PgSig,PgAnt;
public JButton Miku,Rin,Len,Kaito,Luka; //sospechosos
public JButton Cocina,Baño,Jardin,Sala,Cuarto; //lugares
public JButton Katana,Puerro,Cuchillo,Abanico,Pistola;
int Opc1,Opc2,Opc3,Opc4,Opc5;
//////Variables de cada Historia
int RealP,RealA,RealL,Vocaloid;
int MikuA,RinA,LenA,KaitoA,LukaA;
int MikuL,RinL,LenL,KaitoL,LukaL;
int DesP,DesA,DesL;
public void Mezclar(){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        Collections.shuffle(numeros);
         Opc1 = numeros.get(0);
         Opc2 = numeros.get(1);
         Opc3 = numeros.get(2);
         Opc4 = numeros.get(3);
         Opc5 = numeros.get(4);}
//Real



Dialogos diag = new Dialogos();
int ResponderArma,ResponderLugar;
int intentos=0;
int index =0;
int x=0;
int Pg=0,Panel=1;
int CriPer,CriArma,CriLug; //variables del criminal, persona, arma, lugar
char ch=0,c=0;
Timer timer = new Timer(100, this);
String texto = "",tex="";
public ImageIcon BGImage = new ImageIcon("Background/TitulobackGround.png");
public ImageIcon TexBox = new ImageIcon("Background/TitulobackGround.png");
Font Fzl = new Font("OCR A Extended", Font.BOLD, 80);
Font Ex = new Font("Arial", Font.BOLD, 50);
Font HablaFont = new Font("Arial", Font.BOLD, 30);
public  Color C1 = new Color(0,0,0,0);

//mostrarSiguienteCaracter();


public VocaloidClue(){
	
setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Clue Version Vocaloid beta 1.0 por Gozuto Zero");
        timer.setInitialDelay(1000);
        //menu principal del juego
         BackGround = new JLabel(BGImage);
        BackGround.setBounds(0,0,1600,850);
        
MenuInicio = new JPanel();
MenuInicio.setBounds(0,0,1600,850);
MenuInicio.setLayout(null);
MenuInicio.setVisible(true);
add(MenuInicio);
MenuInicio.add(BackGround);
Jugar = new JButton("JUGAR");
        Jugar.setBounds(650,600,300,110);
        MenuInicio.add(Jugar);
        Jugar.setFont(Fzl);
Jugar.addActionListener(this);
//Historia//
Historia = new JPanel();
Historia.setBounds(0,0,1600,850);
Historia.setLayout(null);
Historia.setVisible(false);
add(Historia);
PgAnt = new JButton("<<Anterior<<");
        PgAnt.setBounds(50,700,200,70);
        //Historia.add(PgAnt);
PgSig = new JButton(">>Siguiente>>");
        PgSig.setBounds(1350,700,200,70);
        Historia.add(PgSig);
         Explicacion = new JTextArea("Permiteme explicarte");
         Explicacion.setEditable(false);
         Explicacion.setOpaque(false);
        Explicacion.setBounds(300,100,1000,550);
        Explicacion.setFont(Ex);
        Explicacion.setForeground(Color.WHITE);
        //Explicacion.setBackground(C1);
          Historia.add(Explicacion);
          PgAnt.addActionListener(this);
          PgSig.addActionListener(this);
          
          Historia.addMouseListener(this);
 //Seleccion de opcion
Investigacion = new JPanel();
Investigacion.setBounds(0,0,1600,850);
Investigacion.setLayout(null);
Investigacion.setVisible(false);
add(Investigacion);
//seleccion de personaje
Miku = new JButton("Miku");
        Miku.setBounds(700,50,200,500);
        Miku.setVisible(true);
        Investigacion.add(Miku);
Miku.setIcon(new ImageIcon("Background/MikuBoton.PNG"));
        Miku.addActionListener(this);
Rin = new JButton("Rin");
        Rin.setBounds(450,50,200,500);
        Investigacion.add(Rin);
        Rin.setIcon(new ImageIcon("Background/RinBoton.PNG"));
        Rin.addActionListener(this);
Len = new JButton("Len");
        Len.setBounds(200,50,200,500);
        Len.setIcon(new ImageIcon("Background/LenBoton.PNG"));
        Investigacion.add(Len);
        Len.addActionListener(this);
Kaito = new JButton("Kaito");
        Kaito.setBounds(950,50,200,500);
        Investigacion.add(Kaito);
        Kaito.setIcon(new ImageIcon("Background/KaitoBoton.PNG"));
        Kaito.addActionListener(this);
Luka = new JButton("Luka");
        Luka.setBounds(1200,50,200,500);
Luka.setIcon(new ImageIcon("Background/LukaBoton.PNG"));
        Investigacion.add(Luka);
        Luka.addActionListener(this);
//Armas
Katana = new JButton("Katana");
        Katana.setBounds(300,570,100,100);
        Investigacion.add(Katana);
        Katana.setIcon(new ImageIcon("Background/KatanaBoton.PNG"));
        Katana.addActionListener(this);
        Katana.addMouseListener(this);
Puerro = new JButton("Puerro");
        Puerro.setBounds(450,570,100,100);
        Investigacion.add(Puerro);
        Puerro.setIcon(new ImageIcon("Background/PuerroBoton.PNG"));
        Puerro.addActionListener(this);
        Puerro.addMouseListener(this);
Cuchillo = new JButton("Cuchillo");
        Cuchillo.setBounds(600,570,100,100);
        Investigacion.add(Cuchillo);
        Cuchillo.setIcon(new ImageIcon("Background/CuchilloBoton.PNG"));
        Cuchillo.addActionListener(this);
        Cuchillo.addMouseListener(this);
Abanico = new JButton("Abanico");
        Abanico.setBounds(375,690,100,100);
        Investigacion.add(Abanico);
        Abanico.setIcon(new ImageIcon("Background/AbanicoBoton.PNG"));
        Abanico.addActionListener(this);
        Abanico.addMouseListener(this);
Pistola = new JButton("Pistola");
        Pistola.setBounds(525,690,100,100);
        Investigacion.add(Pistola);
        Pistola.setIcon(new ImageIcon("Background/PistolaBoton.PNG"));
        Pistola.addActionListener(this);
        Pistola.addMouseListener(this);
//habitaciones
Cocina = new JButton("Cocina");
        Cocina.setBounds(850,570,100,100);
        Investigacion.add(Cocina);
        Cocina.setIcon(new ImageIcon("Background/CocinaIcon100.png"));
        Cocina.addActionListener(this);
        Cocina.addMouseListener(this);
Baño = new JButton("Baño");
        Baño.setBounds(1000,570,100,100);
        Investigacion.add(Baño);
        Baño.setIcon(new ImageIcon("Background/BañoIcon100.png"));
        Baño.addActionListener(this);
        Baño.addMouseListener(this);
Jardin = new JButton("Jardin");
        Jardin.setBounds(1150,570,100,100);
        Investigacion.add(Jardin);
        Jardin.setIcon(new ImageIcon("Background/JardinIcon100.png"));
        Jardin.addActionListener(this);
        Jardin.addMouseListener(this);
Sala = new JButton("Sala");
        Sala.setBounds(925,690,100,100);
        Investigacion.add(Sala);
        Sala.setIcon(new ImageIcon("Background/SalaIcon100.png"));
        Sala.addActionListener(this);
        Sala.addMouseListener(this);
Cuarto = new JButton("Cuarto");
        Cuarto.setBounds(1075,690,100,100);
        Investigacion.add(Cuarto);
        Cuarto.setIcon(new ImageIcon("Background/CuartoIcon100.png"));
        Cuarto.addActionListener(this);
        Cuarto.addMouseListener(this);
//Platica
        Talk = new JPanel();
Talk.setBounds(0,0,1600,850);
Talk.setLayout(null);
Talk.setVisible(false);
add(Talk);
        //Talk.add(PgAnt);
        //Talk.add(PgSig);

//String Palabras = diag.Explicacion(1,1,1);
         Decir = new JTextArea();
         Decir.setEditable(false);
         Decir.setOpaque(false);
         //Decir.setText(Palabras);
        Decir.setBounds(650,550,600,200);
        Decir.setFont(HablaFont);
        Decir.setForeground(Color.WHITE);
        Caja= new JLabel("Caja");
        Caja.setBounds(300,500,1000,300);
        Caja.setFont(Ex);
        Caja.setForeground(Color.WHITE);
        Caja.setIcon(new ImageIcon("HUD/HudZero.PNG"));
         Talk.add(Decir);
          Talk.add(Caja);
//Declaracion Final
DenunciarP = new JPanel();
DenunciarP.setBounds(0,0,1600,850);
DenunciarP.setLayout(null);
DenunciarP.setVisible(false);
add(DenunciarP);

DenunciarA = new JPanel();
DenunciarA.setBounds(0,0,1600,850);
DenunciarA.setLayout(null);
DenunciarA.setVisible(false);
add(DenunciarA);

DenunciarL = new JPanel();
DenunciarL.setBounds(0,0,1600,850);
DenunciarL.setLayout(null);
DenunciarL.setVisible(false);
add(DenunciarL);
//Resultado Final y comparacion con Real
Final = new JPanel();
Final.setBounds(0,0,1600,850);
Final.setLayout(null);
Final.setVisible(false);
cadaver = new JLabel();
cadaver.setBounds(800,0,800,850);
cadaver.setIcon(new ImageIcon("Finales/teto.png"));
FinalLugar = new JLabel();
FinalArma = new JLabel();
FinalPerson = new JLabel();
FinalLugar.setBounds(0,0,800,850);
FinalArma.setBounds(0,0,800,850);
FinalPerson.setBounds(0,0,800,850);
RealKiller = new JLabel();
RealKiller.setBounds(800,0,800,850);
RealLugar = new JLabel();
RealLugar.setBounds(800,0,800,850);
Final.add(RealKiller);
Final.add(RealLugar);
Final.add(FinalLugar);
Final.add(FinalArma);
Final.add(FinalPerson);
add(Final);

Instruccion = new JLabel();
Instruccion.setBounds(650,550,600,200);
        Instruccion.setFont(Fzl);
        Instruccion.setForeground(Color.WHITE);
        

Cuadro=Explicacion;
}

 public void Musica(String BackSound){
       try {
        Clip clip = AudioSystem.getClip();
        clip.stop();
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(BackSound).getAbsoluteFile());
        clip.open(audioInputStream);
        clip.start();
       } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
         System.out.println("Error al reproducir el sonido.");
       }
     }

public void Escribir(String esc, JTextArea etiq){
	if(x<esc.length()){
	ch=esc.charAt(x);
	tex= tex + ch;
	etiq.setText(tex);
	
    	x=x+1;// Velocidad de mecanografiado (ajusta según lo desees)}else{timer.stop();
}else{timer.stop();}
}

public void Contar(int v){
switch (v){
case 1: 
Vocaloid=1;
testigosBG = new ImageIcon("Background/MikuTestigos.png");
Caja.setIcon(new ImageIcon("HUD/HudZero.PNG"));
	Talk.setVisible(true);
Investigacion.setVisible(false);
BackGround.setIcon(new ImageIcon("Background/MikuDeclara.png"));
 Talk.add(PgSig);
  //Talk.add(PgAnt);
  Talk.add(BackGround);
  Cuadro=Decir;
  Pg=0;
  Panel=11;
  ch=0;x=0;tex="";ch=' ';
  HUD = new ImageIcon("HUD/HudMiku.PNG");
  tes1 = new ImageIcon("HUD/HudRin.PNG");
  tes2 = new ImageIcon("HUD/HudLen.PNG");
  tes3 = new ImageIcon("HUD/HudKaito.PNG");
  tes4 = new ImageIcon("HUD/HudLuka.PNG");
  ResponderArma=MikuA;
  ResponderLugar=MikuL;
break;
case 2: 
Vocaloid=2;
testigosBG = new ImageIcon("Background/RinTestigos.png");
	Caja.setIcon(new ImageIcon("HUD/HudZero.PNG"));
	Talk.setVisible(true);
Investigacion.setVisible(false);
BackGround.setIcon(new ImageIcon("Background/RinDeclara.png"));
 Talk.add(PgSig);
  //Talk.add(PgAnt);
  Talk.add(BackGround);
  Cuadro=Decir;
  Pg=0;
  Panel=11;
  ch=0;x=0;tex="";ch=' ';
  HUD = new ImageIcon("HUD/HudRin.PNG");
  tes1 = new ImageIcon("HUD/HudMiku.PNG");
  tes2 = new ImageIcon("HUD/HudLen.PNG");
  tes3 = new ImageIcon("HUD/HudKaito.PNG");
  tes4 = new ImageIcon("HUD/HudLuka.PNG");
  
  ResponderArma=RinA;
  ResponderLugar=RinL;
break;
case 3:
	Vocaloid=3;
testigosBG = new ImageIcon("Background/LenTestigos.png");
	Caja.setIcon(new ImageIcon("HUD/HudZero.PNG"));
	Talk.setVisible(true);
Investigacion.setVisible(false);
BackGround.setIcon(new ImageIcon("Background/LenDeclara.png"));
 Talk.add(PgSig);
  //Talk.add(PgAnt);
  Talk.add(BackGround);
  Cuadro=Decir;
  Pg=0;
  Panel=11;
  ch=0;x=0;tex="";ch=' ';
  HUD = new ImageIcon("HUD/HudLen.PNG");
  tes1 = new ImageIcon("HUD/HudMiku.PNG");
  tes2 = new ImageIcon("HUD/HudRin.PNG");
  tes3 = new ImageIcon("HUD/HudKaito.PNG");
  tes4 = new ImageIcon("HUD/HudLuka.PNG");
  
  ResponderArma=LenA;
  ResponderLugar=LenL;
break;
case 4: 
	Vocaloid=4;
testigosBG = new ImageIcon("Background/KaitoTestigos.png");
	Caja.setIcon(new ImageIcon("HUD/HudZero.PNG"));
	Talk.setVisible(true);
Investigacion.setVisible(false);
BackGround.setIcon(new ImageIcon("Background/KaitoDeclara.png"));
 Talk.add(PgSig);
  //Talk.add(PgAnt);
  Talk.add(BackGround);
  Cuadro=Decir;
  Pg=0;
  Panel=11;
  ch=0;x=0;tex="";ch=' ';
  HUD = new ImageIcon("HUD/HudKaito.PNG");
  tes1 = new ImageIcon("HUD/HudMiku.PNG");
  tes2 = new ImageIcon("HUD/HudLen.PNG");
  tes3 = new ImageIcon("HUD/HudRin.PNG");
  tes4 = new ImageIcon("HUD/HudLuka.PNG");
  ResponderArma=KaitoA;
  ResponderLugar=KaitoL;
break;
case 5: 
	Vocaloid=5;
	testigosBG = new ImageIcon("Background/LukaTestigos.png");
	Caja.setIcon(new ImageIcon("HUD/HudZero.PNG"));
	Talk.setVisible(true);
Investigacion.setVisible(false);
BackGround.setIcon(new ImageIcon("Background/LukaDeclara.png"));
 Talk.add(PgSig);
  //Talk.add(PgAnt);
  Talk.add(BackGround);
  Cuadro=Decir;
  Pg=0;
  Panel=11;
  ch=0;x=0;tex="";ch=' ';
  HUD = new ImageIcon("HUD/HudLuka.PNG");
  tes1 = new ImageIcon("HUD/HudMiku.PNG");
  tes2 = new ImageIcon("HUD/HudLen.PNG");
  tes3 = new ImageIcon("HUD/HudKaito.PNG");
  tes4 = new ImageIcon("HUD/HudRin.PNG");
  
  ResponderArma=LukaA;
  ResponderLugar=LukaL;
break;}
}

public int RevisarArma(int armabuscar){
	int encuantraarma=0;
	if(armabuscar==MikuA){texto="Ok, Miku\n";encuantraarma = 1;}
	if(armabuscar==RinA){texto="Ok, Rin\n";encuantraarma = 2;}
	if(armabuscar==LenA){texto="Ok, Len\n";encuantraarma = 3;}
	if(armabuscar==KaitoA){texto="Ok, Kaito\n";encuantraarma = 4;}
	if(armabuscar==LukaA){texto="Ok, Luka\n";encuantraarma = 5;}
	return encuantraarma;}
public int RevisarLugar(int lugarbuscar){
	int encuentralugar=0;
	if(lugarbuscar==MikuL){texto="Ok, Miku\n";encuentralugar = 1;}
	if(lugarbuscar==RinL){texto="Ok, Rin\n";encuentralugar = 2;}
	if(lugarbuscar==LenL){texto="Ok, Len\n";encuentralugar = 3;}
	if(lugarbuscar==KaitoL){texto="Ok, Kaito\n";encuentralugar = 4;}
	if(lugarbuscar==LukaL){texto="Ok, Luka\n";encuentralugar = 5;}	
return encuentralugar;}

 public void actionPerformed(ActionEvent accion){ 

if(Panel==2){
		switch(Pg){
case 0: 
texto=texto;
break;
case 1: 
texto=" Eres un policia de PPS\nFuiste enviado a resolver un caso de \nhomicidio.";
break;
case 2: 
BackGround.setIcon(new ImageIcon("Background/SelecPersonajes.png"));
texto="Se encontraron 5 sospechozos:\nMiku\nRin\nLen\nKaito\ny Luka";
break;
case 3: 
BackGround.setIcon(new ImageIcon("Background/BGCasaHistoria.PNG"));
texto="En la casa existen 5 posibles lugares:\nCocina\nSala\nBaño\nUn Jardin\ny Un Cuarto, se desconoce de quien";
break;
case 4: 
BackGround.setIcon(new ImageIcon("Background/armasBG.PNG"));
texto="En la casa tambien se encontraron \n5 posibles armas homicidas:\nPistola\nCuchillo\nKatana\nUn Abanico de Papel\nY un Puerro (no pregunte porque)";
break;
case 5: 
BackGround.setIcon(new ImageIcon("Background/HistorybackGround.PNG"));
texto="A pesar de los esfuerzos de \ntus colegas, lo vieron como un \ncaso perdido y lo piensan cancelar.";
texto=texto + "\nTu mision es averiguar:\nQuien fue?\nDonde fue el asesinato\nY que arma uso\n\n Antes de que llegue tu superior";
break;
case 6: 
texto="Para esto, haras preguntas relacionadas\na los personajes, Lugares y armas\nhas click en el boton de lo que quieres\npreguntar especificamente";
break;
case 7: 
texto="BUENA SUERTE\n AGENTE ZERO";
break;
case 8: 
//Musica("Sound/Music/Kemurikusa - Ruins.wav");
Cuadro=Decir;
Historia.setVisible(false);
Investigacion.setVisible(true);
BackGround.setIcon(new ImageIcon("Background/Seleccionar.PNG"));
Investigacion.add(BackGround);
break;
}		
}
if(intentos<5){
if(Panel==11){
		switch(Pg){
case 1: 
Caja.setIcon(HUD);
texto = diag.Explicacion(ResponderLugar,ResponderArma,1);
break;
case 2: 
Caja.setIcon(new ImageIcon("HUD/HudZero.PNG"));
texto=diag.Explicacion(ResponderLugar,ResponderArma,2);
break;
case 3: 
BackGround.setIcon(testigosBG);
Caja.setIcon(tes1);
texto=diag.FunFact(ResponderLugar,ResponderArma);
break;
case 4: 
Caja.setIcon(tes2);
texto=diag.AclaracionP(Vocaloid,RealP);
break;
case 5: 
Caja.setIcon(tes3);
texto=diag.AclaracionA(ResponderArma,RealA);
break;
case 6: 
Caja.setIcon(tes4);
texto=diag.AclaracionL(ResponderLugar,RealL);
break;
case 7: 
intentos=intentos+1;
//texto="";
Pg=0;
ch=0;x=0;tex="";ch=' ';
if(intentos<5){
Talk.setVisible(false);
Investigacion.setVisible(true);
BackGround.setIcon(new ImageIcon("Background/Seleccionar.PNG"));
Investigacion.add(BackGround);
Panel=0;
}else{Pg=1;Talk.setVisible(true);
Investigacion.setVisible(false);
Caja.setIcon(new ImageIcon("HUD/HudBRS.PNG"));
BackGround.setIcon(new ImageIcon("Background/BRSarrival.png"));
texto = "SUFICIENTE\nQue haces aqui agente Zero?";}
break;
}		
}}else{
		switch(Pg){
case 1: 
Caja.setIcon(new ImageIcon("HUD/HudBRS.PNG"));
BackGround.setIcon(new ImageIcon("Background/BRSarrival.png"));
texto = "SUFICIENTE\nQue haces aqui agente Zero?";
break;
case 2: 
Caja.setIcon(new ImageIcon("HUD/HudZero.PNG"));
texto="General Black Rock Shooter!!\n estoy interrogando...";
break;
case 3: 
Caja.setIcon(new ImageIcon("HUD/HudBRS.PNG"));
texto = "Pero porque TU?\nno has resuelto ni un caso\neres la peor opcion";
break;
case 4: 
Caja.setIcon(new ImageIcon("HUD/HudZero.PNG"));
texto="Dehecho, ya descubri al culpable";
break;
case 5: 
Caja.setIcon(new ImageIcon("HUD/HudBRS.PNG"));
texto = "Bien, confiare en ti\nY NO ME HAGAS ARREPENTIRME\nAhora dime...";
break;
case 6: 
Talk.setVisible(false);
DenunciarP.setVisible(true);
BackGround.setIcon(new ImageIcon("Background/HistorybackGround.PNG"));
Instruccion.setText("QUIEN FUE?");
DenunciarP.add(Instruccion);
DenunciarP.add(Miku);
DenunciarP.add(Rin);
DenunciarP.add(Len);
DenunciarP.add(Kaito);
DenunciarP.add(Luka);
DenunciarP.add(BackGround);
break;
case 7: 
DenunciarP.setVisible(false);
DenunciarA.setVisible(true);
Instruccion.setBounds(650,50,600,200);
Instruccion.setText("QUE ARMA USO?");
DenunciarA.add(Instruccion);
DenunciarA.add(Katana);
DenunciarA.add(Pistola);
DenunciarA.add(Cuchillo);
DenunciarA.add(Abanico);
DenunciarA.add(Puerro);
DenunciarA.add(BackGround);
break;
case 8: 
DenunciarA.setVisible(false);
DenunciarL.setVisible(true);
Instruccion.setBounds(650,50,600,200);
Instruccion.setText("DONDE FUE?");
DenunciarL.add(Instruccion);
DenunciarL.add(Cocina);
DenunciarL.add(Baño);
DenunciarL.add(Jardin);
DenunciarL.add(Sala);
DenunciarL.add(Cuarto);
DenunciarL.add(BackGround);
break;
case 9: 
Imagenes img = new Imagenes();
Instruccion.setText("Resultados");
FinalLugar.setIcon(new ImageIcon(img.SeleccionadoLugar(DesL)));
FinalArma.setIcon(new ImageIcon(img.SeleccionadoArma(DesA)));
FinalPerson.setIcon(new ImageIcon(img.SeleccionadoPersona(DesP)));
DenunciarL.setVisible(false);
Final.setVisible(true);
break;
}}
Escribir(texto,Cuadro);

 	if(accion.getSource()==Jugar){
 		Imagenes img = new Imagenes();
Panel=2;
Musica("Sound/Music/Kemurikusa - To me after the split.wav");
Pg=0;
MenuInicio.setVisible(false);
Historia.setVisible(true);
BackGround.setIcon(new ImageIcon("Background/HistorybackGround.PNG"));
Historia.add(BackGround);
//iniciar parametros
Mezclar();
RealL=Opc1;
RealLugar.setIcon(new ImageIcon(img.FinalResultLugar(RealL)));
Mezclar();
RealP=Opc1;
Mezclar();
RealA=Opc1;
RealKiller.setIcon(new ImageIcon(img.RealResultKiller(RealP,RealA)));
Mezclar();
MikuL=Opc1;
RinL=Opc2;
LenL=Opc3;
KaitoL=Opc4;
LukaL=Opc5;
Mezclar();
MikuA=Opc1;
RinA=Opc2;
LenA=Opc3;
KaitoA=Opc4;
LukaA=Opc5;
intentos=0;
}
if(accion.getSource()==PgSig){
	timer.start();
ch=0;x=0;tex="";ch=' ';
	Pg=Pg+1;
////////////////////////////////////////////Explicacion De cada Personaje://///////////////////////////////////
}
if(accion.getSource()==Miku){
	if(intentos<5){Contar(1);
texto="HATSUNE MIKU!\nnecesito que responda:\nQue hizo la noche que Teto murio?";
	//Decir.setText("HATSUNE MIKU!\nnecesito que responda:\nQue hizo la noche que Teto murio?");
}else{DesP=1;Pg=Pg+1;}}
if(accion.getSource()==Rin){
	if(intentos<5){Contar(2);
	texto="KAGAMINE RIN!\nnecesito que responda:\nQue hizo la noche que Teto murio?";
	//Decir.setText("KAGAMINE RIN!\nnecesito que responda:\nQue hizo la noche que Teto murio?");
}else{DesP=2;Pg=Pg+1;}}
if(accion.getSource()==Len){
	if(intentos<5){Contar(3);
	texto="KAGAMINE LEN!\nnecesito que responda:\nQue hizo la noche que Teto murio?";
	//Decir.setText("KAGAMINE LEN!\nnecesito que responda:\nQue hizo la noche que Teto murio?");
}else{DesP=3;Pg=Pg+1;}}
if(accion.getSource()==Kaito){
	if(intentos<5){Contar(4);
	texto="SHION KAITO!\nnecesito que responda:\nQue hizo la noche que Teto murio?";
	//Decir.setText("SHION KAITO!\nnecesito que responda:\nQue hizo la noche que Teto murio?");
}else{DesP=4;Pg=Pg+1;}}
if(accion.getSource()==Luka){
	if(intentos<5){Contar(5);
	texto="MEGURINE LUKA!\nnecesito que responda:\nQue hizo la noche que Teto murio?";
	//Decir.setText("MEGURINE LUKA!\nnecesito que responda:\nQue hizo la noche que Teto murio?");
}else{DesP=5;Pg=Pg+1;}}

////////////////////////////////////////////////Investigar Lugar///////////////////////////////////
	if(accion.getSource()==Cocina){if(intentos<5){Contar(RevisarLugar(1));
	texto=texto+"Encontramos rastros de que estuviste mucho tiempo en La Cocina cuando Teto murio\nMe puede explicar que estuvo haciendo?";
}else{DesL=1;Pg=Pg+1;}}
	if(accion.getSource()==Sala){if(intentos<5){Contar(RevisarLugar(2));
	texto=texto+"Encontramos rastros de que estuviste mucho tiempo en La Sala cuando Teto murio\nMe puede explicar que estuvo haciendo?";
}else{DesL=2;Pg=Pg+1;}}
	if(accion.getSource()==Baño){if(intentos<5){Contar(RevisarLugar(3));
	texto=texto+"Encontramos rastros de que estuviste mucho tiempo en El Baño cuando Teto murio\nMe puede explicar que estuvo haciendo?";
}else{DesL=3;Pg=Pg+1;}}
	if(accion.getSource()==Cuarto){if(intentos<5){Contar(RevisarLugar(4));
	texto=texto+"Encontramos rastros de que estuviste mucho tiempo en El Cuarto cuando Teto murio\nMe puede explicar que estuvo haciendo?";
}else{DesL=4;Pg=Pg+1;}}
	if(accion.getSource()==Jardin){if(intentos<5){Contar(RevisarLugar(5));
	texto=texto+"Encontramos rastros de que estuviste mucho tiempo en El Jardin cuando Teto murio\nMe puede explicar que estuvo haciendo?";
}else{DesL=5;Pg=Pg+1;}}
	

////////////////////////////////////////////////Investigar Arma///////////////////////////////////
	if(accion.getSource()==Katana){if(intentos<5){Contar(RevisarArma(1));
	texto=texto+"Encontramos tu huellas digitales\nen la Katana\nme puede explicar que estaba haciendo?";
}else{DesA=1;Pg=Pg+1;}}
	if(accion.getSource()==Abanico){if(intentos<5){Contar(RevisarArma(2));
	texto=texto+"Encontramos tu huellas digitales\nen el Abanico de Papel\nme puede explicar que estaba haciendo?";
}else{DesA=2;Pg=Pg+1;}}
	if(accion.getSource()==Puerro){if(intentos<5){Contar(RevisarArma(3));
	texto=texto+"Encontramos tu huellas digitales\nen el Puerro\nme puede explicar que estaba haciendo?";
}else{DesA=3;Pg=Pg+1;}}
	if(accion.getSource()==Pistola){if(intentos<5){Contar(RevisarArma(4));
	texto=texto+"Encontramos tu huellas digitales\nen la Pistola\nme puede explicar que estaba haciendo?";
}else{DesA=4;Pg=Pg+1;}}
	if(accion.getSource()==Cuchillo){if(intentos<5){Contar(RevisarArma(5));
	texto=texto+"Encontramos tu huellas digitales\nen el Cuchillo\nme puede explicar que estaba haciendo?";
}else{DesA=5;Pg=Pg+1;}}

}

        

 
public void mouseEntered(MouseEvent accion){
	if(accion.getSource()==Cocina){Cocina.setIcon(null);Cocina.setText("COCINA");}
	if(accion.getSource()==Baño){Baño.setIcon(null);Baño.setText("BAÑO");}
	if(accion.getSource()==Jardin){Jardin.setIcon(null);Jardin.setText("JARDIN");}
	if(accion.getSource()==Sala){Sala.setIcon(null);Sala.setText("SALA");}
	if(accion.getSource()==Cuarto){Cuarto.setIcon(null);Cuarto.setText("CUARTO");}
	if(accion.getSource()==Katana){Katana.setIcon(null);Katana.setText("KATANA");}
	if(accion.getSource()==Puerro){Puerro.setIcon(null);Puerro.setText("PUERRO");}
	if(accion.getSource()==Abanico){Abanico.setIcon(null);Abanico.setText("ABANICO");}
	if(accion.getSource()==Pistola){Pistola.setIcon(null);Pistola.setText("PISTOLA");}
	if(accion.getSource()==Cuchillo){Cuchillo.setIcon(null);Cuchillo.setText("CUCHILLO");}
}

public void mouseExited(MouseEvent accion){
	if(accion.getSource()==Cocina){Cocina.setIcon(new ImageIcon("Background/CocinaIcon100.png"));}
	if(accion.getSource()==Baño){Baño.setIcon(new ImageIcon("Background/BañoIcon100.png"));}
	if(accion.getSource()==Jardin){Jardin.setIcon(new ImageIcon("Background/JardinIcon100.png"));}
	if(accion.getSource()==Sala){Sala.setIcon(new ImageIcon("Background/SalaIcon100.png"));}
	if(accion.getSource()==Cuarto){Cuarto.setIcon(new ImageIcon("Background/CuartoIcon100.png"));}
	if(accion.getSource()==Katana){Katana.setIcon(new ImageIcon("Background/KatanaBoton.PNG"));}
	if(accion.getSource()==Puerro){Puerro.setIcon(new ImageIcon("Background/PuerroBoton.PNG"));}
	if(accion.getSource()==Cuchillo){Cuchillo.setIcon(new ImageIcon("Background/CuchilloBoton.PNG"));}
	if(accion.getSource()==Abanico){Abanico.setIcon(new ImageIcon("Background/AbanicoBoton.PNG"));}
	if(accion.getSource()==Pistola){Pistola.setIcon(new ImageIcon("Background/PistolaBoton.PNG"));}
}

  public void mouseReleased(MouseEvent accion){

  }


   public void mousePressed(MouseEvent accion){
   }

    public void mouseClicked(MouseEvent accion){
}





public static void main(String[] args) {
        VocaloidClue yu = new VocaloidClue();
        yu.setBounds(0,0,1600,850);
        yu.setVisible(true);
        yu.setResizable(false);
        
    }
}
