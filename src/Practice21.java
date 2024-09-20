public class Practice21 {
    public static void main(String[] args){
        /* aさん用のオブジェクトの生成 */
        Employee a = new Employee();
        a.setId(100);    // aさん用のidを登録

        /* bさん用のオブジェクトの生成 */
        Employee b = new Employee();
        b.setId(200);    // bさん用のidを登録

        /* 両社員のidをそれぞれ取得し表示 */
        System.out.println("aさんのid：" + a.getId());    // aさんのidを取得し表示
        System.out.println("bさんのid：" + b.getId());    // bさんのidを取得し表示
    }
}

class Employee {
    int id;

    void setId(int i) {
        id = i;
    }

    int getId() {
        return id;
    }
}


