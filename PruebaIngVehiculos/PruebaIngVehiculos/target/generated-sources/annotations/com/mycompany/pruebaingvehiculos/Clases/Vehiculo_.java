package com.mycompany.pruebaingvehiculos.Clases;

import com.mycompany.pruebaingvehiculos.Clases.Propietario;
import com.mycompany.pruebaingvehiculos.Clases.Turno;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-05T21:33:47", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, String> marca;
    public static volatile SingularAttribute<Vehiculo, String> estado;
    public static volatile SingularAttribute<Vehiculo, Propietario> propietario;
    public static volatile SingularAttribute<Vehiculo, Integer> idveh;
    public static volatile ListAttribute<Vehiculo, Turno> turnos;
    public static volatile SingularAttribute<Vehiculo, String> placa;

}