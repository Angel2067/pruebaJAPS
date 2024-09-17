package com.ciberfarma.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ciberfarma.model.Tipo;
import com.ciberfarma.model.Usuario;

public class Demo7 {
	
	public static void main(String[] args)  {
		
		EntityManagerFactory conexion = Persistence.createEntityManagerFactory("jpa_sesion01");		
		EntityManager em = conexion.createEntityManager();	
		
		//sql="select * from tb_tipos"
		//jpql="select u from tipo u"

		
		List<Tipo> lstTipos = em.createNativeQuery("select * from tb_tipos", Tipo.class).getResultList();
		
		for(Tipo t : lstTipos) {
			System.out.print("Tipo de Usuario: " +  t.getDescripcion());
			System.out.print("------------");
			for (Usuario u : t.getLstUsuarios()) {
				System.out.print("Nombre:" + u.getNom_usua() + " " + u.getApe_usua() + "" + u.getCorreo());
				System.out.print("Email:" + u.getCorreo());
				System.out.print("-------------");
			}
		}
		
		List<Tipo> lstTipos2 = em.createNativeQuery("select u from tipo u").getResultList();

		for(Tipo t : lstTipos) {
			System.out.print("Tipo de Usuario: " +  t.getDescripcion());
			System.out.print("------------");
			for (Usuario u : t.getLstUsuarios()) {
				System.out.print("Nombre:" + u.getNom_usua() + " " + u.getApe_usua() + "" + u.getCorreo());
				System.out.print("Email:" + u.getCorreo());
				System.out.print("-------------");

			}}}}
