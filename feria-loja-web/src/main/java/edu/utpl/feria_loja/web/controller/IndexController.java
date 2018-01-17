package edu.utpl.feria_loja.web.controller;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Model
public class IndexController {
	
	public void registrar() {
		addMessage("Participante registrado.");
	}
	
	public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
