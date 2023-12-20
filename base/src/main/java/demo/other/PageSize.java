package demo.other;

/**
 * <P>
 * 分页计算总的数量
 * </p>
 *
 * @author Alex
 * @since 2023/12/5 上午9:59
 */
public class PageSize {

    // 手动分页查询，计算总的数量
    public static void function() {

        int total = 18;
        int i = (int) Math.ceil((double) total / 5);

        System.out.println(i);
        for (int j = 0; j < i; j++) {
            System.out.println("第" + (j + 1) + "页");
            if (total - 5 > 0) {
                total -= 5;
                System.out.println("剩余" + total);
            } else {
                System.out.println("剩余" + total);
            }
        }
    }


    public static void function2() {
        // 查询出来的总的数量
        int total = 18;
        // 分页大小
        int pageSize = 5;
        // 分页数量
        int pageNum = (int) Math.ceil((double) total / 5);
        System.out.println("总页数: " + pageNum);

        int currentPage = 1;
        while (total > 0) {
            // System.out.println("第" + currentPage + "页");
            int currentSize = Math.min(total, pageSize);
            // System.out.println("");
            System.out.println("第" + currentPage + "页,数量为：" + currentSize);
            total -= currentSize;
            System.out.println("剩余条目数:" + total);
            currentPage++;


        }

    }

    public static void main(String[] args) {

        function2();

    }


}
