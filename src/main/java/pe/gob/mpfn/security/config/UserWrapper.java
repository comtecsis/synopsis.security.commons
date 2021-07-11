
package pe.gob.mpfn.security.config;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import pe.gob.mpfn.security.beans.domain.User;

@Getter
@Setter
public class UserWrapper extends UserInfo
{

    private static final long serialVersionUID = -4943465268794839517L;

    private final List<UserRole> roles;
    private final String name;
    private final String email;
    private final String state;

    public UserWrapper(User userInfo)
    {
        super(userInfo);
        this.name = userInfo.getName();
        this.roles = Arrays.asList(new UserRole(userInfo.getRole()));
        this.email = userInfo.getEmail();
        this.state = userInfo.getState();
    }

}
