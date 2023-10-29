//aqui guardare los dialogos de cada caso
//si ya se, que weba

public class Dialogos{
public int Linea=0;//parrafo de la historia
public int habla=0;//quien habla 0=yo 1=acusado, 3-5=testigos
public boolean Otra=false;
public static String Guion="";
public String Explicacion(int lugar, int Objeto,int Linea){
if(Objeto==1){//katana
	switch(lugar){

case 1://Cocina
		switch(Linea){
		case 1:
Guion="yo estaba en la cocina, cortando unos \nvegetales para hacer la cena, pero decidi\nhacerlo con estilo \nCORTANDOLOS CON UNA KATANA!!!!";
break;
case 2:
Guion="No se si deberia preguntar por\nla katana, tu forma de cocinar o si lograste \ncocinar lo que sea que estabas cortando";
		break;
		}
break;
case 2://Sala
		switch(Linea){
		case 1:
Guion="yo estaba en la sala, intentando buscar\nun lugar para colgar la katan\ndebia ser un lugar donde se luciera";
break;
case 2:
Guion="bueno. . . espero esa katana no tenga filo";
		break;
		}
break;
case 3://Baño
		switch(Linea){
		case 1:
Guion="yo estaba en el Baño, intentando depilarme con la katana \nComo todo un samurai!!!";
break;
case 2:
Guion="No se si deberia preguntar porque la katana y no un rastrillo o si lo conseguiste";
		break;
		}
break;
case 4://Cuarto
		switch(Linea){
		case 1:
Guion="yo estaba en El cuarto, me puse a ver anime y bueno, aprovechando que tenia la katana \nRespiracion de Vocaloid, primera postura IEVAN POLKA!!!!";
break;
case 2:
Guion="porque A MI SIEMPRE ME TOCAN LOS FRIKIS!?";
		break;
		}
break;
case 5://Jardin
		switch(Linea){
		case 1:
Guion="yo estaba en El Jardin, podando los arbustos y las plantas al estilo samurai \n CON UNA KATANA!!!!";
break;
case 2:
Guion="de todas las herramientas en el mundo porque una katana!?";
		break;
		}
break;

	}
}

if(Objeto==2){/////////////Abanico
	switch(lugar){

case 1://Cocina
		switch(Linea){
		case 1:
Guion="yo estaba en la cocina, habia terminado de preparar la cena\nPero las moscas tenian planeado comer primero, Asi que las auyente con el Abanico de papel";
break;
case 2:
Guion="No hubiera sido mejor un insecticida o trampa para moscas de IdeasEn5Minutos??";
		break;
		}
break;
case 2://Sala
		switch(Linea){
		case 1:
Guion="yo estaba en la sala, tenia mucho calor\nasi que me la pase con el Abanico de Papel hechandome aire";
break;
case 2:
Guion="Que no tienen ventilador!?";
		break;
		}
break;
case 3://Baño
		switch(Linea){
		case 1:
Guion="yo estaba en el Baño\nTratando de secarme el cabello con el Abanico de Papel";
break;
case 2:
Guion="Te voy a regalar la secadora de cabello de mi ex . . .";
		break;
		}
break;
case 4://Cuarto
		switch(Linea){
		case 1:
Guion="yo estaba en El cuarto, tenia mucho calor\nasi que me la pase con el Abanico de Papel hechandome aire";
break;
case 2:
Guion="tan caro es para ti un ventilador de techo!?";
		break;
		}
break;
case 5://Jardin
		switch(Linea){
		case 1:
Guion="yo estaba en El Jardin, trando de auyentar las plagas \n use el Abanico de Papel por una hora";
break;
case 2:
Guion="Que no sabes lo que son los pesticidas o plantas carnivoras!?";
		break;
		}
break;

	}
}


if(Objeto==3){/////////////Puerro
	switch(lugar){

case 1://Cocina
		switch(Linea){
		case 1:
Guion="yo estaba en la cocina, tratando de terminar la cena\nSolo necesitaba cortar el Puerro. . . pero no encontre con que";
break;
case 2:
Guion="Ok. . .";
		break;
		}
break;
case 2://Sala
		switch(Linea){
		case 1:
Guion="yo estaba en la sala, Bailando Ievan polka\nPero el puerro siempre se salia de mis manos";
break;
case 2:
Guion="Tarap ta ta baridibaridi, Tipico de ustedes";
		break;
		}
break;
case 3://Baño
		switch(Linea){
		case 1:
Guion="yo estaba en el Baño\nLimpiando el Puerro ya que no salia agua en la cocina";
break;
case 2:
Guion=". . . Ok...?";
		break;
		}
break;
case 4://Cuarto
		switch(Linea){
		case 1:
Guion="yo estaba en El cuarto, pensaba gastarle una broma a Teto\nEs divertido pegarle a la gente en la cabeza con un Puerro";
break;
case 2:
Guion="Poruque especificando un puerrazo en la cabeza?";
		break;
		}
break;
case 5://Jardin
		switch(Linea){
		case 1:
Guion="yo estaba en El Jardin, Revisando la cosecha \n Solo sobrevivio un Puerro";
break;
case 2:
Guion="Chale... que mas cosechaban!?";
		break;
		}
break;

	}
}


if(Objeto==4){/////////////Pistola
	switch(lugar){

case 1://Cocina
		switch(Linea){
		case 1:
Guion="yo estaba en la cocina, habia visto una cucaracha\ntome rapido la Pistola y me decidi a matarla";
break;
case 2:
Guion="No se si preguntar por la Pistola, si le dio o el porque tienen una en la Cocina";
		break;
		}
break;
case 2://Sala
		switch(Linea){
		case 1:
Guion="yo estaba en la sala, escuche unos ruidos extraños de afuera\nSaque la pistola y espere al ladron. . . solo era un mapache";
break;
case 2:
Guion="Recuerdame nunca asustarte, me nos en tu casa";
		break;
		}
break;
case 3://Baño
		switch(Linea){
		case 1:
Guion="yo estaba en el Baño\nTratando Limpiar la pistola. . . pero es muy dificil";
break;
case 2:
Guion="Creo que hiciste mas que solo limpiarla (dudo que sirva ahora)";
		break;
		}
break;
case 4://Cuarto
		switch(Linea){
		case 1:
Guion="yo estaba en El cuarto, viendo anime\nme puse en personaje con la Pistola para ser un espia y ayudar a Twilight";
break;
case 2:
Guion="por favor diganme que no tenia balas";
		break;
		}
break;
case 5://Jardin
		switch(Linea){
		case 1:
Guion="yo estaba en El Jardin, vi un animal comiendose la cosecha \n asi que agarre la pistola y me decidi a cazarlo . . . falle";
break;
case 2:
Guion="Lo querias matar para proteger la cosecha o cenartelo?!...";
		break;
		}
break;

	}
}


if(Objeto==5){/////////////Cuchillo
	switch(lugar){

case 1://Cocina
		switch(Linea){
		case 1:
Guion="yo estaba en la cocina, preparando la cena\nMe puse a cortar unos vegetales con el Cuchillo";
break;
case 2:
Guion="Entiendo";
		break;
		}
break;
case 2://Sala
		switch(Linea){
		case 1:
Guion="yo estaba en la sala, me gustan hacer figuras de madera\nMe la pase todo el dia ahi con algo de madera y el Cuchillo";
break;
case 2:
Guion="Eso no le quita filo!?";
		break;
		}
break;
case 3://Baño
		switch(Linea){
		case 1:
Guion="yo estaba en el Baño\nintentando depilarme con el Cuchillo";
break;
case 2:
Guion="QUE NO TIENEN RASTRILLOS!?!?!";
		break;
		}
break;
case 4://Cuarto
		switch(Linea){
		case 1:
Guion="yo estaba en El cuarto, tenia mucha hambre\nasi que me prepare un sandwitch, con el cuchillo unte Crema de mani, le puse jamon, tomate y papitas";
break;
case 2:
Guion="no se si preguntar el porque no lo hiciste en la cocina o por tus gustos de sabor!?";
		break;
		}
break;
case 5://Jardin
		switch(Linea){
		case 1:
Guion="yo estaba en El Jardin\n Cortando algunos cultivos con el Cuchillo";
break;
case 2:
Guion="de que cultivos hablamos!?";
		break;
		}
break;

	}
}
return Guion;
}

public String AclaracionP(int person,int realP){
String AclararP="";
if(person==realP){
	AclararP="Pues, yo no te vi mucho tiempo en la casa";
}else{AclararP="Si te vi cuando pasaste >v<";}
return AclararP;
}

public String AclaracionA(int arma,int realA){
String AclararA="";
if(arma==realA){
	AclararA="Entonces tu lo perdiste";
}else{AclararA="te agradesco que lo pusieras en su lugar cuando terminaste";}
return AclararA;
}

public String AclaracionL(int lugar,int realL){
String AclararL="";
if(lugar==realL){
	AclararL="A que hora entraste? \ncuando yo quise entrar estaba cerrado con llave";
}else{AclararL="creo que todos pasamos por ahi \nmas de 10 veces en el dia";}
return AclararL;
}


public String FunFact(int lugar, int Objeto){
	String Fun="a";
if(Objeto==1){//katana
	switch(lugar){
case 1://Cocina
Fun= "Es divertido, excepto cuando llega la parte de limpiar";
break;
case 2://Sala
Fun= "Pues, tiene ahi muchos años, tendriamos que preguntarle a Gakupo";
break;
case 3://Baño
Fun= "Somos Vocaloids, llevamos la cultira japonesa a otros limites";
break;
case 4://Cuarto
Fun= "amargado, que no te guste disfrutar el anime es tu problema";
break;
case 5://Jardin
Fun= "pues, la katana es muy larga, asi que podas mucho, ademas es buen ejercicio";
break;

	}
}

if(Objeto==2){/////////////Abanico
	switch(lugar){
case 1://Cocina
Fun= "Una buena rafaga y las mandas a la otra dimension";
break;
case 2://Sala
Fun= "es mucho estorvo, y mas en invierno";
break;
case 3://Baño
Fun= "Y porque especificamente la de tu ex!?";
break;
case 4://Cuarto
Fun= "pues....el creador de la casa no penso en eso cuando la diseño";
break;
case 5://Jardin
Fun= "oye, nadie penso que eso pudiera pasar, ademas los pesticidas huelen muy feo";
break;
	}
}


if(Objeto==3){/////////////Puerro
	switch(lugar){

case 1://Cocina
Fun= "Problema con los guisos de por aca?";
break;
case 2://Sala
Fun= "oye, esta bien que es la cancion que le dio la fama a vocaloid, pero no todos la cantamos";
break;
case 3://Baño
Fun= "Uno hace lo que puede con lo que se tiene";
break;
case 4://Cuarto
Fun= "Y porque no? es divertido cuando se rompe de tanta fuerza";
break;
case 5://Jardin
Fun= "cebollas, calabazas, papas, jicama, una vez intentamos sandia";
break;

	}
}

if(Objeto==4){/////////////Pistola
	switch(lugar){
case 1://Cocina
Fun= "Me pregunto lo mismo, y la tenemos para defendernos de ladrones";
break;
case 2://Sala
Fun= "No suele herir a nadie, pero el miedo hace que la gente haga locuras";
break;
case 3://Baño
Fun= "no somos expertos en pistolas, ademas le gusta tener todo limpio";
break;
case 4://Cuarto
Fun= "tenemos balas en la casa, pero desconosco si estaba cargada o no";
break;
case 5://Jardin
Fun= "y porque no las 2?";
break;
	}
}

if(Objeto==5){/////////////Cuchillo
	switch(lugar){
case 1://Cocina
Fun= "dehecho suele hacer unos buenos cortes, la comida queda genial";
break;
case 2://Sala
Fun= "para algo existe la piedra de afilar, y la verdad no mucho, las figuras se le dan muy bien";
break;
case 3://Baño
Fun= "Se llama Ahorrar, genio";
break;
case 4://Cuarto
Fun= "En realidad le gusta hacer eso, es dificil limpiar las manchas\nY sus gustos son de mezclar todo lo que le guste del refri";
break;
case 5://Jardin
Fun= "cebollas, calabazas, papas, jicama, una vez intentamos sandia";
break;
	}

}

return Fun;}
}