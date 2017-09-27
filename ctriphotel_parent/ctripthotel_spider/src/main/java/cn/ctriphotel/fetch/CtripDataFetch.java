package cn.ctriphotel.fetch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hr on 2017/9/27.
 * 携程酒店数据来源的爬虫抽取
 */
@RestController
public class CtripDataFetch {

    @RequestMapping("/index")
    public String toIndex(){
        return "Hello World!";
    }





}
