public class Imagenes{

	public String SeleccionadoLugar(int lugar){
		String Lugar=" ";
switch(lugar){
case 1:
Lugar="Finales/CarpetaCocina.PNG";
break;
case 2:
Lugar="Finales/CarpetaSala.PNG";
break;
case 3:
Lugar="Finales/CarpetaBaño.PNG";
break;
case 4:
Lugar="Finales/CarpetaCuarto.PNG";
break;
case 5:
Lugar="Finales/CarpetaJardin.PNG";
break;
}
return Lugar;
	}

	public String SeleccionadoPersona(int persona){
		String Persona=" ";
switch(persona){
case 1:
Persona="Finales/SelecMiku.png";
break;
case 2:
Persona="Finales/SelecRin.png";
break;
case 3:
Persona="Finales/SelecLen.png";
break;
case 4:
Persona="Finales/SelecKaito.png";
break;
case 5:
Persona="Finales/SelecLuka.png";
break;
}
return Persona;
	}

	public String SeleccionadoArma(int arma){
		String Arma=" ";
switch(arma){
case 1:
Arma="Finales/SelecKatana.png";
break;
case 2:
Arma="Finales/SelecAbanico.png";
break;
case 3:
Arma="Finales/SelecPuerro.png";
break;
case 4:
Arma="Finales/SelecPistola.png";
break;
case 5:
Arma="Finales/SelecCuchillo.png";
break;
}
return Arma;
	}

	public String FinalResultLugar(int lugar){
		String Lugar=" ";
switch(lugar){
case 1:
Lugar="Finales/RealCocina.png";
break;
case 2:
Lugar="Finales/RealJardin.png";
break;
case 3:
Lugar="Finales/RealBaño.png";
break;
case 4:
Lugar="Finales/RealCuarto.png";
break;
case 5:
Lugar="Finales/RealSala.png";
break;
}
return Lugar;
	}
	
	public String RealResultKiller(int killer,int arma){
		String Killer="";
switch(killer){
case 1://Miku
	switch(arma){
	case 1:
	Killer="Finales/MikuKatana.png";
	break;
	case 2:
	Killer="Finales/MikuAbanico.png";
	break;
	case 3:
	Killer="Finales/MikuPuerro.png";
	break;
	case 4:
	Killer="Finales/MikuPistola.png";
	break;
	case 5:
	Killer="Finales/MikuCuchillo.png";
	break;
	}
break;
case 2://Rin
	switch(arma){
	case 1:
	Killer="Finales/RinKatana.png";
	break;
	case 2:
	Killer="Finales/RinAbanico.png";
	break;
	case 3:
	Killer="Finales/RinPuerro.png";
	break;
	case 4:
	Killer="Finales/RinPistola.png";
	break;
	case 5:
	Killer="Finales/RinCuchillo.png";
	break;
	}
break;
case 3://Len
	switch(arma){
	case 1:
	Killer="Finales/LenKatana.png";
	break;
	case 2:
	Killer="Finales/LenAbanico.png";
	break;
	case 3:
	Killer="Finales/LenPuerro.png";
	break;
	case 4:
	Killer="Finales/LenPistola.png";
	break;
	case 5:
	Killer="Finales/LenCuchillo.png";
	break;
	}
break;
case 4://Kaito
	switch(arma){
	case 1:
	Killer="Finales/KaitoKatana.png";
	break;
	case 2:
	Killer="Finales/KaitoAbanico.png";
	break;
	case 3:
	Killer="Finales/KaitoPuerro.png";
	break;
	case 4:
	Killer="Finales/KaitoPistola.png";
	break;
	case 5:
	Killer="Finales/KaitoCuchillo.png";
	break;
	}
break;
case 5:
	switch(arma){
	case 1:
	Killer="Finales/LukaKatana.png";
	break;
	case 2:
	Killer="Finales/LukaAbanico.png";
	break;
	case 3:
	Killer="Finales/LukaPuerro.png";
	break;
	case 4:
	Killer="Finales/LukaPistola.png";
	break;
	case 5:
	Killer="Finales/LukaCuchillo.png";
	break;
	}
break;
}
return Killer;
	}






}