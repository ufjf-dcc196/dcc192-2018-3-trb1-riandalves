package dcc196.ufjf.br.semanac.DAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import dcc196.ufjf.br.semanac.Modelo.Evento;
import dcc196.ufjf.br.semanac.Modelo.Participante;

public class DAO {

    public static List<Participante> lstParticipantes;
    private static List<Evento> lstEventos;

    public static List getParticipanteInstance()
    {
        if (lstParticipantes == null)
        {
            lstParticipantes = new ArrayList<Participante>();
            Participante p1 = new Participante("Mateus", "mateusgon57@gmail.com", "00000000000", null);
            Participante p2 = new Participante("Gabriel", "gabrielmsanta97@gmail.com", "00123456789", null);
            lstParticipantes.add(p1);
            lstParticipantes.add(p2);
        }
        return lstParticipantes;
    }

    public static List getEventoInstance()
    {
        if (lstEventos == null)
        {
            String data = "26/10/2018 20:30";
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            Calendar cal = Calendar.getInstance();
            try {
                cal.setTime(sdf.parse(data));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            lstEventos = new ArrayList<Evento>();
            Evento e1 = new Evento("Palestra de jogos", "S205", cal, "Mateus Gonçalo", "Abordará o desenvolvimento de jogos", null, 30, 0);
            Evento e2 = new Evento("Selenium Web Driver", "L107", cal, "Gabriel Martins", "Abordará o uso do Selenium", null, 40, 0);
            lstEventos.add(e1);
            lstEventos.add(e2);
        }
        return lstEventos;
    }
}
