
package ws.synopsis.security.enumeration;

import org.springframework.core.env.Environment;

public enum RuvaEnum
{

    // @formatter:off
    JWT_EXPIRATION("jwt.expiration"), 
    JWT_SECRET("jwt.secret"), 
    JWT_PREFIX("jwt.prefix"), 
    JWT_HEADER("jwt.header"), 
    DEV_HOME("DEV_HOME");
    // @formatter:on

    private String key;

    RuvaEnum(String key)
    {
        this.key = key;
    }

    public String getKey()
    {
        return this.key;
    }

    public String getString(Environment env)
    {
        return env.getProperty(this.getKey());
    }

    public String[] getMultiple(Environment env)
    {
        return env.getProperty(this.getKey()).split(",");
    }

    public Integer getInt(Environment env)
    {
        return Integer.valueOf(env.getProperty(this.getKey()));
    }

    public Long getLong(Environment env)
    {
        return Long.valueOf(env.getProperty(this.getKey()));
    }
}
