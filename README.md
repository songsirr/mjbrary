#library

###com.mj.song.measurement  
####this package have some Enum class for converting measurement
- LengthConverter
> this enum have some method for convert length 
```java 
LengthConverter.MILE.toMeter(1); -> return 1609.34
LengthConverter.CENTIMETER.toMilimeter(1); -> return 10
```
- SquareConverter  
- WeightConverter  
- VolumeConverter  
- TemperatureConverter
  
###com.mj.song.date  
####this package have some date util
- DateFormatGlobal  
> this enum have some kinds of usual format of date
- DateUtil
> this class have some method for Date class  
1.1 dateToString  
> >this method will return string as converted from Date  
if you input date before format, it will works with your date but return current date otherwise
```java 
DateUtil.dateToString(DateFormatGlobal.YDM) -> return "yyyy-MM-dd" with current date
DateUtil.dateToString(some date, "DateFormatGlobal.YDM) -> return "yyyy-MM-dd" with some date
```
>1.2 datetimeToString  
> >this method will return string as converted from Date  
if you input date before format, it will works with your date but return current date without date parameter
```java 
DateUtil.datetimeToString(DateFormatGlobal.YDM) -> return "yyyy-MM-dd hh:mm:ss" with current date
DateUtil.datetimeToString(some date, "DateFormatGlobal.YDM) -> return "yyyy-MM-dd hh:mm:ss" with some date
```

###com.mj.song.web  
####this package have some util for web dev  
- PasswordGenerator
> generate random password (may for forgot password something), can change pattern if you need
```java 
PasswordGenerator.generate() -> return "gEo<9UH?"
```

###com.mj.song.object  
####this package have some util for object 
- ObjectUtil
>1.1 removeEmptyFields
> >this method will set null for empty(but not a null) field 
```java 
ObjectUtil.removeEmptyFields(Object o);
```

>1.2 mapToObject
> >this method will convert map to object, need to casting returned object 
```java 
TestClass tc = new TestClass();
tc = (TestClass)ObjectUtil.mapToObject(map, tc);
```

>1.3 objectToMap
> >this method will convert object to map, this will return HashMap
```java 
ObjectUtilTest.TestClass t = new ObjectUtilTest.TestClass("f", "s", "t");
Map map = ObjectUtil.objectToMap(t);
```

###com.mj.song.string  
####this package have some util for string 
- StringUtil
>1.1 isNullOrEmpty
> >this method will return boolean that parameter string is null or empty (length = 0)
```java 
StringUtil.isNullOrEmpty(String str); -> return boolean
```

>1.2 isNullOrBlank
> >this method will return boolean that parameter string is null or only have white space 
```java 
StringUtil.isNullOrBlank(String str); -> return boolean
```

###com.mj.song.number  
####this package have some util for number 
- NumberUtil
>1.1 formatCommas
> >this method will remark the commas
```java 
NumberUtil.formatCommas(123000); -> rerutn "123,000"
```