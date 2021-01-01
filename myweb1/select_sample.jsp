<%@page contentType="text/plain; charset=Windows-31J"%>
<%@page import="hoge.ConnectionManager, java.sql.*" %>
<%
try{
	Connection con = ConnectionManager.getConnection();
	Statement smt = con.createStatement();
	ResultSet rs = smt.executeQuery("select * from account");
	while(rs.next()){
		String s = "NAME=" + rs.getString("NAME") + ",MONEY=" + rs.getString("MONEY");
		out.println(s);
	}
	smt.close();
	con.close();
}catch(SQLException e){
	e.printStackTrace();
}
%>