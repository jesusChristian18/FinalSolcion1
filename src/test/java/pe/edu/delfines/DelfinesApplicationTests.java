package pe.edu.delfines;

import java.util.Date;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import pe.edu.delfines.models.entity.Alquiler;
import pe.edu.delfines.models.entity.Cliente;
import pe.edu.delfines.models.entity.Habitacion;
import pe.edu.delfines.models.entity.Tipo;
import pe.edu.delfines.models.repository.AlquilerRepository;
import pe.edu.delfines.models.repository.ClienteRepository;
import pe.edu.delfines.models.repository.HabitacionRepository;
import pe.edu.delfines.models.repository.TipoRepository;


//@RunWith(SpringRunner.class)
@SpringBootTest
class DelfinesApplicationTests {

	
	@Autowired
	private HabitacionRepository habitacionRepository;
	
	private TipoRepository tipoRespository;
	
	
	
	private AlquilerRepository alquilerRepository;
	
	@Test
	void contextLoads() {
		
		try {
			Habitacion pepe = new Habitacion();
			pepe.setId(1);
			pepe.setNumeroCamas(1);
			pepe.setDescripcion("quiero aprobar :v");
			pepe.setPrecio(200.5f);
			pepe.setObservacion("Buenas noches");
			
			Habitacion pepe1 = new Habitacion();
			pepe1.setId(2);
			pepe1.setNumeroCamas(2);
			pepe1.setDescripcion("quiero una habitacion doble :v");
			pepe1.setPrecio(300.5f);
			pepe1.setObservacion("Buenas dias");
			
			Habitacion pepe2 = new Habitacion();
			pepe2.setId(3);
			pepe2.setNumeroCamas(5);
			pepe2.setDescripcion("quiero una habitacion  :v");
			pepe2.setPrecio(300.5f);
			pepe2.setObservacion("Buenas tardes");
			
			pepe = habitacionRepository.save(pepe);
			pepe1 = habitacionRepository.save(pepe1);
			pepe2 = habitacionRepository.save(pepe2);
			
			
			
			//tipo
			
			Tipo tipo1 = new Tipo();
			tipo1.setId("T001");
			tipo1.setNombre("Basico");
			tipo1 = tipoRespository.save(tipo1);
			
			
			
			
			Tipo tipo2 = new Tipo();
			tipo2.setId("T002");
			tipo2.setNombre("Alta");
			tipo2 = tipoRespository.save(tipo2);
			
			
			//cliente
			Cliente cliente1 = new Cliente();
			cliente1.setDocumento("748515632");
			cliente1.setNombre("christian");
			cliente1.setFechaNacimiento(new Date(2019, 10, 12));
			cliente1.setLugarNacimiento("chorrillos");
			cliente1.setSexo('M');
			cliente1.setObservacion("Persona cool");
			
			
			//alquiler
			Alquiler alquiler1 = new Alquiler();
			alquiler1.setId(2);
			alquiler1.setPrecio(200f);
			alquiler1.setFechaEntrada(new Date(2019, 9, 9));
			alquiler1.setFechaSalida(new Date(2019, 9, 20));
			alquiler1.setEstado("activo");
			alquiler1.setObservacion("habitacion de dos plazas");
			
			alquiler1 = alquilerRepository.save(alquiler1);
			
			
			
			
			
			
			
			habitacionRepository.save(pepe);
			habitacionRepository.save(pepe1);
			tipoRespository.save(tipo1);
			tipoRespository.save(tipo2);
			alquilerRepository.save(alquiler1);
			
			
			
			
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
