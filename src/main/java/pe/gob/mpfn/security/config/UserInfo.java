
package pe.gob.mpfn.security.config;

import java.io.Serializable;

import com.google.gson.Gson;

import lombok.Getter;
import pe.gob.mpfn.security.beans.domain.User;

@Getter
public class UserInfo implements Serializable
{

    private static final long serialVersionUID = -4943465268794839517L;

    private final String email;
    private final String phone;
    private final Long userId;
    private final String state;

    public UserInfo(final User userInfo)
    {
        this.email = userInfo.getEmail();
        this.userId = userInfo.getUserId();
        this.phone = userInfo.getPhone();
        this.state = userInfo.getState();
    }

    public static UserWrapper fromJson(String json)
    {
        Gson gson = new Gson();
        UserWrapper userInfo = gson.fromJson(json, UserWrapper.class);
        return userInfo;
    }

}
