
package pe.gob.mpfn.security.beans.domain;

import java.io.Serializable;

import lombok.Data;
import pe.gob.mpfn.security.utils.SecurityConstants;

@Data
public class Role implements Serializable
{

    private static final long serialVersionUID = SecurityConstants.SERIALIZATION_VERSION;

    private String name;

}
