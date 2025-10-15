public class mainclass {
	public static void main(String[] args) {
		//Nombre del objeto
		templateclass MACO = new templateclass();

		// Datos asignados a cada atributo
		MACO.nombreCliente = "Miguel Ángel";
		MACO.apellidoCliente = "Cruz Olmedo";
		MACO.direccionCliente = "Col. San Benito, San Salvador, El Salvador";
		MACO.fecha = "2025-10-20";
		MACO.hora = "8:30";
		MACO.numeroPersonas = 4;
		MACO.telefonoContacto = "+503 6001 2356";

		//Saludo de bienvenida + detalles de la reservación
		System.out.println("Bienvenidos a restaurante Brutto");
		System.out.println("Su reservación ha sido realizada con éxito.");
		System.out.println("Detalles de su reservación:");

		// Contenido de cada variable + concatenación
		System.out.println("Reservación para: " + MACO.nombreCliente + " " + MACO.apellidoCliente);
		System.out.println("Dirección: " + MACO.direccionCliente);
		System.out.println("Fecha: " + MACO.fecha + " a las " + MACO.hora);
		System.out.println("Número de personas: " + MACO.numeroPersonas);
		System.out.println("Teléfono de contacto: " + MACO.telefonoContacto);
	}

}
