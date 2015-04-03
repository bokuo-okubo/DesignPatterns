#3.TemplateMethodsパターン

##3.1 TemplateMethodパターンとは

- TemplateMethodパターンは、テンプレートの機能を持つパターン。
    - スーパークラスで処理の枠組みを定め、サブクラスでその具体的内容を実装する。
    - superクラスでは、アルゴリズムの流れの中で利用される抽象的なメソッドと、この抽象的なメソッドを利用して、処理のアルゴリズムを定義するTemplateMethodメソッドを定義する。
    
##3.2サンプルケース
今回は、生徒たちに木版画を教える。
1. 版材を用意する
2. 版材となる板に絵を書く
3. 絵に合わせて版材を彫る
4. プリントする

abstract class WoodCutPrint

```
package com.bko.TemplateMethod;

/**
 * Created by bko on 4/3/15.
 */
public abstract class WoodCutprint {
    public abstract void draw( Cuttable hanzai );
    public abstract void cut( Cuttable hanzai);
    public abstract void print( Cuttable hanzai );
    public void createWoodCutPrint(){
        Wood hanzai = new wood(); //Wood クラスは、Cuttableインタフェイスを実装している
        draw( hanzai );
        cut( hanzai );
        print( hanzai );
    }
}

```

これでテンプレートは完成。

- テンプレートとなるWoodCutPrintクラスでは、抽象メソッドであるdeawメソッド、cutメソッド、printメソッドを定義している。
- createWoodCutPrintメソッドでは、「版材」となるCuttableインタフェイスを実装したhannzaiインスタンスを生成、自らのクラスで定義している中小メソッドを利用して、処理の流れを記述している。
- どのように絵を描いて、どのように　プリントするかは、全てこれを継承するサブクラスに任せられる。


public class TanakasWoodCutPrint extends woodCutPrint

```
public calass TanakasWoodCutPrint extends WoodCutPrint{
	public void draw( Cuttable hanzai ) {
		
	}
}
```

##まとめ
重要なのは、抽象クラス/インタフェイス を使っていること。ぼくはいつもベースクラスを作って継承してしまうから良くない。
使いドコロは、同じような処理があって、かつきちんとそのフローが見えているような場合。

 TODO: Objective-C, Rubyだとどうやるか？