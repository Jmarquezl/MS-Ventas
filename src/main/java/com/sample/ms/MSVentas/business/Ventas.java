/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.ms.MSVentas.business;

import com.sample.ms.MSVentas.entity.SaludoRequest;
import com.sample.ms.anotaciones.Interceptor;
import org.springframework.stereotype.Component;

/**
 *
 * @author B142837
 */
@Component
public class Ventas {
    
    @Interceptor
    public String hola(SaludoRequest request){
        System.out.println(":::::::::::::::::::::::::::");
        return "Say hello...";
    }
}
