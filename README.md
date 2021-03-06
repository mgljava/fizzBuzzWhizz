# fizzBuzzWhizz
#### 你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有100名学生在上课。游戏的规则是：
* 你首先说出三个不同的特殊数，要求必须是个位数，比如3、5、7。
* 让所有学生拍成一队，然后按顺序报数。
* 学生报数时，如果所报数字是第一个特殊数（3）的倍数，那么不能说该数字，而要说Fizz；如果所报数字是第二个特殊数（5）的倍数，那么要说Buzz；如果所报数字是第三个特殊数（7）的倍数，那么要说Whizz。
* 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如第一个特殊数和第二个特殊数的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
* 学生报数时，如果所报数字包含了第一个特殊数，那么也不能说该数字，而是要说相应的单词，比如本例中第一个特殊数是3，那么要报13的同学应该说Fizz。如果数字中包含了第一个特殊数，那么忽略规则3和规则4，比如要报35的同学只报Fizz，不报BuzzWhizz。
##### 现在，我们需要你完成一个程序来模拟这个游戏，它首先接受3个特殊数，然后输出100名学生应该报数的数或单词。比如， 
##### 输入 3,5,7 输出（片段）
1   
2  
Fizz  
4  
Buzz  
Fizz  
Whizz  
8  
Fizz  
Buzz  
11  
Fizz  
Fizz  
Whizz  
FizzBuzz  
16  
17  
Fizz  
19  
Buzz   
…   
一直到100

#### 题目总结
出错的地方：  
1. 没有根据需求来做更好的抽象  
2. 代码的条件判断太多了  
3. 没有合理的定义常量
#### 改进方式
##### 1.根据现有的情况和需求应该抽取两个对象
###### 1.Teacher对象
* properties：fizz，buzz，whizz
* behavior：sayThreeNumber：说三个数字
###### 2.Student对象
* behavior：numberOff：根据当前的数字进行报数

##### 2.使用策略模式替换掉 if-else。
##### 3.常量定义应该在本类中。

#### 二次改进  
##### 1.抽取Teacher对象：
* behavior：Words say(fizz, buzz, whizz);  
##### 2.抽取Student对象：  
* properties：   
    1. position   
    2. RuleEngine  
* behavior： count 
##### 3.抽取Words对象
* properties:  
    1. fizz
    2. buzz
    3. whizz
##### 4.抽取规则引擎对象：RuleEngine
* properties: 
    1. word: Words
    2. rules: List<Rule>
##### 5.抽取规则对象接口：Rule
* properties:  
    1. 常量定义
* behavior： 
    1. getResultByPosition(int position, Words word): String
    2. isApplicable(): boolean 设置标记
    3. clearApplicable: void 清除flag标记
##### 6.不同的规则实现相同的接口有不同的实现 
