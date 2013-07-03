/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.managed_beans;

import inscricao.entity.Candidato;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author a1156462
 */
@ManagedBean
@ApplicationScoped
public class ListaCandidatos implements Serializable {

    private ArrayList<Candidato> listaCandidatos;
    
    

}
