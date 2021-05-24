/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.idsetter;

import java.io.Serializable;

/**
 *
 * @author ghegghe
 */
public class ID implements Serializable {
    private int[] listaID;
    
    public ID() {
        listaID=new int[0];
    }
    public int getIDLength() {
        return listaID.length;
    }
    public int addID() {
        //Nuovo id
        int newID=0;
        //Presenza id
        for(int i=0; i<listaID.length; i++) {
            if(listaID[i]==newID)
                newID++;
        }
        //Aggiunta dell'id alla lista presenze
        //Creazione nuovo array presenze
        int[] newListaID=new int[listaID.length+1];
        //Copia dei valori precedenti
        for(int i=0; i<listaID.length; i++)
            newListaID[i]=listaID[i];
        //Aggiunta nuovo valore
        newListaID[newListaID.length-1]=newID;
        //Creazione nuovo array della classe
        listaID=new int[newListaID.length];
        //Copia valori nel nuovo array della classe
        for(int i=0; i<listaID.length; i++)
            listaID[i]=newListaID[i];
        //Ritorno id
        return newID;
    }
    public void delID(int posizione) throws ArrayIndexOutOfBoundsException {
        //Eccezione
        if(posizione<0 || posizione>=listaID.length)
            throw new ArrayIndexOutOfBoundsException();
        //Spostamento valore all'ultima posizione
        for(int i=posizione; i<listaID.length-1; i++)
            listaID[i]=listaID[i+1];
        //Creazione nuovo array presenze
        int[] newListaID=new int[listaID.length-1];
        //Copia dei valori precedenti
        for(int i=0; i<listaID.length-1; i++)
            newListaID[i]=listaID[i];
        //Creazione nuovo array della classe
        listaID=new int[newListaID.length];
        //Copia valori nel nuovo array della classe
        for(int i=0; i<listaID.length; i++)
            listaID[i]=newListaID[i];
    }
}
