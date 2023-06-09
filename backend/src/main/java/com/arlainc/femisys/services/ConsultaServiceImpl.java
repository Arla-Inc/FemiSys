package com.arlainc.femisys.services;

import com.arlainc.femisys.models.Consulta;
import com.arlainc.femisys.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaServiceImpl implements ConsultaService {

    private final ConsultaRepository consultaRepository;

    @Autowired
    public ConsultaServiceImpl(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    @Override
    public List<Object[]> findAllOrderByFechaDescWithPaciente() {
        return consultaRepository.findAllOrderByFechaDescWithPaciente();
    }

    @Override
    public List<Consulta> obtenerConsultasPorCedula(String cedula) {
        return consultaRepository.findByCedula(cedula);
    }
}

