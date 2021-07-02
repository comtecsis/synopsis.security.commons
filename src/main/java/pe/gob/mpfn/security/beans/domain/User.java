
package pe.gob.mpfn.security.beans.domain;

import java.io.Serializable;

import lombok.Data;
import pe.gob.mpfn.security.utils.SecurityConstants;

@Data
public class User implements Serializable
{

    private static final long serialVersionUID = SecurityConstants.SERIALIZATION_VERSION;

    private Long userId;
    private String name;
    private String email;
    private String phone;
    private String role;
    private Boolean existImage;
    private String environment;

}
