package com.app.safabooking.service;

import com.app.safabooking.model.Hamburguesa;
import com.app.safabooking.model.Hamburgueseria;
import com.app.safabooking.repository.HamburguesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HamburguesaService {

    @Autowired
    private HamburguesaRepository burguerRepository;


    public List<Hamburguesa> getAll(){
        Hamburgueseria hamburgueseria = new Hamburgueseria();
        return burguerRepository.findAll();
    }

    public List<Hamburguesa> obternerOrdenadasPorID(){
        return burguerRepository.obtenerBurguers();
    }

    public Hamburguesa getById(int id){
        return burguerRepository.findById(id).orElse(null);
    }

    public void guardarHamburguesa(int id, String nombre, Double valorCalorico , Hamburgueseria hamburgueseria){
        Hamburguesa hamburguesaGuardar = new Hamburguesa();
        if(id!= 0){
            Hamburguesa h = burguerRepository.findById(id).orElse(null);
            if(h!=null){
                hamburguesaGuardar = h;
            }
        }
        hamburguesaGuardar.setNombre(nombre);
        hamburguesaGuardar.setValorCalorico(valorCalorico);
        hamburguesaGuardar.setHamburgueseria(hamburgueseria);
    }

    public void guardarHamburguesa(Hamburguesa hamburguesa){
       burguerRepository.save(hamburguesa);
    }


}
