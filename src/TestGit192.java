public class TestGit192 {
    public static void main(String[] args){

        //同学们将自己的学号姓名当做参数，调用stuInfo函数，进行协同开发
        stuInfo("20199001","李四");
        //下面接龙同学们自己的代码修改
        stuInfo("19406040228","徐逸群");
        stuInfo("19406040219","胡智岚");
        stuInfo("19406040229","郭佳俊");
        stuInfo("19406040227","叶汪洋");
        stuInfo("19406040240","蔡名卓");
    }

    public static void stuInfo(String sid, String sname) {
        System.out.println("学号：" + sid + "姓名: " + sname);
    }
}