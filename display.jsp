<%@page import="java.util.List" %>
<%@page import="com.example.demo.dao.Course"%>

${lemp}
<% List<Course> list=(List<Course>) request.getAttribute("lemp");%>
        <table border="2">
            <tr>
                <th>Id</th>
                <th>title</th>
                <th>description</th>
            </tr>
            <%for(Course e:list){%>
                <tr>
                    <td>
                        <%=e.getId()%>
                    </td>
                    <td>
                        <%=e.getTitle()%>
                    </td>
                    <td>
                        <%=e.getDescription()%>
                    </td>
                </tr>
                <%}%>
        </table>