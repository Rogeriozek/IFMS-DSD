import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args){
            Mensagem msg = new Mensagem();
		try {
			ServerSocket servidor = new ServerSocket(9000);
			System.out.println("Estou respondendo na porta 9000");
			while (true) {
				Socket socket = servidor.accept();
				System.out.println("Cliente conectado: " + socket.getInetAddress().getHostAddress());
                                ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
				saida.flush();
				saida.writeUTF(msg.ResultMessage());
				saida.close();
				socket.close();
			}
                }
		 catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
        }
