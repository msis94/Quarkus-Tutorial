package org.acme.config;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Container
{
    public String getStatus()
    {
        return "Succesfully done the CDI";
    }
}
