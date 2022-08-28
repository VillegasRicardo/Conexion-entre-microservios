package venta.venta.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Producto {

	private Integer idproducto;
		
	private Categoria idcategoria;
	
	private String lote;
	
	private LocalDate fechaCaduca;

	/**
	 * @return the idproducto
	 */
	public Integer getIdproducto() {
		return idproducto;
	}

	/**
	 * @param idproducto the idproducto to set
	 */
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	/**
	 * @return the idcategoria
	 */
	public Categoria getIdcategoria() {
		return idcategoria;
	}

	/**
	 * @param idcategoria the idcategoria to set
	 */
	public void setIdcategoria(Categoria idcategoria) {
		this.idcategoria = idcategoria;
	}

	/**
	 * @return the lote
	 */
	public String getLote() {
		return lote;
	}

	/**
	 * @param lote the lote to set
	 */
	public void setLote(String lote) {
		this.lote = lote;
	}

	/**
	 * @return the fechaCaduca
	 */
	public LocalDate getFechaCaduca() {
		return fechaCaduca;
	}

	/**
	 * @param fechaCaduca the fechaCaduca to set
	 */
	public void setFechaCaduca(LocalDate fechaCaduca) {
		this.fechaCaduca = fechaCaduca;
	}

	
	
	
	
}
