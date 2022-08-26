package com.portafolio.backend.Services;

import java.util.List;

import com.portafolio.backend.Models.EducacionModel;
import com.portafolio.backend.Models.ExperienciaModel;
import com.portafolio.backend.Models.HabilidadesModel;
import com.portafolio.backend.Models.UsuarioModel;
import com.portafolio.backend.Repository.EducacionRepository;
import com.portafolio.backend.Repository.ExperienciaRepository;
import com.portafolio.backend.Repository.HabilidadesRepository;
import com.portafolio.backend.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServices implements IUsuarioServices {

    @Autowired
    private UsuarioRepository userRepository;

    @Autowired
    private HabilidadesRepository habilidadRepository;

    @Autowired
    private EducacionRepository educacionRepository;

    @Autowired
    private ExperienciaRepository experienciaRepository;

    @Override
    public List<UsuarioModel> getUsers() {
        List<UsuarioModel> listaUsers = userRepository.findAll();
        return listaUsers;
    }

    @Override
    public void savePersona(UsuarioModel user) {
        userRepository.save(user);

    }

    @Override
    public void deletePersona(int id) {
        userRepository.deleteById((long) id);

    }

    @Override
    public UsuarioModel findUser(int id) {
        UsuarioModel user = userRepository.findById((long) id).orElse(null);
        return user;
    }
    // ------------------------------------------------------------------------------------------------------------

    @Override
    public List<ExperienciaModel> getExperiencias() {
        List<ExperienciaModel> listaExperiencie = experienciaRepository.findAll();
        return listaExperiencie;
    }

    @Override
    public void addExperience(ExperienciaModel experience) {
        experienciaRepository.save(experience);
    }

    @Override
    public void removeExperience(int id) {
        experienciaRepository.deleteById((long) id);
    }

    @Override
    public ExperienciaModel findExperiencie(int id) {
        ExperienciaModel experience = experienciaRepository.findById((long) id).orElse(null);
        return experience;
    }

    // ------------------------------------------------------------------------------------------------------------
    @Override
    public List<EducacionModel> getEducacion() {
        List<EducacionModel> listaEducacion = educacionRepository.findAll();
        return listaEducacion;
    }

    @Override
    public void addEducacion(EducacionModel educacion) {
        educacionRepository.save(educacion);
    }

    @Override
    public void removeEducacion(int id) {
        educacionRepository.deleteById((long) id);
    }

    @Override
    public EducacionModel findEducacion(int id) {
        EducacionModel educacion = educacionRepository.findById((long) id).orElse(null);
        return educacion;
    }

    // ------------------------------------------------------------------------------------------------------------
    @Override
    public List<HabilidadesModel> getHabilidades() {
        List<HabilidadesModel> listaHabilidades = habilidadRepository.findAll();
        return listaHabilidades;
    }

    @Override
    public void addHabilidades(HabilidadesModel habilidad) {
        habilidadRepository.save(habilidad);
    }

    @Override
    public void removeHabilidad(int id) {
        habilidadRepository.deleteById((long) id);
    }

    @Override
    public HabilidadesModel findHabilidad(int id) {
        HabilidadesModel habilidad = habilidadRepository.findById((long) id).orElse(null);
        return habilidad;
    }

}
