package com.mycompany.pruebaingvehiculos.Clases;

import com.mycompany.pruebaingvehiculos.Clases.Vehiculo;
import java.sql.Time;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-05T21:33:47", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, Time> hora;
    public static volatile SingularAttribute<Turno, Integer> anden;
    public static volatile SingularAttribute<Turno, Vehiculo> vehiculo;
    public static volatile SingularAttribute<Turno, Integer> idturn;
    public static volatile SingularAttribute<Turno, Date> dia;

}