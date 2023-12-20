package demo.other;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Alex
 * @date: 2023/9/20 上午9:31
 * @Descprition: 图床迁移
 */
public class PictureBed {

    /**
     * github 图床迁移到 gitee 图床
     */
    public static List<String> githubToGitee(List<String> githubImgUrls) {

        String giteeUrl = "https://gitee.com/JadePanda/picture-bed/raw/main";
        String githubUrl = "https://cdn.jsdelivr.net/gh/alex-oos/picture-bed";


        List<String> giteeUrls = githubImgUrls.stream().map(e -> e.replace(githubUrl, giteeUrl)).collect(Collectors.toList());


        return giteeUrls;

    }

    public static void main(String[] args) {

        List<String> githubImgUrlList = new ArrayList<>();
        githubImgUrlList.add("![202310171717103.png](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notbook/202310171717103.png)");
        githubImgUrlList.add("![202310171631486.png](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notbook/202310171631486.png)");
        githubImgUrlList.add("![202310171607135.png](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notbook/202310171607135.png)");
        githubImgUrlList.add("![image-20231017173106659.png](https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notbook/image-20231017173106659.png)");


        // String githubImgUrl = "https://cdn.jsdelivr.net/gh/alex-oos/picture-bed/img/notbook/202310171717103.png";
        List<String> strings = githubToGitee(githubImgUrlList);
        strings.forEach(System.out::println);


    }

}
