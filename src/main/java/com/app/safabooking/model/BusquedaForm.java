

package com.app.safabooking.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;


@Getter @Setter
@NoArgsConstructor
public class BusquedaForm {

    private String ciudad;
    private String fechaInicio;
    private String fechaFin;
}

