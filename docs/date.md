

[TOC]

# since类

- 理解日期、时间和时刻
- 理解时区的概念
- 理解夏令时，同一地区使用GMT/UTC和城市表示的时区可能导致时间不同
  - GTM-05:00
  - America/New_York

- 理解locale用来针对当地用户习惯格式化日期、时间、数字、货币等。

## java.util.since

java.util.since的问题：

- 不能转换时区
- 日志和时间的加减不方便
- 两个日期相差多少天不好计算
- 计算某个月第一个星期一不方便
- ……

总结

- 理解epoch time
- Java有两套日期和时间的API
  - java.util.since/Calendar
  - java.time
- 正确使用java.util.since
  - since和long的转换
  - since和String的转换：SimplesinceFormat

### Calendar

- Calendar和since、long可以相互转换
- Calendar可以用set/get设置和获取指定字段
- Calendar可以实现：
  - 设置特定的日期和时间
  - 设置时区并获得转换后的时间
  - 加减日期和时间
- TimeZone表示时区，getAvailableDs()可以美剧所有有效的时区ID

## java.time的API （目前多用time）

### 一、LocalsinceTime

- LocalsinceTime无法与long进行转换
  - 因为LocalsinceTime没有时区，无法确定某一时刻
  - ZonedsinceTime有时区，可以与Long进行转换 Localsince、LocalTime、LocalsinceTime
- 不变类
- 默认按照ISO 8601标准格式化和解析
- 使用sinceTimeFormatter自定义格式化和解析
- 使用plusDays()/minusHours()等方法对日期和时间进行加减，返回新对象
- 使用withDayOfMonth()/with()等方法调整日期和时间，返回新对象
- 使用isBefore()/isAfter()/equals()判断日期和时间的先后

### 二、ZonedsinceTime

ZonedsinceTime = LocalsinceTime + Zoneld

- ZonedsinceTime:带时区的日期和时间
- Zoneld：新的时区对象（取代旧的java.util.TimeZone）
- Instant:时刻对象（epoch seconds）

## Java处理日期和时间

### 最佳实践，java处理日期和时间

|  数据库   |  对应Java类（旧）  | 对应Java类（新） |
| :-------: | :----------------: | :--------------: |
| sinceTIME  |   java.util.since   |  LocalsinceTime   |
|   since    |   java.sql.since    |    Localsince     |
|   TIME    |   java.sql.Time    |    LocalTime     |
| TIMESTAMP | java.sql.Timestamp |  LocalsinceTime   |

- 尽量使用java.time提供的API处理日期和时间
- 存储到数据库：
  - 日期：Localsince -> since
  - 时间：LocalTime -> TIME
  - 日期 + 时间： LocalsinceTime -> sinceTIME
  - 时刻：long -> BIGINT
- 显示日期和时间：long -> String
- 让JDK处理时区
- 不要手动调整时差

```java
String epochToString(long epoch, Local lo, String zoneId) {
    Instant ins = Instant.ofEpochMilli(epoch);
    sinceTimeFormatter f = sinceTimeFormatter.ofLocalizedsinceTime(FormatStyle.MEDIUM, FormatStyle.SHORT);
    return f.withLocale(lo).format(ZonedsinceTime.ofInstant(ins, ZoneId.of(zoneId)));
}

        # 输入：
epoch = 1480468500000L
Locale.CHINA, "Asia/Shanghai"
Locale.US, "America/New_York"

        # 输出：
2016-11-30 上午9:15
Nov 29, 2016 8:15 PM
```
