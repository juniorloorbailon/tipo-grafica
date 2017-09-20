paquete  listasimplee ;
import  javax.swing.JOptionPane ;
importación  listasimplee.Nodo ;

Todos los derechos reservados
 *
 * @author junior loor
 * /
la  clase  pública Principal  extiende  javax.swing . JFrame {
  
    ListaSimpleE lista = nuevo  ListaSimpleE ();
    ListaSimpleE  Nodo = nuevo  ListaSimpleE ();
     protegido  Nodo inicio, aleta; // punteros para saber donde esta el inicio y el fin
    int opcion = 0 , el;
  
    
    public  Principal () {
       
        initComponents ();
        esta . setLocationRelativeTo ( null );
         inicio =  nulo ;
        fin =  null ;
    }                      
    private  void  BTNingresarInicioActionPerformed ( java.awt.event . ActionEvent  evt ) {                                                  
       tratar {
            int elemento = Integer . parseInt ( TXTingresar . getText () . toString ());
         
              inicio =  nuevo  Nodo (elemento, inicio);
                 if (fin ==  null ) {
                   fin = inicio;
               
               }
                    // Agregando al Inicio
                  Lista . agregarAlInicio (elemento);
                     
                            } catch ( NumberFormatException n) {
                             
                     JOptionPane . showMessageDialog ( null , " Error " + n . getMessage ());
                      TXTingresar . setText ( " " );
                      
                    }  
     JOptionPane . showMessageDialog ( null , " Elemento ingresado al INICIO " );
    }                                                 

    private  void  BTNingresarFinalActionPerformed ( java.awt.event . ActionEvent  evt ) {                                                 
      tratar {
                    int elemento = Integer . parseInt ( TXTingresar . getText () . toString ());
                    
                     if ( ! estaVacia ()) {
                     aleta . siguiente =  new  Nodo (elemento);
                      fin = aleta . siguiente
                    } else {
                        inicio = fin =  nuevo  Nodo (elemento);

                             }
                    
                    
                    // Agregando al Inicio
                    Lista . agregalFinal (elemento);
                            } catch ( NumberFormatException n) {
                     JOptionPane . showMessageDialog ( null , " Error " + n . getMessage ());
                    
                            }
            JOptionPane . showMessageDialog ( null , " Elemento ingresado al FINAL " );
    }                                                

    private  void  BTNmostrarListaActionPerformed ( java.awt.event . ActionEvent  evt ) {                                                
        tratar {
            if (lista . estaVacia () == true ) {
                txt . setText (txt . getText () + " \ n " );
               JOptionPane . showMessageDialog ( null , " Lista vacia " );
            }
            else {
                Nodo recorrer = inicio;
                txt . setText (txt . getText () + " \ n " );
                mientras que (recorrer ! =  null ) {
                    txt . setText (txt . getText () + " [ "  + recorrer . dato +  " ] -----> " );
                    // recorrer = recorrer.siguiente;
                romper ;
                }
            }
        } catch ( NumberFormatException n) {
            JOptionPane . showMessageDialog ( null , " Error " + n . getMessage ());
        }

         
           
    }                                               

    private  void  BTNeliminarInicioActionPerformed ( java.awt.event . ActionEvent  evt ) {                                                  
        tratar {
            if (estaVacia () ! =  true ) {
                int elemento = Integer . parseInt ( TXTingresar . getText () . toString ());
                elemento = inicio . dato
                if (inicio == fin) {
                    inicio =  nulo ;
                    fin =  null ;
                } else {
                    inicio = inicio . siguiente
                 
                }
                
                JOptionPane . showMessageDialog ( null , " El elemento a eliminar es "  + elemento, " Eliminando Nodo del Inicio " ,
                       JOptionPane . INFORMATION_MESSAGE );
            }
            else {
                JOptionPane . showMessageDialog ( null , " Lista vacia " );
            }
        }
        catch ( NumberFormatException n) {
            JOptionPane . showMessageDialog ( null , " Error " + n . getMessage ());
        }
    }                                                 

    private  void  BTNeliminarFinActionPerformed ( java.awt.event . ActionEvent  evt ) {                                               
        tratar {
            if (estaVacia () ! =  true ) {
                int elemento = Integer . parseInt ( TXTingresar . getText () . toString ());
                elemento = fin . dato
                if (inicio == fin) {
                    inicio = fin =  null ;
                } else {
                    Nodo temporal = inicio;
                    mientras que (temporal . siguiente ! = fin) {
                        temporal = temporal . siguiente
                    }
                fin = temporal;
                aleta . siguiente =  null ;
                }
                JOptionPane . showMessageDialog ( null , " El elemento eliminado es " + elemento, " Eliminando Nodo del Final " ,
                        JOptionPane . INFORMATION_MESSAGE );
            }
            else {
                JOptionPane . showMessageDialog ( null , " Lista vacia " );
            }
        
        } catch ( NumberFormatException n) {        
                     JOptionPane . showMessageDialog ( null , " Error " + n . getMessage ());
        }  
      
    }                                              

    private  void  BTNsalirActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
       if ( JOptionPane . showConfirmDialog (rootPane, " ¿Desea realmente salir del sistema? " ,
                " Confirme " , JOptionPane . YES_NO_OPTION ) ==  JOptionPane . YES_OPTION )
            Sistema . salida ( 0 );
        
    }                                        

    private  void  jButton1ActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
        // TODO agregue su código de manejo aquí:
                tratar {
            if (lista . estaVacia () == true ) {
                txt . setText (txt . getText () + " \ n " );
               JOptionPane . showMessageDialog ( null , " Lista vacia " );
            }
            else {
                Nodo recorrer = fin;
                txt . setText (txt . getText () + " \ n " );
                mientras que (recorrer ! =  null ) {
                    txt . setText (txt . getText () + " [ "  + recorrer . dato +  " ] -----> " );
                    // recorrer = recorrer.siguiente;
                romper ;
                }
            }
        } catch ( NumberFormatException n) {
            JOptionPane . showMessageDialog ( null , " Error " + n . getMessage ());
        }
    }                                        
// Metodo para saber si la lista esta vacia

   public  boolean  estaVacia () {
        if (inicio ==  null ) {
            devuelve  verdadero ;
        } else {
            return  false ;
        }
    }
    