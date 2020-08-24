package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 이승환
 * @since 2020-08-24
 */
@Getter
@Setter
public class BookForm {

    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    private String author;
    private String isbn;

}
