package venta.venta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import venta.venta.entity.Producto;
import venta.venta.repository.VentaFeignClient;



@Service
@RequiredArgsConstructor
public class VentaService {

	@Autowired
	private VentaFeignClient FeignClientProducto;
	
	//R	- OK
			public List<Producto> buscarTodos() {
				return FeignClientProducto.getProductos();
			}
	
}
