package agencia0.data;
/*
import agencia.model.Tour;
.







import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//clase de colleciones
public class GestorDatos {
    public List<Tour> listaTours(String AT) {

        ArrayList<Tour> listaTours = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(AT);

        if (inputStream == null) {
            System.out.println("Error: No se pudo encontrar el archivo " + AT);
            return listaTours;
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                if (partes.length == 3) {
                    String lugar = partes[0].trim();
                    int precio = Integer.parseInt(partes[1].trim());
                    int duracionDias = Integer.parseInt(partes[2].trim());

                    Tour t = new Tour(lugar, precio, duracionDias);
                    listaTours.add(t);
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al procesar el archivo: " + e.getMessage());
        }
        return listaTours;
    }

    public List<Tour> filtroDias(List<Tour> listaCompleta, int diasMinimo) {
        List<Tour> listaFiltrada = new ArrayList<>();

        for (Tour t : listaCompleta) {
            if (t.getDuracionDias() > diasMinimo) {
                listaFiltrada.add(t);
            }
        }
        return listaFiltrada;
    }

    public List<Tour> filtroLugares(List<Tour> listaCompleta, String palabra) {
        List<Tour> listaLugares = new ArrayList<>();

        for (Tour tr : listaCompleta) {
            if (tr.getLugar().equals(palabra)){
                listaLugares.add(tr);
            }

        }

        return listaLugares;
    }

    }




*/
