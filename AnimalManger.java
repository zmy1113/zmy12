package zmy.AnimalManger;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalManger {
    public static void main(String[] args) {
        while (true) {
            System.out.println("======欢迎使用动物管理系统=======");
            System.out.println("输入1查看动物信息");
            System.out.println("输入2添加动物信息");
            System.out.println("输入3删除动物信息");
            System.out.println("输入4修改动物信息");
            System.out.println("输入5退出系统");
            Scanner sc = new Scanner(System.in);
            String st = sc.nextLine();
            switch (st) {
                case "1":
                    showAnimal(array);
                    break;
                case "2":
                    addAnimal(array);
                    break;
                case "3":
                    remove(array);
                    break;
                case "4":
                    change(array);
                    break;
                case "5":
                    System.out.println("欢迎下次使用");
                    System.exit(0);
                    break;
                default:
                    System.out.println("谢谢使用");
                    break;
            }
        }
    }

    static ArrayList<Animal> array = new ArrayList<>();

    public static void showAnimal(ArrayList<Animal> array) {//判断集合是否有动物信息
        if (array.size() == 0) {
            System.out.println("对不起，目前没有动物信息");
            return;
        }
        System.out.println("种类\t\t\t性别\t\t\t年龄");
        for (Animal am : array) {
            System.out.println(am.getAnimal_species() + "\t\t\t" + am.getAnimal_sex() + "\t\t\t" + am.getAnimal_age());
        }

    }

    public static void addAnimal(ArrayList<Animal> array) {
        int a = 0;//作为检验是否重复的标志
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入新的种类");
        String species = sc.nextLine();
        //与已经添加的集合元素进行对比，如果相同则输出相应内容
        for (Animal am1 : array) {
            if (am1.getAnimal_species().equals(species))//元素的species变量与刚获取的变量利用方法进行对比
            {
                System.out.println("该种类已经存在，请重新输入");
                a++;//重复，检验标志自加
                break;
            }
        }
        if (a == 0) {
            System.out.println("请输入新动物性别：");
            String sex1 = sc.nextLine();
            System.out.println("请输入新动物年龄：");
            int Sage = sc.nextInt();
            Animal am2 = new Animal();
            am2.setAnimal_species(species);
            am2.setAnimal_sex(sex1);
            am2.setAnimal_age(Sage);
            array.add(am2);
            System.out.println("添加成功");
        }

    }

    public static void remove(ArrayList<Animal> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的动物种类");
        String species = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Animal am = array.get(i);
            if (am.getAnimal_species().equals(species)) {
                array.remove(i);
                System.out.println("删除成功");
                break;
            } else if (i == array.size() - 1) {
                System.out.println("查无此类，请重新输入");
                remove(array);
            }
        }
    }

    public static void change(ArrayList<Animal> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的动物的种类");
        String species = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Animal am1 = array.get(i);
            if (am1.getAnimal_species().equals(species)) {
                System.out.println("请输入想要修改的内容：");
                System.out.println("1 种类");
                System.out.println("2 性别");
                System.out.println("3 年龄");
                String p = sc.nextLine();
                System.out.println("请出入修改后的内容");
                String date = sc.nextLine();
                int sage = sc.nextInt();
                switch (p) {
                    case "1":
                        am1.setAnimal_species(date);
                        System.out.println("修改成功");
                        break;
                    case "2":
                        am1.setAnimal_sex(date);
                        System.out.println("修改成功");
                        break;
                    case "3":
                        am1.setAnimal_age(sage);
                        System.out.println("修改成功");
                        break;
                    default:
                        break;
                }
                break;
            } else if (i == array.size() - 1) {
                System.out.println("没有找到该种类，请重新输入");
                change(array);
            }
        }

    }
}


