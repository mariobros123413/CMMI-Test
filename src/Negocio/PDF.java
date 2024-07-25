/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class PDF {

    public static void generarReporte() throws FileNotFoundException, DocumentException {
        Calendar calendario = Calendar.getInstance();

        int dia, mes, year, hora, minuto, segundo;
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH) + 1;
        year = calendario.get(Calendar.YEAR);
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minuto = calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND);
        com.itextpdf.text.Font bfBold12 = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER, 11, com.itextpdf.text.Font.NORMAL, new BaseColor(0, 0, 0));
        com.itextpdf.text.Font tituloTabla = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER, 11, com.itextpdf.text.Font.BOLD, new BaseColor(0, 0, 0));
        // Creacion del documento con los margenes
        Document document = new Document(PageSize.LEGAL, 5, 5, 10, 10);
        try {
            String dir = System.getProperty("user.home") + File.separator + "Documents";
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss");
            String historial = hourdateFormat.format(date);
            File fileOut2 = new File(dir + "//ReportsCMMI//" + historial);
            if (!fileOut2.exists()) {
                FileOutputStream outStream = new FileOutputStream(fileOut2 + ".pdf");
                PdfWriter.getInstance(document, outStream);

                document.open();
                // JOptionPane.showMessageDialog(null, "Reporte guardado con Exito!");  
            } else {

            }

            com.itextpdf.text.Image image = null;

            // Obtenemos el logo de datojava
//    URL iconURL = getClass().getResource("/iconos/logo.jpg");
//   image = com.itextpdf.text.Image.getInstance(iconURL);
//   image.scaleAbsolute(180f, 140f);
            // Crear las fuentes para el contenido y los titulos
            com.itextpdf.text.Font fontTitulo = FontFactory.getFont(FontFactory.TIMES_BOLDITALIC.toString(), 15, com.itextpdf.text.Font.UNDERLINE,
                    BaseColor.DARK_GRAY);
            com.itextpdf.text.Font fontContenido = FontFactory.getFont(FontFactory.TIMES_ROMAN.toString(), 11, com.itextpdf.text.Font.NORMAL,
                    BaseColor.DARK_GRAY);
            com.itextpdf.text.Font fontTitulos = FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, 20, com.itextpdf.text.Font.UNDERLINE,
                    BaseColor.DARK_GRAY);
            Paragraph titulo = new Paragraph();
            // Agregar un titulo con su respectiva fuente
            titulo.add(new Phrase("REPORTE DE EVALUACION CMMI", fontTitulo));
            // Creacion de una tabla
            // Crear tabla nueva con dos posiciones
            PdfPTable table1 = new PdfPTable(1);
            float[] longitudes = {12.0f};
            // Establecer posiciones de celdas
            table1.setWidths(longitudes);
            // Cargar imagenes del producto y agregarlas
            table1.getDefaultCell().setBorderColor(BaseColor.WHITE);
            table1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
//  
            table1.addCell(titulo);
//    image = com.itextpdf.text.Image.getInstance(iconURL);
//   image.scaleAbsolute(40f, 20f);
//   table1.addCell(image);
            // Agregar la tabla al documento
            document.add(table1);
            // Creacion del parrafo
            Paragraph paragraph = new Paragraph();
            // Agregar un titulo con su respectiva fuente
            paragraph.add(new Phrase(Chunk.NEWLINE));
            paragraph.add(new Phrase(Chunk.NEWLINE));
            paragraph.add(new Phrase("Informacion general", fontTitulo));

            // Agregar saltos de linea
            paragraph.add(new Phrase(Chunk.NEWLINE));
          

            document.add(paragraph);

            //specify column widths
            //Especificar ancho de las columnas de detalles
            float[] columnWidths2 = {1.8f, 1.6f, 1.8f, 1.8f, 1.8f, 1.8f, 1.8f, 2.2f};
            float[] columnWidths = {1.5f, 2f, 2f, 2f};
            float[] columnWidthsMensaje = {5.0f};
            float[] columnWidthsArchivosYCaptions = {4.0f, 4.0f};
            float[] columnWidthsButtons = {4.0f, 4.0f, 4.0f};
            //create PDF table with the given widths
            PdfPTable table = new PdfPTable(columnWidths);
            // set table width a percentage of the page width
            table.setWidthPercentage(90f);

            PdfPTable table2 = new PdfPTable(columnWidthsButtons);
            // set table width a percentage of the page width
            Paragraph Mensajes4 = new Paragraph();
   
            Mensajes4.add(new Phrase(Chunk.NEWLINE));
            Mensajes4.add(new Phrase("Organizacion: [Nombre de la organización] ", fontContenido));
            Mensajes4.add(new Phrase(Chunk.NEWLINE));
             paragraph.add(new Phrase(Chunk.NEWLINE));
            Mensajes4.add(new Phrase("Fecha de Evaluacion: [fecha de la evaluacion] ",fontContenido));
            Mensajes4.add(new Phrase(Chunk.NEWLINE));
             paragraph.add(new Phrase(Chunk.NEWLINE));
            Mensajes4.add(new Phrase("Nivel Evaluado: [Nivel alcanzado en la evaluación] ", fontContenido));
            Mensajes4.add(new Phrase(Chunk.NEWLINE));
            Mensajes4.add(new Phrase(Chunk.NEWLINE));
            document.add(Mensajes4);
            

         

            Paragraph Mensajes = new Paragraph();

            // Agregar un titulo con su respectiva fuente
            Mensajes.add(new Phrase(Chunk.NEWLINE));
            Mensajes.add(new Phrase(Chunk.NEWLINE));
            Mensajes.add(new Phrase("Resumen ejecutivo", fontTitulo));
            Mensajes.add(new Phrase(Chunk.NEWLINE));
            Mensajes.add(new Phrase(Chunk.NEWLINE));
            document.add(Mensajes);
            PdfPTable tableMensaje = new PdfPTable(columnWidthsMensaje);

            insertCell(tableMensaje, "Breve descripción del estado actual de la organización en términos de madurez y capacidad de sus procesos.\n"
                    + "Destacar los puntos fuertes y áreas de mejora identificadas durante la evaluación.", Element.ALIGN_CENTER, 1, bfBold12);

            document.add(tableMensaje);

            Paragraph contexto = new Paragraph();
            contexto.add(new Phrase(Chunk.NEWLINE));
            contexto.add(new Phrase(Chunk.NEWLINE));
            contexto.add(new Phrase("Contexto de la evaluacion", fontTitulo));
            contexto.add(new Phrase(Chunk.NEWLINE));
            contexto.add(new Phrase(Chunk.NEWLINE));
            document.add(contexto);

            PdfPTable tableMensaje2 = new PdfPTable(columnWidthsMensaje);

            insertCell(tableMensaje2, "Descripción del contexto en el que se realizó la evaluación (motivaciones, objetivos, alcance, etc.).\n"
                    + "Metodología utilizada para la evaluación (por ejemplo, SCAMPI - Standard CMMI Appraisal Method for Process Improvement).", Element.ALIGN_CENTER, 1, bfBold12);

            document.add(tableMensaje2);

            Paragraph ArchivosYCaptios = new Paragraph();

            // Agregar un titulo con su respectiva fuente
            ArchivosYCaptios.add(new Phrase(Chunk.NEWLINE));
            ArchivosYCaptios.add(new Phrase(Chunk.NEWLINE));
            ArchivosYCaptios.add(new Phrase("Resultado de la Evaluacion", fontTitulo));
            ArchivosYCaptios.add(new Phrase(Chunk.NEWLINE));
            ArchivosYCaptios.add(new Phrase(Chunk.NEWLINE));
            document.add(ArchivosYCaptios);

            PdfPTable tableMensaje3 = new PdfPTable(columnWidthsMensaje);

            insertCell(tableMensaje, "Puntuación General\n"
                    + "Descripción de la puntuación obtenida en cada área de proceso evaluada.\n"
                    + "Comparación con el modelo de referencia de CMMI-SW.\n"
                    + "Niveles de Madurez\n"
                    + "Descripción del nivel de madurez alcanzado por la organización.\n"
                    + "Detalles sobre los procesos y prácticas asociadas a cada nivel.\n"
                    + "Capacidades Específicas\n"
                    + "Análisis detallado de las capacidades específicas demostradas por la organización en áreas de proceso clave.\n"
                    + "Hallazgos\n"
                    + "Identificación de puntos fuertes y áreas de mejora en los procesos de la organización.\n"
                    + "Recomendaciones para abordar las áreas de mejora identificadas..", Element.ALIGN_CENTER, 1, bfBold12);

            document.add(tableMensaje3);

            PdfPTable tableMensaje4 = new PdfPTable(columnWidthsMensaje);

            insertCell(tableMensaje4, "Puntuación General\n"
                    + "Descripción de la puntuación obtenida en cada área de proceso evaluada.\n"
                    + "Comparación con el modelo de referencia de CMMI-SW.\n"
                    + "Niveles de Madurez\n"
                    + "Descripción del nivel de madurez alcanzado por la organización.\n"
                    + "Detalles sobre los procesos y prácticas asociadas a cada nivel.\n"
                    + "Capacidades Específicas\n"
                    + "Análisis detallado de las capacidades específicas demostradas por la organización en áreas de proceso clave.\n"
                    + "Hallazgos\n"
                    + "Identificación de puntos fuertes y áreas de mejora en los procesos de la organización.\n"
                    + "Recomendaciones para abordar las áreas de mejora identificadas..", Element.ALIGN_CENTER, 1, bfBold12);
            document.add(tableMensaje4);

            Paragraph Registro = new Paragraph();
            // Agregar un titulo con su respectiva fuente
            Registro.add(new Phrase(Chunk.NEWLINE));
            Registro.add(new Phrase(Chunk.NEWLINE));
            Registro.add(new Phrase("Anexos", fontTitulo));
            Registro.add(new Phrase(Chunk.NEWLINE));
            Registro.add(new Phrase(Chunk.NEWLINE));
            document.add(Registro);

            PdfPTable tableMensaje5 = new PdfPTable(columnWidthsMensaje);

            insertCell(tableMensaje5, "Detalles adicionales sobre la metodología de evaluación.\n"
                    + "Documentación de soporte, como listas de verificación utilizadas, entrevistas realizadas, etc.", Element.ALIGN_CENTER, 1, bfBold12);
            document.add(tableMensaje5);
           
            document.close();
           
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null, "El archivo ya Existe, Por favor introduzca otro nombre!");
        }
    }

    public static void insertCell(PdfPTable table, String text, int align, int colspan, Font font) {
        //create a new cell with the specified Text and Font
        PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
        //set the cell alignment
        cell.setHorizontalAlignment(align);
        //set the cell column span in case you want to merge two or more cells
        cell.setColspan(colspan);
        //in case there is no text and you wan to create an empty row
        if (text.trim().equalsIgnoreCase("")) {
            cell.setMinimumHeight(10f);
        }
        table.addCell(cell);

    }
}
