package day4.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor		//json 을 자바객체로 매핑할 때 필요합니다.
@EqualsAndHashCode
public class ProductDto {
    private String pcode;
	private String category;
	private String pname;
	private int price;
    
    @Override
    public String toString() {
        return String.format("\n %6s %15s %40s\t %,8d ", 
                            category,pcode,pname,price);
    }

    
}
