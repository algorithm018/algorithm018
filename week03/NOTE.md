学习笔记

# 递归代码模板

```python
# Python
def recursion(level, param1, param2, ...): 
    # recursion terminator 
    if level > MAX_LEVEL: 
	   process_result 
	   return 
    # process logic in current level 
    process(level, data...) 
    # drill down 
    self.recursion(level + 1, p1, ...) 
    # reverse the current level status if needed
```

```java
// Java
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}
```

```cpp
// C/C++
void recursion(int level, int param) { 
  // recursion terminator
  if (level > MAX_LEVEL) { 
    // process result 
    return ; 
  }

  // process current logic 
  process(level, param);

  // drill down 
  recursion(level + 1, param);

  // reverse the current level status if needed
}
```

```javascript
// JavaScript
const recursion = (level, params) =>{
   // recursion terminator
   if(level > MAX_LEVEL){
     process_result
     return 
   }
   // process current level
   process(level, params)
   //drill down
   recursion(level+1, params)
   //clean current level status if needed
   
}



```

## 回溯于递归

### 维基百科中的定义
    回溯算法： 采用试错的思想，它尝试分步的去解决一个问题。在分步解决问题的过程中，当它通过尝试发现现有
    的分步答案不能得到有效的正确的解答的时候，它将取消上一步甚至是上几步的计算，在通过其他的可能的分步
    解答再次尝试寻找问题的答案。回溯法通常用最简单的递归方法来实现，在反复重复上述的步骤后可能出现两种情况：
    1 找到一个可能存在的正确的答案
    2 在尝试了所有可能的分步方法后宣告该问题没有答案
    
    深度优选搜素算法 是一种用于遍历或搜素树或图的算法。这个算法会尽可能深的搜素树的分支。当节点 v 的所
    在边都已被探寻过，搜素将回溯到发现节点v的那条边的起点。这一过程一直进行到已发行从源节点可达的所有节点
    为止。如果还存在未被发现的节点，则选择其中一个座位源节点并重复以上过程，整个过程反复进行直到所有节点
    都被访问为止。
### 联系
    回溯算法和深度优选遍历都有着不撞南墙不回头的意思。我个人理解是： 回溯算法强调了深度优先遍历思想的用途，
    用一个不断变化的变量，在尝试各种可能的过程中吗，搜索需要的结果。强调了回退操作对于搜索的合理性。 
    而深度优先遍历强调一种遍历的思想，与之对于的遍历思想是广度优先遍历。
    
    回溯算法是一种遍历算法，以深度优先遍历的方式尝试所有的可能性。回溯算法是有向地搜索，区别于多层循实现的暴力法。
    
    
    




















