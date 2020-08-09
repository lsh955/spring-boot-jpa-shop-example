package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

/**
 * @author 이승환
 * @since 2020-08-09
 */
@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

}
