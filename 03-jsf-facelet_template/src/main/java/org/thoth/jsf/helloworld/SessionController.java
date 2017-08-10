package org.thoth.jsf.helloworld;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named
@SessionScoped
public class SessionController implements Serializable {

    private static final long serialVersionUID = 1244514523L;

    public String getSessionId() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        return session.getId();
    }
    
    public String getMemoryAddress() {
        return this.toString();
    }
}
