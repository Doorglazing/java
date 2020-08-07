public class LinearList {
    // 由n>=0所构成的有限序列.
    // n为线性表的长度 n = 0时为空表
    // i为a[i]的序列号
    //线性的特点 ： 有且仅有一个第一个元素和最后一个元素
    // 有且仅有一个前驱和后继
    // [[数据域Object(变量)],[指针域Node(变量)]]
    public class Node{
        public Object data; //存放节点值
        public Node next; //后继节点的引用
        public Node(){
            this(null, null);
        }
        public Node(Object o, Object o1) {

        }

    }
}
