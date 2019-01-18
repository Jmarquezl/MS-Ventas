/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.ms.MSVentas.controller;

import com.sample.ms.MSVentas.business.Ventas;
import com.sample.ms.MSVentas.entity.SaludoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author B142837
 */
@RestController
@RequestMapping("/ventas")
public class VentasController {
    @Autowired
    private Ventas ventas;
    
    @RequestMapping(value = "/confirmar", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String venta(){
        SaludoRequest request = new SaludoRequest();
        request.setUss("digi1");
        request.setPss("digi");
        
        return ventas.hola(request);
    }
}
