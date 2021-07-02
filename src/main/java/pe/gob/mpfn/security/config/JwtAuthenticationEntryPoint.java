
package pe.gob.mpfn.security.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import pe.gob.mpfn.security.beans.response.Response;
import pe.gob.mpfn.security.enumeration.RuvaCodeEnum;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint
{

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e)
            throws IOException, ServletException
    {
        logger.error("Responding with unauthorized error. Message - {}", e.getMessage());
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        try (PrintWriter pw = response.getWriter())
        {

            Response<String> webResponse = new Response<String>();
            webResponse.setStatus(RuvaCodeEnum.NOT_AUTHENTICATED.status());

            String message = new Gson().toJson(webResponse);

            response.setContentType("application/json;charset=UTF-8");
            pw.write(message);
        }
    }
}
