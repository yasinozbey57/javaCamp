package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
public class Category {
	
	@Id
	@Column(name = "category_id")
	private int categoryId;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@OneToMany(mappedBy = "categories")
	private List<Product> products;
}
