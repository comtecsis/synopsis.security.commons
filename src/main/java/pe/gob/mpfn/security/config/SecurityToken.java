
package pe.gob.mpfn.security.config;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class SecurityToken extends UsernamePasswordAuthenticationToken
{

    private static final long serialVersionUID = -4943465268794839517L;

    private final UserWrapper userInfo;

    public SecurityToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities,
            UserWrapper userInfo)
    {
        super(principal, credentials, authorities);
        this.userInfo = userInfo;
    }

    public UserWrapper getUserInfo()
    {
        return userInfo;
    }

}