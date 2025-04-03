package org.nonage.service;

import org.nonage.domain.ProductVO;

import java.util.ArrayList;

public interface ProductService {

    public ArrayList<ProductVO> getProductList (int page, int limit);

    public void insert (ProductVO product);

    public void modify (ProductVO product);

    public ProductVO getDetail (int pseq);

    public ArrayList<ProductVO> getNewList();

    public ArrayList<ProductVO> getBestList();

    public ArrayList<ProductVO> getKindList(String kind);

}
