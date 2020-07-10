# datastructures-algorithms

### 介绍
数据结构包括:线性结构和非线性结构

#### 线性结构
1) 线性结构作为最常用的数据结构，其特点是数据元素之间存在一对一的线性关系
2) 线性结构有两种不同的存储结构，即顺序存储结构(数组)和链式存储结构(链表)。顺序存储的线性表称为顺序表，顺序表中的存储元素是连续的
3) 链式存储的线性表称为链表，链表中的存储元素不一定是连续的，元素节点中存放数据元素以及相邻元素的地址信息
4) 线性结构常见的有:数组、队列、链表和栈，后面我们会详细讲解.
#### 非线性结构
非线性结构包括：二维数组，多维数组，广义表，树结构，图结构

### 模块结构
data-structures 数据结构部分
algorithms 算法部分

### 代码概览
#### 数据结构模块
| 类 | 介绍 | 功能 |
|:-----:|:-----:|:-----|
| SparseArray | 稀疏数组 | 1、使用稀疏数组，来保留棋盘、地图等二维数组；<br/> 2、将稀疏数组重新恢复原来的二维数组 |
| ArrayQueue | 数组模拟队列 | 1、使用数组模拟一个队列的基本功能；<br/> 2、接收用户的输入验证模拟队列功能
| SingleLinkedList | 单向链表 | 1、模拟一个带head头的单向链表；<br/> 2、通过链表实现对水浒英雄排榜的管理
| DoubleLinkedList | 双向链表 | 1、模拟一个带head头的双向链表；<br/> 2、通过链表实现对水浒英雄排榜的管理
| CircleSingleLinkedList | 单向环形链表 | 使用单向环形链表解决约瑟夫环问题
| ArrayStack | 栈 | 使用数组模拟栈的基本功能
| Calculator | 综合计算器 | 使用模拟的栈来实现中缀表达式的计算器
| PolandNotation | 逆波兰表达式计算器 | 1、通过栈实现逆波兰表达式计算器；<br/> 2、支持小括号和多位数整数，不支持小数；<br/> 3、支持中缀表达式转后缀表达式
| Recursion | 递归 | 1、打印问题；<br/> 2、阶乘问题
| MiGong | 迷宫 | 通过递归解决迷宫问题
| Queen8 | 8皇后 | 通过递归解决8皇后问题
| HashTableDemo | 哈希表 | 通过数组加链表实现一个哈希表，创建一个简单的员工管理系统 
| BinaryTreeDemo | 二叉树 | 1、实现一个二叉树 <br/> 2、通过二叉树对人物进行管理
| ArrBinaryTreeDemo | 顺序存储二叉树 | 通过数组模拟二叉树
| ThreadedBinaryTreeDemo | 线索化二叉树 | 线索化二叉树
| HuffmanTree | 赫夫曼树 | 赫夫曼树
| HuffmanCode | 赫夫曼编码 | 1、实现赫夫曼编码 <br/> 2、通过赫夫曼编码实现对文件的解压缩
| BinarySortTreeDemo | 二叉排序树 | 1、创建二叉排序树 <br/> 2、二叉排序树节点的新增和删除
| AVLTreeDemo | 平衡二叉树 | 1、创建平衡二叉树 <br/> 2、平衡二叉树的新增和删除
| Graph | 图 | 图
#### 算法模块
| 类 | 介绍 | 功能 |
|:-----:|:-----:|:-----|
| BubbleSort | 冒泡排序 | 冒泡排序
| SelectSort | 选择排序 | 选择排序
| InsertSort | 插入排序 | 插入排序
| ShellSort | 希尔排序 | 希尔排序
| QuickSort | 快速排序 | 快速排序
| MergeSort | 归并排序 | 归并排序
| RadixSort | 基数排序 | 基数排序
| SeqSearch | 线性查找 | 线性查找
| BinarySearch | 二分查找 | 二分查找
| InsertValueSearch | 插值查找 | 插值查找
| FibonacciSearch | 斐波那契查找 | 斐波那契查找
| HeapSort | 堆排序 | 堆排序
| BinarySearchNoRecur | 二分查找非递归 | 二分查找非递归
| HannuoTower | 汉诺塔 | 汉诺塔的移动的方法，使用分治算法
| KnapsackProblem | 背包问题 | 动态算法，背包问题
| ViolenceMatch | 暴力匹配算法 | 暴力匹配算法
| KmpAlgorithm | KMP算法 | KMP算法
| GreedyAlgorithm | 贪心算法 | 贪心算法
| PrimAlgorithm | 普利姆算法 | 普利姆算法
| KruskalCase | 克鲁斯卡尔算法 | 克鲁斯卡尔算法
| DijkstraAlgorithm | 迪杰斯特拉算法 | 迪杰斯特拉算法
| FloydAlgorithm | 弗洛伊德算法 | 弗洛伊德算法
| HorseChessboard | 骑士周游算法 | 骑士周游算法
