package service;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

@WebService(name = "TransactionWS")
public class TransactionService {

    @WebMethod(operationName = "Crediter")
    public double crediter(@WebParam(name = "amount") double amount,@WebParam(name = "code") Long code) {
        Compte compte = new Compte(code, 100000, new Date());
        return  compte.getSolde() + amount;
    }

    @WebMethod(operationName = "Debiter")
    public double debiter(@WebParam(name = "amount") double amount,@WebParam(name = "code") Long code) {
        Compte compte = new Compte(code, 100000, new Date());
        return  compte.getSolde() - amount;
    }
}
