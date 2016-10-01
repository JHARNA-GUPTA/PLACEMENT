import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class pm6 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter p=res.getWriter();
p.println("<html>"+
"<head>"+
"<title>"+"PLACEMENT ENTRY"+"</title>"+
"</head>"+
"<form method='get' form action=http://localhost:8080/examples/pm7>"+
"<br>"+"<br>"+"<input type='submit' name='name'  />"+"</html>");

String aa=req.getParameter("name");
p.println(aa);
String bb=req.getParameter("email");

String cc=req.getParameter("phone");
int x=Integer.parseInt(cc);
p.println(""+x);
String dd=req.getParameter("ten");
int y=Integer.parseInt(dd);
p.println(y);
String ee=req.getParameter("twelve");
int z=Integer.parseInt(ee);
p.println(z);
String ff=req.getParameter("cgpa");
int w=Integer.parseInt(ff);
p.println(w);
String gg=req.getParameter("skill");
p.println(gg);
String hh=req.getParameter("willing");
p.println(hh);
String ii=req.getParameter("it");
p.println(ii);
String jj=req.getParameter("cmp");
p.println(jj);
String kk=req.getParameter("arrear");
int u=Integer.parseInt(kk);
p.println(u);
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost/placement";
Connection con=DriverManager.getConnection(url);
Statement s=con.createStatement();
int i=s.executeUpdate("insert into placement values('"+aa+"','"+bb+"','"+x+"','"+y+"','"+z+"','"+w+"','"+gg+"','"+hh+"','"+ii+"','"+jj+"','"+u+"')");
System.out.println(i+"\t row inserted");

}
catch(Exception se)
{
p.println(se+"");
}
}
}