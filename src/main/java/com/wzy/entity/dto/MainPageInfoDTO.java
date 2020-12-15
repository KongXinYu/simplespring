package com.wzy.entity.dto;


import com.wzy.entity.bo.HeadLine;
import com.wzy.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

@Data
public class MainPageInfoDTO {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoryList;
}
