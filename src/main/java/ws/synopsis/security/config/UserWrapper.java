
package ws.synopsis.security.config;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import ws.synopsis.security.beans.domain.User;

@Getter
@Setter
public class UserWrapper extends UserInfo
{

    private static final long serialVersionUID = -4943465268794839517L;

    private final List<UserRole> roles;
    private final String name;

    public UserWrapper(User userInfo)
    {
        super(userInfo);
        this.name = userInfo.getName();
        this.roles = Arrays.asList(new UserRole(userInfo.getRole()));
    }

}
