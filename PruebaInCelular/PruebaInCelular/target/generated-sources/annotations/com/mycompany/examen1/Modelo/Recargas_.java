package com.mycompany.examen1.Modelo;

import com.mycompany.examen1.Clases.Recargas;
import com.mycompany.examen1.Clases.Celular;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-05T21:29:33", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Recargas.class)
public class Recargas_ { 

    public static volatile SingularAttribute<Recargas, Integer> idReca;
    public static volatile SingularAttribute<Recargas, Integer> valor;
    public static volatile SingularAttribute<Recargas, Celular> celular;
    public static volatile SingularAttribute<Recargas, Double> saldo;
    public static volatile SingularAttribute<Recargas, Double> megas;

}