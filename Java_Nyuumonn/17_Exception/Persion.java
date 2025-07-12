public class Persion {
    int age;
    public void setAge(int age){
        if(age<0){
            throw new IllegalArgumentException(
                "年齢は0以上の数を設定すべきです。指定値＝" + age
            );
        } else {
            this.age = age;
        }
    }
}
