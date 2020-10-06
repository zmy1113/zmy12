package zmy.AnimalManger;

public class AnimalManger1 {
    private String Animal_species;
    private String Animal_sex;
    private int Animal_age;

  public AnimalManger1(){}
  public AnimalManger1(String species ,String sex, int age)
  {//全参构造函数：动物的各种数据
      this.Animal_age=age;
      this.Animal_species=species;
      this.Animal_sex=sex;
  }

  public String getAnimal_species()   //获取动物种类
  {
   return Animal_species;
  }

  public void setAnimal_species(String species)   //创建动物种类
  {
      this.Animal_species=species;
  }

  public String getAnimal_sex()   //动物性别获取
  {
      return Animal_sex;
  }

  public void setAnimal_sex(String sex)   //动物性别创建
  {
      this.Animal_sex=sex;
  }

  public int getAnimal_age()
  {
      return Animal_age;
  }

  public void setAnimal_age(int age)
  {
      this.Animal_age=age;
  }
}
