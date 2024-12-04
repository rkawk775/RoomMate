package com.room.mate.service;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.room.mate.mapper.ExMapper;

//ExService 추상메소드 implements하기, @Service 어노테이션 붙이기
//ServiceImpl 은 DB와 백엔드를 연결시켜주는 중간 단계이다.
@Service
public class ExServiceImpl implements ExService{
    /*
    //써야하는 Mapper 연결시키기
    @Autowired
    ExMapper ExMapper;

    
       //찜 추가
     	@Override
	    public int addCart(CartVO cart) throws Exception{
            //0:등록 실패, 1: 등록 성공, 2: 등록된 데이터 존재, 5: 로그인 필요
            System.out.println("CartServiceImpl 까지는 왔음");
            
            //찜 데이터 체크
            CartVO checkCart = cartMapper.checkCart(cart);
            System.out.println(checkCart);
            
            if(checkCart != null) {
                return 2;
            }
            
            //찜 등록 & 에러 시 0 반환
            try {
                return cartMapper.addCart(cart);
            }catch(Exception e) {
                return 0;
            }
	    }
     */

}
