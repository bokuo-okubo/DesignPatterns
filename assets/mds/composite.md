#11. Compositeパターン

##11.1 Compositeパターンとは
- Compositeとは、英語で複合物を意味することば。

Compositeでは、「容器と中身を同一視する」ことで、再帰的な構造の取り扱いを容易にするもの。

「容器と中身を同一視する」必要が生じる例として、ファイルシステムなどがあげられる。

あるフォルダ以下のファイルやフォルダを全て削除したい場合など、それがファイルなのかフォルダなのかを意識せずに、同じように削除できたほうが都合が良いだろう。


##11.2 サンプルケース
サンプルケースでは、ディレクトリとファイルを考える。

まずは、Compositeパターンを意識せずに、ファイルとディレクトリを表すクラスを作成してみよう。

```
package com.bko.structure_patterns.composite;

/**
 * Created by bko on 4/8/15.
 */
public class File {
    private String name = null;
    public File(String name){
        this.name = name;
    }

    public void remove(){
        System.out.println(name + "を削除しました。");
    }

}

```

ディレクトリを表す、Dirctoryクラスは、Listオブジェクトとして、配下のディレクトイrとファイルのオブジェクトを管理し、removeメソッドが呼ばれた場合には、list に保持しているオブジェクトをすべて削除してから、自らを削除するものとする。


```
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
 
 
public class Directory{
    private List<Object> list = null;
    private String name = null;
    public Directory(String name){
        this.name = name;
        list = new ArrayList<Object>();
    }
    public void add(File file){
        list.add(file);
    }
    public void add(Directory dir){
        list.add(dir);
    }
    public void remove(){
        Iterator<Object> itr = list.iterator();
        while(itr.hasNext()){
            Object obj = itr.next();
            if(obj instanceof File){
                ((File)obj).remove();
            }else if(obj instanceof Directory){
                ((Directory)obj).remove();
            }else{
                System.out.println("削除できません");
            }
        }
        System.out.println(name + "を削除しました。");
    }
}
```
[ジェネリクスとは](./generics.md)

ディレクトリのremove メソッドが呼ばれると、listに保持しているおbジェクトがfileクラスであるのかdirクラスであるのかチェックして、各クラスにキャストしてからそれぞれのremoveメソッドを呼び出すようにしている。

![composite1](../img/composite/composite1.gif)

 上記の２つのファイルを使って、以下のようなファイル構造を記述して、削除してみよう。

![composite2](../img/composite/composite2.gif)




```

```