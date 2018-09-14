package classes;

import classes.entiy.Students;
import classes.json.ListObject;
import classes.service.StudentServiceImpl;
import classes.status.StatusHouse;
import classes.utils.JackJsonUtils;
import classes.utils.ResponseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentInq")
public class StudentInq extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Students> list = new StudentServiceImpl().getAllStudents();
        ListObject listObject=new ListObject();
        listObject.setItems(list);
        listObject.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        String responseText = JackJsonUtils.toJson(listObject);
        ResponseUtils.renderJson(response, responseText);
    }
}
