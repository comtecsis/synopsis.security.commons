
package ws.synopsis.security.config;

import org.springframework.security.core.GrantedAuthority;

public class UserRole implements GrantedAuthority
{

    private static final long serialVersionUID = -4943465268794839517L;
    private final String authority;

    public UserRole(String authority)
    {
        this.authority = authority;
    }

    @Override
    public String getAuthority()
    {
        return this.authority;
    }

}
