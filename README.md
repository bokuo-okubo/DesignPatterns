##目的
- デザインパターンを学ぶ。
- ついでにJavaも復習する。


##目標
- 21個のパターンについて、名前と使い方を漠然と覚える。
- indexをはる。概念だけ掴んで、RubyやObjective-Cにどう移植できるのか、考える。

参考にしたもの
[http://www.techscore.com/tech/DesignPattern/Iterator/Iterator2.html/](http://www.techscore.com/tech/DesignPattern/Iterator/Iterator2.html/)


###目録

####生成に関するパターン
1. [AbstractFactory]

2. [Builder](./assets/mds/builder.md)
	- 複合化されたインスタンスの生成過程を隠蔽する。

3. [FactoryMethod](./assets/mds/FactoryMethod.md)
	- 実際に生成されるインスタンスに依存しない、インスタンスの生成方法を提供する

4. [Prototype](./assets/mds/prototype.md)
	- 同様のインスタンスを生成するために、原型のインスタンスを複製する
5. [Singleton](./assets/mds/Singleton.md)
	- あるクラスについて、そのインスタンスが単一であることを保証する

####構造に関するパターン
6. [Adapter](./assets/mds/Adapter.md)
	- もともと関連性の無い２つのクラスを接続するクラスを作る。
7. [Bridge]
8. [Composite]
9. [Decorator]
10. [Facade]
11. [Flyweight]
12. [Proxy]

####振る舞いに関するパターン
13. [Chain of Responsibility]
14. [Command]
15. [Interpreter]
16. [Itarator](./assets/mds/Iterator.md) 
	- 複数の要素を内包するオブジェクトの全ての要素に順にアクセスする方法を提供する。
17. [Mediator]
18. [Memento]
19. [Observer]
20. [State]
21. [Strategy]
22. [TemplateMethod](./assets/mds/TemplateMethod.md)
	- あるアルゴリズムの途中経過で必要な処理を抽象メソッドに委ね、その実装を変えることで処理が変えられるようにする。
23. [Visitor]

