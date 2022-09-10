import java.io.ObjectInputStream;
import java.net.Socket;
import java.sql.Date;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost", 9000);
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String data_atual = (String) entrada.readUTF();
			System.out.println("A mesagem recebida do servidor foi: " + data_atual);
			entrada.close();
			System.out.println("Conexão realizada com sucesso");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}