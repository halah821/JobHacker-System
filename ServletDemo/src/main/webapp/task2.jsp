<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"   import = "java.time.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
<style>
.bgtext {
  background-color: green;
}
</style>
</head>
<body>

<form action="add" method="get"> 

Date of birth <input type="date" name="birthday"> <% out.println(request.getAttribute("date1")); %><br>
Age at the date of <input type="date" name="ageAt"> <% out.println(request.getAttribute("date2")); %>
<input type="submit" value="calculate">
<br>
<span class="bgtext"> Result          </span><br>
<%

//LocalDate date1 =LocalDate.parse(request.getParameter("birthday"));

// LocalDate date2 =LocalDate.parse(request.getParameter("ageAt"));
// Period period = Period.between(date1, date2);
// period.getDays();
// period.getMonths();
%>
Age:<br>
<% out.println(request.getAttribute("years")); %>
years<br>
<% out.println(request.getAttribute("months")); %>
months<br>
<% out.println(request.getAttribute("days")); %>
days<br>
<% out.println(0); %>
hours<br>
</form>

</body>
</html>