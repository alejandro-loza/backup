#include <iostream> //la libreria iostream visita esta url https://es.wikipedia.org/wiki/Iostream
using namespace std;//es un identificador para funciones puedes ver mas info https://espanol.answers.yahoo.com/question/index?qid=20070512212620AA5LyDR

void Convert(unsigned int val){//esta es una funcion que no va regresar nada osea va hacer su chamba y nada mas  por eso el void, te pide que le des un valor de un entero ese se lo das en la linea 17
	unsigned int mask = 1 << (sizeof(int) * 8 - 1);//unsigned te pedira simpre valores positivos osea 0 1 2 pero nunca -1 -2 -3  esta es la linea mas importate del programa el mask va cambiando en la linea 12
	for(int i = 0; i < 32; i++) {//es un ciclo que se ejecutara hasta que i sea menor a 32 osea 31 este ciclo termina en la linea 15 recuerda que se ejecutara 32 porque "i" inicia en 0
		//cout << " val: " << val << " mask:"<< mask << " result: " <<(val & mask) << endl; //esta linea la puse para ver que hace el mask no es util mas que  para debugear
		if( (val & mask) == 0  ) //aqui hace un and pero a nivel de bits igual esta muy raro este if porque no usa un and norma && sino uno & pero si val y mask son iguales a cero imprime 0 de pa linea 9
	    	cout << '0' ; //imprime cero sin salto de linea osea sin el endl 
		else//de lo contrario imprime uno linea 11
			cout << '1' ; 
			mask  >>= 1;// este hace una asignacion no se bien pero aqui esta la explicacion tecnica http://en.cppreference.com/w/cpp/language/operator_assignment#Builtin_compound_assignment
		}
		cout << endl ; //imprime un salto de line el equivalente en word de dar un enter
}

int main(){ // este es el metodo main es el primer metodo que invoca al ejecutar el programa osea lo primero que hara
	Convert(2); // ejecuta el metodo convert que avarca de la linea 4 a la 15 y le asigna el numero a convertir en este caso el 2 si nececitas que el usuario capture el numero desde teclado te conviene declarar una variable int asi int elNumeroInsertadoPorRata ;  cin>> elNumeroInsertadoPorRata; Convert(elNumeroInsertadoPorRata); 
}
