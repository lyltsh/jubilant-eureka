<%@ page import="java.lang.*" %>
<%@ page import="java.io.*" %>
<%@ page import="com.jvm.code.chapter9.*" %>
<%
    InputStream inputStream=new FileInputStream("/Users/bxapp/Documents/Code/jvmCode/jubilant-eureka/target/classes/com/jvm/code/chapter9/TestClass.class");
    byte[] b=new byte[inputStream.available()];
    inputStream.read(b);
    inputStream.close();
    out.println(JavaClassExecuter.execute(b));
%>