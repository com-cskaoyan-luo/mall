package com.cskaoyan.mall.controller.xw;

import com.cskaoyan.mall.bean.BaseRespModel;
import com.cskaoyan.mall.mapper.GoodsMapper;
import com.cskaoyan.mall.service.lxt.BrandService;
import com.cskaoyan.mall.service.lxt.CategoryService;
import com.cskaoyan.mall.service.wjw.AdService;
import com.cskaoyan.mall.service.wjw.CouponService;
import com.cskaoyan.mall.service.wjw.GroupRuleService;
import com.cskaoyan.mall.service.wjw.GrouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("wx/home")
public class WxHomeController {
    @Autowired
    AdService adService;
    @Autowired
    BrandService brandService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    CouponService couponService;
    @Autowired
    GroupRuleService groupRuleService;

    @RequestMapping("index")
    public BaseRespModel homeShow(){
        BaseRespModel resp = new BaseRespModel();
        try {
            HashMap data = new HashMap();
            data.put("banner",adService.selectList(null,null));
            data.put("brandList",brandService.getBrandList(1,4,"id","desc",null,null));
            data.put("channel",categoryService.getFirstCategory());
            data.put("couponList",couponService.selectLimitList(4,"id","desc"));
            data.put("floorGoodsList",null);//新建bean
            data.put("grouponList",groupRuleService.getLimitList(4,"id","desc"));//等
            data.put("hotGoodsList",null);
            data.put("newGoodsList",null);
            data.put("topicList",null);//肖旺写
            resp.setData(data);
            resp.setErrmsg("成功");
            resp.setErrno(0);
        }catch (Exception e){
            resp.setErrno(1);
            resp.setErrmsg("失败");
        }
        return resp;
    }

}
