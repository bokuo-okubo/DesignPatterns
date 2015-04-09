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
1. [AbstractFactory](./assets/mds/abstract_factory.md)
	- 関連する一連のインスタンスを状況に応じて適切に生成する方法を提供する。

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
7. [Bridge](./assets/mds/bridge.md)
	- クラスなどの実装と、呼び出し側の間の橋渡しをするクラスを用意し、実装を隠蔽する。
8. [Composite](./assets/mds/composite.md)
	- 再帰的な構造を表現する。
	
9. [Decorator](./assets/mds/decorator.md)
	- あるインスタンスに対し、動的に付加機能を追加する。Filterとも呼ばれる。
10. [Facade](./assets/mds/facade.md)
	- 複数のサブシステムの窓口となる共通のインターフェイスを提供する
11. [Flyweight]
12. [Proxy]

####振る舞いに関するパターン
13. [Chain of Responsibility](./assets/mds/chain_of_responsibility.md)
	- イベントの送受信を行う複数のオブジェクトを鎖状につなぎ、それらの間をイベントが渡されていくようにする。
14. [Command]
15. [Interpreter]
16. [Itarator](./assets/mds/Iterator.md) 
	- 複数の要素を内包するオブジェクトの全ての要素に順にアクセスする方法を提供する。
17. [Mediator](./assets/mds/mediator.md)
	- オブジェクト間の相互作用を仲介するオブジェクトを定義し、オブジェクト間の結合度を低くする。
18. [Memento]
19. [Observer]
20. [State]
21. [Strategy](./assets/mds/strategy.md)
	- データ構造に対して適用する一連のアルゴリズムをカプセル化し、アルゴリズムの切り替えを容易にする
22. [TemplateMethod](./assets/mds/TemplateMethod.md)
	- あるアルゴリズムの途中経過で必要な処理を抽象メソッドに委ね、その実装を変えることで処理が変えられるようにする。
23. [Visitor](./assets/mds/visitor.md)
	- データ構造を保持するクラスと、それに対して処理を行うクラスを分離する。

