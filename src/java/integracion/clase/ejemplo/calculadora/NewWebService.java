/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion.clase.ejemplo.calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Wladimir
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     * @param operando1
     * @param operando2
     */
    @WebMethod(operationName = "hello")
    public double sumar(@WebParam(name = "operador1") double operando1,@WebParam(name = "operador2") double operando2) {
        return operando1+operando2;
    }
}
