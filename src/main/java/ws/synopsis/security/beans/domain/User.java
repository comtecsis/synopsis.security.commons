
package ws.synopsis.security.beans.domain;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import ws.synopsis.security.utils.SecurityConstants;

@Data
@Builder
public class User implements Serializable
{

    private static final long serialVersionUID = SecurityConstants.SERIALIZATION_VERSION;

    private Long userId;
    private String name;
    private String email;
    private String phone;
    private String role;
    private String state;

}
