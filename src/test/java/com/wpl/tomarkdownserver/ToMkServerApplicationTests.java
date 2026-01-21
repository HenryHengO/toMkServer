package com.wpl.tomarkdownserver;

import cn.hutool.http.HttpUtil;
import com.wpl.tomarkdownserver.entity.MarkDown;
import com.wpl.tomarkdownserver.model.WebSiteContent;
import com.wpl.tomarkdownserver.service.ResolveService;
import jakarta.annotation.Resource;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class ToMkServerApplicationTests {

    @Test
    void testLinuxDo() {
        MarkDown markDown = new MarkDown();

        markDown.setBlogUrl("https://linux.do/t/topic/376081");
//        markDown.setBlogUrl("https://linux.do/t/topic/312506");

        WebSiteContent webSiteContent = ResolveService.get(markDown);
        System.out.println(webSiteContent.getContent());
    }
    @Test
    void testLinuxDoDown() {
        String str = "https://linux.do/t/topic/310029";

        Map<String, Object> headers = new HashMap<>();
        headers.put("cookie", "_ga=GA1.1.334287831.1734866505; __stripe_mid=30d4a008-d1c9-476a-bcc8-329b6365fa5de6500f; fp=daa542b44a631c79f753d1fbd49e7993; theme_ids=1%7C0; __stripe_sid=ea17c745-f7fd-469f-9af8-d9d764209e910e8b54; _t=k34umhHqmSjiGfqyW6tUu%2FM5yyxCim%2BJxKRNKgIAa5FJKMcXyIq0T0LqKLW3l0mweJsrKniKsCiTBNJhMNjBj2%2BwfCIlfYLbJXMrMwbP1%2BL7F8bmnXoGWXwAcpPurI%2F%2B4DmFeZEkkzIQ9Zh45jCIty%2BeqThjDZSlqbsCG%2FoASdG7s6Gg1Zic%2Bf%2BFqqcjBUvv943b3oZtXRy%2B4E5mpBgjkCS2rBuD35A0WrgNzWw9gJeutTSPLE8E%2BkrM1137jL39Ae1IizaAew%2FR4AVVeQU0WPHSyDmWPrNcUDBV7h7OL08MOK6bizD6Lbmdhec%3D--8b8XBlX5FYOkC5Kq--qkCU12ZfhCcrzWgnpaargQ%3D%3D; cf_clearance=TAI1nCi_oFZ7NHhxRRD8U2Tk7H9wge1KG5MXa5alGgs-1737479040-1.2.1.1-A9B5SFk498T9B8vxSU6FSgtNEI4BI1KJbOJF_4xGodAy_macicm1TyW..RYl8oA_n_PBS4SrcWvu84zHtK0mcyZ2mdXLzMZCqQOeyry_APNltncrjcwAZ6qYM.i3T820VkirnnxMVR8SCjyWryFw6QOTyVQWuCLNut7alc4F8rYvBP3MwLWNQ6SFRZZ2IkLZabRofFBuXPSkF0Mvsgf5isSR61m9JPmRYcx20nnDRub5ieEgB0w1qQMH9mn2PYir2hEuGyiqRrSx8OyRqHMH1FU083f8l_34FLRK9ToyBPC_8yuqxwa79vqxFH2REaTRjNzz1DCMHPX_XuwugcXK9w; _forum_session=ZniGgKRs4lMtVuo0iw%2Bo0vFNN%2BwtyhzXkfiYKz7ziOqxXkSErj5OS0i9ax17dBzQfXH8J5F6wlxS2qU%2B0as2Q4noaK4k8VfAc28tEbFgUiHa5FMr84RhGgxW3GNhhrwJO6ffd5y3HVrn0DGDsXyDrzgJ70Vg6q9koDr0NqMkm1AcZOODV2OLqEyBTkojIKDRJadRQBBTUJGAra48CLp4QoB%2B6jaGoWCCcgADMu%2BsnqDqpHspBYMs%2BmWys4NCtIETmcJvxDBMSxkwyiPplYOr13QxpAloTw%3D%3D--4LqOt%2Fe2V94i8gbi--0Ln%2BVxme26Okf%2BVYko%2FFZQ%3D%3D; _ga_1X49KS6K0M=GS1.1.1737478072.49.1.1737479083.0.0.344782698");
        String string = HttpUtil.get(str, headers);
        Document parse = Jsoup.parse(string);

        System.out.println(parse);
    }

    @Test
    void testV2ex() {
        MarkDown markDown = new MarkDown();

        markDown.setBlogUrl("https://www.v2ex.com/t/1103477");

        WebSiteContent webSiteContent = ResolveService.get(markDown);
        System.out.println(webSiteContent.getContent());
    }
}
