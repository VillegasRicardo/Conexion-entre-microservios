package venta.venta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import venta.venta.entity.Producto;
import venta.venta.service.VentaService;


@RestController
@RequestMapping("/v1/ventas")
public class VentaController {

	@Autowired
	private VentaService serviceVentana;
	
	
		//R		
		@GetMapping()
		public ResponseEntity<List<Producto>> getALL() {
			return new ResponseEntity<>(serviceVentana.buscarTodos(),HttpStatus.OK);
			
		}
			
}
