package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.Producto;
import com.uce.edu.demo.bodega.repository.IProductoRepository;

@Service
public class GestorInventarioService implements IGestorInventarioService {

	@Autowired
	private IProductoRepository productoRepository;


	@Override
	public void reporteInv(LocalDateTime fechaBusqueda) {

		// this.inventarioService.buscar(fechaBusqueda);
		List<Producto> listaProducto = this.productoRepository.buscar(fechaBusqueda);
		List<Producto> listaFiltrada = new ArrayList<>();

		for (Producto t : listaProducto) {
			if (t.getFechaIngreso().isAfter(fechaBusqueda)) {

				BigDecimal pc = t.getPrecioCompra();
				BigDecimal pv = pc.add(pc.multiply(new BigDecimal(0.1))).add(pc.multiply(new BigDecimal(0.12)))
						.setScale(2, RoundingMode.UP);
				t.setPrecioCompra(pv);
				listaFiltrada.add(t);
			}
		}
		mostrar(listaFiltrada);

	}

	public void mostrar(List<Producto> listProduc) {
		for (Producto p : listProduc) {
			System.out.println(p.getNombreProducto() + " -- " + p.getCantidad() + " - $" + p.getPrecioCompra() + " - "
					+ p.getFechaIngreso());

		}

	}

}
