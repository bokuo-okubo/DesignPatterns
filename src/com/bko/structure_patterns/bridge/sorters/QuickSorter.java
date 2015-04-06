package com.bko.structure_patterns.bridge.sorters;

/**
 * Created by bko on 4/6/15.
 */
public class QuickSorter extends SortImple {
    @Override
    public void sort(Object[] obj) {
        int[] ints = new int[obj.length];
        for(int n=0; n < obj.length; n++){
            ints[n] = (int)obj[n];
        }
        int[] answer = quickSorting(ints);
        for(int i=0; i < answer.length; i++){
//            System.out.println(answer[i]);
        }
    }

    /*
   * 軸要素の選択
   * 順に見て、最初に見つかった異なる2つの要素のうち、
   * 大きいほうの番号を返します。
   * 全部同じ要素の場合は -1 を返します。
   */
    int pivot(int[] a,int i,int j){
        int k=i+1;
        while(k<=j && a[i]==a[k]) k++;
        if(k>j) return -1;
        if(a[i]>=a[k]) return i;
        return k;
    }

    /*
     * パーティション分割
     * a[i]～a[j]の間で、x を軸として分割します。
     * x より小さい要素は前に、大きい要素はうしろに来ます。
     * 大きい要素の開始番号を返します。
     */
    int partition(int[] a,int i,int j,int x){
        int l=i,r=j;

        // 検索が交差するまで繰り返します
        while(l<=r){

            // 軸要素以上のデータを探します
            while(l<=j && a[l]<x)  l++;

            // 軸要素未満のデータを探します
            while(r>=i && a[r]>=x) r--;

            if(l>r) break;
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++; r--;
        }
        return l;
    }

    /*
     * クイックソート（再帰用）
     * 配列aの、a[i]からa[j]を並べ替えます。
     */
    public int[] quickSort(int[] a,int i,int j){
        if(i==j) return null;
        int p=pivot(a,i,j);
        if(p!=-1){
            int k=partition(a,i,j,a[p]);
            quickSort(a,i,k-1);
            quickSort(a,k,j);
        }
        return a;
    }

    /*
     * ソート
     */
    public int[] quickSorting(int[] a){
        int[] ary = quickSort(a,0,a.length-1);
        return ary;
    }
}
