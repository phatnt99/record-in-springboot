package blog.home.taphng.recordspringboot.service;

import org.javatuples.Pair;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PageInfoService {

    public static void main(String[] args) {
        Map<String, Object> postInfoMap = new HashMap<>();
        postInfoMap.put("postNumber", 10);
        postInfoMap.put("postTitle", "Record in Spring Boot");

        System.out.println(postInfoMap.get("postTitle"));

        Pair<String, Integer> postInfoPair = Pair.with("Record in Spring Boot", 10);
        System.out.println(postInfoPair.getValue0());

        record PostInfo(String title, Integer number) {}
        PostInfo postInfoRecord = new PostInfo("Record in Spring Boot", 10);
        System.out.println(postInfoRecord.title);
    }
}
