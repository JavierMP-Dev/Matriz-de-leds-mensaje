#include <MD_Parola.h>
#include <MD_MAX72xx.h>
#include <SPI.h>

#define HARDWARE_TYPE MD_MAX72XX::FC16_HW

MD_Parola P = MD_Parola(HARDWARE_TYPE, 11, 13, 10, 4);
//declaracion de variables 
const char* cadena = "Solt Advance S.A. de C.V.";
String msj;
int nivel=1;
textEffect_t  efectoDesplazamiento = PA_SCROLL_LEFT;

void setup(void)
{
  Serial.begin(9600);
  P.begin();
  if(cadena == "???????????????????????????" ){
    cadena = "Royal";
  }
}

void loop(void)
{
  if(Serial.available() > 0){
    switch (Serial.read()) {
      case '1'://menu de seleccion para la direccion de animaciones
      //hacia izquierda
        efectoDesplazamiento = PA_SCROLL_LEFT;
        break;
      case '2':
      //hacia derecha
        efectoDesplazamiento = PA_SCROLL_RIGHT;
        break;
      case '3':
      //hacia abajo
        efectoDesplazamiento = PA_SCROLL_DOWN;
        break;
      case '4':
      //hacia arriba
        efectoDesplazamiento = PA_SCROLL_UP;
        break;
      case '5':
      //opcion de cadena vacia o default 
        cadena = " ";
        break;
      case 'v': 
        msj = Serial.readString();//msj usado como auxiliar para convertir
        nivel = msj.toInt();
        Serial.println(nivel);
        break;
        
      case '@':
        cadena = "";
        msj = "";
        msj = Serial.readString();
                
        char mensajeSerial[msj.length()];
        (msj).toCharArray(cadena, msj.length()+1 );
        Serial.println(cadena);
        
        //cadena = mensajeSerial;
        break;
    }
    
  }
  if (P.displayAnimate()) //Se anima y se delvuelvwe un valor verdadero en boobleano
  //cuando se completa la animacion 
  {
    uint8_t efectoEntrada = efectoDesplazamiento;  // text effect IN index
    uint8_t efectoSalida = efectoEntrada; // text effect OUT index
    //uint8_t eOut = random(ARRAY_SIZE(catalogo)); // text effect OUT index
    
    // damos de alta todos los parametros de la animacion de 
    //manera manual
    P.setTextBuffer(cadena);
    P.setTextAlignment(PA_LEFT);
    P.setSpeedInOut(80/nivel, 80/nivel);
    P.setTextEffect(efectoDesplazamiento, efectoDesplazamiento);
    P.displayReset();
  }
}
