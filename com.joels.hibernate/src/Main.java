import com.joels.hibernate.dominio.Ciclo;
import com.joels.hibernate.dominio.CorreoElectronico;
import com.joels.hibernate.dominio.Direccion;
import com.joels.hibernate.dominio.Modulo;
import com.joels.hibernate.dominio.Municipio;
import com.joels.hibernate.dominio.Profesor;
import com.joels.hibernate.dominio.tipoFuncionario;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {
    public static void main (String[]args ){
        SessionFactory sessionFactory ;
   Configuration configuration = new Configuration();
   configuration.configure();
   ServiceRegistry serviceRegisrty = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
   sessionFactory = configuration.buildSessionFactory(serviceRegisrty);
  Session session = sessionFactory.openSession();
   session.beginTransaction();
try{
   
 
//   
////     Profesor profesor2 = new Profesor(103,"joel","enciso","saravia");
////      Direccion direccion2= new Direccion(103,"callenueva",23,"valencia");}
//      
   
   //Profesor profesor2 = new Profesor(9,"milhouse","enciso","saravia",tipoFuncionario.interino);
//      Profesor profesor3 =new Profesor(10,"joel","enciso","saravia",tipoFuncionario.practicante);
//      //ingresando direcciones
//      Direccion direccion1=new Direccion(9, "plaza", 757,"mala" );
//      Direccion direccion2=new Direccion(10, "portonverde", 351, "ayacucho");
//      profesor2.setDireccion(direccion1);
//      profesor3.setDireccion(direccion2);
//      
//      //agregamos los correos elctronicos
//      Set<CorreoElectronico> correosElectronicos =new HashSet<>();
//      correosElectronicos.add(new CorreoElectronico(3, "joeluna", profesor3));
//      correosElectronicos.add(new CorreoElectronico(4, "joeluna", profesor2));
//      correosElectronicos.add(new CorreoElectronico(5, "joeluna", profesor3));
//      
//      //agregamos los modulos
//      Modulo modulo1 = new Modulo(1, "lp1");
//      Modulo modulo2 = new Modulo(2, "lp2");
//      Modulo modulo3 = new Modulo(3, "lp3");
//      
//      profesor2.getModulos().add(modulo3);
//      profesor3.getModulos().add(modulo2);
//      profesor2.getModulos().add(modulo1);
//      profesor3.getModulos().add(modulo3);
//      
//      modulo3.getProfesores().add(profesor3);
//      modulo2.getProfesores().add(profesor3);
//      modulo1.getProfesores().add(profesor2);
//      profesor3.setCorreosElectronicos(correosElectronicos);
   
   
//      ingresando muncipios
   
//   Profesor profesor5 = new Profesor(6, "milhouse", "saravia", "enciso", tipoFuncionario.interino);
//   Municipio municipio = new Municipio(5,102,104,"laures verdes");
//   Direccion direccion = new Direccion(13, "crucinelas", 12, "cafca", municipio);
//   direccion.setMunicipio(municipio);
//  profesor5.setDireccion(direccion);
   
////     Session session = sessionFactory.openSession();
////   session.beginTransaction();
   Query query  = session.createQuery("SELECT p FROM Profesor p");
   List<Profesor> profesores = query.list();
   for(Profesor profesor: profesores){
       System.out.println("resultados");
       System.out.println(profesor.getNombre());
   }
////       //listamos 2 escaler de profesor almacenados en un array dentro de una lista
////            Query query2 = session.createQuery("SELECT p.id,p.nombre FROM Profesor p");
////            List<Object[]> listDatos = query2.list();
////            for (Object[] datos : listDatos) {
////                System.out.println(datos[0] + "--" + datos[1]);
////            }
////       //listamos una propiedad almacenada en un object     
////            Query query3 = session.createQuery("select p.nombre from Profesor p");
////            List<Object> listaNombre = query3.list();
////            for(Object nombre : listaNombre){
////                System.out.println(nombre);
////            }
////            
////        //listaremos unn unicoresultado "where"
////          
////            Profesor profesorU = (Profesor)session.createQuery("select p from Profesor p where id=10").uniqueResult();
////            System.out.println(profesorU.getNombre());
////        //filtrado wthere
////            Ciclo ciclo =(Ciclo)session.createQuery("select c from Ciclo c where c.nombre='ciclo1'").uniqueResult();
////            System.out.println(ciclo.getIdCiclo());
////        //calusulas
////            Query queryc=session.createQuery("select c from Ciclo c where c.horas between 1 and 3");
////           
////            List<Ciclo> llista = queryc.list();
////            for( Ciclo cicloc :llista){
////            System.out.println("nombre de ciclo cuando horas esta entre 1 y 3 es:.."+cicloc.getNombre());//puede imprimir directamente el objeto
////            }
////        //LIKE
////            Profesor profesorl =(Profesor)session.createQuery("select p from Profesor p where p.nombre like '%l' ").uniqueResult();
////             System.out.println("nombre de profesor que termina con 'l' :.."+profesorl.getNombre());
////            
////        //parametro posicional
////             String nombre="joel";
////             Query querypo =session.createQuery("select p from Profesor p where p.nombre=?");
////             querypo.setString(0, nombre);
////             List<Profesor> profes = query.list();
////             for(Profesor pf : profes){
////                 System.out.println("el nombre con el parametro joel es :..."+pf.getNombre());
////             }
////         //parametro cobn set parameter
////             String nombrep="joel";
////             Query querySp = session.createQuery("select p from Profesor p where p.nombre=:nombre");
////             querySp.setParameter("nombre", nombrep);
////             List<Profesor> profesorSp = query.list();
////             for(Profesor profesorsp : profesorSp){
////                 System.out.println("el nombre del profesor con el parametro nombre joel es:----"+profesorsp.getNombre());
////             }
////             
////         //navegacion por proepiedades
////               Query query4 = session.createQuery("select p.nombre.ape1 from Profesor p");
////            List<Object> listasNombre4 = query4.list();
////            for(Object nombress : listasNombre4){
////                System.out.println("select de nombre y apellidos por navegacion por propiedades"+nombress);
////            }
   //session.saveOrUpdate(profesor3);
   

   //session.getTransaction().commit();
//    
//    Profesor profesor2=(Profesor)session.get(Profesor.class, 101);
//    
//        System.out.println(profesor2.getId());
//        System.out.println(profesor2.getNombre());
//       System.out.println(profesor2.getApe1());
//        System.out.println(profesor2.getApe2());
//        System.out.println(profesor2.getDireccion());
//        
//        
//     Direccion direccion2 =(Direccion) session.get(Direccion.class, 101);
//      
//        System.out.println(direccion2.getId());
//        System.out.println(direccion2.getCalle());
//        System.out.println(direccion2.getNumero());
//        System.out.println(direccion2.getProvincia());
    // session.delete(profesor);
//        session.save(profesor5);
//        session.getTransaction().commit();
}catch(HibernateException e){
    e.printStackTrace();
}finally{
    session.close();
    sessionFactory.close();
}}
    }
    

