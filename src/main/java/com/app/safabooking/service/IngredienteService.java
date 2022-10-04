package com.app.safabooking.service;

import com.app.safabooking.model.Ingrediente;
import com.app.safabooking.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;



    public List<Ingrediente> listar(){
        return ingredienteRepository.findAll();
    }

    public Ingrediente buscarPorID(Integer id){
        return ingredienteRepository.findById(id).orElse(null);
    }

    public void guardar(Ingrediente ingrediente){
        ingredienteRepository.save(ingrediente);
    }


    //       Ingrediente ingredienteEliminar = buscarPorID(id);
//       if(ingredienteEliminar!=null){
//           ingredienteRepository.delete(ingredienteEliminar);
//           return "Elimado Correctamente";
//       }else{
//           return "No se ha encontrado";
//       }
    public void eliminar(Integer id){
       ingredienteRepository.deleteById(id);
    }





}
