package venta.venta.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import venta.venta.configuration.FeignClientConfig;
import venta.venta.entity.Producto;


@FeignClient(name = "GESTOR-PRODUCTOS", url = "${external.api.base-url}", configuration = FeignClientConfig.class)
public interface VentaFeignClient {
	
	@GetMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	List<Producto> getProductos();
		
}
