<%@ page import="java.lang.*" %>
<%@ page import="java.io.*" %>
<%@ page import="com.jvm.code.chapter9.*" %>
<%
    InputStream inputStream=new FileInputStream("com/jvm/code/chapter9/TestClass.class");
    byte[] b=new byte[inputStream.available()];
    inputStream.read(b);
    inputStream.close();
    System.out.println(JavaClassExecuter.execute(b));
%>