<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Assign Employee to Project</title>
</head>
<body>
<h2>Assign Employee to Project</h2>
<form action="/assign" method="post">
  <label for="employee">Employee:</label>
  <select id="employee" name="employeeId">
    <c:forEach var="employee" items="${employees}">
      <option value="${employee.id}">${employee.name}</option>
    </c:forEach>
  </select>
  <label for="project">Project:</label>
  <select id="project" name="projectId">
    <c:forEach var="project" items="${projects}">
      <option value="${project.id}">${project.name}</option>
    </c:forEach>
  </select>
  <button type="submit">Assign</button>
</form>
</body>
</html>
