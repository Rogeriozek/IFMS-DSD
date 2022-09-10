import java.net.InetAddress;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.net.InetAddress;


public class Mensagem{
    private
            int index;
            DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            static ArrayList<String> messages = new ArrayList<String>();
            
    public Mensagem() {
               messages.add("Hora certa: " +  new SimpleDateFormat("dd/MM/yyyy").format(new Date(0)));
                messages.add("Hoje é dia: " + new SimpleDateFormat("dd/MM/yyyy").format(new Date(0)));
                messages.add("Sou um servidor de mensagens. ");
                messages.add("Sou mensageiro, trago sempre informações úteis.");
                messages.add("Só trabalho nos dias ímpares.");
                messages.add("Puts, você só sabe me requisitar...");
                messages.add("Chega!!! Não te respondo mais.");
                messages.add("Servidor TCP desenvolvido em Java.");
                messages.add("Dia da semana: " + DayOfWeek.from(parser.parse( new SimpleDateFormat("dd/MM/yyyy").format(new Date(0)))));
    }  
                     
   public
   String ResultMessage(){
       index = (int)(Math.random() * messages.size());
       return messages.get(index); 
   } 
}
