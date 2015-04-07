#Strategyパターン
## 10.1 Strategyパターンとは

- Strategyとは英語で戦略
	- 戦略の切り替え、追加が簡単に行えるようになる。
	

普通にプログラミングしていると、メソッドの中に溶け込んだ形でアルゴリズムを実装してしまうことがよくある。
if文などで分岐させることでアルゴリズムを変更するような方法

Strategyパターンは、戦略の部分を意識して別クラスとして作成するようにする。

戦略×部分を別クラスとして作成しておき、戦略を変更したい場合には、利用する戦略クラスを変更する、という方法で対応する。

 Strategyパターンを利用することで、メソッドの中に溶け込んだ形のアルゴリズムより柔軟でメンテナンスしやすい設計となる。
 
 
 ##10.2 サンプルケース
 
 状況に応じてアルゴリズムを変えなkればならないことは多々ある。
 例えばゲームのプログラムでは、何どの設定によって、戦略アルゴリズムを変える必要がある。
 ここでは簡単に、大小の比較を行うアルゴリズムを考える。
 
 まず、人間を表すHumanクラスを作成する。
 
 Humanクラスは、名前、身長、体重、年齢の4つのパラメタを持つものとする。
 
 
 ```
 public class Human{
 
    public String name;
    public int height = -1;
    public int weight = -1;
    public int age = -1;
 
    public Human(String name,int height,int weight,int age){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
}
 ```