package com.wzy.service.combine;


import com.wzy.entity.dto.MainPageInfoDTO;
import com.wzy.entity.dto.Result;

public interface HeadLineShopCategoryCombineService {
    Result<MainPageInfoDTO> getMainPageInfo();
}
