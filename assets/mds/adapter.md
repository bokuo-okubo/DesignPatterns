#2. Adapterパターン

##2.1 Adapterパターンとは

- adaptとは適合させるという意味
- Adapterパターンは、インタフェイスに互換性の無いクラス同士を組み合わせることを目的としたパターン。

- 例えば、これまで利用していたメソッドと同じ機能を、より優れた形で提供するメソッドを持つクラスの存在を知ったとする

	- しかし、この優れたメソッドは、これまで医療していたメソッドとは異なるインタフェイスを持つため、乗り換えると多大な変更を余儀なくされる場合がある。
	- こんなとき、この２つのメソッドのインタフェイスの違いを吸収してやるAdapterを準備することで、少ない変更で新しいメソッドに乗り換えることができる。
	- このような目的を果たすためAdapeterパターンでは、2つの方法を与えている。
		- 継承を利用した方法
		- 移譲を利用した方法
		
##2.2 サンプルケース1 (継承を利用したAdapterパターン)
あなたは、相変わらず学校の先生をしている。

class Taro

```
public class Taro{
	public void enjoyWithClassmate(){
		System.out.println("みんなで楽しむ");
	}
}
```

interface Chairperson

```
public interface Chairperson{
	 public void organizeClass();
}
```

class Teacher

```
public class Teacher{
	 public static void main(String args[]){
	 	Chairperson chairperson = new Taro();
	 	chairperson.organizeClass();
	 }
}
```

![adapter1.gif](../img/adapter/adapter1.gif)



