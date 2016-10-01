import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class pm7 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter p=res.getWriter();
p.println("<html>"+"<head>"+"<body bgcolor='aqua'>"+"<H1 ALIGN='CENTER'>"+"<FONT COLOR='BLUE'>"+"<b>"+"ELIGIBLE STUDENTS"+"</B>"+"</FONT>"+"</H1>"+"<BR>"+"<title>"+"view"+"</title>"+"</body>"+"</head>"+"</html>");
try
{

Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost/placement";
Connection con=DriverManager.getConnection(url);
Statement s=con.createStatement();


ResultSet i=s.executeQuery("select * from placement where cgpa>8");
while(i.next())
{
p.println(i.getString(1)+"\n");
p.println("\n");
System.out.println();
}


}
catch(Exception e)
{
p.println(e);
}
}
}
