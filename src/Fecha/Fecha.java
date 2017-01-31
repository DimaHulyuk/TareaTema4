package Fecha;

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	private boolean bisiesto ( ) {
		if ( (anio % 400 == 0) || ( (anio % 4 == 0) && (anio % 100 != 0) ) )
		return true;
		else return false;
		}


	private int diasMes ( ) {
		int diasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: diasMes = 31; break;
		case 4:
		case 6:
		case 9:
		case 11 : diasMes = 30; break;
		case 2 : if ( bisiesto() )
		diasMes = 29;
		else diasMes = 28;
		break;
		}
		return diasMes;
		}

	
	public boolean valida ( ) {
		if (dia < 1 || dia > 31) return false;
		if (mes < 1 || mes > 12) return false;
		if (anio < 0) return false;
		if (dia > diasMes()) return false;
		else return true;
	}

	
}
