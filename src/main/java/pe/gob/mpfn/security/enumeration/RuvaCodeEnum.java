
package pe.gob.mpfn.security.enumeration;

import pe.gob.mpfn.security.beans.response.Status;

/**
 * 
 * @author Elvis <br/>
 *         Se utiliza para manejo y agrupamiento de excepciones. <br/>
 *         Revisar la documentaci&oacute;n de: {@link RuvaContext}
 */
public enum RuvaCodeEnum
{
    // @formatter:off
    OK(RuvaContext.LOGIC, 0, "Consulta exitosa."), 
    NOT_AUTHENTICATED(RuvaContext.LOGIC, 1, "No se encuentra autenticado."),
    MIMETYPE_INVALID(RuvaContext.LOGIC, 2, "El tipo de dato es inválido."), 
    STORE_PROCEDURE(RuvaContext.LOGIC, 3, "Error inesperado."), 
    NOT_AUTHORIZE(RuvaContext.LOGIC, 4, "No se encuentra autorizado."),
    FAIL(RuvaContext.LOGIC, 1000, "Error inesperado."),

    RESOURCE_NOT_EXIST(RuvaContext.STORE_PROCEDURE, 1, "Recurso no existe.");
    // @formatter:on

    private RuvaContext context;
    private Status status;

    RuvaCodeEnum(RuvaContext context, Integer index, String message)
    {
        this.status = new Status(context.getCode(index), message);
        this.context = context;
    }

    public RuvaContext getContext()
    {
        return context;
    }

    public String getCode()
    {
        return this.status.getCode();
    }

    public String getMessage()
    {
        return this.status.getMessage();
    }

    public boolean isCode(String code)
    {
        return this.getCode().equals(code);
    }

    public Status status()
    {
        return this.status;
    }

}
