#5.Singletonパターン

##5.1 Singletonパターンとは
- singletonとは、一枚札のこと。トランプの一組に唯一のカードのこと。
- Singletonパターンは、唯一性を保証する  
  
<br>

- あるクラスのインスタンスがひとつしかないことを保証したい場合がある。
- 注意深く設計すれば、唯一のインスタンスを使いまわすことは可能だろうが、このインスタンスが唯一であることを保証するものではない。

- Singletonパターンは、コンスタラクタをprivateとすることで、他クラスから新たにインスタンスが生成されないような構造とし、インスタンスの生成を制御する。

##5.2 サンプルケース

- サンプルケースでは、図書館の貸出超を考える。  
- 図書の貸出にあたって、その貸出超がいくつあるのかわからないような状態では、管理がとてもむずかしくなる。  
- 貸出帳はひとつにしたいよね


class RegisterNote

```
public class RegisterNote{
    private static RegisterNote registerNote = new RegisterNote();
    private RegisterNote(){}
    public static RegisterNote getInstance(){
        return registerNote;
    }
}

```

- Singletonパターンはひとつのクラスで構成される
- 上記RegisterNoteをシングルトンにしよう

class RegisterNote (Singleton Version)

```
public class RegisterNote{
    private static RegisterNote registerNote = new RegisterNote(); ①
    private RegisterNote(){}
    public static RegisterNote getInstance(){
        return registerNote;
    }
}
```

- ①まず注目すべき点は、コンストラクタの識別子がprivateになっていること。
	- RegisterNoteのインスタンスを外部から生成することができない。
	- RegisterNoteクラスのインスタンスが欲しいときは、
	- ```RegiseterNote note ~ RegisterNote.getInstance();```とするしかない。
	
	
###クラス図


	








