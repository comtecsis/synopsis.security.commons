
package pe.gob.mpfn.security.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import pe.gob.mpfn.security.beans.response.Response;
import pe.gob.mpfn.security.enumeration.RuvaCodeEnum;

@Component
public class JwtAccessDeniedEntryPoint implements AccessDeniedHandler
{

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
            AccessDeniedException e) throws IOException, ServletException
    {
        logger.error("Responding with unauthorized error. Message - {}", e.getMessage());
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        try (PrintWriter pw = response.getWriter())
        {

            Response<String> webResponse = new Response<String>();
            webResponse.setStatus(RuvaCodeEnum.NOT_AUTHORIZE.status());

            String message = new Gson().toJson(webResponse);

            response.setContentType("application/json;charset=UTF-8");
            pw.write(message);
        }
    }

}
