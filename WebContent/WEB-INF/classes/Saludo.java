import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Saludo extends HttpServlet {
  public void init( ServletConfig conf ) throws ServletException {
    super.init( conf );
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException
  {
    // Si la petición entra por aquí la reenviamos al método doPost()
    doPost( req,res );
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res)
  throws IOException, ServletException
  {
    // Recuperamos el nombre del usuario
    String nombre = req.getParameter( "nombre" );
    // Generamos la página de saludo personalizada
    res.setContentType( "text/html" );
    PrintWriter salida = res.getWriter();
    salida.println( "<HTML><BODY>" );
    salida.println( "<H2>Saludos,</H2>" );
    salida.println( "<H1 ALIGN=\"CENTER\">" +
      "<FONT COLOR=\"#0000FF\">" + nombre );
    salida.println( "</FONT></H1>" );
    salida.println( "</HTML></BODY>" );
  }

  public void destroy() {
  }
}
