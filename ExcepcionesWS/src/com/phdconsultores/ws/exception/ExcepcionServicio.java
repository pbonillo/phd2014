package com.phdconsultores.ws.exception;

import javax.xml.ws.WebFault;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Clase para el manejo de excepciones de servicios web
 * 
 * @author Dr. Pedro Nolasco Bonillo Ramos
 * @version 1.0
 * @edited Dr. Pedro Nolasco Bonillo Ramos
 */
@WebFault(name="ExcepcionServicio")
public class ExcepcionServicio extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final static Logger logger = Logger.getLogger(ExcepcionServicio.class);
	
	
	public ExcepcionServicio(){
		PropertyConfigurator.configure(System.getProperties().getProperty("user.dir") + 
				System.getProperty("file.separator") + "log4j.properties");
	}
	
	
	public ExcepcionServicio(String message, Throwable cause) {
        super(message, cause); 
    }

    public ExcepcionServicio(String message) {
        super(message);
        logger.error(message);
    }
    
    public ExcepcionServicio(String msg, Logger log) {
        super(msg);
        log.error(msg);
    }

    public ExcepcionServicio(String msg, Throwable cause, Logger log) {
        super(msg, cause);
        log.error(msg, cause);
    }
    
}