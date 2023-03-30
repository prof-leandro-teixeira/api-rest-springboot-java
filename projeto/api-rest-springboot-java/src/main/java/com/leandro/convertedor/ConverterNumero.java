package com.leandro.convertedor;

public class ConverterNumero {
	
	public static Double converteParaNumero(String numero) {
		if (numero == null) return 0D;
			String valor = numero.replaceAll(",", ".");
			if (isNumeric(numero)) return Double.parseDouble(valor);
			return 0D;
		}
	
	public static boolean isNumeric(String numero) {
		if (numero == null) return false;
		String valor = numero.replaceAll(",", ".");
		return valor.matches("[+-]?[0-9]*\\.?[0-9]+");
	}

}
