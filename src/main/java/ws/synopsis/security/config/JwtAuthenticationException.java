
package ws.synopsis.security.config;

import org.springframework.security.core.AuthenticationException;

public class JwtAuthenticationException extends AuthenticationException
{

    private static final long serialVersionUID = 9080607749506816451L;

    public JwtAuthenticationException(String msg, Throwable t)
    {
        super(msg, t);
    }

    public JwtAuthenticationException(String msg)
    {
        super(msg);
    }

}
